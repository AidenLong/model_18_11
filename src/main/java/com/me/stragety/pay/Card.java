package com.me.stragety.pay;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Autor syl
 * @Date 2019/1/31 13:28
 **/
public abstract class Card implements PaymentMethod {

    static Map<String, PaymentMethod> paymentMethodMap = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        paymentMethodMap.put(getType(), this);
    }

    @Override
    public void pay(int cents) {
        System.out.println("use " + getType() + " pay cents: " + cents);
    }

    protected abstract String getType();

    protected abstract void exectuTransaction(int cents);
}
