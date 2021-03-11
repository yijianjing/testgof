package com.gof.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jianjun
 * @version 1.0
 * @date 2021/3/10
 */
public class Leader implements IEmployee{

    private Map<String,IEmployee> targets = new HashMap<String,IEmployee>();

    public Leader() {
        targets.put("a",new EmployeeA());
        targets.put("b",new EmployeeB());
    }

    public void doing(String command) {
        targets.get(command).doing(command);
    }



}
