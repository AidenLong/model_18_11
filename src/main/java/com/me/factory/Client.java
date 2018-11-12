package com.me.factory;

public class Client {

    public static void main(String[] args) {
        ComputerFactory computerFactory = new GDComputerFactor();
        LenovoComputer mLenovoComputer = computerFactory.createComputer(LenovoComputer.class);
        mLenovoComputer.start();
        HpComputer mHpComputer = computerFactory.createComputer(HpComputer.class);
        mHpComputer.start();
    }
}
