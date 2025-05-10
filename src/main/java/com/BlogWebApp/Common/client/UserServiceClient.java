package com.BlogWebApp.Common.client;

import com.BlogWebApp.Common.dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "user-service", url = "http://localhost:8082")
public interface UserServiceClient {
    
    @GetMapping("/api/users/email/{email}")
    UserResponse getUserByEmail(@PathVariable String email);
    
    @PostMapping("/api/users")
    UserResponse createUser(@RequestBody UserResponse response);
    
    @GetMapping("/api/users/{id}")
    UserResponse getUserById(@PathVariable Long id);
} 