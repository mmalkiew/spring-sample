package com.mmalkiew.quartz.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Service class.
 * 
 * @author mmalkiew
 *
 */
@Service
public class SampleService {

    private static final Logger logger = LoggerFactory.getLogger(SampleService.class);

    public void sayHello() {
        logger.info("Hello Quartz!!!");
    }
}
