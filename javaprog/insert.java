import java.util.*;
public class insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n =sc.nextInt();

        System.out.println("Enter the element: ");
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Enetr the position");
        int pos = sc.nextInt();
        System.out.println("Enter the element");
        int element = sc.nextInt();

        for (int i = n-1; i > pos-1; i--) {
            a[i]=a[i-1];
        }
        a[pos-1]= element;
        
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
    

}  

