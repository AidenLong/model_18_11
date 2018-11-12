package com.me.stragety;

public class Client {

    public static void main(String[] args) {
        Context context;
        //如果遇到弱的对手
        context = new Context(new WeakRivalStrategy());
        context.fighting();

        //如果遇到强的对手
        context = new Context(new StrongRivalStrategy());
        context.fighting();
    }
}
