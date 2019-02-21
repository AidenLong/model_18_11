package com.me.proxy.mic;

/**
 * @Autor syl
 * @Date 2019/1/31 10:32
 **/
public class ThirdChannelPayment implements Payment {

    @Override
    public String doPay(String uid) {
        System.out.println(uid + "发起了支付请求");
        return "success";
    }
}
