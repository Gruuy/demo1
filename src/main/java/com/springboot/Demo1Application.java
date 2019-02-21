package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource可以用来导入xml文件，虽然SpringBoot推荐使用注解开发，但还是保留了xml接口
//@ImportResource必须用在启动类上边。
@ImportResource(locations = {"classpath:xml/beans.xml"})
@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

}
