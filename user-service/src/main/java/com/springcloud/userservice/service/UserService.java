package com.springcloud.userservice.service;

import com.springcloud.userservice.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
}
