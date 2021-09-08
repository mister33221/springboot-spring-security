package com.abc.springbootsecurity.config.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

//下面的DemoWebSecurityConfig即為Spring Security的配置，
//類別前掛上@EnableWebSecurity並繼承WebSecurityConfigurerAdapter。
@EnableWebSecurity
public class DemoWebSercurityConfig extends WebSecurityConfigurerAdapter {

	//如此便可在DemoWebSecurityConfig中透過覆寫WebSecurityConfigurerAdapter的下面方法來自訂各種配置。

	protected void configure(HttpSecurity http) throws Exception{
		//預設v1
//		http
//		.authorizeRequests()
//		.anyRequest()
//		.authenticated()
//		.and().formLogin()
//		.and().httpBasic()
//		.and().csrf().disable(); // <--關閉CSRF 請求食材不嫆另外代CSRF token  (?????
		
		
		//停用預設登入畫面 v2
//		http
//		.authorizeRequests()
//		.anyRequest()
//		.authenticated()
//		.and().formLogin().disable() //停用預設登入畫面
//		.httpBasic(); //保留HTTP basic  驗證
		
		//v3  
		
	}
	
	//userDetailsService()方法建立一個UserDetailsService的Spring Bean類，
	//用來建立一些測試用的使用者帳號密碼資料。
	//目前建立了兩個使用者的帳號/密碼分別為user123/user123與admin123/admin123。
	public UserDetailsService userDetailsService() {
		
		UserBuilder users = User.withDefaultPasswordEncoder();
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(users.username("user123")
								.password("user123")
								.roles("USER").build());
		
		manager.createUser(users.username("admin123")
								.password("admin123")
								.roles("USER","ADMIN")
								.build());
		
		return manager;
		
	}
	
	
	

}
