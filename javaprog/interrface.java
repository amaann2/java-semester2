
interface Bicycle {
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

 interface amaan{
   void name();
}
class bike{
    void booke(){
        System.out.println("bosj");
    }
}

class avon extends bike implements Bicycle,amaan  {
    public void applyBrake(int decrement) {
        System.out.println("brake");
    }

    public void speedUp(int increment) {
        System.out.println("increase");
    }
    public void name(){
        System.out.println("amaan");
    }

}

public class interrface {
    public static void main(String args[]) {
     avon a = new avon();
     a.applyBrake(8);
     a.speedUp(9);
     a.name();
     a.booke();
     System.out.println(a.a);
    }  
}