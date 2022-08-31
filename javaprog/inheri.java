import java.util.*;

class circle {
    int radius;

    circle(int r) {
        this.radius = r;

    }

    public double result() {
        return Math.PI * radius * radius;
    }
}

class cylinder extends circle {
    int height;
    cylinder(int r, int h) {
        super(r);
        this.height = h;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class inheri {
    public static void main(String[] args) {
        int h, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius for circle and cylinder");
        r = sc.nextInt();
        System.out.println("Enter the heights for cylinder");
        h = sc.nextInt();
        cylinder c = new cylinder(r,h);
        System.out.println(c.result());
        System.out.println(c.volume());
    }
}