package com.rissins.dockerdb.service;

import com.rissins.dockerdb.domain.User;
import com.rissins.dockerdb.dto.UserRequest;
import com.rissins.dockerdb.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void save(UserRequest userRequest) {
        User user = userRequest.toEntity();
        userRepository.save(user);
    }
}
