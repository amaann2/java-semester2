import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;
public class prac3 extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4;
    JComboBox<String> c1;

    prac3(){
        l1 = new JLabel("Select Movie Name");
        l2 = new JLabel("");
        l3 = new JLabel("");
        l4 = new JLabel("");


        c1 = new JComboBox<String>();
        c1.addItem("Batman");
        c1.addItem("Superman");
        c1.addItem("Amaan");
        c1.addItem("Hero");

        c1.addActionListener(this);

        add(l1);
        add(c1);
        add(l2);
        add(l3);
        add(l4);




        setSize(300,300);
        setLayout(new FlowLayout());
        setTitle("conversion");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
     if (ae.getSource()==c1) {
         if (c1.getSelectedItem().equals("Batman")) {
             l2.setText("abfah");
             l3.setText("abgdgdfah");
             l4.setText("abfah");
         }
         if (c1.getSelectedItem()== "Superman") {
             l2.setText("abfah");
             l3.setText("abfah");
             l4.setText("abfah");
         }
         if (c1.getSelectedItem()== "Amaan") {
             l2.setText("abfah");
             l3.setText("abfah");
             l4.setText("abfah");
         }
         if (c1.getSelectedItem()== "Hero") {
             l2.setText("abfah");
             l3.setText("abfah");
             l4.setText("abfah");
         }
     }
    }
    public static void main(String[] args) {
        new prac3();
    }
}
