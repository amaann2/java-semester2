import java.util.*;

public class room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount of double room");
        int x = sc.nextInt();
        System.out.println("enter the amount of triple room");
        int y = sc.nextInt();

        int double_amt = (3 * x);
        int triple_amt = (2 * y);

        if (double_amt > triple_amt) {
            System.out.println(triple_amt);
        } else if (double_amt < triple_amt) {
            System.out.println(double_amt);
        } else {
            System.out.println(double_amt);
        }

    }
}