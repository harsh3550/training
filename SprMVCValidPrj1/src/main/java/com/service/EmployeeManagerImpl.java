package com.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.EmployeeDAO;
import com.model.Employee;
@Service
public class EmployeeManagerImpl implements EmployeeManager {
    @Autowired
    EmployeeDAO dao;
    public List<Employee> getAllEmployees()     {
        return dao.getAllEmployees();
    }
}
