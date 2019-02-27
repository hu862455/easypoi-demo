package com.easypoi.demo.controller;

import com.easypoi.demo.service.StudentTemporaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Class_name: AdmissionInfoImportController
 * @Exception:
 * @Describe: 录取信息导入
 * @Author: shuaihu2
 * @Creat_date: 2019/1/27 15:49
 **/
@RestController
public class AdmissionInfoImportController {

    @Autowired
    StudentTemporaryService studentTemporaryService;

    @RequestMapping("test")
    public void chechData(){
        studentTemporaryService.checkData();
    }

}
