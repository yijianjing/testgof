package com.gof.adapter.loginadapter.v1;

import com.gof.adapter.loginadapter.ResultMsg;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/11
 */
public class SinginForThirdService extends SiginService{

    public ResultMsg loginForQQ(String openId){

        return loginForRegist(openId,null);
    }

    public ResultMsg loginForWechat(String openId){
        return null;
    }

    public ResultMsg loginForToken(String token){
        //通过token拿到用户信息，然后再重新登陆了一次
        return  null;
    }

    public ResultMsg loginForTelphone(String telphone,String code){

        return null;
    }

    public ResultMsg loginForRegist(String username,String password){
        super.login(username,password);
        return  super.login(username,password);
    }
}
