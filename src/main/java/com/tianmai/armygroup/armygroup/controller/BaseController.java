/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tianmai.armygroup.armygroup.controller;
import com.tianmai.armygroup.armygroup.persistent.repository.ArmyGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author yangtao.lyt
 * @version $Id: TestController.java, v 0.1 2019年02月28日 23:56 yangtao.lyt Exp $
 */
@Controller
public class BaseController {

    @Autowired
    private ArmyGroupRepository armyGroupRepository;

    @RequestMapping(value = "/")
    public String doIndex(){

        return "index.html";
    }


}