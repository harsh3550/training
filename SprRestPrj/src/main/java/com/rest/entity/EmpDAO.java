package com.rest.entity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class EmpDAO {
    private static ArrayList<Emp> emps = new ArrayList<>(Arrays.asList(new Emp(101, "Abc"),
            new Emp(102,"Abcd"),new Emp(103,"Abcde"),
            new Emp(104,"Abcdef")));
    public EmpDAO(){

    }
    public Emp getEmp(int id)
    {
        Emp e=null;
        for(Emp emp : emps){
            if(emp.getEmpId()==id) {
                e = emp;
                break;
            }
        }
        return e;
    }
    public List<Emp> getAllEmps(){
        return emps;
    }
    public void addEmp(Emp e){
        emps.add(e);
    }
    public List<Emp> delEmp(int empID){
        emps.remove(new Emp(empID, "A"));
        return emps;
    }
    public String updateEmp(Emp e){
        String s="Not Found and so could not be Updated";
        for(Emp emp : emps){
            if(emp.getEmpId()==e.getEmpId()) {
                emp.setEmpName(e.getEmpName());
                s="Found and Updated";
                break;
            }
        }
        return s;
    }
}
