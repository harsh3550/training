package com.springsecure;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
public class MvcWebApplicationInitializer extends
        AbstractSecurityWebApplicationInitializer {

    public MvcWebApplicationInitializer() {

        super(WebSecurityConfig.class);
    }
}