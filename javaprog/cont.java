class base{
     int x;
    base(int _x){
       x = _x;
   }
   public void display(){
       System.out.println("x ="+x);
   }
}
class new 

public class cont {
    public static void main(String args[]){
     base b = new base(12); 
     b.display();
    }
}
