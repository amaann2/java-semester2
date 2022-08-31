import java.util.*;
class area{
    int l;
    int b;
  public int getArea(int l ,int b){
    return l*b;
  }
  public int perimeter(int l ,int b){
      return 2*(l+b);
  }
}
public class classsques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        area a= new area();
        area b= new area();
        System.out.println(a.getArea(4,5));
        System.out.println(b.getArea(5,9));
        System.out.println(a.perimeter(4,5));
        System.out.println(b.perimeter(5,9));
    }
}
