import java.util.*;
public class commomelementint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an aray");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
         System.out.println("Enter the element of first array");
        for (int i = 0; i < n; i++) {
            arr1[i]= sc.nextInt();
        }
        System.out.println("Enter the element of seconf array");

        for (int i = 0; i < n; i++) {
            arr2[i]= sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i]==arr2[j]) {
                    System.out.println("Duplicate elemet "+arr1[i]);
                }
            }
        }
    }
}
