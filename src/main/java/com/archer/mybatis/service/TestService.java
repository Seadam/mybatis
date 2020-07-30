package com.archer.mybatis.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Author: Archer
 * @Date: 2020/7/31
 * @Description:
 * @Version: 1.0
 */
@Service
public class TestService {

    private Logger logger = LoggerFactory.getLogger(TestService.class);


    public void say() {
        logger.info("info");

        logger.debug("debug");
    }

}
