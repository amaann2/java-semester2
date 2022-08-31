import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class three extends JFrame implements ActionListener 
{
  JLabel l1, l2, l3, l4;
  JComboBox<String> cl;

  three()
   {
     l1 = new JLabel("Select Movie Name: "); 
     l2 = new JLabel("");
     l3 = new JLabel("");
     l4 = new JLabel("");

     cl = new JComboBox<String>();

     cl.addItem("Batman");
     cl.addItem("Spiderman"); cl.addItem("Ironman");

     add (l1);
     add (cl);
     add (l2);
     add (l3);
     add (l4);

     cl.addActionListener(this);

     setTitle("movie");
     setVisible(true);
     setSize(400, 400); 
     setLayout (new FlowLayout());
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
    public void actionPerformed (ActionEvent ae) 
  {
    if (ae.getSource() == cl) 
   {
      if(cl.getSelectedItem().equals("Batman"))
      { 
        l2.setText("Batman Director is Tim Burton");
        l3.setText("Batman Actor is Christian Bale");
        l4.setText("Batman Actress is Michelle Pfeiffer");
      }
      if(cl.getSelectedItem().equals("Spiderman")) 
      {
        l2.setText("Spiderman Director is Sam Raimi");
        l3.setText("Spiderman Actor is Tobey Maguire");
        l4.setText("Spiderman Actress is Katelyn Johnson");  
      }
      if(cl.getSelectedItem().equals("Ironman"))
      {
        l2.setText("Ironman Director is Jon Favreau");
        l3.setText("Ironman Actor is Robert Downey Jr.");
        l4.setText("Ironman Actress is Gwyneth Paltrow");
      }
    }
}
      public static void main(String[] args)
       { 
        new three();
       }
    
  }
