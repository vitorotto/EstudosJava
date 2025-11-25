package com.vitorotto;

public class GuestModel {
    String name;
    Integer age;

    public GuestModel(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

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
        return "GuestModel [name=" + name + ", age=" + age + "]";
    }

    
}
