class student{
    String name;
    int roll;
    String phone;
    String adress;
}
public class classques3 {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        s1.name="john";
        s2.name="sam";
        
        s1.roll=1;
        s2.roll=2;

        s1.phone="9167920399";
        s2.phone="9619203239";

        s1.adress="mumbai";
        s2.adress="deulghat";

        System.out.println("name is "+s1.name+" roll no  is "+s1.roll+" phone no is "+s1.phone+" adress is "+s1.adress);
        System.out.println("name is "+s2.name+" roll no  is "+s2.roll+" phone no is "+s2.phone+" adress is "+s2.adress);
    }
}
