class employe{
    int id;
    String name;
    int salary;
    public void getDetails(){
        System.out.println("my id is "+id);
        System.out.println("my name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}
public class clas {
    public static void main(String[] args) {
        employe amaan = new employe();

        amaan.id=12;
        amaan.name="amaan ansari";
        amaan.salary=1011000;
        amaan.getDetails();
        // amaan.getSalary();
        int salary = amaan.getSalary();
        System.out.println(salary);

    }
}
