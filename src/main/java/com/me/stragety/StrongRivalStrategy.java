package com.me.stragety;

public class StrongRivalStrategy implements FightingStrategy {

    @Override
    public void fighting() {
        System.out.println("对手有点强，撤！");
    }
}
