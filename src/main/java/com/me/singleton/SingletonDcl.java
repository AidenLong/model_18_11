package com.me.singleton;

// 双重检查模式 （DCL）

/**
 * 这种写法在getSingleton方法中对singleton进行了两次判空，第一次是为了不必要的同步，
 * 第二次是在singleton等于null的情况下才创建实例
 *
 * 在这里使用volatile会或多或少的影响性能，但考虑到程序的正确性，牺牲这点性能还是值得的。
 * DCL优点是资源利用率高，第一次执行getInstance时单例对象才被实例化，效率高。
 * 缺点是第一次加载时反应稍慢一些，在高并发环境下也有一定的缺陷，虽然发生的概率很小。
 * DCL虽然在一定程度解决了资源的消耗和多余的同步，线程安全等问题，但是他还是在某些情况会出现失效的问题，也就是DCL失效
 */
public class SingletonDcl {

    private volatile static SingletonDcl instance;
    private SingletonDcl() {}
    public static SingletonDcl getInstance() {
        if (instance == null) {
            synchronized (SingletonDcl.class) {
                if (instance == null) {
                    instance = new SingletonDcl();
                }
            }
        }
        return instance;
    }
}
