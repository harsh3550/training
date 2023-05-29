package test.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestMain2 {
    public static void main(String[] args) {

        customer cus1 = new customer("Harsh", 21, "darbhanga");
        customer cus2 = new customer("Harish", 26, "patna");
        customer cus3 = new customer("Amar", 24, "jharkhand");
        ArrayList<customer> customerTable = new ArrayList<>();
        customerTable.add(cus1);
        customerTable.add(cus2);
        customerTable.add(cus3);
        System.out.println(customerTable);
    }
}   

//        Collections.sort(customerTable, (cus1, cus2, cus3) -> cus1.getAge() - cus2.getAge());
//
//        for (customer customer : customerTable) {
//            System.out.println(customer.getName() + ", " + customer.getAge() + ", " + customer.getAddress());
//        }
//        if(customerTable.getAge() < 21);
//        {
//            customerTable.remove;
//        }
//
//        customerTable.removeIf(cus -> cus.getAge() < 21);
//        System.out.println(customerTable);
//    }
//}
