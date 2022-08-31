import java.util.*;

class matches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int count = 0;

            int list[] = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
            // System.out.println("enter the value of a");
            int a = sc.nextInt();
            // System.out.println("enter the value of b");
            int b = sc.nextInt();
            int res = a + b;
            while (res != 0) {
                int x = res % 10; // return last digit
                count += list[x];
                res = res / 10; // remove last digit
            }
            System.out.println(count);
        }

    }
}