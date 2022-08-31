import java.util.Scanner;

public class four {
    public void decimaltoBinary() {
        int dec_num, no, n;
        long convert = 0, tens = 1;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        dec_num = ob.nextInt();
        no = dec_num;
        while (dec_num != 0) {
            n = dec_num % 2;
            dec_num = dec_num / 2;
            convert = convert + n * tens;
            tens = tens * 10;
        }
        System.out.println("\nThe binary form of the decimal number " + no + "is " + convert + "\n\n");
    }

    public static void main(String args[]) {
        four pobj = new four();
        pobj.decimaltoBinary();
    }
}