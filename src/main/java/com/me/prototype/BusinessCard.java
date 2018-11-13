package com.me.prototype;

/**
 * 原型模式简单实现
 */
public class BusinessCard implements Cloneable {

    private String name;
    private String company;

    public BusinessCard(){
        System.out.println("执行构造函数 BusinessCard");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public BusinessCard clone() {
        BusinessCard businessCard = null;
        try {
            businessCard = (BusinessCard) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return businessCard;
    }

    public void show() {
        System.out.println("name:" + name);
        System.out.println("company:" + company);
    }
}
