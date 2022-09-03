package com.rissins.dockerdb.domain;

import com.rissins.dockerdb.dto.UserResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String password;

    public UserResponse fromEntity() {
        return UserResponse
                .builder()
                .name(name)
                .password(password)
                .build();
    }
}
