package com.dianping.pigeon.governor.model;

import java.util.Date;

public class ExceptionDesc {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exception_desc.exception_id
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    private Integer exceptionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exception_desc.method_id
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    private Integer methodId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exception_desc.exception_name
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    private String exceptionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exception_desc.updateTime
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    private Date updatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exception_desc.exception_desc
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    private String exceptionDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_desc.exception_id
     *
     * @return the value of exception_desc.exception_id
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    public Integer getExceptionId() {
        return exceptionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_desc.exception_id
     *
     * @param exceptionId the value for exception_desc.exception_id
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    public void setExceptionId(Integer exceptionId) {
        this.exceptionId = exceptionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_desc.method_id
     *
     * @return the value of exception_desc.method_id
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    public Integer getMethodId() {
        return methodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_desc.method_id
     *
     * @param methodId the value for exception_desc.method_id
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    public void setMethodId(Integer methodId) {
        this.methodId = methodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_desc.exception_name
     *
     * @return the value of exception_desc.exception_name
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    public String getExceptionName() {
        return exceptionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_desc.exception_name
     *
     * @param exceptionName the value for exception_desc.exception_name
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    public void setExceptionName(String exceptionName) {
        this.exceptionName = exceptionName == null ? null : exceptionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_desc.updateTime
     *
     * @return the value of exception_desc.updateTime
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_desc.updateTime
     *
     * @param updatetime the value for exception_desc.updateTime
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exception_desc.exception_desc
     *
     * @return the value of exception_desc.exception_desc
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    public String getExceptionDesc() {
        return exceptionDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exception_desc.exception_desc
     *
     * @param exceptionDesc the value for exception_desc.exception_desc
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    public void setExceptionDesc(String exceptionDesc) {
        this.exceptionDesc = exceptionDesc == null ? null : exceptionDesc.trim();
    }
}