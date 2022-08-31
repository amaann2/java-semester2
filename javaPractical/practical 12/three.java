import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class three extends JFrame implements Runnable, MouseListener,MouseMotionListener {
    int x = 300, y = 320, dx = 1, dy = 1, x1, y1;

    public three() {
        setSize(600, 600);
        setTitle("Throwball");
        setVisible(true);
        getContentPane().setBackground(Color.white);
        Thread t = new Thread(this);
        t.start();
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public static void main(String[] args) {
        new three();
    }

    public void run() {

        Graphics g = getContentPane().getGraphics();
        for (;;) {
            try {
                x = x + dx;
                y = y + dy;
                if (x > 600 - 20 || x < 20)
                    dx = -dx;
                if (y > 600 - 20 || y < 20)
                    dy = -dy;
                g.setColor(Color.BLACK);
                g.drawOval(x, y, 20, 20);
                Thread.sleep(20);
                g.setColor(Color.WHITE);
                g.drawOval(x, y, 20, 20);

            } catch (InterruptedException ex) {
            }
        }
    }

    public void mouseClicked(MouseEvent arg0) {
    }

    public void mousePressed(MouseEvent arg0) {
        x1 = arg0.getX();
        y1 = arg0.getY();
    }

    public void mouseReleased(MouseEvent arg0) {
        dx = arg0.getX() - x1;
        dy = arg0.getY() - y1;
    }

    public void mouseEntered(MouseEvent arg0) {

    }

    public void mouseExited(MouseEvent arg0) {
    }

    public void mouseDragged(MouseEvent arg0) {
    }

    public void mouseMoved(MouseEvent arg0) {
    }

}
