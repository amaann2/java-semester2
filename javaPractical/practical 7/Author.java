import java.util.*;
public class Author {
    String firstName;
    String lastName;

    Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String f = sc.next();
        String l = sc.next();
        Author a = new Author(f , l);
    
        System.out.println(a.getFirstName());
        System.out.println(a.getLastName());
    }
}