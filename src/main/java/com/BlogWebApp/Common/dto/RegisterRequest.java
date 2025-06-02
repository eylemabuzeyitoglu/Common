package com.BlogWebApp.Common.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterRequest {
    private Long userId;
    private String userName;
    private String email;
    private String password;
}
