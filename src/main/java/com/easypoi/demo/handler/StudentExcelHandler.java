package com.easypoi.demo.handler;

import cn.afterturn.easypoi.handler.impl.ExcelDataHandlerDefaultImpl;
import com.easypoi.demo.vo.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Class_name: UserExcelHandler
 * @Exception: 
 * @Describe: student对应的handler
 * @Author: shuaihu2
 * @Creat_date: 2019/1/27 14:31
 **/
public class StudentExcelHandler extends ExcelDataHandlerDefaultImpl<Student> {

    private static final Logger log = LoggerFactory.getLogger(StudentExcelHandler.class);

    @Override
    public Object importHandler(Student obj, String name, Object value) {
        log.info(name+":"+value);
        return super.importHandler(obj, name, value);
    }

}
