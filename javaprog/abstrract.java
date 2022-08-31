abstract class base {
    base() {
        System.out.println("I am a base constructor");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();
}

class base2 extends base {
    @override
    public void greet() {
        System.out.println("Good morning");
    }

}

public class abstrract {
    public static void main(String[] args) {
    base2 b = new base2();
    }
}
