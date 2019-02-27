package com.easypoi.demo.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.easypoi.demo.mapper.SchoolMapper;
import com.easypoi.demo.dto.School;

@Service
public class SchoolService{

    @Resource
    private SchoolMapper schoolMapper;

    public int deleteByPrimaryKey(Integer id){
        return schoolMapper.deleteByPrimaryKey(id);
    }

    public int insert(School record){
        return schoolMapper.insert(record);
    }

    public int insertSelective(School record){
        return schoolMapper.insertSelective(record);
    }

    public School selectByPrimaryKey(Integer id){
        return schoolMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(School record){
        return schoolMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(School record){
        return schoolMapper.updateByPrimaryKey(record);
    }

}
