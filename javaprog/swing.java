import javax.swing.*;

class Abc extends JFrame {
    public Abc() {
        JLabel l = new JLabel("hELLO WORLD");
        JButton b = new JButton("Clear");
        add(l);
        add(b);
        setVisible(true);
        setSize(400, 400);
    }
}

public class swing {
    public static void main(String[] args) {
        Abc obj = new Abc();
    }
}