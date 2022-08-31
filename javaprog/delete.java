import java.util.*;
public class delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n =sc.nextInt();

        System.out.println("Enter the element: ");
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to delete in an array: ");
        int d = sc.nextInt();
        int count =0;
        for (int i = 0; i < n-1; i++) {
            if (d==a[i]) {
                for (int j = i; j < n-1; j++) {
                    a[j]=a[j]+1;
                }
                count= count+1;
                break;
            }
        }
        if (count==0) {
            System.out.println("number not found");
        }
        else{
            System.out.println("number deleted successful");
        }

        for (int i = 0; i < n-1; i++) {
            System.out.println(a[i]);
        }
    }
}
