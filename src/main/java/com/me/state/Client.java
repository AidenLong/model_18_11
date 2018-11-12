package com.me.state;

public class Client {

    public static void main(String[] args){
        Context context = new Context();
        context.setMp3State(new PowerOffState());
        context.preSong();
        context.powerOn();
        context.nextSong();
        context.powerOff();
    }
}
