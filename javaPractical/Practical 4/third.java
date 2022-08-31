import java.util.Scanner;
class book {
    String bookName;
    String authorName;
    int price;

    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of book");
        bookName = sc.next();
        System.out.println("Enter the name of aauthor");
        authorName = sc.next();
        System.out.println("Enter the price of book");
        price = sc.nextInt();
    }

    public void getDetails() {
        System.out.println("name of book is " + bookName);
        System.out.println("name of aauthor is " + authorName);
        System.out.println("price of book is " + price);
    }
}

public class third {
    public static void main(String[] args) {
        book b1[] = new book[3];
        for (int i = 0; i < b1.length; i++) {
            b1[i] = new book();
            b1[i].setDetails();
        }
        for (int i = 0; i < b1.length; i++) {
            b1[i].getDetails();
        }
    }
}
