import java.util.Scanner;

public class RemoveByIndex {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter N = ");
        int n=input.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a["+i+"]= ");
            a[i]=input.nextInt();
        }
        int index;
        do{
            System.out.print("Enter Index to remove : ");
            index=input.nextInt();
        }while (!(index>=0 && index<n));
        int []temp=a;
        a=new int[n-1];
        for(int i=0,j=0;i<temp.length;i++){
            if(i==index)continue;
            a[j]=temp[i];
            j++;
        }
        temp=null;
        System.out.println("List all Element of Array :");
        for(int i=0;i<a.length;i++){
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}
