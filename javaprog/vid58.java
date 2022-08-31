
interface parent{
    void meth1();
    void meth2();

}
interface child extends parent{
    void meth3();
     void meth4();
}
class mainn implements child{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class vid58 {
    public static void main(String[] args) {
        mainn a =new mainn();
        a.meth1();
        a.meth2();
        a.meth3();
        a.meth4();
    }
}
