/*
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved
 */

package com.tianmai.armygroup.armygroup.support;

/**
 *
 * JSON结果的工具类
 *
 * @author yangtao.lyt
 * @version $Id: JsonResult, v 0.1 2016-06-01 19:50 yangtao.lyt Exp $
 */
public class JsonResult {

    /** json数据success字段 */
    private Boolean success = false;
    /** json数据msg字段 */
    private String  msg;
    /** json数据data字段 */
    private Object  data;

    /**
     * Instantiates a new Json result.
     *
     * @param success the success
     */
    public JsonResult(Boolean success) {
        this.success = success;
    }

    /**
     * Is success boolean.
     *
     * @return the boolean
     */
    public Boolean isSuccess() {
        return success;
    }

    /**
     * Getter method for property <tt>success</tt>.
     *
     * @return property value of success
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     *
     * Setter method for property <tt>success</tt>.
     * @param success value to be assigned to property success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * Getter method for property <tt>msg</tt>.
     *
     * @return property value of msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     *
     * Setter method for property <tt>msg</tt>.
     * @param msg value to be assigned to property msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * Getter method for property <tt>data</tt>.
     *
     * @return property value of data
     */
    public Object getData() {
        return data;
    }

    /**
     *
     * Setter method for property <tt>data</tt>.
     * @param data value to be assigned to property data
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 创建一个默认的json数据模型,保证所有key存在.
     * @return
     */
    public static JsonResult createSuccessInstance() {
        return new JsonResult(true);
    }

    /**
     * 创建一个默认的json数据模型,保证所有key存在.
     * @return
     */
    public static JsonResult createFailInstance() {
        return new JsonResult(false);
    }

}
