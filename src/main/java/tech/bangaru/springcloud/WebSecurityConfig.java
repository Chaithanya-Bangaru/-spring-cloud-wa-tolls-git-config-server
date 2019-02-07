package tech.bangaru.springcloud;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
/**
 * 
 * @author ivaan
 * By default Spring enforces csrf enabling. Even though we get authorized using Postman with Basic Authentication mechanism, 
 * the /encrypt endpoint is not working and resulted in /forbidden error
 *
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		super.configure(http);
		http.csrf().disable();
	}

}
