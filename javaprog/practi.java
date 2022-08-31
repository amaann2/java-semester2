class employee{
   String name;
   int id;

   public void getNsalary(int salary){
      System.out.println("YOur salary has been credited"+salary);
   }
   public  void getdetails()
   {
       System.out.println("your name is"+name);
       System.out.println("your id is"+id);
   }
}
public class practi {
    public static void main(String[] args) {
     employee n = new employee(); 

     System.out.println(n.getNsalary(12000));
    }
}
