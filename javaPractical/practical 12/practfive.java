import java.awt.event.*;    
import java.awt.*;    
import javax.swing.*;   
public class practfive extends JFrame implements ActionListener {
    JButton b;
    JLabel l;
    practfive(){
        l= new JLabel("hello");
        b= new JButton("color");
        b.addActionListener(this);
        add(b);
        add(l);
        setLayout(new FlowLayout());   
        setSize(400,400);    
        setVisible(true);    
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
    public void actionPerformed(ActionEvent ae){
        Color initialcolor = Color.BLUE;
     Color color = JColorChooser.showDialog(this,"choose a color",initialcolor);
     l.setForeground(color);
    }
    public static void main(String[] args) {
        new practfive();
    }
}
