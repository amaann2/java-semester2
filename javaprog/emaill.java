import java.util.Scanner;

public class emaill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        String user = "";

        for(int i = 0 ; i<email.length();i++){
             if (email.charAt(i)=='@') {
                 break;
             }else{
                 user += email.charAt(i);
             }
        }
        System.out.println(user);
    }
}
