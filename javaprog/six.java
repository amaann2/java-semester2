import java.util.*;

public class six {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter 1 for addition\nEnter 2 for Subtraction\nEnter 3 for division\nEnter 4 for multiply");
        int n = sc.nextInt();
    
        if (n==1){
            System.out.println(a+b);
        } else if(n==2) {
            System.out.println(a-b);
        }
        else if(n==3) {
            System.out.println(a/b);
        }
        else if(n==4){
            System.out.println(a*b);
        }
    }
}
