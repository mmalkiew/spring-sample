package com.mmalkiew.quartz.configuration;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.scheduling.quartz.SpringBeanJobFactory;

/**
 * This class add autowiring support to quartz jobs.
 *
 * @autho mmalkiew 
 */
public class AutowiringSpringBeanJobFactory extends SpringBeanJobFactory implements ApplicationContextAware {

    private transient AutowireCapableBeanFactory beanFactory;

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		beanFactory = context.getAutowireCapableBeanFactory();
	}
	
	@Override
	protected Object createJobInstance(final TriggerFiredBundle triggerBundle) throws Exception {
		final Object job = super.createJobInstance(triggerBundle);
		beanFactory.autowireBean(job);
		return job;
	}

}
