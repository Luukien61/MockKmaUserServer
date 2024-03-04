package com.example.mockkmastudentserver.service;

import com.example.mockkmastudentserver.entity.UserEntity;
import com.example.mockkmastudentserver.model.RoleModel;
import com.example.mockkmastudentserver.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public void saveUser(UserEntity user) {
        try {
            var existUser = userRepository.findByPersonalId(user.getPersonalId().toUpperCase()).orElse(null);
            if (existUser == null) {
                userRepository.save(user);
            }
        } catch (Exception e) {
            throw new RuntimeException("An error occur when saving the user");
        }
    }

    @Transactional
    public void saveAllUsers(List<UserEntity> items) {
        try {
            items.forEach(this::saveUser);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<UserEntity> findAllByRole(String role) {
        try {
            var userRole = RoleModel.valueOf(role.toUpperCase());
            return findAllByRole(userRole);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("The role currently does not exist in the database");
        }
    }

    public List<UserEntity> findAllByRole(RoleModel roleModel) {
        try {
            return userRepository.findAllByRole(roleModel).orElse(null);
        } catch (Exception e) {
            throw new RuntimeException("An error occurs when fetching users");
        }
    }

    public List<UserEntity> findAllUser(){
        try {
            return userRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("An error occurs when fetching users");
        }
    }
}
