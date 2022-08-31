import java.util.*;

public class four {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("A is greater than b");
        } else if (b > a) {
            System.out.println("b is greater than a");
        } else {
            System.out.println("Both are equal");
        }
    }
}
