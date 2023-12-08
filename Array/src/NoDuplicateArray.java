import java.util.Scanner;

public class NoDuplicateArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter N = ");
        int n=input.nextInt();
        int []a=new int[n];
        loop1:for(int i=0;i<n;i++){
            System.out.print("Enter a["+i+"]= ");
            int temp=input.nextInt();
            for(int j=0;j<i;j++){
                if(temp==a[j]){
                    i--;
                    System.out.println("Value "+a[j]+" already exist!!");
                    continue loop1;
                }
            }
            a[i]=temp;
        }
        System.out.println("List all Element of Array :");
        for(int i=0;i<a.length;i++){
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}
