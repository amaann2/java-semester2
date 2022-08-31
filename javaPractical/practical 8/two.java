import java.util.*;
class number{
   Scanner sc = new Scanner(System.in);
   int a =sc.nextInt();
   int b =sc.nextInt();
}
class cAdd extends number{
    public int add(){
        return a+b;
    }
}
class csub extends cAdd{
    public int sub(){
        return a-b;
    }
}
public class two {
    public static void main(String[] args) {
        csub a = new csub();
        System.out.println("Addition of number is "+a.add());
        System.out.println("subtraction of number is "+a.sub());
    }
}
