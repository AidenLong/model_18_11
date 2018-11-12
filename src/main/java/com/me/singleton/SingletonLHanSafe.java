package com.me.singleton;

// 懒汉模式（线程安全）

/**
 * 这种写法能够在多线程中很好的工作，但是每次调用getInstance方法时都需要进行同步，
 * 造成不必要的同步开销，而且大部分时候我们是用不到同步的，所以不建议用这种模式。
 */
public class SingletonLHanSafe {

    private static SingletonLHanSafe instance;
    private SingletonLHanSafe() {}
    public static synchronized SingletonLHanSafe getInstance() {
        if (instance == null) {
            instance = new SingletonLHanSafe();
        }
        return instance;
    }
}
