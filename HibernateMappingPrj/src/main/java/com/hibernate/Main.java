package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class Main {
    public static void main(String[] args) {
        StudentAddress studentAddress = new StudentAddress();
        studentAddress.setAddress("Delhi, India");
        Student student1 = new Student();
        student1.setStudent_name("AAA1");
        student1.setStudentAddress(studentAddress);
        Student student2 = new Student();
        student2.setStudent_name("AAA2");
        student2.setStudentAddress(studentAddress);
        (studentAddress.getStudents()).add(student1);
        (studentAddress.getStudents()).add(student2);
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(studentAddress);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
