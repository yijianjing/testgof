package com.gof.proxy.cglibproxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/10
 */
public class CGlibMeipo implements MethodInterceptor {


    public Object getInstance(Class<?> clz) {
        //相当于Proxy，代理的工具类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println("after");
        return obj;
    }
}
