import java.util.*;
import java.util.Random;

class game {
    int number;
    int input;
    int guess;
    game() {
        Random r = new Random();
        this.number = r.nextInt(10);
    }

    public void takeUerInput() {
        System.out.println("Enter a nunber");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
    }

    public boolean isCorrectNumber() {

        guess++;
        if (input == number) {
            System.out.println("You have guess a right number in count " + guess);
            return true;
        } else if (input > number) {
            System.out.println("the number is high....");
        } else if (input < number) {
            System.out.println("the number is low....");
        }
        return false;
    }
}

public class gamme {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while (!b) {
            g.takeUerInput();
            b = g.isCorrectNumber();
            System.out.println(b);

        }
    }
}
