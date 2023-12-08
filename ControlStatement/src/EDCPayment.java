import java.text.DecimalFormat;
import java.util.Scanner;

public class EDCPayment {
    public static void main(String[] args) {
        /*[0,50] 1kw/h =350r
        * [50,150] 1kw/h =650r
        * [150,...] 1kw/h=950r
        * old index,new index >=0 and new index >=old index
        * if not "Invalided Input*/
        Scanner input=new Scanner(System.in);
        long oldMonth,newMonth;
        System.out.print("Enter Old Month : ");
        oldMonth=input.nextLong();
        System.out.print("Enter New Month : ");
        newMonth=input.nextLong();
        if(oldMonth >= 0 && newMonth >= oldMonth){
            long consumption=newMonth-oldMonth;
            double payment;
            if(consumption<=50) {
                payment=consumption*350;
            }
            else if(consumption<=150) {
                payment=(consumption-50)*650+350*50;
            }
            else{
                payment=(consumption-150)*950+100*650+50*350;
            }
            DecimalFormat df=new DecimalFormat("#,##0.## Reil");
            System.out.println("--------------------------");
            System.out.println("Consumption : "+consumption+" kw/h");
            System.out.println("Payment : "+df.format(payment));
        }else System.out.println("Invalided Input!!!!!");

    }
}
