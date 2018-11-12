package com.me.factory;

// 抽象工厂类
public abstract class ComputerFactory {

    public abstract <T extends  Computer> T createComputer(Class<T> clazz);
}
