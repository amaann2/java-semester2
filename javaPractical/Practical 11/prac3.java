import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class prac3 extends JFrame implements ActionListener{
    JMenu m1,m2;
    JMenuItem me1,me2,me3,me4;
    JMenuBar mb1;
    prac3(){
       m1 = new JMenu("Color");
       m2 = new JMenu("list");

       me1 = new JMenuItem("Red");
       me2 = new JMenuItem("Blue");
       me3 = new JMenuItem("Java");
       me4 = new JMenuItem("Android");

       mb1 = new JMenuBar();
      m1.add(me1);
      m1.add(me2);
      m2.add(me3);
      m2.add(me4);

       mb1.add(m1);
       mb1.add(m2);
       setJMenuBar(mb1);

       me1.addActionListener(this);
       me2.addActionListener(this);
       me3.addActionListener(this);
       me4.addActionListener(this);

       setSize(300,300); 
       setVisible(true); 
       setLayout(new FlowLayout()); 
       setTitle("JMenu"); 
       setDefaultCloseOperation(EXIT_ON_CLOSE); 

    }
    public void actionPerformed(ActionEvent ae){
        Container c = getContentPane();
   if (ae.getSource()==me1) {
       c.setBackground(Color.RED);
   }
   if (ae.getSource()==me2) {
       c.setBackground(Color.BLUE);
   }
   if (ae.getSource()==me3) {
       JOptionPane.showMessageDialog(this, "You have selected"+me1.getText(),"",JOptionPane.ERROR_MESSAGE);
   }
   if (ae.getSource()==me4) {
       JOptionPane.showMessageDialog(this,"you have selected"+me4.getText(),"",JOptionPane.ERROR_MESSAGE);
   }
    }
    public static void main(String[] args) {
        new prac3();
    }
}
