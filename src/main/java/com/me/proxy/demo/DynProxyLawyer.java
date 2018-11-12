package com.me.proxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynProxyLawyer implements InvocationHandler {

    private Object target;

    public DynProxyLawyer(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("案件进展:" + method.getName());
        Object result = method.invoke(target, args);
        return result;
    }
}
