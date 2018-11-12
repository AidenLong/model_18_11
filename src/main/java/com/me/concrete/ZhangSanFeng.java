package com.me.concrete;

public class ZhangSanFeng extends AbstractSwordsman {
    @Override
    protected void neigong() {
        System.out.println("运行纯阳无极功");
    }

    @Override
    protected void weapons() {
        System.out.println("使用真武剑");
    }

    @Override
    protected void moves() {
        System.out.println("使用招式神门十三剑");
    }

    @Override
    protected void hook() {
        System.out.println("突然肚子不舒服，老夫先去趟厕所");
    }
}
