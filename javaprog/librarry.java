import java.util.Scanner;

class admin {
    static String name;
    static String email;
    static String city;
    static long phone;
    static String password;
    Scanner sc = new Scanner(System.in);

    public void addlibrarian() {
        System.out.println("Enter the name");
        name = sc.next();
        System.out.println("Enter the email id");
        email = sc.next();
        System.out.println("Enter the password");
        password = sc.next();
        System.out.println("Enter the city");
        city = sc.next();
        System.out.println("Enter the Contact number");
        phone = sc.nextLong();
    }

    public void viewlibrarian() {
       System.out.println(name+"  "+email+"  "+password+"  "+city+"  "+phone);
    }

    public void deletelibrarian() {

    }

}

class librarian {
    public void addBooks() {

    }

    public void viewBooks() {

    }

    public void issueBooks() {

    }

    public void returnBooks() {

    }

}

public class librarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
while (true) {
        System.out.println("Type 1 for admin\nType 2 for librarian");
        int n = sc.nextInt();

        if (n == 1) {
            admin a = new admin();
            System.out.println(
                    "Type 1 for Add Librarian\nType 2 for view Librarian\nType 3 for Delete Librarian");
            int x = sc.nextInt();
            if (x == 1) {
                a.addlibrarian();
            } else if (x == 2) {
                a.viewlibrarian();
            } else if (x == 3) {
                a.deletelibrarian();
            } else {
                System.out.println("Invalid input");
            }

        } else if (n == 2) {
            librarian l = new librarian();
            System.out.println(
                    "Type 1 for Add Books\nType 2 for view Books\nType 3 for issue Books\nType 4 for return Books");
            int y = sc.nextInt();
            if (y == 1) {
                l.addBooks();
            } else if (y == 2) {
                l.viewBooks();
            } else if (y == 3) {
                l.issueBooks();
            } else if (y == 4) {
                l.returnBooks();
            } else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("invalid input");
        }
    }
    }
}
