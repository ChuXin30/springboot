package com.example.springboot1;



import com.example.springboot1.pojo.Dog;
import com.example.springboot1.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan(basePackages = "com.example.*")
class Springboot1ApplicationTests {

//    @Autowired //将狗狗自动注入进来

    @Autowired
    Dog dog;

    @Autowired
    Person person;
    @Test
    void contextLoads() {
        System.out.println(person.toString());
    }

}
