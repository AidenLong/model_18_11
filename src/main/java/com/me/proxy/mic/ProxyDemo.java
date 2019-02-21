package com.me.proxy.mic;

import net.sf.cglib.core.DebuggingClassWriter;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @Autor syl
 * @Date 2019/1/31 10:33
 **/
public class ProxyDemo {

    public static void main(String[] args) {
        // 静态代理
        /*Payment payment = new ThirdChannelPayment();
        System.out.println(payment.doPay("mic"));

        ThirdChannelProxy proxy = new ThirdChannelProxy();
        proxy.doPay("Mic");*/

        // 动态代理
        DynamicProxy dynamicProxy = new DynamicProxy();
        Payment payment = new ThirdChannelPayment();
        Payment p1 = (Payment) dynamicProxy.bind(payment);
        System.out.println(p1.doPay("mic"));

        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", ThirdChannelPayment.class.getInterfaces());
        String path = "PaymentProxy.class";
        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(classFile);
            fos.flush();
            System.out.println("end");
        } catch (Exception e) {

        }

    }
}
