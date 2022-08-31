import java.util.Scanner;

class rectangle {
    int length, breadth, height;

    rectangle(int l, int b, int h) {
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    public double area() {
        return length * breadth;
    }

    public double volume() {
        return length + breadth + height;
    }
}

class cuboid extends rectangle {
    int length, breadth, height;

    cuboid(int l, int b, int h) {
        super(l, b, h);
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    public double areaa() {
        return length * breadth;
    }

    public double volumee() {
        return length + breadth + height;
    }
}

public class inherit {
    public static void main(String[] args) {
        int l, b, h;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length");
        l = sc.nextInt();
        System.out.println("Enter the breadth");
        b = sc.nextInt();
        System.out.println("Enter the height");
        h = sc.nextInt();

        cuboid c = new cuboid(l, b, h);
        System.out.println("The area of rectangle is "+c.area());
        System.out.println("The vouume of rectangle is "+c.volume());
        System.out.println("The area of cubid is "+c.areaa());
        System.out.println("The vouume of cubid is "+c.volumee());

    }
}
