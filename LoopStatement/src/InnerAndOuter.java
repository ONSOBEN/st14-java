import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class InnerAndOuter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        loop1: do{
            System.out.print("");
            System.out.print("Enter N = ");
            int n=input.nextInt();
            loop2:do {
                System.out.println("Show Menu ");
                System.out.println("1. 1 + 3 + 5 + 7 + 9 ......2n-1");
                System.out.println("2. 2 + 4 + 6 + 8 + 10 .....2n");
                System.out.println("3. 1 - 2 + 3 - 4 + 5.....+-n");
                System.out.println("4. 1/2 + 3/4 + 5/6 +7/8.....(2n-1)/(2n)");
                System.out.print("Choose Number : ");
                int op=input.nextInt();
                String str1="",str2="",str3="",str4="";
                double s1=0,s2=0,s3=0,s4=0;
                if(op==1){
                    for(int i=1;i<=n;i++){
                        str1+=(i*2-1)+" + ";
                        s1+=(i*2-1);
                    }
                    System.out.println(str1+"\b\b="+s1);
                }else if(op==2){
                    for(int i=1;i<=n;i++){
                        str2+=(i*2)+" + ";
                        s2+=(i*2);
                    }
                    System.out.println(str2+"\b\b="+s2);
                }else if(op==3){
                    for(int i=1;i<=n;i++){
                        if(i%2!=0) {
                            str3+=i+" - ";
                            s3+=i;
                        }
                        else {
                            str3+=i+" + ";
                            s3-=i;
                        }
                    }
                    System.out.println(str3+"\b\b="+s3);
                } else if (op==4) {
                    for(int i=1;i<=n;i++){
                        str4+=(i*2-1)+"/"+(i*2)+" + ";
                        s4+=(double)(i*2-1)/(i*2);
                    }
                    System.out.println(str4+"\b\b="+s4);
                }
                System.out.println("Sub Menu ");
                System.out.println("a. Choose number again");
                System.out.println("b. Enter n again");
                System.out.println("c. Exit ");
                input.nextLine();
                System.out.print("Choose Character : ");
                String choice=input.nextLine();
                if(choice.equalsIgnoreCase("a")){
                    continue loop2;
                } else if (choice.equalsIgnoreCase("b")) {
                    continue loop1;
                } else if (choice.equalsIgnoreCase("c")) {
                    System.out.println("Program has been closed!!!!!!!!!!!!!!!");
                    break loop1;
                }
            }while (true);
        }while(true);

    }
}
