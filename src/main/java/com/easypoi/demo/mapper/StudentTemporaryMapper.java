package com.easypoi.demo.mapper;

import com.easypoi.demo.dto.StudentTemporary;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface StudentTemporaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentTemporary record);

    int insertSelective(StudentTemporary record);

    StudentTemporary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentTemporary record);

    int updateByPrimaryKey(StudentTemporary record);

    List<List<?>> checkData(HashMap<String,Object> param);
}