package com.springsecure;
import org.springframework.security.web.context.*;
public class SecurityWebApplicationInitializer extends
        AbstractSecurityWebApplicationInitializer {
}
/*
Configure the springSecurityFilterChain
The SecurityWebApplicationInitializer will do the following things:
Automatically register the springSecurityFilterChain Filter for every URL
in your application
Add a ContextLoaderListener that loads the WebSecurityConfig
*/