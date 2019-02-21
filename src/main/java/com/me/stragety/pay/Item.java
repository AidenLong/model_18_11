package com.me.stragety.pay;

/**
 * @Autor syl
 * @Date 2019/1/31 13:34
 **/
public class Item {

    private String desc;
    private int cents;

    public Item(String desc, int cents) {
        this.desc = desc;
        this.cents = cents;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCents() {
        return cents;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }
}
