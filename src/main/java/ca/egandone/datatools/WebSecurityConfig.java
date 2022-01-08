package ca.egandone.datatools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private CustomOAuth2UserService userService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.authorizeRequests()
				.antMatchers("/oath2/**").permitAll()
				.antMatchers("/", "/home").permitAll()
				.anyRequest().authenticated()
				.and()
				.oauth2Login().loginPage("/login").permitAll().userInfoEndpoint().userService(userService)
				.and().and()
				.logout().permitAll().logoutSuccessUrl("/home?logout=success")
				;
	}

}