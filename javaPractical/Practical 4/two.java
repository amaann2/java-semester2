import java.util.Scanner;

class society{
    int no_Of_Member;
    String society_Name;
    int income;
    int house_No;
    String flat;

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of society: ");
        society_Name =sc.next();
        System.out.println("Enter the number of house: ");
        house_No= sc.nextInt();
        System.out.println("Enter the number of member: ");
        no_Of_Member= sc.nextInt();
        System.out.println("Enter the Income: ");
        income = sc.nextInt();
    }

    public void allocate_flat(){
        if (this.income>=25000) {
            flat = "A type";
        }
        else if (this.income>=20000 && this.income<25000) {
            flat = "B type";
        }
        else if(this.income<15000){
            flat = "C type";
        }
    }

    public void show_data() {
      System.out.println("Society name is "+society_Name);
      System.out.println("House number is "+house_No);
      System.out.println("no of member is is "+no_Of_Member);
      System.out.println("Income is "+income);
      System.out.println("Flat type is "+flat);
    }
}
public class two {
    public static void main(String[] args) {
     society s1 = new society();
     s1.inputData();
     s1.allocate_flat();
    s1.show_data();
    }
}
