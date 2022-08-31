import java.util.Scanner;

public class quest {
    public static int max(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximum value is"+max(array));
        System.out.println("Maximum value is"+min(array));
      
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] a = new int[5];
    for (int i = 0; i < 5; i++) {
        a[i]= sc.nextInt();
    }
    quest m = new quest();
   m.max();

    }
}