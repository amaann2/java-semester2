import java.util.*;
public class func {
    public static int sum(int a, int b) {
         int sum = a+b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = sum(a, b);
        System.out.println("sum of number is: "+add);
    }
}