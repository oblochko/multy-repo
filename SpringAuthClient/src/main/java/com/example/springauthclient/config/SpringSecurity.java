package com.example.springauthclient.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SpringSecurity {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(
                        authorizeRequests -> authorizeRequests.anyRequest().authenticated()
                )
                /*.oauth2Login(
                        oauth2Login ->
                                oauth2Login.loginPage("/oauth2/authorization/tacocloud"))*/
                .oauth2Client(withDefaults());
        return http.build();
    }
}
