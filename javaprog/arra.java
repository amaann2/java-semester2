import java.util.*;

public class arra {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for (int i = 0; i < number.length; i++) {
            if (x == number[i]) {
                System.out.println("Your x is at index:" + i);
            }
        }
    }
}
