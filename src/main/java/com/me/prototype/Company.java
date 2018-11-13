package com.me.prototype;

public class Company implements Cloneable {

    private String name;
    private String address;

    public Company() {
        System.out.println("执行构造函数 Company");
    }

    public Company clone() {
        Company company = null;
        try {
            company = (Company) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String show() {
        return name + "-address-" + address;
    }
}
