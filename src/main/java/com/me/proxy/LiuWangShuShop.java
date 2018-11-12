package com.me.proxy;

//这个购买者LiuWangShu也就是我，实现了IShop接口提供的 buy()方法：
public class LiuWangShuShop implements IShop {
    @Override
    public void buy() {
        System.out.println("LiuWangShu 购买");
    }
}
