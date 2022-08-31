import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.Font;
public class radio extends JFrame implements ActionListener{
      JLabel l1 ;
      JTextField t1;
      JRadioButton r1,r2,r3;
      Font f1,f2,f3;
    radio(){
         l1= new JLabel("Enter name");
         t1 = new JTextField(10);
         r1 = new JRadioButton("Bold");
         r2= new JRadioButton("Italic");
         r3 = new JRadioButton("Normal");
         f1 = new Font("",Font.BOLD ,15);
         f2 = new Font("",Font.ITALIC,15);
         f3=new Font("",Font.PLAIN,15);

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

         setSize(300,300);
         setTitle("Radio Button");
         setVisible(true);
         setLayout(new FlowLayout());
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent ae){
         if (ae.getSource()==r1) {
              t1.setFont(f1);
         }
         else if(ae.getSource()==r2){
              t1.setFont(f2);

         }
         else{
              t1.setFont(f3);
         }
    }
    public static void main(String[] args) {
        new radio()
;    }
}
