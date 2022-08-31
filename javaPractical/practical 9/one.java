import java.util.*;
abstract class number {
    int num1;
    int num2;

    public void getNumber(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    abstract public int calculate();
}

class add extends number {
    public int calculate() {
        return num1 + num2;
    }
}

class sum extends number {
    public int calculate() {
        return num1 - num2;
    }
}

public class one {
    public static void main(String[] args) {
        add a = new add();
        sum s = new sum();
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        s.getNumber(num1, num2);
        System.out.println(a.calculate());
        System.out.println(s.calculate());
    }
}