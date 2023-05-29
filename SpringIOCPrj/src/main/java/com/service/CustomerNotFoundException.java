package com.service;
import org.springframework.stereotype.Service;
@Service
public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException() {
        super("Customer not found");
    }
}
