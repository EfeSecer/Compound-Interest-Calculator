import java.util.Scanner;
import java.lang.Math;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        //LAYOUT___________________________
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------COMPOUND INTEREST CALCULATOR-----------------");
        System.out.println();
        System.out.print("Inital Deposit : ");
        double initalDeposit = input.nextDouble();
        System.out.println();
        System.out.print("Yearly Interest Rate % : ");
        double interestRate = input.nextDouble();
        System.out.println();
        input.nextLine();
        System.out.println();
        System.out.print("Interest should apply 'monthly' or 'yearly' : ");
        String timePeriod = input.nextLine();
        System.out.println();
        //LAYOUT___________________________
        if(timePeriod.equalsIgnoreCase("monthly"))
        {
            double monthlyResult = monthlyCalculator(initalDeposit,interestRate,input);
            System.out.printf("Total Amount: %.2f\n", monthlyResult);
        }
        if(timePeriod.equalsIgnoreCase("yearly"))
        {
            double yearlyResult = yearlyCalculator(initalDeposit,interestRate,input);
            System.out.printf("Total Amount: %.2f\n", yearlyResult);
        }
        input.close();
    } //main end
    public static double monthlyCalculator(double initalDeposit,double interestRate,Scanner input)
    {
        System.out.print("For how many months should interest accrue? : ");
        double time = input.nextDouble();
        double result = initalDeposit * Math.pow(1 + interestRate/100,time);
        return result;
    }
    public static double yearlyCalculator(double initalDeposit,double interestRate,Scanner input)
    {
        System.out.print("For how many years should interest accrue? : ");
        double time = input.nextDouble();
        double result = initalDeposit * Math.pow(1 + interestRate/100,time);
        return result;
    }
}
