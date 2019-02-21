package com.me.proxy.mic;

/**
 * @Autor syl
 * @Date 2019/1/31 10:37
 **/
public class ThirdChannelProxy implements Payment {

    private Payment payment = new ThirdChannelPayment();
    PaymentLogger logger = new PaymentLogger();

    @Override
    public String doPay(String uid) {
        logger.Log(uid);
        return payment.doPay(uid);
    }
}
