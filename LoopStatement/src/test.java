public class test {
    public static void main(String[] args) {
        int n=10;
        int j=0;
        for (int i=1;i<=n;i++){
            if(i%3==0) {
                System.out.println(3);
                j=1;
            } else if (i==n) {
                System.out.println(j);
            } else {
                System.out.println(0);
                j++;
            }
        }
    }
}
