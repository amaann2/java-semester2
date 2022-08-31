class employee{
    String name;
    int yoj;
    String address;

    public void display(String name,int yoj, String address){
       System.out.println(name+"  "+yoj+"  "+address);
    }   
 
}
public class classquest10 {
    public static void main(String[] args) {
        employee e1= new employee();
        e1.display("john",2001,"mumbai");
        e1.display("amaan",2001,"mumbai");
        e1.display("huzair",2001,"mumbai");
    }
}
