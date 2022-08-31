
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.tree.*;

public class one extends MouseAdapter {
    JTree t;
    JTextField jtf;
    JFrame f1;

    one() {
        f1 = new JFrame();
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode dmt1 = new DefaultMutableTreeNode("Color");
        top.add(dmt1);
        DefaultMutableTreeNode dt1 = new DefaultMutableTreeNode("Red");
        dmt1.add(dt1);
        DefaultMutableTreeNode dt2 = new DefaultMutableTreeNode("Blue");
        dmt1.add(dt2);
        DefaultMutableTreeNode dt3 = new DefaultMutableTreeNode("Orange");
        dmt1.add(dt3);
        DefaultMutableTreeNode dmt2 = new DefaultMutableTreeNode("Font");
        top.add(dmt2);
        DefaultMutableTreeNode dt4 = new DefaultMutableTreeNode("Normal");
        dmt2.add(dt4);
        DefaultMutableTreeNode dt5 = new DefaultMutableTreeNode("Bold");
        dmt2.add(dt5);
        DefaultMutableTreeNode dt6 = new DefaultMutableTreeNode("Blue");
        dmt2.add(dt6);

        t = new JTree(top);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp = new JScrollPane(t, v, h);
        f1.add(jsp, BorderLayout.CENTER);
        jtf = new JTextField(15);
        f1.add(jtf, BorderLayout.SOUTH);
        t.addMouseListener(this);

        f1.setSize(300, 300);
        f1.setVisible(true);

    }

    public void mouseClicked(MouseEvent me) {
        doMouseClicked(me);
    }

    void doMouseClicked(MouseEvent a) {
        TreePath tp = t.getPathForLocation(a.getX(), a.getY());
        if (tp != null) {
            jtf.setText(tp.toString());
        } else {
            jtf.setText(" ");
        }
    }

    public static void main(String ar[]) {
        new one();
    }
}
