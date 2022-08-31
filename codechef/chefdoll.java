import java.util.Scanner;

public class chefdoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            
            // System.out.println("enter a num of doll");
            int n = sc.nextInt();
    
            // System.out.println("enter the doll pair");
            int a[] = new int[n];
    
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                a[j] = sc.nextInt();
                if (a[j] % 2 == 1) {
                    count++;
                }
            }
          
            // System.out.println("doll who are single : " + count);
            System.out.println(count);
        }

    }
}
