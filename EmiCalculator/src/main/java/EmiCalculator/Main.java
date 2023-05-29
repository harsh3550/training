//package EmiCalculator;
//
//public class Main {
//    public static void main(String[] args) {
////        HomeLoan l  = new HomeLoan();
////        System.out.println(l.EMIcalculator(5000000,10,156));
//        generateRepaymentSchedule(5000000,9,2,25);
//
//
//    }
//
//
//    public static void generateRepaymentSchedule(double principal, double annual_rate, int no_of_yearly_installments, int tenure_in_months) {
//        double emi = calculateEmi(principal, annual_rate, tenure_in_months, no_of_yearly_installments);
//        String schedule = new String("");
//        schedule = "SL No.      Principal       EMI         Interest        P.Comp          New Principal\n";
//        // String res = "";
//        // schedule += calculateSchedule(schedule,1, tenure_in_months, emi, principal,
//        // annual_rate);
//        calculateSchedule(schedule, 1, tenure_in_months, emi, principal, annual_rate, no_of_yearly_installments);
//    }
//
//    private static void calculateSchedule(String schedule, int count, int tenure, double emi, double principal, double apr, int yearlyFrequency) {
//        if (count == (tenure + 1)) {
//            // return schedule;
//            System.out.print(schedule);
//            return;
//        }
//
//        double interest = calculateInterest(principal, apr, yearlyFrequency);
//        double principal_component = (emi - interest);
//        double new_principal = (principal - principal_component);
//
//        schedule += count + "         " + principal + "       " + emi + "         " + interest + "      "
//                + principal_component + "         " + new_principal + "\n";
//        // System.out.print("tenure "+count+'\n'+ schedule);
//        principal = new_principal;
//
//        calculateSchedule(schedule, count + 1, tenure, emi, principal, apr, yearlyFrequency);
//        // return;
//    }
//
//    public static double calculateEmi(double principal, double apr, int tenure, int yearlyFrequency) {
//        // p -> principal
//        // apr -> annual percentage rate
//        // no of yearly pay -> 3,4,12, etc
//        // t -> tenure in months
//        apr = apr / 100;
//        double r = apr / (double) yearlyFrequency;
//        double emi = (principal * r) / (1 - Math.pow(1 + r, -tenure));
////        emi = Currency.roundOff(emi);
//        return emi;
//    }
//
//
//    public static double calculateInterest(double principal, double apr, int yearlyFrequency) {
//        apr = apr / 100;
//        double interest = principal * apr / (double) yearlyFrequency;
////        interest = Currency.roundOff(interest);
//        return interest;
//    }
//
//
//
//}
