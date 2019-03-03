/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tianmai.armygroup.armygroup.persistent.repository;

import com.tianmai.armygroup.armygroup.persistent.dataobject.ArmyMember;
import org.springframework.data.repository.CrudRepository;

/**
 * @author yangtao.lyt
 * @version $Id: ArmyMemberRepository.java, v 0.1 2019年03月02日 02:14 yangtao.lyt Exp $
 */
public interface ArmyMemberRepository extends CrudRepository<ArmyMember, String>{
}