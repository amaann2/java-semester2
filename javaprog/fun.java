import java.util.*;
public class fun {
    public static int multiply(int a,int b){
        return a*b;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer = multiply(a, b);
        System.out.println("multiplication is :"+answer);

    }
}
