package com.springcloud.userservice.service;

import com.springcloud.userservice.dto.UserDto;
import com.springcloud.userservice.jpa.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto userDto);
    UserDto getUserById(String userId);
    Iterable<UserEntity> getUserByAll();
    UserDto getUserDetailsByEmail(String email);
}
