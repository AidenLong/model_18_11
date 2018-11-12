package com.me.singleton;

// 枚举单例

/**
 * 枚举单例的优点就是简单，但是大部分应用开发很少用枚举，可读性并不是很高，不建议用。
 */
public enum SingletonEnum {

    INSTANCE;
    public void doSomeThing() {

    }
}
