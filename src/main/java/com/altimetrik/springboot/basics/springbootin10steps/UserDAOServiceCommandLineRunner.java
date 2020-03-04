package com.altimetrik.springboot.basics.springbootin10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.altimetrik.springboot.basics.springbootin10steps.entity.User;
import com.altimetrik.springboot.basics.springbootin10steps.service.UserDAOService;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
    @Autowired
    private UserDAOService userDAOService;

    @Override
    public void run(String... args) throws Exception {
        User user = User.of("Jack", "Admin");
        long insert = userDAOService.insert(user);
        LOG.info("id = {}", insert);

    }

}
