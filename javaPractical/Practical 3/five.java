import java.util.Scanner;

public class five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println(
                "Enter operator\nPress 1 for addition\nPress 2 for subtraction\nPress 3 for multiplication\nPress 4 for division");
        System.out.println("---------------------------------");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;

            default:
                System.out.println("Invalid");
                break;
        }
    }
}