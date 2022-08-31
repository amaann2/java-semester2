import java.util.Scanner;

public class findelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[6];  

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int x = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (x==arr[i]) {
                System.out.println("Eleement found at :"+i);
            }
            else if(x!=arr[i]){
                System.out.println("Element not found");
            }
        }
    }
}
