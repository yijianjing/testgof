package com.gof.adapter.loginadapter.v2.adapters;

import com.gof.adapter.loginadapter.ResultMsg;

/**
 * Created by Tom.
 */
public class LoginForTokenAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        System.out.println("LoginForTokenAdapter");
        return null;
    }
}
