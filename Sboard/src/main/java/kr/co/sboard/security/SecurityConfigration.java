package kr.co.sboard.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfigration {
	
	//@Autowired
	//private SecurityUserService service;
	
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		// 인가(접근권한) 설정
		http.authorizeHttpRequests().antMatchers("/").permitAll();
		
		// 사이트 위변조 요청 방지
		http.csrf().disable();
		
		// 로그인 설정
		/*
		http.formLogin()
		.loginPage("/user2/login")
		.defaultSuccessUrl("/user2/loginSuccess")
		.failureUrl("/user2/login?success=100)")
		.usernameParameter("uid")
		.passwordParameter("pass");
		*/
		// 로그아웃 설정
		/*
		http.logout()
		.invalidateHttpSession(true)
		.logoutRequestMatcher(new AntPathRequestMatcher("/user2/logout"))
		.logoutSuccessUrl("/user2/login?success=200");
		*/
		// 사용자 인증 처리 컴포넌트 서비스 등록
		//http.userDetailsService(service);
		
		return http.build();
	}
	
	@Bean
    public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
    }
}