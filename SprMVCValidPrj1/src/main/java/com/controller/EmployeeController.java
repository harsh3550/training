package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.service.EmployeeManager;

@Controller
public class EmployeeController
{
    @Autowired
    EmployeeManager manager;
    @RequestMapping(value="/getAllEmployees", method = RequestMethod.GET)
    public String welcome(Model model)
    {
        model.addAttribute("employees",manager.getAllEmployees());
        return "employeesListDisplay";
    }
}










//package com.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.SessionAttributes;
//import org.springframework.web.bind.support.SessionStatus;
//
//import com.model.Employee;
//import com.service.EmployeeManager;
//import com.validator.EmployeeValidator;
//
//@Controller
//@RequestMapping("addNew")
//@SessionAttributes("employee")
//public class EmployeeController
//{
//    @Autowired
//    EmployeeManager manager;
//
//    @Autowired
//    EmployeeValidator validator;
//
//    @RequestMapping(method = RequestMethod.GET)
//    public String setupForm(Model model)
//    {
//        Employee employee = new Employee();
//        model.addAttribute("employee", employee);
//        return "addEmployee";
//    }
//
//    @RequestMapping(method = RequestMethod.POST)
//    public String submitForm(@ModelAttribute("employee") Employee employee,
//                             BindingResult result, SessionStatus status)
//    {
//
//        validator.validate(employee, result);
//
//        if (result.hasErrors()) {
//            return "addEmployee";
//        }
//        //Store the employee information in database
//        //manager.createNewRecord(employeeVO);
//
//        //Mark Session Complete
//        status.setComplete();
//        return "redirect:addNew/success";
//    }
//
//    @RequestMapping(value = "/success", method = RequestMethod.GET)
//    public String success(Model model)
//    {
//        return "addSuccess";
//    }
//}