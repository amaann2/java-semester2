import java.util.*;
public class one{
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        System.out.println("even number between "+a+" and "+b+" is :");
        for (int i = a; i < b; i++) {
            r=i%2;
            if (r==0) {
                System.out.println(i);
            }
        }
        System.out.println("odd number between "+a+" and "+b+" is :");
        for (int i = a; i < b; i++) {
            r=i%2;
            if (r==1) {
                System.out.println(i);
            }
        }
    }
}