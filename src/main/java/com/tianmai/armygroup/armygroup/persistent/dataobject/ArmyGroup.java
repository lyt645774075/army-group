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
 * @version $Id: ArmyGroup.java, v 0.1 2019年03月01日 21:42 yangtao.lyt Exp $
 */
@Entity
public class ArmyGroup {

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

    /** 标签 */
    private String tag;

    /** 团长 */
    private String leader;

    /** 副团长 */
    private String assistLeader;


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
     * Getter method for property <tt>tag</tt>.
     *
     * @return property value of tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * Setter method for property <tt>tag</tt>.
     *
     * @param tag value to be assigned to property tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * Getter method for property <tt>leader</tt>.
     *
     * @return property value of leader
     */
    public String getLeader() {
        return leader;
    }

    /**
     * Setter method for property <tt>leader</tt>.
     *
     * @param leader value to be assigned to property leader
     */
    public void setLeader(String leader) {
        this.leader = leader;
    }

    /**
     * Getter method for property <tt>assistLeader</tt>.
     *
     * @return property value of assistLeader
     */
    public String getAssistLeader() {
        return assistLeader;
    }

    /**
     * Setter method for property <tt>assistLeader</tt>.
     *
     * @param assistLeader value to be assigned to property assistLeader
     */
    public void setAssistLeader(String assistLeader) {
        this.assistLeader = assistLeader;
    }
}