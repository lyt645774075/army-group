/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tianmai.armygroup.armygroup.controller;

import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author yangtao.lyt
 * @version $Id: ArmyController.java, v 0.1 2019年03月02日 02:46 yangtao.lyt Exp $
 */
@RestController
public class ArmyController {


    @RequestMapping("/test.json")
    public Map<String, Object> doTest(){
        Map<String , Object> result = Maps.newHashMap();

        result.put("key", "value");

        return result;
    }





}