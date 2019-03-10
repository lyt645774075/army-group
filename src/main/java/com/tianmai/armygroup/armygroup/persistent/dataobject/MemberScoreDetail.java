/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tianmai.armygroup.armygroup.persistent.dataobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author yangtao.lyt
 * @version $Id: MemberScoreDetailRepository.java, v 0.1 2019年03月02日 02:10 yangtao.lyt Exp $
 */
@Entity
public class MemberScoreDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    /** 主键id */
    private long id;

    /** 创建时间 */
    private Date gmtCreate = new Date();

    private Date gmtModified = new Date();

    private String memberCode;

    private String memberName;

    private Float deltaScore;

    private Float unusedScore;

    private String eventType;

    private String eventMemo;

    private String eventImageUrl;

    private String status;

    private String operatorName;

    private String operatorCode;

    private String settleDate;

    private String settleType;

    private String battleFieldId;


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
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public long getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>gmtCreate</tt>.
     *
     * @return property value of gmtCreate
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * Setter method for property <tt>gmtCreate</tt>.
     *
     * @param gmtCreate value to be assigned to property gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * Getter method for property <tt>gmtModified</tt>.
     *
     * @return property value of gmtModified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * Setter method for property <tt>gmtModified</tt>.
     *
     * @param gmtModified value to be assigned to property gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

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
     * Getter method for property <tt>memberName</tt>.
     *
     * @return property value of memberName
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * Setter method for property <tt>memberName</tt>.
     *
     * @param memberName value to be assigned to property memberName
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * Getter method for property <tt>deltaScore</tt>.
     *
     * @return property value of deltaScore
     */
    public Float getDeltaScore() {
        return deltaScore;
    }

    /**
     * Setter method for property <tt>deltaScore</tt>.
     *
     * @param deltaScore value to be assigned to property deltaScore
     */
    public void setDeltaScore(Float deltaScore) {
        this.deltaScore = deltaScore;
    }

    /**
     * Getter method for property <tt>unusedScore</tt>.
     *
     * @return property value of unusedScore
     */
    public Float getUnusedScore() {
        return unusedScore;
    }

    /**
     * Setter method for property <tt>unusedScore</tt>.
     *
     * @param unusedScore value to be assigned to property unusedScore
     */
    public void setUnusedScore(Float unusedScore) {
        this.unusedScore = unusedScore;
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

    /**
     * Getter method for property <tt>eventImageUrl</tt>.
     *
     * @return property value of eventImageUrl
     */
    public String getEventImageUrl() {
        return eventImageUrl;
    }

    /**
     * Setter method for property <tt>eventImageUrl</tt>.
     *
     * @param eventImageUrl value to be assigned to property eventImageUrl
     */
    public void setEventImageUrl(String eventImageUrl) {
        this.eventImageUrl = eventImageUrl;
    }

    /**
     * Getter method for property <tt>status</tt>.
     *
     * @return property value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for property <tt>status</tt>.
     *
     * @param status value to be assigned to property status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter method for property <tt>operatorName</tt>.
     *
     * @return property value of operatorName
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * Setter method for property <tt>operatorName</tt>.
     *
     * @param operatorName value to be assigned to property operatorName
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    /**
     * Getter method for property <tt>operatorCode</tt>.
     *
     * @return property value of operatorCode
     */
    public String getOperatorCode() {
        return operatorCode;
    }

    /**
     * Setter method for property <tt>operatorCode</tt>.
     *
     * @param operatorCode value to be assigned to property operatorCode
     */
    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    /**
     * Getter method for property <tt>settleDate</tt>.
     *
     * @return property value of settleDate
     */
    public String getSettleDate() {
        return settleDate;
    }

    /**
     * Setter method for property <tt>settleDate</tt>.
     *
     * @param settleDate value to be assigned to property settleDate
     */
    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    /**
     * Getter method for property <tt>settleType</tt>.
     *
     * @return property value of settleType
     */
    public String getSettleType() {
        return settleType;
    }

    /**
     * Setter method for property <tt>settleType</tt>.
     *
     * @param settleType value to be assigned to property settleType
     */
    public void setSettleType(String settleType) {
        this.settleType = settleType;
    }
}