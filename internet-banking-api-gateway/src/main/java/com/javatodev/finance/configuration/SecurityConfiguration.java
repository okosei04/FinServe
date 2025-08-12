package com.javatodev.finance.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
@EnableReactiveMethodSecurity
public class SecurityConfiguration {
    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        return http
                .authorizeExchange(exchanges -> exchanges
                        .pathMatchers("/user/api/v1/register").permitAll() // Allow public access to registration
                        .anyExchange().authenticated() // Require authentication for everything else
                )
                .csrf(csrf -> csrf.disable()) // Disable CSRF protection (only if you're using stateless JWTs)
                .oauth2Login(Customizer.withDefaults()) // Enable OAuth2 login (useful if you're building a login UI)
                .oauth2ResourceServer(resourceServer -> resourceServer
                        .jwt(Customizer.withDefaults()) // Enable JWT authentication
                )
                .build();
    }

}
