import java.util.Scanner;

public class MountainRange {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter mountain :");
        int mountain=input.nextInt();
        int [] height=new int[mountain];
        for(int i=0;i<mountain;i++){
            System.out.print("Enter a["+i+"] = ");
            height[i] = input.nextInt();
        }
        int peak=0;
        if(height[0]>height[1]) peak++;
        if(height[mountain-1]>height[mountain-2]) peak++;
        for(int i=1;i<mountain-1;i++){
            if(height[i]>height[i-1]&&height[i]>height[i+1]) peak++;
        }
        System.out.println("Peak : "+peak);
    }
}
