import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter N : ");
        int n= input.nextInt();
        int odd=0;
        String strOdd="";
        int even=0;
        String strEven="";
        for(int i=1;i<=n;i++){
            strOdd+=(i*2-1)+" + ";
            odd+=i*2-1;
            even+=i*2;
            strEven+=(i*2)+" + ";
        }
        System.out.println(strOdd+"\b\b=" +odd);
        System.out.println(strEven+"\b\b="+even);
    }
}
