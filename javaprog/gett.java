class area {
    private int radius;
    private float area;
    private int perimeter;

    public void setRadius(int r) {
        radius = r;
    }

    public void setArea(float a) {
        area = 3.142f * radius * radius;
        if (a == area) {
            area = a;
        } else {
            System.out.println("wrong value for area");
        }
    }
}

public class gett {
    public static void main(String[] args) {
        area circle = new area();
        circle.setRadius(5);
        circle.setArea(78.53f);
    }
}
