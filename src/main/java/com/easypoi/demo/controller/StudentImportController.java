package com.easypoi.demo.controller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import com.easypoi.demo.dto.StudentDto;
import com.easypoi.demo.handler.StudentExcelHandler;
import com.easypoi.demo.service.DozerUtils;
import com.easypoi.demo.vo.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;

/**
 * @Class_name: StudentImportController
 * @Exception:
 * @Describe: 学生基础信息导入
 * @Author: shuaihu2
 * @Creat_date: 2019/1/27 14:42
 **/
@RestController
public class StudentImportController {

    private static final Logger log = LoggerFactory.getLogger(StudentImportController.class);

    @Autowired
    private DozerUtils dozerUtils;

    @PostMapping("StudentExcelImport")
    public void StudentExcelImport(@RequestParam("file") MultipartFile file) {

        ImportParams importParams = new ImportParams();
        // 数据处理
        StudentExcelHandler studentExcelHandler = new StudentExcelHandler();
        studentExcelHandler.setNeedHandlerFields(new String[]{"姓名"});

        // 需要验证
        importParams.setNeedVerfiy(true);

        try {
            ExcelImportResult<Student> studentsResult = ExcelImportUtil.importExcelMore(file.getInputStream(), Student.class, importParams);
            List<Student> successList = studentsResult.getList();
            List<Student> failList = studentsResult.getFailList();

            // 测试dozer转换
            List<StudentDto> studentDtos = dozerUtils.mapperList(failList, StudentDto.class);

            // 对数据进行去重处理
            HashSet h = new HashSet(successList);
            successList.clear();
            successList.addAll(h);
            h.clear();
            h.addAll(failList);
            failList.clear();
            failList.addAll(h);


            log.info("是否存在验证未通过的数据:" + studentsResult.isVerfiyFail());
            log.info("验证通过的数量:" + successList.size());
            log.info("验证未通过的数量:" + failList.size());

            for (Student successStudent : successList) {
                log.info("成功列表信息：序号={} 姓名={} 准考证号={} 手机号={} 学校代码={}", successStudent.getSerialNumber(),
                        successStudent.getName(), successStudent.getAdmissionNumber(), successStudent.getPhone(),successStudent.getSchoolCode());
            }

            for (Student failStudent : failList) {
                log.info("失败列表信息：序号={} 姓名={} 准考证号={} 手机号={} 学校代码={}", failStudent.getSerialNumber(),
                        failStudent.getName(), failStudent.getAdmissionNumber(), failStudent.getPhone(),failStudent.getSchoolCode());
            }

        } catch (IOException e) {
            log.error(e.getMessage(), e);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }


    }
}
