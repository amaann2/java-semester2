import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();

        String array[]= new String[size];
        int totlength=0;
        for(int i=0 ; i<size ; i++){
            array[i]=sc.nextLine();
            totlength += array[i].length();

        }
        System.out.println(totlength);
    }
}
