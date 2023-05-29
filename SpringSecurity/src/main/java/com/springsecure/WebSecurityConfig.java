package com.springsecure;
import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
@EnableWebSecurity
@ComponentScan("com.springsecure")
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withDefaultPasswordEncoder()
                .username("admin").password("java").roles("ADMIN").build());
        return manager;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().hasRole("ADMIN")
                .and().formLogin()
                .and()
                .rememberMe()
                .key("rem")
                .rememberMeParameter("remember") // it is name of checkbox at login page
                .rememberMeCookieName("rememberlogin") // it is name of the cookie
                .tokenValiditySeconds(100) // remember for number of seconds
                .and()
                .httpBasic()
                .and()
                .logout()
                .logoutUrl("/j_spring_security_logout")
                .logoutSuccessUrl("/")  	      ;
    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.authorizeRequests().
//                antMatchers("/index", "/user","/").permitAll()
//                .antMatchers("/admin").authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .and()
//                .rememberMe()
//                .key("rem-me-key")
//                .rememberMeParameter("remember") // it is name of checkbox at login page
//                .rememberMeCookieName("rememberlogin") // it is name of the cookie
//                .tokenValiditySeconds(100) // remember for number of seconds
//                .and()
//                .logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
//    }
}