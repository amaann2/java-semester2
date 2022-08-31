import java.util.Scanner;

public class fourth {
   public static void main(String[] args) {
       int n ,a;
       String s = " ";
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the decimal number");
       n = sc.nextInt();

       while (n>0) {
           a = n%2;
           s =a+" "+s;
           n =n/2;
       }
       System.out.println("Binary number is "+s);
   }
}
