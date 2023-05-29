package EmiCalculator;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/personalloan")
public class PresonalLoan {

    @POST
    @Path("/EMI")
    @Produces(MediaType.TEXT_HTML)
    public String EMIcalculator(@FormParam("principal2") String Principal, @FormParam("Interest2") String rate, @FormParam("Tenure2") int tenure) {

        List<String> list = new ArrayList<>();
        double p = Integer.parseInt(Principal);
        double r = Double.parseDouble(rate);
        r = (r/12)/100;
        double sum = Math.pow((1+r),tenure);
        double emi = (p * r * sum)/(sum-1);
        int totalPayment = (int)emi*tenure;
        int totalInterestPayable = totalPayment-(int)p;

        list.add("your Each month Emi is " + (int)emi + "<br>");
        list.add("your TotalInterestpayable is " + totalInterestPayable + "<br>");
        list.add("your Total payment is " + totalPayment);
        return list.toString();

    }
}
