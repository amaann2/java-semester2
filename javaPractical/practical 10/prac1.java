import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;
public class prac1 extends JFrame implements ActionListener{
     JLabel l1,l2;
    JButton b1;
    JTextField t1;
    prac1(){
        l1 = new JLabel("Enter a number in meter");
        l2= new JLabel("");
        b1= new JButton("Convert");
        t1= new JTextField(10);
        
        add(l1);
        add(t1);
        add(b1);
        add(l2);

        b1.addActionListener(this);

        setSize(300,300);
        setLayout(new FlowLayout());
        setTitle("conversion");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        public void actionPerformed(ActionEvent ae){
            if (ae.getSource()==b1) {
              int m = Integer.parseInt(t1.getText());
              l2.setText(""+m*100);
            }
        }
    
    public static void main(String[] args) {
        new prac1();
    }
}