import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Number Form  ");
        int num1 = input.nextInt();

        System.out.print("To ");
        int num2 = input.nextInt();
        for(int i=num1;i<=num2;i++){
            int count=0;
            int num=i;
            while (num>0){
                count++;
                num/=10;
            }
            int sum=0;
            num=i;
            while (num>0){
                int digit=num%10;
                sum+=Math.pow(digit,count);
                num/=10;
            }
            if(sum==i) System.out.println(i);
        }
    }
}
