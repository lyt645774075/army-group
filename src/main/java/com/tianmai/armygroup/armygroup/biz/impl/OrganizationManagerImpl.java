/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tianmai.armygroup.armygroup.biz.impl;

import com.alibaba.fastjson.JSON;
import com.tianmai.armygroup.armygroup.biz.OrganizationManager;
import com.tianmai.armygroup.armygroup.persistent.dataobject.ArmyGroup;
import com.tianmai.armygroup.armygroup.persistent.dataobject.ArmyMember;
import com.tianmai.armygroup.armygroup.persistent.dataobject.ArmyOrganization;
import com.tianmai.armygroup.armygroup.persistent.dataobject.MemberScoreDetail;
import com.tianmai.armygroup.armygroup.persistent.repository.ArmyGroupRepository;
import com.tianmai.armygroup.armygroup.persistent.repository.ArmyMemberRepository;
import com.tianmai.armygroup.armygroup.persistent.repository.ArmyOrganizationRepository;
import com.tianmai.armygroup.armygroup.persistent.repository.MemberScoreDetailRepository;
import com.tianmai.armygroup.armygroup.support.ScoreDetailData;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @author yangtao.lyt
 * @version $Id: OrganizationManagerImpl.java, v 0.1 2019年03月09日 23:20 yangtao.lyt Exp $
 */
@Service
public class OrganizationManagerImpl implements OrganizationManager {

    @Autowired
    private ArmyMemberRepository armyMemberRepository;

    @Autowired
    private MemberScoreDetailRepository memberScoreDetailRepository;

    @Autowired
    private ArmyGroupRepository armyGroupRepository;

    @Autowired
    private ArmyOrganizationRepository armyOrganizationRepository;


    @Override
    public ArmyOrganization queryArmyOrganizationByCode(String code) {
        return armyOrganizationRepository.findByCode(code);
    }

    @Override
    public List<ArmyMember> queryAllMember(String organizationCode) {
        return armyMemberRepository.findByOrganizationCode(organizationCode);
    }


    @Override
    public List<ArmyGroup> queryAllGroup(String organizationCode) {
        return armyGroupRepository.findAllByOrganizationCode(organizationCode);
    }

    @Override
    public List<ArmyMember> queryTopMemberWithUnused(String organizationCode, Integer topK) {
        return armyMemberRepository.findTopKUnusedScore(organizationCode, topK);
    }

    @Override
    public List<ArmyMember> queryTopMemberWithTotal(String organizationCode, Integer topK) {
        return armyMemberRepository.findTopKTotalScore(organizationCode, topK);
    }

    @Transactional
    @Override
    public void addScoreDetailData(ScoreDetailData detailData) {

        Assert.notNull(detailData, "数据包不能为空");
        Assert.notEmpty(detailData.getMemberList(), "玩家列表不能为空");

        //检查权限码
        if (!checkPermissionCode(detailData.getPermissionCode())) {
            return;
        }

        detailData.getMemberList().forEach(m -> {

            //存储积分明细
            ArmyMember armyMember = armyMemberRepository.findByCode(m.getMemberCode());

            float deltaScore = decideScore(detailData.getRank());

            MemberScoreDetail detail = new MemberScoreDetail();
            detail.setMemberCode(armyMember.getCode());
            detail.setMemberName(armyMember.getGameName());
            detail.setDeltaScore(deltaScore);
            detail.setUnusedScore(deltaScore);
            detail.setEventType(m.getEventType());
            detail.setEventMemo(m.getEventMemo());
            detail.setStatus("INIT");
            detail.setEventImageUrl(JSON.toJSONString(detailData.getImageList()));

            detail.setBattleFieldId(detailData.getBattleFieldId());

            //保存
            memberScoreDetailRepository.save(detail);

            //更新用户得分
            armyMemberRepository.updateScore(armyMember.getCode(), armyMember.getTotalScore() + deltaScore, armyMember.getUnusedScore() + deltaScore);

        });


    }


    /**
     * 计算分数
     *
     * @param rank
     * @return
     */
    private float decideScore(String rank) {
        if (StringUtils.endsWithIgnoreCase(rank, "first")) {
            return 2;
        } else if (StringUtils.endsWithIgnoreCase(rank, "second")) {
            return 1;
        }

        return 0;
    }


    /**
     * 检查权限码
     *
     * @return
     */
    private boolean checkPermissionCode(String permissionCode) {
        if (StringUtils.equals(permissionCode, "pc_xmjt_score_code")) {
            return true;
        } else {
            return false;
        }
    }

}