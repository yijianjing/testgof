package com.gof.decorator.passport;

import com.gof.decorator.passport.old.SigninService;
import com.gof.decorator.passport.upgrade.ISiginForThirdService;
import com.gof.decorator.passport.upgrade.SiginForThirdService;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/12
 */
public class DecoratorTest {
    public static void main(String[] args) {


        //满足一个is-mouseevent
        ISiginForThirdService siginForThirdService = new SiginForThirdService(new SigninService());
        siginForThirdService.loginForQQ("sdfasfdasfsf");


    }
}
