/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.tianmai.armygroup.armygroup.persistent.dataobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author yangtao.lyt
 * @version $Id: ArmyMemberRepository.java, v 0.1 2019年03月02日 02:08 yangtao.lyt Exp $
 */
@Entity
public class ArmyMember {

    /** 主键id */
    private long id;

    /** 创建时间 */
    private Date gmtCreate = new Date();

    private Date gmtModified = new Date();

    @Id
    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    /** 军团名称 */
    private String name;

    /** 所属集团 */
    private String organizationCode;

    /** 所属集团 */
    private String groupCode;

    /** 总分 */
    private Integer totalScore;

    /** 未使用分 */
    private Integer unusedScore;

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
     * Getter method for property <tt>code</tt>.
     *
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     *
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>organizationCode</tt>.
     *
     * @return property value of organizationCode
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * Setter method for property <tt>organizationCode</tt>.
     *
     * @param organizationCode value to be assigned to property organizationCode
     */
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    /**
     * Getter method for property <tt>groupCode</tt>.
     *
     * @return property value of groupCode
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * Setter method for property <tt>groupCode</tt>.
     *
     * @param groupCode value to be assigned to property groupCode
     */
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    /**
     * Getter method for property <tt>totalScore</tt>.
     *
     * @return property value of totalScore
     */
    public Integer getTotalScore() {
        return totalScore;
    }

    /**
     * Setter method for property <tt>totalScore</tt>.
     *
     * @param totalScore value to be assigned to property totalScore
     */
    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    /**
     * Getter method for property <tt>unusedScore</tt>.
     *
     * @return property value of unusedScore
     */
    public Integer getUnusedScore() {
        return unusedScore;
    }

    /**
     * Setter method for property <tt>unusedScore</tt>.
     *
     * @param unusedScore value to be assigned to property unusedScore
     */
    public void setUnusedScore(Integer unusedScore) {
        this.unusedScore = unusedScore;
    }
}