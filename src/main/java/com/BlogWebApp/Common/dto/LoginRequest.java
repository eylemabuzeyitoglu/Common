package com.BlogWebApp.Common.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
    private Long userId;
    private String email;
    private String password;
}
