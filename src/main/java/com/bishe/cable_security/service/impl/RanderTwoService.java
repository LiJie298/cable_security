package com.bishe.cable_security.service.impl;

import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author lijie
 * @date 2019-11-25 14:21
 */
@Service
public class RanderTwoService {

    /**
     *
     */
    public void doSomeThing() {
        System.out.println(Thread.currentThread().getName() + " : doSomeThing");
    }
}
