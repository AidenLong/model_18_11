package com.me.proxy.demo;

public class Ciient {

    public static void main(String[] args) {
        // 静态代理
        ILawSuit proxy = ProxyFactory.getProxy();
        proxy.submit("123123");
        proxy.defend();

        // 动态代理
        ILawSuit dnyProxy = (ILawSuit) ProxyFactory.getDnyProxy(new SecondDogWang());
        dnyProxy.submit("aaaa");
        dnyProxy.defend();
    }
}
