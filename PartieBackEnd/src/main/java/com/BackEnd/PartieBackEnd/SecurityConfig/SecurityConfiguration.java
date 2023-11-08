package com.BackEnd.PartieBackEnd.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import com.BackEnd.PartieBackEnd.services.UtilisateurServiceV1;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	
	 @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        return http.cors().disable().csrf().disable()
	                .authorizeHttpRequests()
	                .requestMatchers("/**").permitAll()
	                .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
	                .build();
	    }
	@Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	@Bean
	   public UserDetailsService userDetailsService(){
	        return new UtilisateurServiceV1();
	    }
}
