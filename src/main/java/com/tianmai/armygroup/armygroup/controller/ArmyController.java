/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tianmai.armygroup.armygroup.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.tianmai.armygroup.armygroup.biz.OrganizationManager;
import com.tianmai.armygroup.armygroup.persistent.dataobject.ArmyGroup;
import com.tianmai.armygroup.armygroup.persistent.dataobject.ArmyMember;
import com.tianmai.armygroup.armygroup.persistent.dataobject.ArmyOrganization;
import com.tianmai.armygroup.armygroup.support.JsonResult;
import com.tianmai.armygroup.armygroup.support.ScoreDetailData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yangtao.lyt
 * @version $Id: ArmyController.java, v 0.1 2019年03月02日 02:46 yangtao.lyt Exp $
 */
@RestController
public class ArmyController {

    @Autowired
    private OrganizationManager organizationManager;


    @RequestMapping("/{organizationCode}/baseInfo")
    public JsonResult queryOne(@PathVariable(name = "organizationCode") String organizationCode){

        ArmyOrganization armyOrganization = organizationManager.queryArmyOrganizationByCode(organizationCode);

        JsonResult result = JsonResult.createSuccessInstance();
        result.setData(armyOrganization);

        return result;
    }

    @RequestMapping("/{organizationCode}/groupList")
    public JsonResult queryGroupList(@PathVariable(name = "organizationCode") String organizationCode){

        List<ArmyGroup> groupList = organizationManager.queryAllGroup(organizationCode);

        JsonResult result = JsonResult.createSuccessInstance();
        result.setData(groupList);

        return result;
    }


    @RequestMapping("/{organizationCode}/member/all")
    public JsonResult doTest(@PathVariable(name = "organizationCode") String organizationCode){

        List<ArmyMember> memberList = organizationManager.queryAllMember(organizationCode);

        JsonResult result = JsonResult.createSuccessInstance();
        result.setData(memberList);

        return result;
    }

    @RequestMapping("/{organizationCode}/topk/unused")
    public JsonResult queryUnused(@PathVariable(name = "organizationCode") String organizationCode){

        List<ArmyMember> memberList = organizationManager.queryTopMemberWithUnused(organizationCode, 40);

        JsonResult result = JsonResult.createSuccessInstance();
        result.setData(memberList);

        return result;
    }

    @RequestMapping("/{organizationCode}/topk/total")
    public JsonResult queryTotal(@PathVariable(name = "organizationCode") String organizationCode){

        List<ArmyMember> memberList = organizationManager.queryTopMemberWithTotal(organizationCode, 20);

        JsonResult result = JsonResult.createSuccessInstance();
        result.setData(memberList);

        return result;
    }


    @RequestMapping("/scoredetail/add")
    public JsonResult addScoreDetail(@RequestParam  String detailListStr){

        ScoreDetailData data = JSONObject.parseObject(detailListStr, ScoreDetailData.class);

        organizationManager.addScoreDetailData(data);

        return JsonResult.createSuccessInstance();
    }




}