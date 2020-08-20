package com.onlinegames.novel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {		
		http.csrf().disable();
		
		
		http.authorizeRequests()
			.antMatchers("/", "/home").permitAll()
			.antMatchers("/login").anonymous()
			.anyRequest().authenticated().and()
		.formLogin()
	        .loginPage("/login")
	        .loginProcessingUrl("/login")
	        .defaultSuccessUrl("/", true)
	        .failureUrl("/index?error=true").and()
	    .logout()
	        .logoutUrl("/logout")
	        .logoutSuccessUrl("/")		
	        .deleteCookies("JSESSIONID");
	    
		http.headers().frameOptions().sameOrigin();
	}

	@Configuration
	protected static class AuthenticationConfiguration extends GlobalAuthenticationConfigurerAdapter {

		@Override
		public void init(AuthenticationManagerBuilder auth) throws Exception {
			auth.inMemoryAuthentication().withUser("admin").password(passwordEncoder().encode("admin")).roles("ADMIN");
		}

		@Bean
		public PasswordEncoder passwordEncoder() {
			return new BCryptPasswordEncoder();
		}
	}
}