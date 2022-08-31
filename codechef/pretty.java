import java.util.*;

class pretty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            // System.out.println("Enter the first number");
            int l = sc.nextInt();
            // System.out.println("ENter the last number");
            int r = sc.nextInt();
            int count = 0;
            for (int j = l; j <= r; j++) {
                if (j % 10 == 2 || j % 10 == 3 || j % 10 == 9) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}