package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    //Configuration One
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeHttpRequests()
                .requestMatchers("/api/customers/index2").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().permitAll()
                .and()
                .httpBasic()
                .and()
                .build();
    }

    //Configuration Two
    /*@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeHttpRequests(auth -> {
                    auth.requestMatchers("/api/customers/index2").permitAll();
                    auth.anyRequest().authenticated();
                })
                .formLogin()
                    .successHandler(successHandler())//Url a donde redirigir al usuario después de iniciar sesión
                    .permitAll()
                .and()
                .sessionManagement()
                    .sessionCreationPolicy(SessionCreationPolicy.ALWAYS)// ALWAYS, NEVER, STATELESS IF_REQUIED
                    .invalidSessionUrl("/login")
                    .maximumSessions(1)
                    .expiredUrl("/login")
                    .sessionRegistry(sessionRegistry())
                .and()
                .sessionFixation()
                    .migrateSession() // migrateSession, newSession, none
                .and()
                .build();
    }*/

    @Bean
    public SessionRegistry sessionRegistry(){
        return new SessionRegistryImpl();
    }

    public AuthenticationSuccessHandler successHandler(){
        return((request, response, authentication) -> {
            response.sendRedirect("/api/customers/session");
        });
    }
}
