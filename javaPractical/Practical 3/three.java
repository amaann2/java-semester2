import java.util.*;
public class three{
    public static void main(String args[]){
        int i,sum=0,b;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        b=n;
        while (b>0) {
            i=b%10;
            sum = sum+(i*i*i);
            b=b/10;
        }
        if (n==sum) {
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("not a armstrong number");
        }
    }
}
