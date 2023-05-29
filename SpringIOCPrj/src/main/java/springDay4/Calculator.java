package springDay4;

public class Calculator {
    public int add(int num1, int num2){
        return num1+num2;
    }
    public double add(double num1, double num2){
        return num1+num2;
    }
    public static String add(String str1, String str2){
        return str1+str2;
    }
    public int subtract(int num1, int num2){
        return num1-num2;
    }
    public double subtract(double num1, double num2){
        return num1-num2;
    }
    public int multiply(int num1, int num2){
        return num1*num2;
    }
    public double multiply(double num1, double num2){
        return num1*num2;
    }
    public int divide(int num1, int num2) throws ArithmeticException{
        return num1/num2;
    }
    double divide(double num1, double num2)throws ArithmeticException{
        return num1/num2;
    }
}