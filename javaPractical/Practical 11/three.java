import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
class three extends JFrame implements ActionListener
{ 
    JMenu M1,M2; 
    JMenuItem me1,me2,me3,me4; 
    JMenuBar mb; 
    three() 
       { 
        M1=new JMenu("Choose Colour"); 
        M2=new JMenu("SY"); 
        me1=new JMenuItem("Red"); 
        me2=new JMenuItem("Blue"); 
        me3=new JMenuItem("Java"); 
        me4=new JMenuItem("Android"); 
        mb=new JMenuBar(); 
        
        M1.add(me1); 
        M1.add(me2); 
        M2.add(me3); 
        M2.add(me4);

        mb.add(M1); 
        mb.add(M2); 
        setJMenuBar(mb);

        me1.addActionListener(this); 
        me3.addActionListener(this); 

        setSize(300,300); 
        setVisible(true); 
        setLayout(new FlowLayout()); 
        setTitle("JMenu"); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 

        me1.addActionListener(this); 
        me2.addActionListener(this); 
        me3.addActionListener(this); 
        me4.addActionListener(this); 
        } 
         public void actionPerformed(ActionEvent ae) 
         { 
            Container c=getContentPane(); 
            if(ae.getSource()==me1) 
            { 
                c.setBackground(Color.RED); 
            } 
            else if(ae.getSource()==me2) 
            { 
                c.setBackground(Color.BLUE); 
            } 
            else if(ae.getSource()==me3) 
            { 
                JOptionPane.showMessageDialog(this,"You have Selected " + 
                me3.getText(), " ", JOptionPane.ERROR_MESSAGE);  } 
                else if(ae.getSource()==me4) 
                { 
                    JOptionPane.showMessageDialog(this,"You have Selected " + 
                    me4.getText(), " ", JOptionPane.ERROR_MESSAGE); 
                } 
                else 
                { 
                } 
            } 
            public static void main(String args[]) 
            { 
                new three(); 
            } 
}