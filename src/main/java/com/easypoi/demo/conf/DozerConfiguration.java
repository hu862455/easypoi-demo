package com.easypoi.demo.conf;

import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

/**
 * @Class_name: DozerConfiguration
 * @Exception:
 * @Describe: TODO
 * @Author: shuaihu2
 * @Creat_date: 2019/1/27 16:53
 **/
@Configuration
public class DozerConfiguration {
    private static final Logger log = LoggerFactory.getLogger(DozerConfiguration.class);

    @Bean
    public DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean (@Value("classpath:dozer/*.xml") Resource[] resources){
        final DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean = new DozerBeanMapperFactoryBean();
        dozerBeanMapperFactoryBean.setMappingFiles(resources);
        log.info("------------【注入dozerMapper成功！】------------------");
        return dozerBeanMapperFactoryBean;
    }

}
