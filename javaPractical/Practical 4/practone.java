import java.util.Scanner;
class sort{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[3];
    int temp=0;
    public void getdata(){
        for (int i = 0; i <= n; i++) {
            arr[i]=sc.nextInt();
        }
    }
    public void displayarr(){
        for (int i = 0; i <= n; i++) {
            System.out.println(arr);
        }
    }
    public void getasec(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);
        }
    }
    public void getadesec(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
public class practone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        sort s = new sort();
        s.getdata();
        s.displayarr();
        s.getasec();
        s.getadesec();
      }
}