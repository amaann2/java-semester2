import java.util.*;

public class duplicatestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the size of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i].equals(arr[j])) && (i != j)) {
                   System.out.println("Duplicate string found "+arr[j]);
                }
            }
        }
    }
}