package com.spring.jwt.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthRequest {
    private final String email;
    private final String password;
}
