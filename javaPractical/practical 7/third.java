import java.util.*;
class fact{
    int fact=1;
    fact(int n){    
        for(int i=1;i<=n;i++){    
            fact=fact*i ;
        }
    }
    public int display(){
        return fact;
    }
}
public class third{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();
      fact f = new fact(i);
      System.out.println(f.display());

    }
}