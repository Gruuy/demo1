package com.springboot;

import com.springboot.model.Person;
import com.springboot.model.Person1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo1ApplicationTests {
    @Autowired
    Person person;
    @Autowired
    Person1 person1;
    @Test
    public void contextLoads() {
        System.out.println(person.toString());
        System.out.println(person1.toString());
    }

}
