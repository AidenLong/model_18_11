package com.me.mediator;

public class ShaoLin extends United {
    public ShaoLin(WulinAlliance wulinAlliance) {
        super(wulinAlliance);
    }
    public void sendAlliance(String message) {
        wulinAlliance.notice(message, this);
    }
    public void getNotice(String message) {
        System.out.println("少林收到消息：" + message);
    }
}
