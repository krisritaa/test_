package com.ericsson.map;

public class Student {
    String name;
    Integer age;
    String email;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public Student(String name, Integer age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
