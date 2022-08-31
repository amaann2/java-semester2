import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import java.awt.BorderLayout;


public class pract0ne extends MouseAdapter {
    JFrame f;
    JTree t;
    JTextField t1;

    pract0ne() {
        f = new JFrame("tree");
        t1= new JTextField(16);

        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Style");

        DefaultMutableTreeNode a = new DefaultMutableTreeNode("colour");
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("font");

        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("blue");
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("red");
        DefaultMutableTreeNode a3 = new DefaultMutableTreeNode("blck");

        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("bold");
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("italic");
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("normal");


        t = new JTree(top);

        // int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        // int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        // JScrollPane jp = new JScrollPane(t,v,h);
        // f.add(jp ,BorderLayout.CENTER);
        a.add(a1);
        a.add(a2);
        a.add(a3);

        b.add(b1);
        b.add(b2);
        b.add(b3);

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
    void doMouseClicked(MouseEvent me){
        TreePath jp = t.getPathForLocation(me.getX(), me.getY());
        if (jp!=null) {
            t1.setText(jp.toString());
        }
        else{
            t1.setText("");
        }
    }

    public static void main(String[] args) {
        new pract0ne();
    }
}
