package com.controller;
import com.model.User;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;
@Controller
public class UserController {
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new
                StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,
                stringTrimmerEditor);
    }
    @RequestMapping("/regd")
    public String showForm(Model theModel) {
        theModel.addAttribute("user", new User());
        return "UserForm";
    }
    @RequestMapping("/Form")
    public String processForm(@Valid @ModelAttribute("user") User theCustomer, BindingResult theBindingResult) {
        if (theBindingResult.hasErrors()) {
            return "UserForm";
        } else {
            return "Output";
        }
    }
}