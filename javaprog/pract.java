class cylinder {
    private int radius;
    private int height;

    public int get_radius() {
        return radius;
    }
    

    public void set_Radius(int r) {
        this.radius = r;
    }

    public int get_height() {
        return radius;
    }

    public void set_height(int h) {
        this.radius = h;
    }

}

public class pract {
    public static void main(String args[]) {
    cylinder mCylinder = new cylinder();
    mCylinder.set_Radius(12);
    int r = mCylinder.get_radius();
    System.out.println(r);
    mCylinder.set_height(10);
    int h = mCylinder.get_height();
    System.out.println(h);
    }
}
