import java.util.*;
import java.util.Random;
public class stonpaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock , 1 for paper , 2 for stone");
        int user = sc.nextInt();
        
        Random random = new Random();
        int computer = random.nextInt(3);
        
        
        //user chioce
        if (user==0) {
            System.out.println("user choice is rock");
        }else if(user == 1){
            System.out.println("user choice is paper");
        }else{
            System.out.println("user choice is scissors");
        }
        
        //computer choice
        if (computer==0) {
            System.out.println("computer choice is rock");
        }else if(computer == 1){
            System.out.println("computer choice is paper");
        }else{
            System.out.println("computer choice is scissors");
        }

        //game logic
        if (user==computer) {
            System.out.println("Draw");
        }
        else if(user ==0 && computer==2 || user ==1 && computer==0||user ==2 && computer==1){
            System.out.println("YOu win");
        }
        else{
            System.out.println("Computer win");
        }
    }
}
