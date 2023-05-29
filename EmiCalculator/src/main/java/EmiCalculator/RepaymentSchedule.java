package EmiCalculator;

import java.util.ArrayList;
import java.util.List;

public class RepaymentSchedule {
//    public static void main(String[] args) {
//        System.out.println(generateRepaymentSchedule(500000,12,14));
//    }

    private static double calculateEmi(double p, double r, int tenure) {
        r = (r/12)/100;
        double sum = Math.pow((1+r),tenure);
        double emi = (p * r * sum)/(sum-1);
        return Currency.roundOff(emi);
    }

    public static List<String> generateRepaymentSchedule(double principal, double annual_rate, int tenure_in_months) {
        double emi = calculateEmi(principal, annual_rate, tenure_in_months);
        String schedule = new String("");
        schedule = "                                                                                                           " +

                " " + "SL No.     Principal        EMI        Interest                     P.Comp        New Principal\n";
        // String res = "";
        // schedule += calculateSchedule(schedule,1, tenure_in_months, emi, principal,
        // annual_rate);
        return calculateSchedule(schedule, 1, tenure_in_months, emi, principal, annual_rate);
    }

    static List<String> list = new ArrayList<>();

    private static List<String> calculateSchedule(String schedule, int count, int tenure, double emi, double principal, double apr) {


        if (count == (tenure + 1)) {
            // return schedule;
            list.add(schedule);
            return list;
        }

        double interest = calculateInterest(principal, apr);
        double principal_component = Currency.roundOff(emi - interest);
        double new_principal = Currency.roundOff(principal - principal_component);

        schedule += count + "         " + principal + "       " + emi + "         " + interest + "      "
                + principal_component + "         " + new_principal + "\n";
        // System.out.print("tenure "+count+'\n'+ schedule);
        principal = new_principal;

        calculateSchedule(schedule, count + 1, tenure, emi, principal, apr);
        return list;
    }

    private static double calculateInterest(double principal, double apr) {
        return Currency.roundOff((int)principal * apr * 30)/(100*360);
    }
}
