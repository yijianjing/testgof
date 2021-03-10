package com.gof.proxy.jdkproxy;

import java.lang.reflect.Method;

/**
 * Created by Tom on 2019/3/10.
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        try {
            Object obj = new JDKMeipo().getInstance(new Girl());
            Method method = obj.getClass().getMethod("findLove",null);
            method.invoke(obj);
        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
