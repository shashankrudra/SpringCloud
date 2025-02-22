package com.walmart.epi.eureka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {
	
	@Bean
	public SecurityFilterChain defaultConfiguration(HttpSecurity http) throws Exception {
		http.csrf(c -> c.disable())
			.authorizeHttpRequests(request -> request.requestMatchers("/**").authenticated())
			.httpBasic(Customizer.withDefaults());
		
		return http.build();
	}

}
