package com.me.stragety.pay;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Autor syl
 * @Date 2019/1/31 13:39
 **/
public class Client {

    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.addItem(new Item("JVM书籍", 10000));
        bill.addItem(new Item("眼镜", 50000));

        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        bill.pay(Card.paymentMethodMap.get("debit"));
    }
}
