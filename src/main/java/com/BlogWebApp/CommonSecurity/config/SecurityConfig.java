package com.BlogWebApp.CommonSecurity.config;

import com.blogapp.commonsecurity.security.JwtAuthenticationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    private final JwtAuthenticationFilter jwtAuthenticationFilter;

    public SecurityConfig(JwtAuthenticationFilter jwtAuthenticationFilter) {
        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // CSRF korumasını kapat
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/auth/**").permitAll() // Giriş işlemleri serbest
                        .requestMatchers("/user/**").authenticated() // Kimliği doğrulanmış kullanıcılar
                        .requestMatchers("/api/blog/**").permitAll() // Blog erişimi serbest
                        .anyRequest().denyAll() // Diğer tüm istekler reddedilir
                )
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

}