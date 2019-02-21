package com.me.stragety.pay;

import java.util.ArrayList;
import java.util.List;

/**
 * @Autor syl
 * @Date 2019/1/31 13:35
 **/
public class Bill {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public int getSumCents() {
        return items.stream().mapToInt(Item::getCents).sum();
    }

    public void pay(PaymentMethod paymentMethod) {
        paymentMethod.pay(getSumCents());
    }
}
