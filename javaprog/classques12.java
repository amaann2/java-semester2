import java.util.*;

class employee {
   int sal=0;
    int no=0;

    public void getInfo(int salary, int hour) {
        this.sal = salary;
        this.no = hour;
    }

    public void addsal() {
        if (sal < 500) {
            sal  += 10;
            
        }
    }

    public int addWork() {
        if (no < 6) {
            sal  += 5;
        }
        return sal;
        }
    public int finalSalary() {
      System.out.println(sal);
      return sal;
    }

}

public class classques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee e1 = new employee();
        System.out.println("Salary");
        int n = sc.nextInt();
        System.out.println("no of hours");
        int x = sc.nextInt();
        e1.getInfo(n, x);
        e1.addsal();
        e1.addWork();
        e1.finalSalary();
    }
}
