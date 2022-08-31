import java.util.*;

public class contain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enetr the  element of array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to check");
        int c = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (a[i] == c) {
                System.out.println("Number found at" + i + "index");
            } 

        }
    }
}
