class average{
    public void calculate(int num1, int num2,int num3){
        int average = (num1+num2+num3)/3;
        System.out.println(average);
    }
}
public class classquest8 {
    public static void main(String[] args) {
        average a = new average();
    a.calculate(2,3,4);
    }
}
