package com.me.decorator;

public class Client {

    public static void main(String[] args) {
        YangGuo yangGuo = new YangGuo();
        yangGuo.attackMagic();

        HongQiGong hongQiGong = new HongQiGong(yangGuo);
        hongQiGong.teachAttackMagic();
    }
}
