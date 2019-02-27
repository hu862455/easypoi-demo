package com.easypoi.demo.dto;

import java.io.Serializable;

public class StudentTemporary implements Serializable {
    /**
	* 主键
	*/
    private Integer id;

    /**
	* 序号
	*/
    private Integer serialNumber;

    /**
	* 姓名
	*/
    private String userName;

    /**
	* 准考证号
	*/
    private String admissionNumber;

    /**
	* 手机号码
	*/
    private String phone;

    /**
	* 学校代码
	*/
    private String schoolCode;

    /**
	* 手机号码 正常-0 表内重复-1 库表重复-2 
	*/
    private Integer phoneFlag;

    /**
	* 准考证号码 正常-0 表内重复-1 库表重复-2 
	*/
    private Integer admissionNumberFlag;

    /**
	* 手机号码 正常-0 存在-1 不存在-2 
	*/
    private Integer schoolCodeFlag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public Integer getPhoneFlag() {
        return phoneFlag;
    }

    public void setPhoneFlag(Integer phoneFlag) {
        this.phoneFlag = phoneFlag;
    }

    public Integer getAdmissionNumberFlag() {
        return admissionNumberFlag;
    }

    public void setAdmissionNumberFlag(Integer admissionNumberFlag) {
        this.admissionNumberFlag = admissionNumberFlag;
    }

    public Integer getSchoolCodeFlag() {
        return schoolCodeFlag;
    }

    public void setSchoolCodeFlag(Integer schoolCodeFlag) {
        this.schoolCodeFlag = schoolCodeFlag;
    }
}