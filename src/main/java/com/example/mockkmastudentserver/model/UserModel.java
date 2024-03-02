package com.example.mockkmastudentserver.model;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    private String personalId;
    private String userName;
    private String password;
    private RoleModel role;
}
