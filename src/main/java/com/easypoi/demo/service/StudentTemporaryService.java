package com.easypoi.demo.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import com.easypoi.demo.mapper.StudentTemporaryMapper;
import com.easypoi.demo.dto.StudentTemporary;

@Service
public class StudentTemporaryService{

    @Resource
    private StudentTemporaryMapper studentTemporaryMapper;

    public int deleteByPrimaryKey(Integer id){
        return studentTemporaryMapper.deleteByPrimaryKey(id);
    }

    public int insert(StudentTemporary record){
        return studentTemporaryMapper.insert(record);
    }

    public int insertSelective(StudentTemporary record){
        return studentTemporaryMapper.insertSelective(record);
    }

    public StudentTemporary selectByPrimaryKey(Integer id){
        return studentTemporaryMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(StudentTemporary record){
        return studentTemporaryMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(StudentTemporary record){
        return studentTemporaryMapper.updateByPrimaryKey(record);
    }

    public void checkData(){
        HashMap<String, Object> param = new HashMap<>();
        List<List<?>> lists = studentTemporaryMapper.checkData(param);
        System.out.println(param.get("phoneRepeat"));
        System.out.println(lists.get(0).size());
        System.out.println(lists.get(1).size());
        System.out.println(lists.get(2).size());
    }

}
