import java.util.*;
public class two{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter = 0;

        for (int i = 1; i < num; i++) {
           if (num%i==0) {
               counter++;
           } 
        }

        if (counter==2) {
            System.out.println("Nmmber are prime number");
        }else{
            System.out.println("Number are not prime number");
        }
    }
}