package com.jdbc;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
      // int status=dao.saveEmployee(new Employee(101,"Ishu",50000));
        //  status=dao.saveEmployee(new Employee(102,"Ishani",5000));
     //   System.out.println(status);

	//	int status=dao.updateEmployee(new Employee(102,"Ishani",35000));
	//	System.out.println(status);

		// int status=dao.saveEmployee(new Employee(103,"Tanvi",50000));
	//	System.out.println(status);

//        Employee e=new Employee();
//		e.setId(103);
//		int status=dao.deleteEmployee(e);
//		System.out.println(status);


		 List<Employee> list=dao.getAllEmployees();
		for(Employee e:list)
			System.out.println(e);


    }	}
