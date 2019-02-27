package com.easypoi.demo.dto;

import java.io.Serializable;

public class School implements Serializable {
    /**
	* 主键
	*/
    private Integer id;

    /**
	* 学校代码
	*/
    private String schoolCode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }
}