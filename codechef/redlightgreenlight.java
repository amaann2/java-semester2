import java.util.*;

public class redlightgreenlight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of testcase:");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            
            // System.out.println("enter the number of player standing in between ali and gihun");
            int x = sc.nextInt();
            
            // System.out.println("Enter the height of ali and gihun");
            int n = sc.nextInt();
            
            int count = 0;
            // System.out.println("Enter the height of each player");
            int h[] = new int[x];

            for (int j = 0; j < x; j++) {
                h[j] = sc.nextInt();
                if (h[j] > n) {
                    count++;
                }
            }

            // System.out.println("player having height more than ali and gihun so ther will be kill by doll " + count);

            System.out.println(count);
        }
    }

}
