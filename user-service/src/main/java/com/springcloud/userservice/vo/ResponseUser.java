package com.springcloud.userservice.vo;

import lombok.Data;

@Data
public class ResponseUser {
    private String email;
    private String name;
    private String userId;
}