/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tianmai.armygroup.armygroup.persistent.repository;

import com.tianmai.armygroup.armygroup.persistent.dataobject.ArmyMember;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author yangtao.lyt
 * @version $Id: ArmyMemberRepository.java, v 0.1 2019年03月02日 02:14 yangtao.lyt Exp $
 */
public interface ArmyMemberRepository extends CrudRepository<ArmyMember, String>{

    /**
     * 查询军团成员
     * @param code
     * @return
     */
    List<ArmyMember> findByOrganizationCode(String code);


    /**
     * 查询军团成员积分排行
     * @return
     */
    @Query(nativeQuery=true, value ="select * from army_member where organization_code = ?1 order by unused_score desc limit ?2")
    List<ArmyMember> findTopKUnusedScore(String organizationCode, Integer topK);

    /**
     * 查询军团成员总积分排行
     * @return
     */
    @Query(nativeQuery=true, value = "select * from army_member where organization_code = ?1 order by total_score desc limit ?2")
    List<ArmyMember> findTopKTotalScore(String organizationCode, Integer topK);

    /**
     * 查询分团成员
     * @param code
     * @return
     */
    List<ArmyMember> findByGroupCode(String code);

    /**
     * 查询成员
     * @param code
     * @return
     */
    ArmyMember findByCode(String code);


    /**
     * 更新积分
     * @param memberCode
     * @param totalScore
     * @param unusedScore
     */
    @Transactional
    @Modifying
    @Query("update ArmyMember am set am.totalScore = ?2 ,am.unusedScore=?3, am.gmtModified=now() where am.code = ?1")
    void updateScore(String memberCode, float totalScore, float unusedScore);


}