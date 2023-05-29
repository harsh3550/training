package EmiCalculator;

public class Currency {
    public static double roundOff(double val){
        return Double.parseDouble(String.format("%.2f", val));
    }
}
