package com.easypoi.demo.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.easypoi.demo.vo.Student;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Class_name: StudentExportController
 * @Exception:
 * @Describe: 学生基础数据导出
 * @Author: shuaihu2
 * @Creat_date: 2019/1/27 16:41
 **/
@Controller
public class StudentExportController {

    @RequestMapping("exportStudentExcel")
    public void exportStudentExcel(HttpServletResponse response){
        // 查询获取对应的实体集合
        Student student1 = new Student(1L,"1","hushuai","jopkofasd","15927030754","keda","科大讯飞大学");
        Student student2 = new Student(2L,"2","hushuai2","jopkofasd","15927030754","keda","科大讯飞大学");
        Student student3 = new Student(3L,"3","hushuai3","jopkofasd","15927030754","keda","科大讯飞大学");
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        // 指定列表标题和工作表名称
        ExportParams exportParams = new ExportParams("学生基础信息表", "学生");
        Workbook workbook = ExcelExportUtil.exportBigExcel(exportParams, Student.class, studentList);

        // 输出出来
        try {
        response.setHeader("content-Type","application/vnd.ms-excel");
        response.setHeader("Content-Disposition","attachment;filename="+new String("学生基础信息表".getBytes("gbk"), "iso8859-1")+".xlsx");
        response.setCharacterEncoding("UTF-8");
        workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
