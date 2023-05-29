package com.springsecure;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//import com.springsecure.dao.AppUserDetailsServiceDAO;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import java.sql.SQLException;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    public DataSource getDataSource() throws SQLException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:training@//10.1.50.198:1535/nsbt19c");
        dataSource.setUsername("training");
        dataSource.setPassword("training");
        return dataSource;
    }
    @Override
    public void configure(AuthenticationManagerBuilder auth)
            throws Exception {

        // in-memory authentication
        // auth.inMemoryAuthentication().withUser("monica").password("java").roles("USER");

        // using custom UserDetailsService DAO
        // auth.userDetailsService(new AppUserDetailsServiceDAO());

        // using JDBC
        //Context ctx = new InitialContext();
        DataSource ds = (DataSource) getDataSource();

        final String findUserQuery = "select username, password, enabled "
                + "from users16895 " + "where username = ?";
        final String findRoles = "select username, authority " + "from authorities16895 "
                + "where username = ?";

        auth.jdbcAuthentication().dataSource(ds)
                .passwordEncoder(NoOpPasswordEncoder.getInstance());
        //.usersByUsernameQuery(findUserQuery)
        // .authoritiesByUsernameQuery(findRoles);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                // Spring Security should completely ignore URLs ending with .html
                .antMatchers("/*.html");
    }

}

