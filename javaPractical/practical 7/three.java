import java.util.*;

public class three{

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("\n");

            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            three obj = new three(num);
            obj.display();
        }
    }

    int num;
    int fact = 1;

three(int num) {
        this.num = num;
    }

    void display() {
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("\nFactorial of " + num + " is " + fact + "\n");
    }

}
