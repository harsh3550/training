package EmiCalculator;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

import static EmiCalculator.RepaymentSchedule.generateRepaymentSchedule;

@Path("/CarLoan")
public class CarLoan{
    @POST
    @Path("/EMI")
    @Produces(MediaType.TEXT_PLAIN)
    public String EMICalculatorcCar(@FormParam("principal1") String Principal, @FormParam("Interest1") String rate, @FormParam("Tenure1") int tenure) {

        List<String> list = new ArrayList<>();
        double p = Integer.parseInt(Principal);
        double r = Double.parseDouble(rate);
        r = (r/12)/100;
        double sum = Math.pow((1+r),tenure);
        double emi = (p * r * sum)/(sum-1);
        int totalPayment = (int)emi*tenure;
        int totalInterestPayable = totalPayment-(int)p;

        List<String> list1 = generateRepaymentSchedule(p, r, tenure);

        list.add("your Each month Emi is " + emi );
        list.add("your TotalInterestpayable is " + totalInterestPayable );
        list.add("your Total payment is " + totalPayment);
        list.add(list1.toString());
        return list.toString();
    }
}
