package com.serv.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ReadParam {
    //    @GetMapping(path="/users")
//    public ModelAndView getUsers(@RequestParam(name="uname", required = false) String uname) {
//
//        ModelAndView modelAndView = new ModelAndView("users", "uname",uname);
//        return modelAndView;
//    }
    @GetMapping(path="/users")
    public ModelAndView getUsers(@RequestParam(name="uname", defaultValue = "Ishu") String uname) {
        ModelAndView modelAndView = new ModelAndView("users", "uname",uname);
        return modelAndView;
    }
}