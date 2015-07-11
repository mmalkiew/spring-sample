package com.mmalkiew.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import com.mmalkiew.quartz.service.SampleService;

/**
 * 
 * Job class.
 * 
 * @author mmalkiew
 *
 */
public class SampleJob implements Job {

    @Autowired
    private SampleService service;
    
    /**
     * Constructor without any parameters in order to avoid
     * java.lang.NoSuchMethodException
     */
    public SampleJob(){   	
    }

    public SampleJob(SampleService service) {
        this.service = service;
    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        service.sayHello();
    }
}
