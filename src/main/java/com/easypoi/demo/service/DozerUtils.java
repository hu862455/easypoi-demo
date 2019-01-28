package com.easypoi.demo.service;

import org.apache.poi.ss.formula.functions.T;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Package_name: com.easypoi.demo.service
 * @Class_name: $CLASS_NAME$
 * @Exception: $Exception$
 * @Describe: TODO
 * @Author: shuaihu2
 * @Creat_date: 2019 2019/1/27 17:09
 **/
@Service
public class DozerUtils {
    @Autowired
    private Mapper beanMapper;

    //基于Dozer转换对象的类型.
    public <T> T mapper(Object source, Class<T> destinationClass) {
        return beanMapper.map(source, destinationClass);
    }

    //基于Dozer转换Collection中对象的类型.
    public <T> List<T> mapperList(Collection sourceList, Class<T> destinationClass) {
        List<T> destinationList = new ArrayList<>();
        for (Object sourceObject : sourceList) {
            T destinationObject = beanMapper.map(sourceObject, destinationClass);
            destinationList.add(destinationObject);
        }
        return destinationList;
    }

    //基于Dozer将对象A的值拷贝到对象B中.
    public void copy(Object source, Object destinationObject) {
        beanMapper.map(source, destinationObject);
    }


}
