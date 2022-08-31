class A{
    public void meth2(){
        System.out.println("I am a meth2 of class A ");
    }
    A(){
        System.out.println("amaan");
    }
}
class B extends A{
    @override
    public void meth2(){
        System.out.println("I am a meth2 of class b ");
    }
}
public class overrrid {
    public static void main(String[] args) {
        
     A a = new A();
    a.meth2();

    B b = new B();
    b.meth2();
    }
}
