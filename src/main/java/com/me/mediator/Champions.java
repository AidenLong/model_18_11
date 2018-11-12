package com.me.mediator;

public class Champions extends WulinAlliance {
    private Wudang wudang;
    private ShaoLin shaolin;
    private Emei emei;
    public void setWudang(Wudang wudang) {
        this.wudang = wudang;
    }
    public void setEmei(Emei emei) {
        this.emei = emei;
    }
    public void setShaolin(ShaoLin shaolin) {
        this.shaolin = shaolin;
    }
    @Override
    public void notice(String message, United united) {
        // 具体消息发送的地方，判断消息发送给谁
        if (united == wudang) {
            shaolin.getNotice(message);
        } else if (united == emei) {
            shaolin.getNotice(message);
        } else if (united == shaolin) {
            wudang.getNotice(message);
            emei.getNotice(message);
        }
    }
}
