package com.synii.knit.uaa.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
public class AuthenticationRequest {
    private final String username;
    private final String password;
}
