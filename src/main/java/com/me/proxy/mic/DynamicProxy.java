package com.me.proxy.mic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Autor syl
 * @Date 2019/1/31 10:40
 **/
public class DynamicProxy implements InvocationHandler {

    private Object target;

    public Object bind(Object target) {
        this.target = target;
        return Proxy.
                newProxyInstance
                        (target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("记录日志开始");
        Object invoke = method.invoke(target, args);
        System.out.println("记录日志结束");
        return invoke;
    }
}
