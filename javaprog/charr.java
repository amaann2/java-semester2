import java.util.*;

class charr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
     

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {   
            System.out.println("The Symbol is : " +ch);
            System.out.println("the symbol is number: false");
            System.out.println("the symbol is letter: true");
            System.out.println("The symbol before is "+(ch-1));
            System.out.println("The symbol after is "+(ch+1));

        }
        else{
            System.out.println("The Symbol is : " +ch);
            System.out.println("the symbol is number: true");
            System.out.println("the symbol is letter: false");
            int a=Character.getNumericValue(ch);
            System.out.println("The symbol before is "+(a-1));
            System.out.println("The symbol after is "+(a+1));
             
        }
        
      

    }

  
}