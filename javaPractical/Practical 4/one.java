import java.util.Scanner;
class shape{
    int length;
    int width;
    public void getRect(){
        Scanner Sc  = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        length = Sc.nextInt();
        System.out.println("Enter the width of rectangle");
        width = Sc.nextInt();
    }
    public int calArea(){
        return length*width;
    }
}
public class one{
    public static void main(String[] args) {
    shape s1 = new shape();
    s1.getRect();
    System.out.println("Area of rectangle is "+s1.calArea());
    }
}