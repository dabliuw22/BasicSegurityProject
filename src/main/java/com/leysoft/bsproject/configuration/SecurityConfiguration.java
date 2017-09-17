package com.leysoft.bsproject.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().
			withUser("dabliuw22").password("barcelona22").roles("USER", "ADMIN");
		auth.inMemoryAuthentication().
			withUser("herpao").password("herpao19").roles("USER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/").permitAll()
			.antMatchers("/admin/**").access("hasRole('ADMIN')")
			.antMatchers("/user/**").access("hasRole('USER') or hasRole('ADMIN')")
			.and().formLogin().loginPage("/login").defaultSuccessUrl("/", true)
				.usernameParameter("username").passwordParameter("password")
			.and().csrf()
			.and().exceptionHandling().accessDeniedPage("/login");
	}
}
