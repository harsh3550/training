package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    public List<Employee> getAllEmployees()
    {
        List<Employee> employees = new ArrayList<Employee>();

        Employee vo1 = new Employee();
        vo1.setId(1);
        vo1.setFirstName("Ishu");
        vo1.setLastName("Gupta");
        employees.add(vo1);

        Employee vo2 = new Employee();
        vo2.setId(2);
        vo2.setFirstName("Ishani");
        vo2.setLastName("Choudhury");
        employees.add(vo2);

        return employees;
    }
}
