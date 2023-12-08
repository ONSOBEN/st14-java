import java.util.Scanner;

public class RemoveByValue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter N = ");
        int n=input.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a["+i+"]= ");
            a[i]=input.nextInt();
        }
        System.out.print("Enter Value to remove=");
        int val=input.nextInt();
        int count=0;
        for(int temp:a)
            if(temp==val)
                count++;
        if(count>0) {
            System.out.println("Found " + count + " Value" + (count < 2 ? "" : "s") + " in array");
            int[] temp=a;
            a=new int[n-count];
            for(int i=0,j=0;i<temp.length;i++){
                if(val==temp[i])
                    continue;
                a[j]=temp[i];
                j++;
            }
        }else System.out.println("Value Not Found!!!");
        System.out.println("List all Element of Array :");
        for(int i=0;i<a.length;i++){
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}
