import java.util.*;
class two
{
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        String name;
        char gender;
        byte age;
        long mo;
        float percentage;
        double per;
        System.out.println("ENTER YOUR NAME");
        name=sc.next();
        System.out.println("ENTER YOUR GENDER");
        gender=sc.next().charAt(0);
        System.out.println("ENTER YOUR AGE");
        age=sc.nextByte();
        System.out.println("ENTER YOUR MOBILE NUMBER");
        mo=sc.nextLong();
        
        System.out.println("ENTER YOUR PERCENTAGE");
        percentage=sc.nextFloat();
        System.out.println("ENTER YOUR PERCENTAGE for type casting");
        per=sc.nextDouble();
        int percen=(int)per;//type casting

        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(percentage);
        System.out.println(per);
        System.out.println(percen);
        
    }
}

