package com.jdbc;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import java.util.*;
import java.sql.*;
public class EmployeeDao {
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public int saveEmployee(Employee e){
        String query="insert into employee16895 values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
        return jdbcTemplate.update(query);	//executeUpdate()
    }
    public int updateEmployee(Employee e){
        String query="update employee16895 set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";
        return jdbcTemplate.update(query);
    }
    public int deleteEmployee(Employee e){
        String query="delete from employee16895 where id='"+e.getId()+"' ";
        return jdbcTemplate.update(query);
    }
    public List<Employee> getAllEmployees(){
        return jdbcTemplate.query("select * from employee16895",new ResultSetExtractor<List<Employee>>(){
            @Override
            public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<Employee> list=new ArrayList<Employee>();
                while(rs.next()){
                    list.add(new Employee(rs.getInt(1),rs.getString(2), rs.getInt(3)));
                }
                return list;
            }});
    }
}