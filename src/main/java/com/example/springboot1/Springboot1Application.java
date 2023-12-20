package com.example.springboot1;

import com.example.springboot1.pojo.Dog;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//@SpringBootApplication 来标注一个主程序类
//说明这是一个Spring Boot应用
//作用：标注在某个类上说明这个类是SpringBoot的主配置类 ， SpringBoot就应该运行这个类的main方法来启动SpringBoot应用；
//@ComponentScan
//这个注解在Spring中很重要 ,它对应XML配置中的元素。
//
//作用：自动扫描并加载符合条件的组件或者bean ， 将这个bean定义加载到IOC容器中

//@SpringBootConfiguration
//作用：SpringBoot的配置类 ，标注在某个类上 ， 表示这是一个SpringBoot的配置类；
//
//        我们继续进去这个注解查看

@SpringBootApplication
@MapperScan("com.example.springboot1.mapper")
public class Springboot1Application {





    public static void main(String[] args) {
        //以为是启动了一个方法，没想到启动了一个服务
        SpringApplication.run(Springboot1Application.class, args);
    }

}
