import java.util.*;
public class sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int sum=0;
        int[] arr = new int[5];  
        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();
        } 
        for (int i = 0; i < 5; i++) {
            sum=sum+arr[i];
            
        }
        System.out.println(sum);
    }
}