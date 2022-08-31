import java.util.*;

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 100;
        int deposit, withdraw;
        for (int i = 0; i < 100; i++) {
            System.out.println("Atm automated");
            System.out.println(
                    "Press 1 for deposit\nPress 2 for Withdrawal\nPress 3 for check Balance\nPress 4 for exit");
            int n = sc.nextInt();

            if (n == 1) {
                System.out.println("Enter the amount you want to deposits");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Your balance is: " + balance);
            }

            else if (n == 2) {
                System.out.println("Enter the amount you want to withdrawal");
                withdraw = sc.nextInt();
                if (withdraw <= balance) {
                    System.out.println("Your amount has been recieved");
                    balance = balance - withdraw;
                } else if (withdraw >= balance) {
                    System.out.println("Insufficient Balance ");
                }
            }

            else if (n == 3) {
                System.out.println("Your balance is: " + balance);
            }

            else if (n == 4) {
                System.out.println("Your programm has been ended");
                break;
            }

            else {
                System.out.println("Invalid input");
                break;
            }

        }
    }
}