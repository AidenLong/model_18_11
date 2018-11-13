package com.me.prototype;

/**
 * 原型模式简单实现
 */
public class DeepBusinessCard implements Cloneable {

    private String name;
    private Company company = new Company();

    public DeepBusinessCard(){
        System.out.println("执行构造函数 DeepBusinessCard");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String name, String address) {
        this.company.setName(name);
        this.company.setAddress(address);
    }

    public DeepBusinessCard clone() {
        DeepBusinessCard businessCard = null;
        try {
            businessCard = (DeepBusinessCard) super.clone();
            businessCard.company = this.company.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return businessCard;
    }

    public void show() {
        System.out.println("name:" + name);
        System.out.println("company:" + company.show());
    }
}
