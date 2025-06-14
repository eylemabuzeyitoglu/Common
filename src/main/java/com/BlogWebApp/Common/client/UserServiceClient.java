package com.BlogWebApp.Common.client;

import com.BlogWebApp.Common.dto.response.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "user-service", url = "http://localhost:8082/api/user")
public interface UserServiceClient {
    
    @GetMapping("/email/{email}")
    UserResponse getUserByEmail(@PathVariable String email);
    
    @PostMapping("/")
    UserResponse createUser(@RequestBody UserResponse response);
    
    @GetMapping("/{id}")
    UserResponse getUserById(@PathVariable Long id);
} 