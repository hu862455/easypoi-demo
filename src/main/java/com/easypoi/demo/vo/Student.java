package com.easypoi.demo.vo;

import cn.afterturn.easypoi.excel.annotation.Excel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * @Class_name: Student
 * @Exception:
 * @Describe: TODO
 * @Author: shuaihu2
 * @Creat_date: 2019/1/27 14:13
 **/
public class Student implements java.io.Serializable {

    /** 主键id */
    private long id;

    /**
     * 序号
     */
    @Excel(name = "序号")
    @NotBlank(message = "该字段不能为空")
    private String serialNumber;
    /**
     * 姓名
     */
    @Excel(name = "姓名")
    @Pattern(regexp = "[\\u4E00-\\u9FA5]{2,5}", message = "姓名中文2-5位")
    private String name;
    /**
     * 准考证号
     */
    @Excel(name = "准考证号")
    @NotBlank(message = "该字段不能为空")
    private String admissionNumber;
    /**
     * 手机号码
     */
    @Excel(name = "手机号")
    @Pattern(regexp = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\\\d{8}$", message = "手机号码格式错误")
    private String phone;
    /**
     * 学校代码
     */
    @Excel(name = "学校代码")
    @NotBlank(message = "该字段不能为空")
    private String schoolCode;

    /**
     * 学校名称
     */
    private String schoolName;

    public Student() {
    }

    public Student(long id, @NotBlank(message = "该字段不能为空") String serialNumber, @Pattern(regexp = "[\\u4E00-\\u9FA5]{2,5}", message = "姓名中文2-5位") String name, @NotBlank(message = "该字段不能为空") String admissionNumber, @Pattern(regexp = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\\\d{8}$", message = "手机号码格式错误") String phone, @NotBlank(message = "该字段不能为空") String schoolCode, String schoolName) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.name = name;
        this.admissionNumber = admissionNumber;
        this.phone = phone;
        this.schoolCode = schoolCode;
        this.schoolName = schoolName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() &&
                Objects.equals(getSerialNumber(), student.getSerialNumber()) &&
                Objects.equals(getName(), student.getName()) &&
                Objects.equals(getAdmissionNumber(), student.getAdmissionNumber()) &&
                Objects.equals(getPhone(), student.getPhone()) &&
                Objects.equals(getSchoolCode(), student.getSchoolCode()) &&
                Objects.equals(getSchoolName(), student.getSchoolName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSerialNumber(), getName(), getAdmissionNumber(), getPhone(), getSchoolCode(), getSchoolName());
    }
}
