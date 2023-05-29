package org.example;
import service.Service;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name:");
        String name = scanner.nextLine();
        Service.readDataFromFileAndReturnEmployee(name);
    }
}