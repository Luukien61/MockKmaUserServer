package com.example.mockkmastudentserver.repository;

import com.example.mockkmastudentserver.entity.UserEntity;
import com.example.mockkmastudentserver.model.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,String> {
    Optional<List<UserEntity>> findAllByRole(RoleModel roleModel);
    Optional<UserEntity> findByPersonalId(String id);
}
