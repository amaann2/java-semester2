import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.BorderLayout;


import java.awt.FlowLayout;
public class practone extends MouseAdapter{
    JFrame f;
    JTree t;
    JTextField t1;
    practone(){
       f = new JFrame("Tree");
       t1 = new JTextField(16);
       DefaultMutableTreeNode top = new DefaultMutableTreeNode("Style") ;

       DefaultMutableTreeNode a = new DefaultMutableTreeNode("color");
       DefaultMutableTreeNode b = new DefaultMutableTreeNode("font");

       DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("red");
       DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("blue");

       DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("bold");
       DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("italic");
       t = new JTree(top);
       a.add(a1);
       a.add(a2);

       b.add(b1);
       b.add(b2);

       top.add(a);
       top.add(b);

       f.add(t);
       f.add(t1,BorderLayout.SOUTH);

       t.addMouseListener(this);

       f.setSize(300, 300);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }
    public void mouseClicked(MouseEvent me){
        doMouseClicked(me);
    }
    public void doMouseClicked(MouseEvent me){
        TreePath tp = t.getPathForLocation(me.getX(), me.getY());
        if (tp != null) {
            t1.setText(tp.toString());
        }
        else{
            t1.setText("");
        }
    }
    public static void main(String[] args) {
        new practone();
    }
}
