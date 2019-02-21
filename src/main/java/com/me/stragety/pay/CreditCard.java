package com.me.stragety.pay;

import org.springframework.stereotype.Service;

/**
 * @Autor syl
 * @Date 2019/1/31 13:31
 **/
@Service
public class CreditCard extends Card {

    @Override
    protected String getType() {
        return "credit";
    }

    @Override
    protected void exectuTransaction(int cents) {
        System.out.println("doTransaction with credit:" + cents);
    }
}
