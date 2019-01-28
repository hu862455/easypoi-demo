package com.easypoi.demo.vo;

import cn.afterturn.easypoi.excel.annotation.Excel;

import javax.validation.constraints.NotBlank;

/**
 * @Class_name: AdmissionInfo
 * @Exception:
 * @Describe: 录取信息实体
 * @Author: shuaihu2
 * @Creat_date: 2019/1/27 16:01
 **/
public class AdmissionInfo implements java.io.Serializable{

    /** 主键id */
    private long id;

    /** 序号 */
    @Excel(name = "序号")
    @NotBlank(message = "该字段不能为空")
    private String serialNumber;

    /** 准考证号 */
    @Excel(name = "准考证号")
    @NotBlank(message = "该字段不能为空")
    private String admissionNumber;

    /** 学校代码 */
    @Excel(name = "录取学校")
    @NotBlank(message = "该字段不能为空")
    private String schoolCode;

    /** 专业代码 */
    @Excel(name = "录取专业")
    @NotBlank(message = "该字段不能为空")
    private String majorCode;

}
