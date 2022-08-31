import java.util.*;

class number {
    int length;
    int breadth;
    public void getDetails(int l, int b) {
        this.length = l;
        this.breadth = b;
    }
}
class area extends number {
    public int getArea() {
        return length * breadth;
    }
}
public class one {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        area n = new area();
        n.getDetails(l, b);
        System.out.println(n.getArea());
    }
}