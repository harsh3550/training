package com.hellocontroller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HelloController {
    @RequestMapping("/sayHello.do")
    public String Hello(@RequestParam("username") String name, Model model) {
        model.addAttribute("msg", "Hello " + name);
        return "display";
    }
}
