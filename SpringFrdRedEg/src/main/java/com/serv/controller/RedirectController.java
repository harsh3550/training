package com.serv.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class RedirectController {
    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("index");
    }
    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public ModelAndView redirect() {
        return new ModelAndView("redirect:finalPage.html");
    }
    @RequestMapping(value = "/forward", method = RequestMethod.GET)
    public ModelAndView forwd() {
        return new ModelAndView("forward:finalPage.html");
    }
    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public ModelAndView finalPage() {
        return new ModelAndView("final");
    }
}
