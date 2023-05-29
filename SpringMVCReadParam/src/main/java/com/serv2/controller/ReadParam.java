package com.serv2.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class ReadParam {
    @GetMapping("/userid/{id}")
    public ModelAndView getUsersId(@PathVariable String id) {

        ModelAndView modelAndView = new ModelAndView("users", "uname",id);
        return modelAndView;
    }
}