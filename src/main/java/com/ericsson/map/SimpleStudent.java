package com.ericsson.map;

public class SimpleStudent {
    String name;
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SimpleStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public SimpleStudent(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
