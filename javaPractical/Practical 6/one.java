class one {

    public int square(int number) {
        int square = number * number;
        System.out.println("Method with Integer Argument Called: " + square);
        return square;

    }

    public double square(double number) {
        double square = number * number;
        System.out.println("Method with double Argument Called: " + square);
        return square;
    }

    public static void main(String[] args) {
        one obj = new one();

        obj.square(5);
        obj.square(25);
    }
}
