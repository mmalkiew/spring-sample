package pl.mmalkiew.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.swing.*;

/**
 * Created by mmalkiew on 2015-03-25.
 */
@EnableAutoConfiguration
@ComponentScan
@EnableJpaRepositories(basePackages = "pl.mmalkiew.app.repository")
@EntityScan(basePackages = "pl.mmalkiew.app.model")
public class SpringBootSecurityHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSecurityHibernateApplication.class, args);
    }
}
