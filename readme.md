# 技术点说明
### easyPOI
#### 功能：
1. 实现excel文件上传
2. 实现上传excel内容校验
3. 实现excel导出实现
#### 集成方式：
- 导入对应的依赖
---
        <dependency>
            <groupId>cn.afterturn</groupId>
            <artifactId>easypoi-base</artifactId>
            <version>3.2.0</version>
        </dependency>
        <dependency>
            <groupId>cn.afterturn</groupId>
            <artifactId>easypoi-annotation</artifactId>
            <version>3.2.0</version>
        </dependency>
        <dependency>
            <groupId>cn.afterturn</groupId>
            <artifactId>easypoi-web</artifactId>
            <version>3.2.0</version>
        </dependency>
---
- 实现对应的handler（导入需要） 
- 在对应实体上添加指定的注解
- 代码中实现对应的方法
>[更多easyPOI资料](http://easypoi.mydoc.io/)
### dozer
#### 功能：
1. 实现vo，dto等javaBean的相互转换
#### 集成方式：
- 导入对应的依赖
---
        <dependency>
            <groupId>net.sf.dozer</groupId>
            <artifactId>dozer</artifactId>
            <version>5.5.1</version>
        </dependency>
        <dependency>
            <groupId>net.sf.dozer</groupId>
            <artifactId>dozer-spring</artifactId>
            <version>5.5.1</version>
        </dependency>
---
- 需要配置对应的转换配置文件，如resources -->dozer -->StudentDozer.xml
- 需要注入对应的bean对象
---
    @Bean
    public DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean (@Value("classpath:dozer/*.xml") Resource[] resources){
        final DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean = new DozerBeanMapperFactoryBean();
        dozerBeanMapperFactoryBean.setMappingFiles(resources);
        log.info("------------【注入dozerMapper成功！】------------------");
        return dozerBeanMapperFactoryBean;
    }
---
- 实现了dozer的工具类 com.easypoi.demo.service.DozerUtils

>[更多dozer资料](http://dozer.sourceforge.net/)
