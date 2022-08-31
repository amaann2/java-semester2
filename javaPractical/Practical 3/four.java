public class four {
    public static void main(String args[]) {
        System.out.println("pattern 1");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("pattern 2");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("pattern 3");
        for (int i = 1; i <= 3; i++) {
            for (int space = 1; space <= (3 - i); space++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println();
        System.out.println("pattern 4");
        for (int i = 1; i < 5; i++) {

            if (i % 2 == 0) {
                System.out.println("===");
            } else {
                System.out.println("^^^");
            }
        }

        System.out.println();
        System.out.println("pattern 5");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }


        System.out.println();
        int n =1;
        System.out.println("pattern 6");
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(n++);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("pattern 7");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
        for (int i = 2; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("1");
            }
            System.out.println();
        }


    }
}
