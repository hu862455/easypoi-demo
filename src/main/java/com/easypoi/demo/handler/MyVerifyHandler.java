package com.easypoi.demo.handler;

import cn.afterturn.easypoi.excel.entity.result.ExcelVerifyHandlerResult;
import cn.afterturn.easypoi.handler.inter.IExcelVerifyHandler;
import com.easypoi.demo.vo.Student;

/**
 * @Package_name: com.easypoi.demo.handler
 * @Class_name: $CLASS_NAME$
 * @Exception: $Exception$
 * @Describe: 自定义的校验规则
 * @Author: shuaihu2
 * @Creat_date: 2019 2019/2/21 10:14
 **/
public class MyVerifyHandler implements IExcelVerifyHandler<Student> {
    @Override
    public ExcelVerifyHandlerResult verifyHandler(Student student) {

        ExcelVerifyHandlerResult result = new ExcelVerifyHandlerResult();
        // 1.查询导入的学校代码在数据库中是否存在
        String schoolCode = student.getSchoolCode();
        // 这里就确认code一定要是abc
        if(!"abc".equals(schoolCode)){
            result.setSuccess(false);
            result.setMsg("学校code错误！");
            return result;
        }
        result.setSuccess(true);

        return result;
    }
}
