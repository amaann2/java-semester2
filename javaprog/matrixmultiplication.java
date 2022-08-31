import java.util.*;

public class matrixmultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[][] = new int[3][3];
        int arr[][] = new int[3][3];
        int c[][] = new int[3][3];
   
        System.out.println("Enter the element for first array");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the element for second array");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix multiplication is:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                c[i][j] = 0;

                for (int k = 0; k < c.length; k++) {
                    c[i][j]+= array[i][k] * arr[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
