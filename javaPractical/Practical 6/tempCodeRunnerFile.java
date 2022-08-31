import java.util.*;
public class three {
    public static void max(int i ,int j){
          
            if(i> j)
                System.out.println(i+" is greater than "+j);
            else
                System.out.println(j+" is greater than "+i);
    }
    public static void main(String args[]) {
        int i ,j;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        j = sc.nextInt();
        three.max( i ,j);
    }
}
