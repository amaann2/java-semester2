class employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}

public class obj {
    public static void main(String[] args) {
        employe amaan = new employe();
        amaan.salary = 233;
        amaan.getsalary();
        amaan.setName("amaan ansari");

    }
}