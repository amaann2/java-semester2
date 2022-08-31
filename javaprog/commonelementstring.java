import java.util.*;
public class commonelementstring {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
         String arr1[] = new String[n];
         String arr2[] = new String[n];
         System.out.println("Enter the element of first array");
         for (int i = 0; i < n; i++) {
             arr1[i]= sc.next();
         }
         System.out.println("Enter the element of second array");

         for (int i = 0; i < n; i++) {
             arr2[i]= sc.next();
         }

         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 if (arr1[i].equals(arr2[j])) {
                     System.out.println("comon element s"+arr1[i]);
                 }
             }
         }
    }
}
