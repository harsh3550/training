import service.InsuranceCompanyService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        InsuranceCompanyService company = new InsuranceCompanyService();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Add policy");
            System.out.println("2. View all policies");
            System.out.println("3. Add customer");
            System.out.println("4. Assign policy to customer");
            System.out.println("5. View all policies for customer");
            System.out.println("6. Exit");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter policy name:");
                    String policyName = scanner.nextLine();
                    System.out.println("Enter policy type:");
                    String policyType = scanner.nextLine();
                    System.out.println("Enter maximum years:");
                    int maxYears = scanner.nextInt();
                    System.out.println("Enter premium rate per year per lakh:");
                    double premiumRate = scanner.nextDouble();
                    System.out.println("Enter maximum sum assured:");
                    int maxSumAssured = scanner.nextInt();
                    company.addPolicy(policyName, policyType, maxYears, premiumRate, maxSumAssured);
                    break;
                case 2:
                    company.viewAllPolicies();
                    break;
                case 3:
                    System.out.println("Enter customer name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter age:");
                    int age = scanner.nextInt();
                    System.out.println("Enter gender:");
                    String gender = scanner.next();
                    scanner.nextLine(); // consume the newline character
                    System.out.println("Enter address:");
                    String address = scanner.nextLine();
                    System.out.println("Enter phone number:");
                    String phone = scanner.nextLine();
                    company.addCustomer(name, age, gender, address, phone);
                    break;
                case 4:
                    System.out.println("Enter customer name:");
                    String customerName = scanner.nextLine();
                    System.out.println("Enter policy name:");
                    String policyName2 = scanner.nextLine();
                    System.out.println("Enter sum assured:");
                    int sumAssured = scanner.nextInt();
                    System.out.println("Enter years:");
                    int years = scanner.nextInt();
                    System.out.println("Enter payment cycle (monthly/quarterly/annual):");
                    String paymentCycle = scanner.next();
                    company.assignPolicyToCustomer(customerName, policyName2, sumAssured, years, paymentCycle);
                    break;
                case 5:
                    System.out.println("Enter customer name:");
                    String customerName2 = scanner.nextLine();
                    company.viewAllPoliciesForCustomer(customerName2);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 6);
        scanner.close();





    }
}