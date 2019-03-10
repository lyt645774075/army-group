/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tianmai.armygroup.armygroup.biz;

import com.tianmai.armygroup.armygroup.persistent.dataobject.ArmyGroup;
import com.tianmai.armygroup.armygroup.persistent.dataobject.ArmyMember;
import com.tianmai.armygroup.armygroup.persistent.dataobject.ArmyOrganization;
import com.tianmai.armygroup.armygroup.support.ScoreDetailData;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * 军团管理器
 *
 * @author yangtao.lyt
 * @version $Id: OrganizationManager.java, v 0.1 2019年03月09日 23:01 yangtao.lyt Exp $
 */

public interface OrganizationManager {


    /**
     * 查询一个军团
     * @param code
     * @return
     */
    ArmyOrganization queryArmyOrganizationByCode(String code);

    /**
     * 查询军团下所有成员
     * @param organizationCode
     * @return
     */
    List<ArmyMember> queryAllMember(String organizationCode);


    /**
     * 查询军团下所有分团
     * @param organizationCode
     * @return
     */
    List<ArmyGroup> queryAllGroup(String organizationCode);



    /**
     * 查询军团下所有成员
     * @param organizationCode
     * @return
     */
    List<ArmyMember> queryTopMemberWithUnused(String organizationCode, Integer topK);



    /**
     * 查询军团下所有成员
     * @param organizationCode
     * @return
     */
    List<ArmyMember> queryTopMemberWithTotal(String organizationCode, Integer topK);



    /**
     * 新增积分明细数据包
     * @param detailData
     */
    void addScoreDetailData(ScoreDetailData detailData);




}