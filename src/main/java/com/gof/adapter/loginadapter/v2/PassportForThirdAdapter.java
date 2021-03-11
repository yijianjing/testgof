package com.gof.adapter.loginadapter.v2;

import com.gof.adapter.loginadapter.ResultMsg;
import com.gof.adapter.loginadapter.v1.SiginService;
import com.gof.adapter.loginadapter.v2.adapters.LoginAdapter;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/11
 */
public class PassportForThirdAdapter extends SiginService implements IPassportForThird {
    public ResultMsg loginForQQ(String id) {
        return null;
    }

    public ResultMsg loginForWechat(String id) {
        return null;
    }

    public ResultMsg loginForToken(String token) {
        return null;
    }

    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    public ResultMsg loginForRegist(String username, String passport) {
        return null;
    }

    private ResultMsg processLogin(String key,Class<? extends LoginAdapter> clazz){

        try {
            LoginAdapter adapter=clazz.newInstance();
            if(adapter.support(adapter)){
                return adapter.login(key,adapter);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;


    }
}
