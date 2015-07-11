package com.mmalkiew.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.mmalkiew.quartz.configuration.SchedulerConfig;

/**
 * Runner class
 */
@SpringBootApplication
@Import({SchedulerConfig.class})
public class SpringBootQuartzApplication {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootQuartzApplication.class, args);
    }
}
