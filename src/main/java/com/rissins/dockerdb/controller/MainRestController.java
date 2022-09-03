package com.rissins.dockerdb.controller;

import com.rissins.dockerdb.dto.UserRequest;
import com.rissins.dockerdb.dto.UserResponse;
import com.rissins.dockerdb.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MainRestController {
    private final UserService userService;

    @PostMapping
    public void save(@RequestBody UserRequest userRequest) {
        userService.save(userRequest);
    }

    @GetMapping
    public List<UserResponse> get() {
        return userService.findAll();
    }
}
