package com.bishe.cable_security.service.impl;

import com.bishe.cable_security.service.RanderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * TODO
 *
 * @author lijie
 * @date 2019-11-25 13:59
 */
@Slf4j
@Service
public class RanderServiceImpl implements RanderService {


    private RanderTwoService randerTwoService;

    @Override
    @Transactional
    public void checkRander(String name) {

    }
}
