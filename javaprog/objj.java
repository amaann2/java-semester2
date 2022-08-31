class phone {
    public void ringing() {
        System.out.println("phone is ringing");
    }

    public void vibrating() {
        System.out.println("phone is vibrating");
    }
}

public class objj {
    public static void main(String[] args) {
        phone iphone = new phone();
        iphone.ringing();
        iphone.vibrating();

    }
}