package com.altimetrik.springboot.basics.springbootin10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootIn10stepsApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootIn10stepsApplication.class);

	public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(SpringbootIn10stepsApplication.class, args);
        
        /*
         * List<String> beanName = Arrays.asList(appContext.getBeanDefinitionNames());
         * beanName.stream().forEach(b -> LOGGER.info(b));
         */
	}

}
