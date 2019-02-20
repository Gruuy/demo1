package com.springboot.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

//Component用于注入容器，ConfigurationProperties用于映射配置文件的属性，person是映射前缀
@Component
//@ConfigurationProperties(prefix = "person")
public class Person1 {
    //@Value不适合做复杂结构读取，复杂结构请使用@ConfigurationProperties
    //properties不支持驼峰命名法，lastName会被改成last-name，使用lastName会报错(不支持松散绑定)
    //@Value支持计算，例如#{12*3}，而@ConfigurationProperties不支持。
    //@ConfigurationProperties支持数据校验，配合@Validated以及@Email等注解可以校验数据，@Valid不可以 校验不通过会报错。
    @Value("${person.lastName}")
    private String lastName;
    @Value("#{12*3}")
    private int age;
    @Value("${person.boss}")
    private boolean boss;
    @Value("${person.birth}")
    private Date birth;
    private Map<String,String> maps;
    private List<String> lists;
    private Dog dog;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
