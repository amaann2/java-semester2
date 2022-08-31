import java.util.Scanner;

public class billardgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of round in game");
        int n = sc.nextInt();
           int p1=0,p2=0;
        for (int i = 0; i < n; i++) {
        p1 = sc.nextInt();
        p2=sc.nextInt();
        }
        int leader=0 , lead=0 ;
        for (int i = 0; i < n; i++) {
            if (p1>p2) {
                leader=1;
                lead = p1-p2;
            }
            else if(p2>p1){
                leader = 2;
                lead = p2-p1;
            }
        }

        System.out.println(leader);
        System.out.println(lead);
    }
}
