import java.util.*;

public class anasassign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Integer between 1 to 100");
        int[] n = new int[100];
        for (int i = 0; i < 100; i++) {
            n[i] = sc.nextInt();
            if (n[i] < 1 || n[i] > 100) {
                break;
            }
        }
        int fre[] = new int[n.length];
        int vis = -1;

        for (int i = 0; i < n.length; i++) {
            int count = 1;
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] == n[j]) {
                    count++;
                    fre[j] = vis;
                }
            }
            if (fre[i] != vis) {
                fre[i] = count;
            }
        }
        for (int i = 0; i < n.length; i++) {
            if (fre[i] != vis) {

                System.out.println(n[i] + " occurs " + fre[i] + "  times");
            }
        }
    }

}
