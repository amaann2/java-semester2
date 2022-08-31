import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class four extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu file;
    JMenuItem open, colorMenu;
    JTextArea ta;

    four() {
        open = new JMenuItem("Open File");
        colorMenu = new JMenuItem("Select Color");
        open.addActionListener(this);
        colorMenu.addActionListener(this);

        file = new JMenu("File");
        file.add(open);
        file.add(colorMenu);
        mb = new JMenuBar();
        mb.setBounds(0, 0, 800, 20);
        mb.add(file);

        ta = new JTextArea(800, 800);
        ta.setBounds(0, 20, 800, 800);
        add(mb);
        add(ta);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == open) {
            JFileChooser fc = new JFileChooser();
            int i = fc.showOpenDialog(this);
            System.out.println("i= " + i);
            if (i == JFileChooser.APPROVE_OPTION) {
                File f = fc.getSelectedFile();
                String filepath = f.getPath();
                try {
                    BufferedReader br = new BufferedReader(new FileReader(filepath));
                    String s1 = "", s2 = "";
                    while ((s1 = br.readLine()) != null) {
                        // s2+=s1+"\n";
                        s2 = s2 + s1 + "\n";
                    }
                    ta.setText(s2);
                    br.close();
                } catch (Exception ex) {
                    ex.getMessage();
                }
            }
        } else {
            Color color = JColorChooser.showDialog(this, "Select a color", Color.BLUE);
            ta.setForeground(color);

            setSize(500, 500);
            setLayout(null);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

    }

    public static void main(String[] args) {
        four om = new four();
    }
}
