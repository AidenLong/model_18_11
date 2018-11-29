package com.me.singleton;

import java.util.concurrent.CountDownLatch;

public class Test {

    public static void main(String[] args) {

        int count = 20;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        SingletonManager.registerService("1111", new Integer[]{});
        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                try {
                    countDownLatch.await();
                    System.out.println(System.currentTimeMillis() + "---" + SingletonManager.getService("1111"));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            countDownLatch.countDown();
        }
    }
}
