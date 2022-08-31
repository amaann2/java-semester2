import java.util.Scanner;

public class patter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("patttern 1");
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        // for(int i=0;i<=n;i++){
        //    for(int j=1;j<=i;j++){
        //        System.out.print("#");
        //    }
        //    System.out.println();
        // }

        // for(int i=n ;i>0;i--){
        //     for(int j=0 ; j<=i;j++){
        //         System.out.print("#");
        //     }
        //     System.out.println();
        // }

        // for (int i = 0; i <n; i++) {
        //         if (i%2==0) {
        //             System.out.println("===");
        //         }
        //         else{
        //             System.out.println("/////");
        //         } 
        // }
        for(int i=n ;i>0;i--){
                for(int j=0 ; j<=i;j++){
                    if ((i+j)%2==0) {
                        System.out.print("1");
                        
                    }
                    else{
                        System.out.print("0");                    }
                }
                System.out.println();
            }
        
    }
}
