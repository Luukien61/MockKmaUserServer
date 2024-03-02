package com.example.mockkmastudentserver.util;

import com.example.mockkmastudentserver.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PopulateUser implements CommandLineRunner {
    private UserService userService;
    @Override
    public void run(String... args) throws Exception {
        populateUser();
    }
    private void populateUser(){
        var users = UserUtil.getUserEntity();
        userService.saveAllUsers(users);
    }
}
