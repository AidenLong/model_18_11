package com.me.concrete;

public class ZhangWuJi extends AbstractSwordsman {
    @Override
    protected void neigong() {
        System.out.println("运行九阳神功");
    }

    @Override
    protected void weapons() {

    }

    @Override
    protected void moves() {
        System.out.println("使用招式乾坤大挪移");
    }

    protected boolean hasWeapons(){
        return false;
    }
}
