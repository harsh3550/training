package service;

import exception.DetailsNotAvailableException;
import model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Properties;

public class Service {
    private Service() {
    }
    public static Properties getProperties(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            fis.close();
        }
        return prop;
    }

    public static void readDataFromFileAndReturnEmployee(String name) {
        List<String> empsData = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        Employee emp = new Employee();

        try {
            Properties properties = getProperties("D:\\OneDrive\\OneDrive - nucleusonline\\java assignment\\JavaCodingTest\\src\\main\\resources\\fileName.properties");
            File f = new File((String) properties.get(name));
            System.out.println(f.exists());

            try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                for (String line; (line = br.readLine()) != null; ) {
                    empsData.add(line);
                }
            } catch (NullPointerException npe) {
                throw new DetailsNotAvailableException("File Not Found");
            }
        } catch (IOException ex) {
            throw new DetailsNotAvailableException("File Not Found");
        }
        emp.setEmpName(empsData.get(0));
        emp.setEmail(empsData.get(1));
        emp.setQualification(empsData.get(2));
        emp.setYearsOfExperience(Double.parseDouble(empsData.get(3)));
        emp.setDateOfBirth(empsData.get(4));
        employees.add(setDesignation(emp));
        storeDetailsOfEmployees(employees);
        serializeToStore(employees);
    }

    public static Employee setDesignation(Employee emp) {

        double yoe = emp.getYearsOfExperience();
        String empQual = emp.getQualification();
        if (yoe > 0.0 && yoe <= 1.0 && empQual.equals("B.tech")) {
            emp.setDesignation("ASE");
        } else if (yoe > 3.0 && yoe <= 5.0 && empQual.equals("MCA")) {
            emp.setDesignation("TL");
        } else if (yoe > 5.0 && (empQual.equals("MCA") || empQual.equals("B.tech"))) {
            emp.setDesignation("Project Manager");
        } else if (yoe > 1.0 && yoe <= 3.0 && (empQual.equals("B.tech") || empQual.equals("MCA"))) {
            emp.setDesignation("SE");
        }
        return emp;
    }

    public static void storeDetailsOfEmployees(List<Employee> employees) {
        StringBuilder str = new StringBuilder();

        try (FileWriter fw = new FileWriter("D:\\OneDrive\\OneDrive - nucleusonline\\java assignment\\JavaCodingTest\\src\\main\\java\\files\\detailsOfEmployee.txt")) {
            for (Employee employee : employees) {
                str.append("Name : ").append(employee.getEmpName()).append("\n");
                str.append("DOB : ").append(employee.getDateOfBirth()).append("\n");
                str.append("Email : ").append(employee.getEmail()).append("\n");
                str.append("Qualification : ").append(employee.getQualification()).append("\n");
                str.append("Designation : ").append(employee.getDesignation()).append("\n");
                str.append("YOE : ").append(employee.getYearsOfExperience()).append("\n");
                try {
                    Objects.requireNonNull(fw).append(String.valueOf(str));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void serializeToStore(List<Employee> employees) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("D:\\OneDrive\\OneDrive - nucleusonline\\java assignment\\JavaCodingTest\\src\\main\\java\\files\\details.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            for (Employee employee : employees) {
                objectOutputStream.writeObject(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}