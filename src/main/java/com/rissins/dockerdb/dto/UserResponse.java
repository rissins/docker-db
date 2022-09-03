package com.rissins.dockerdb.dto;

import com.rissins.dockerdb.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    private String name;
    private String password;

    public List<UserResponse> fromEntity(List<User> users) {
        return users.stream()
                .map(User::fromEntity)
                .collect(Collectors.toList());
    }
}
