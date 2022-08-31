class animal {
    String color;
    // int size;

    public String getC() {
        return color;
    }

    public void setC(String c) {
        this.color = c;
    }
}

class dog extends animal {
    int size;

    public int getS() {
        return size;
    }

    public void setS(int n) {
        this.size = n;
    }
}

public class inheritenc {
    public static void main(String args[]) {
        dog d1 = new dog();
        d1.setC("bllue");
        System.out.println(d1.getC());
        d1.setS(12);
        System.out.println(d1.getS());

    }
}
