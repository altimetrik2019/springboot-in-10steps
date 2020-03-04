package com.altimetrik.springboot.basics.springbootin10steps;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.altimetrik.springboot.basics.springbootin10steps.entity.User;
import com.altimetrik.springboot.basics.springbootin10steps.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = User.of("Jill", "Admin");
        user = userRepository.save(user);
        LOG.info("jill id = {}", user.getId());

        User userWithIdOne = userRepository.findById(1L).orElse(User.of(null, null));
        LOG.info("user with id 1 = {}", userWithIdOne.getName());

        List<User> userList = userRepository.findAll();
        LOG.info("user list created {}", userList.size());
    }

}
