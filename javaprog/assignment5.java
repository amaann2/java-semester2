import java.util.*;

public class assignment5 {
    static int balance,deposit, withdraw, acc;
    static  String namee;
    
    public static void getDetails(String name, int accountNumber, int bal) {
        namee = name;
        acc = accountNumber;
        balance = bal;
    }
    
    public static void withdrawal() {
        System.out.println("Enter the amount you want to withdrawal");
        Scanner sc = new Scanner(System.in);
        withdraw = sc.nextInt();

        if (withdraw <= balance) {
            System.out.println("Your amount has been recieved");
            balance = balance - withdraw;
        } else if (withdraw >= balance) {
            System.out.println("Insufficient Balance ");
        }
    }

    public static void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to deposits");
        deposit = sc.nextInt();
        balance = balance + deposit;
    }

    public static void viewBalance() {
        System.out.println("Your balance is: " + balance);

    }

    public static void display() {
        System.out.println("\nYour name is:" + namee);
        System.out.println("Your account number is is:" + acc);
        System.out.println("Your Balance is:" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the name of bank holder:");
        String name = sc.nextLine();
        System.out.println("\nEnter the accounnt number of bank holder:");
        int acc = sc.nextInt();
        System.out.println("\nEnter the minimum balance:");
        int bal = sc.nextInt();
        getDetails(name, acc, bal);

        loop: while (true) {
            {
                System.out.println(
                        "\nPress 1 for deposit\nPress 2 for Withdrawal\nPress 3 for check Balance\nPress 4 for Display details\nPress 5 for exit");
                int n = sc.nextInt();
                switch (n) {
                    case 1:
                        deposit();
                        break;
                    case 2:
                        withdrawal();
                        break;

                    case 3:
                        viewBalance();
                        break;

                    case 4:
                        display();

                        break;

                    case 5:
                        System.out.println("programm exit");
                        break loop;

                    default:
                        System.out.println("Invalid Input");
                        break;
                }
            }
        }
    }
}
