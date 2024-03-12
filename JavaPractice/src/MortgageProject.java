import java.text.NumberFormat;
import java.util.Scanner;
public class MortgageProject {
    public static void main(String[] args){
        final byte Mon_in_year = 12;
        final byte percent = 100;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Principal :");
        int principal = sc.nextInt();

        System.out.print("Annual Interest Rate :");
        float annualInterest = sc.nextFloat();
        float monthlyInterest = annualInterest / percent /Mon_in_year;
  
        System.out.print("Period(years) :");
        byte years = sc.nextByte();
        int NoOfPayments = years * Mon_in_year;

        double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest,NoOfPayments)
                                    / (Math.pow(1+monthlyInterest,NoOfPayments)-1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance( ).format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);






    }
}
