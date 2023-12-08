import java.text.DecimalFormat;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter P1 :$ ");
        double p1=input.nextFloat();
        System.out.print("Enter P2 :$ ");
        double p2=input.nextFloat();
        System.out.print("Enter P3 :$ ");
        double p3=input.nextFloat();
        if(p1>=0 && p2>=0 && p3>=0){
            double total,disPrice,payment,dis;
            int ticket;
            total=p1+p2+p3;
            if (total < 1) dis=0;
            else if(total<=50) dis=5;
            else if (total<=150) dis=10;
            else dis=15;
            disPrice=total*dis/100;
            payment=total-disPrice;
            ticket= (int) (total/10);
            DecimalFormat df=new DecimalFormat("$#,##0.00");
            System.out.println("---------------------------------------");
            System.out.println("Total :"+ df.format(total));
            System.out.println("Discount : "+dis+" %");
            System.out.println("Discount Price : "+df.format(disPrice));
            System.out.println("---------------------------------------");
            System.out.println("Payment : "+df.format(payment));
            System.out.println("Ticket : "+ticket+"t");
        }else{
            System.out.println("Invalided Input!!!!!");
        }
    }
}
