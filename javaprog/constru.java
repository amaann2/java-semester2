class base {
    base() {
        System.out.println("I am a base constructor");
    }
    base(int x){
        System.out.println("I am a base constructor with value of x is "+x);
    }
}

class derived extends base {
    derived() {
        System.out.println("I am a derived constructor");
    }
    derived(int x,int y){
        super(x);
        System.out.println("I am derived constructor with value of y is"+y);
    }
}

class child extends derived {
    child(){
        System.out.println("I am a cild constructor");
    }
    child(int x , int y,int z){
        super(x,y);
        System.out.println("I am derived constructor with value of z is"+z);
        
    }
}

public class constru {
    public static void main(String args[]) {
        child d1 = new child(5,3,2);
    }
}
