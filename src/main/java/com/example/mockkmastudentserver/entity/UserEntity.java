package com.example.mockkmastudentserver.entity;

import com.example.mockkmastudentserver.model.RoleModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    private String personalId;
    private String userName;
    private String password;
    @Enumerated(EnumType.STRING)
    private RoleModel role;
}
