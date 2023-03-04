package com.springcloud.userservice.service;

import com.springcloud.userservice.dto.UserDto;
import com.springcloud.userservice.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserById(String userId);
    Iterable<UserEntity> getUserByAll();
}
