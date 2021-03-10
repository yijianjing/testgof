package com.gof.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/10
 */
public class JDKMeipo implements InvocationHandler {

    private Object target;

    public Object getInstance(Object target) throws Exception{
        this.target=target;
        Class<?> clz=target.getClass();
        return Proxy.newProxyInstance(clz.getClassLoader(),clz.getInterfaces(),this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始物色");
        Object obj=method.invoke(this.target,args);
        System.out.println("OK的话，准备办事");
        return obj;
    }
}
