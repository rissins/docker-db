package com.rissins.dockerdb.dto;

import com.rissins.dockerdb.domain.User;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserRequest {

    private String name;
    private String password;

    public User toEntity() {
        return User.builder()
                .name(name)
                .password(password)
                .build();
    }
}
