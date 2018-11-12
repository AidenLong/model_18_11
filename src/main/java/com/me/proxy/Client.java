package com.me.proxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        //创建LiuWangShu
//        IShop liuwangshu = new LiuWangShuShop();
////        创建代购者并将LiuWangShu作为构造函数传
//        IShop purchasing = new Purchasing(liuwangshu);
//        purchasing.buy();

        //创建LiuWangShu
        IShop liuwangshu = new LiuWangShuShop();
        //创建动态代理
        DynamicPurchasing mDynamicPurchasing = new DynamicPurchasing(liuwangshu);
        //创建LiuWangShu的ClassLoader
        ClassLoader loader = liuwangshu.getClass().getClassLoader();
        //动态创建代理类
        IShop purchasing = (IShop) Proxy.newProxyInstance(loader, new Class[]{IShop.class}, mDynamicPurchasing);
        purchasing.buy();
    }
}
