import java.util.*;

public class four {
    public static void main(String[] args) {
        int r,even=0,odd=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number");
        int a = sc.nextInt();
        System.out.println("Enter End number");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            r=i%2;
            if (r==0) {
               even++; 
            }
        }

        for (int i = a; i <= b; i++) {
            r=i%2;
            if (r==1) {
               odd++; 
            }
        }
   System.out.println("There are "+even+" even number between "+a+" and "+b);
   System.out.println("There are "+odd+" odd number between "+a+" and "+b);

    }
}
