import java.util.*;
class array{
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a [] = new int[4];

     for (int i = 0; i < a.length; i++) {
         a[i]= sc.nextInt();
     }

     int count =0;
     for (int i = 0; i < a.length; i++) {
         if (a[i]>=10) {
             count++;
         }
        }
        System.out.println(count);
 }
}