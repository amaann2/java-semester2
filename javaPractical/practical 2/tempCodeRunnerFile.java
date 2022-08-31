import java.util.*;

class three {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        int n = sc.nextInt();
        System.out.println("THE DIVISORS OF NUMBER " + n + " ARE:");
        for (int i = 1; i <= n; ++i) {
            if (n % i == 0)
                System.out.print(i + "  ");
        }
    }
}
