package com.gof.decorator.passport.old;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/12
 */
public interface ISigninService {

    ResultMsg regist(String username, String password);

    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    ResultMsg login(String username, String password);
}
