package com.me.builder;

public class CreatComputer {

    public static void main(String[] args) {
        Builder builder = new MoonComputerBuilder();
        Dirextor dirextor = new Dirextor(builder);
        dirextor.createComputer("i7-6700","华擎玩家至尊","三星DDR4");
    }
}
