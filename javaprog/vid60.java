// abstract class pen {
//     abstract void refil();

//     abstract void write();
// }

// class fountainPen extends pen {
//     void changenib() {
//         System.out.println("change");
//     }

//     void refil() {
//         System.out.println("refil");
//     }
//     void write(){
//         System.out.println("write");
//     }
// }
interface basicAnimal{
    void eat();
    void sleep();
}
class monkey{
    void jump(){
        System.out.println("monkey is jumping");
    }
    void bite(){
        System.out.println("monkey is bite");
    }
}

class human extends monkey implements basicAnimal{
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}

public class vid60 {
    public static void main(String[] args) {
        // fountainPen p = new fountainPen();
        // p.refil();
        // p.write();
        // p.changenib();

        human h = new human();
        h.eat();
        h.sleep();
        h.jump();
        h.bite();

        monkey m = new human();
        m.jump();
       
    }
}
