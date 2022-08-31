import java.util.Scanner;

class area{
    static int length;
    static int breadth;
    public void getDim(int l , int b){
       length = l;
       breadth =b;
    }
    public int getArea(){
        return length*breadth ;
    }
}
public class rectangle {
    public static void main(String[] args) {
        area a = new area();
        Scanner sc = new Scanner(System.in);
        int l =sc.nextInt();
        int b =sc.nextInt();
        a.getDim(l, b);
        System.out.println(a.getArea());
    }
}
