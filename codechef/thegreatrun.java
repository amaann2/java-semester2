import java.util.*;

class thegreatrun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int j = 0; j < t; j++) {

            // System.out.println("enter the number of distance");
            int n = sc.nextInt();

            // System.out.println("Enter th enumber of distance at which you can run at
            // best");
            int k = sc.nextInt();

            // System.out.println("Enter the no of girls in each km");
            int a[] = new int[n];

            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }


            int sum = 0;
            for (int i = 0; i < k; i++) {
                sum += a[i];
            }
            int max = sum; //15
            // System.out.println(sum);

            for (int i = k; i < n; i++) {
                sum += a[i]; 
                sum -= a[i - k];
                if (sum > max) {
                    max = sum;
                }
            }
            System.out.println(max);
        }
    }
}