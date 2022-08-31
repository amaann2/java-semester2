import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.Font;

public class two extends JFrame implements ActionListener{
    JTextField t1;
    JLabel  l1;
    JRadioButton r1,r2,r3;
    Font f1,f2,f3;

     two(){
         l1 = new JLabel("Enter Name");
         t1 =  new JTextField(10);
         r1 = new JRadioButton("bold");
         r2 = new JRadioButton("italic");
         r3 = new JRadioButton("normals");
         f1= new Font("Book Antiqua",Font.BOLD,20);
         f2= new Font("Book Antiqua",Font.ITALIC,20);
         f3= new Font("Book Antiqua",Font.PLAIN,20);

         ButtonGroup bg = new ButtonGroup();
         bg.add(r1);
         bg.add(r2);
         bg.add(r3);

         add(l1);
         add(t1);
         add(r1);
         add(r2);
         add(r3);

         r1.addActionListener(this);
         r2.addActionListener(this);
         r3.addActionListener(this);

         setTitle("radio button");
         setVisible(true);
         setLayout(new FlowLayout());
         setSize(300,300);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
         public void actionPerformed(ActionEvent ae){
             if (ae.getSource()==r1) {
                 t1.setFont(f1);
             }
            else if (ae.getSource()==r2) {
                 t1.setFont(f2);
             }
             else {
                 t1.setFont(f3);
             }
         }

     

    public static void main(String[] args) {
 new two();
    }
    
}
