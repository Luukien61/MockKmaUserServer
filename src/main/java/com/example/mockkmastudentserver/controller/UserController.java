package com.example.mockkmastudentserver.controller;

import com.example.mockkmastudentserver.entity.UserEntity;
import com.example.mockkmastudentserver.model.RoleModel;
import com.example.mockkmastudentserver.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @GetMapping("/user/ct06")
    public ResponseEntity<List<UserEntity>> getUsers() {
        return ResponseEntity.ok(userService.findAllByRole(RoleModel.USER));
    }

}
