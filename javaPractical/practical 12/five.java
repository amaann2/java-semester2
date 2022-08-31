import java.awt.event.*;    
import java.awt.*;    
import javax.swing.*;     
public class five extends JFrame implements ActionListener 
{    
    JButton b;
    JLabel L1;
    five()
    {    
             b=new JButton("color");    
             b.addActionListener(this);   
        L1=new JLabel("HELLOO!!!!");
    
            setLayout(new FlowLayout());   
            setSize(400,400);    
            setVisible(true);    
            setDefaultCloseOperation(EXIT_ON_CLOSE);          
              
         add(b); 
         add(L1);
      }    
    public void actionPerformed(ActionEvent e)
     {    
        Color initialcolor=Color.BLUE;    
        Color color=JColorChooser.showDialog(this,"Select a color",initialcolor);      
        L1.setForeground(color);
    }    
    public static void main(String[] args)
     {    
                five ch=new five();    
            
    }    
}

