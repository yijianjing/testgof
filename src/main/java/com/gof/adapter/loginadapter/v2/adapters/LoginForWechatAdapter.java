package com.gof.adapter.loginadapter.v2.adapters;

import com.gof.adapter.loginadapter.ResultMsg;

/**
 * Created by Tom.
 */
public class LoginForWechatAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        System.out.println("LoginForWechatAdapter");
        return null;
    }
}
