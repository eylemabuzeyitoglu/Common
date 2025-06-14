package com.BlogWebApp.Common.dto.response;

import com.BlogWebApp.Common.model.Role;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {
    private Long userId;
    private String userName;
    private String email;
    private String password;
    private Role role;
}