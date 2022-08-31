import java.util.*;
public class vaciine
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int age[]= new int[n];        
        int count =0 ;
for (int i = 0; i < age.length; i++) {
    
       age[i]= sc.nextInt();
       if (age[i]>=90 || age[i]<=9 ) {
          count++;
       }

}
if (d==1) {
    System.out.println(n);
}
else{
    
}
count += n/d;

System.out.println("count is "+count);
    }
}