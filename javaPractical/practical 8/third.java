import java.util.*;

class add {
    public int add(int a, int b) {
        return a + b;
    }
}

class multiply extends add {
    public int getResult(int a , int b) {
        return a * b;
    }
}
class division extends multiply{
    public int getResult(int a , int b){
        return a/b;
    }
}

public class third {
    public static void main(String[] args) {
    division n = new division();
    Scanner sc= new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(n.add(a,b));
    System.out.println(n.getResult(a, b));
    }
}
