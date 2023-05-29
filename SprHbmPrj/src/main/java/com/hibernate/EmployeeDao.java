package com.hibernate;
import java.util.*;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
public class EmployeeDao {
    HibernateTemplate template;
    public void setTemplate(HibernateTemplate template) {  this.template = template; }
    @Transactional(readOnly = false)
    public void saveEmployee(Employee e){  	template.save(e); 	}
    @Transactional(readOnly = false)
    public void updateEmployee(Employee e){  	template.update(e); }
    @Transactional(readOnly = false)
    public void deleteEmployee(Employee e){  template.delete(e);  }
    @Transactional(readOnly = false)
    public Employee getById(int id){
        Employee e=(Employee)template.get(Employee.class,id);
        return e;
    }
    @Transactional(readOnly = false)
    public List<Employee> getEmployees(){
        List<Employee> list=new ArrayList<Employee>();
        list=template.loadAll(Employee.class);
        return list;
    }
}
//If you specify readOnly as true, the flush mode will be set as FlushMode.NEVER in the current Hibernate Session preventing the session from committing the transaction.
