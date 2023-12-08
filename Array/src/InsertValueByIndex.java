import java.util.Scanner;

public class InsertValueByIndex {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter N = ");
        int n=input.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a["+i+"]= ");
            a[i]=input.nextInt();
        }
        int index,val;
        do{
            System.out.print("Enter index to insert=");
            index=input.nextInt();
        }while (!(index>=0 && index<n));
        System.out.print("Enter value to insert=");
        val=input.nextInt();
        int []temp=a;
        a=new int[n+1];
        for(int i=0,j=0;i<a.length;i++){
            if(i==index){
                a[i]=val;
                continue;
            }
            a[i]=temp[j];
            j++;
        }
        System.out.println("List all Element of Array :");
        for(int i=0;i<a.length;i++){
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}
