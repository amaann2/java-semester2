import java.util.*;
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int n = sc.nextInt();

        if (n>=18) {
            System.out.println("You are eligible for vote");
        }
        else if(n<18){
            System.out.println("your are not eligible you have to wait "+(18-n)+ " year");
        }
    }
}
