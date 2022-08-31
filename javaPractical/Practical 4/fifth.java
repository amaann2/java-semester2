import java.util.Scanner;

public class fifth {
    long num_1, num_2;
    int i = 0, carry = 0;
    int[] sum = new int[10];

    public void add() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Binary Numbers : ");
        num_1 = in.nextLong();
        System.out.println("Enter Second Binary Numbers : ");
        num_2 = in.nextLong();
        in.close();
        while (num_1 != 0 || num_2 != 0) {
            sum[i++] = (int) ((num_1 % 10 + num_2 % 10 + carry) % 2);
            carry = (int) ((num_1 % 10 + num_2 % 10 + carry) / 2);
            num_1 = num_1 / 10;
            num_2 = num_2 / 10;
        }
        if (carry != 0) {
            sum[i++] = carry;
        }
        --i;
        System.out.print("Output: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }

    public static void main(String args[]) {
        fifth p = new fifth();
        p.add();
    }
}