package com.gof.delegate.simple;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/10
 */
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }
}
