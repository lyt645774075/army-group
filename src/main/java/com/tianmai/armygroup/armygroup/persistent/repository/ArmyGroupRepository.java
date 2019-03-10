/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tianmai.armygroup.armygroup.persistent.repository;

import com.tianmai.armygroup.armygroup.persistent.dataobject.ArmyGroup;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author yangtao.lyt
 * @version $Id: ArmyGroupRepository.java, v 0.1 2019年03月01日 21:42 yangtao.lyt Exp $
 */
public interface ArmyGroupRepository extends CrudRepository<ArmyGroup, String>{


    /**
     * 查询单个军团
     * @param code
     * @return
     */
    ArmyGroup queryByCode(String code);

    /**
     * 查询所有分团
     * @param organizationCode
     * @return
     */
    List<ArmyGroup> findAllByOrganizationCode(String organizationCode);

}