package com.me.simpleFactory;

public class CreatComputer {

    public static void main(String[] args) {
        ComputerFactory.createComputer("hp").start();
    }
}
