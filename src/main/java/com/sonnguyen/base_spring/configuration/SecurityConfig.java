package com.sonnguyen.base_spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
//  Define @Bean
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(authorizeHttpRequest ->
                        authorizeHttpRequest.requestMatchers(
                                        "/api/v1/auth/register",
                                        "/api/v1/admin",
                                        "/api/v1/users/**",
                                        "/api/v1/auth/login",
                                        "/api/v1/docs/**")
                                .permitAll()
                                .anyRequest()
                                .authenticated()
                );
        return http.build();
    }
}