import java.util.Scanner;

public class AmicableNumbers {
    static int sum(int sum){
        int x = 0;
        for(int i=1;i<sum;i++){
            if(sum%i==0) x+=i;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter P :");
        int p=input.nextInt();
        for (int i=0;i<=p;i++){
             int t=sum(i);
             if(i==sum(t)){
                 if(t!=sum(t)){
                     System.out.println(i+" - "+t);
                     i=t+1;
                 }
             }
        }
    }
}
