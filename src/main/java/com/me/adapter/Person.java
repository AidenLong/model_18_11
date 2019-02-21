package com.me.adapter;

/**
 * @Autor syl
 * @Date 2019/2/21 15:12
 **/
public class Person {

    private String name;
    private String sex;
    private int age;

    public void speakJapanese(){
        System.out.println("I can speak Japanese!");
    }

    public void speakEnglish(){
        System.out.println("I can speak English!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
