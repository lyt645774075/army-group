/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tianmai.armygroup.armygroup.support;

import com.alibaba.fastjson.JSONObject;

import java.security.Permission;
import java.util.List;

/**
 * @author yangtao.lyt
 * @version $Id: ScoreDetailData.java, v 0.1 2019年03月10日 00:53 yangtao.lyt Exp $
 */
public class ScoreDetailData {

    private String battleFieldId;

    private String rank;

    private List<Member> memberList;

    private List<String> imageList;

    private String permissionCode;


    /**
     * Getter method for property <tt>battleFieldId</tt>.
     *
     * @return property value of battleFieldId
     */
    public String getBattleFieldId() {
        return battleFieldId;
    }

    /**
     * Setter method for property <tt>battleFieldId</tt>.
     *
     * @param battleFieldId value to be assigned to property battleFieldId
     */
    public void setBattleFieldId(String battleFieldId) {
        this.battleFieldId = battleFieldId;
    }

    /**
     * Getter method for property <tt>rank</tt>.
     *
     * @return property value of rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * Setter method for property <tt>rank</tt>.
     *
     * @param rank value to be assigned to property rank
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * Getter method for property <tt>memberList</tt>.
     *
     * @return property value of memberList
     */
    public List<Member> getMemberList() {
        return memberList;
    }

    /**
     * Setter method for property <tt>memberList</tt>.
     *
     * @param memberList value to be assigned to property memberList
     */
    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    /**
     * Getter method for property <tt>imageList</tt>.
     *
     * @return property value of imageList
     */
    public List<String> getImageList() {
        return imageList;
    }

    /**
     * Setter method for property <tt>imageList</tt>.
     *
     * @param imageList value to be assigned to property imageList
     */
    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }

    /**
     * Getter method for property <tt>permissionCode</tt>.
     *
     * @return property value of permissionCode
     */
    public String getPermissionCode() {
        return permissionCode;
    }

    /**
     * Setter method for property <tt>permissionCode</tt>.
     *
     * @param permissionCode value to be assigned to property permissionCode
     */
    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    public class Member{

        private String memberCode;

        private String eventType;

        private String eventMemo;

        /**
         * Getter method for property <tt>memberCode</tt>.
         *
         * @return property value of memberCode
         */
        public String getMemberCode() {
            return memberCode;
        }

        /**
         * Setter method for property <tt>memberCode</tt>.
         *
         * @param memberCode value to be assigned to property memberCode
         */
        public void setMemberCode(String memberCode) {
            this.memberCode = memberCode;
        }

        /**
         * Getter method for property <tt>eventType</tt>.
         *
         * @return property value of eventType
         */
        public String getEventType() {
            return eventType;
        }

        /**
         * Setter method for property <tt>eventType</tt>.
         *
         * @param eventType value to be assigned to property eventType
         */
        public void setEventType(String eventType) {
            this.eventType = eventType;
        }

        /**
         * Getter method for property <tt>eventMemo</tt>.
         *
         * @return property value of eventMemo
         */
        public String getEventMemo() {
            return eventMemo;
        }

        /**
         * Setter method for property <tt>eventMemo</tt>.
         *
         * @param eventMemo value to be assigned to property eventMemo
         */
        public void setEventMemo(String eventMemo) {
            this.eventMemo = eventMemo;
        }
    }


}