import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Loan_Decrease {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Loan = $");
        double loan = input.nextDouble();
        System.out.print("Enter Interest Rate = %");
        int rate = input.nextInt();
        System.out.print("Enter Month =");
        int duration = input.nextInt();
        LocalDate currentDate = LocalDate.now();
        System.out.println("Date Received : "+currentDate);
        float interestRate=(float) rate/100;
        double debtBalance=loan;
        System.out.print(String.format("%-17s","Month").replace(" ","-"));
        System.out.print(String.format("%-17s","Installment").replace(" ","-"));
        System.out.print(String.format("%-17s","Principle").replace(" ","-"));
        System.out.print(String.format("%-17s","Interest").replace(" ","-"));
        System.out.println("DebtBalance");
        DecimalFormat df=new DecimalFormat("$0.00");
        double totalInterest=0;
        double installment;
        double principle=loan/duration;
        double interest;
        for(int i=1;i<=duration;i++){
            currentDate = currentDate.plusMonths(1);
            interest=debtBalance*interestRate;
            installment=principle+interest;
            debtBalance-=principle;


            System.out.print(String.format("%-18s",currentDate).replace(" ","-"));
            System.out.print(String.format("%-17s",df.format(installment)).replace(" ","-"));
            System.out.print(String.format("%-17s",df.format(principle)).replace(" ","-"));
            System.out.print(String.format("%-17s",df.format(interest)).replace(" ","-"));
            System.out.println(df.format(debtBalance));

            totalInterest+=interest;
        }
        System.out.println("===========================================================================");
        System.out.println("Total Interest : "+df.format( totalInterest));
        System.out.println("Total : "+df.format( loan+totalInterest));

    }
}
