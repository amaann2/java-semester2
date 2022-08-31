import java.util.Scanner;

public class chefrating {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number of question: ");
        int n = sc.nextInt();
        
        System.out.println("enter a difficulty level of each question: ");
        int a [] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int count =0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>1000) {
                count++;
            }
        }
        System.out.println("count of question whose difficulty level is greater than 1000 is : "+count);
    }
}
