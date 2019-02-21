package com.me.proxy.mic;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @Autor syl
 * @Date 2019/2/21 20:07
 **/
public class CglibTest {

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "cglib");

        CglibProxy cglibProxy = new CglibProxy();
        ThirdChannelPayment payment = new ThirdChannelPayment();
        ThirdChannelPayment p1 = (ThirdChannelPayment) cglibProxy.getInstance(payment);
        System.out.println(p1.doPay("mic"));
    }
}
