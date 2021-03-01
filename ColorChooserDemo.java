
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ColorChooserDemo {
    JFrame myFrame;
    JTextArea ta;
    JPanel pnl;
    public ColorChooserDemo() {
        myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setTitle("Dialog Box Example");
        myFrame.setSize(500, 300);
        myFrame.setLocationRelativeTo(null);
        myFrame.setLayout(new BorderLayout());
        ta = new JTextArea("File ta:");
        ta.setVisible(true);
        myFrame.add(ta, BorderLayout.NORTH);
        pnl = new JPanel();
        pnl.setLayout(new GridLayout(1, 2));
        myFrame.add(pnl, BorderLayout.SOUTH);
        JButton showButton = new JButton("Show ColorChooser box");
        showButton.setActionCommand("Show ColorChooser box");
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                Color selectedColor = JColorChooser.showDialog(myFrame, "Pick a Color", Color.GREEN);
                if (selectedColor != null) {
                    ta.append("\nThe selected color is make up of Red: " + selectedColor.getRed() + " Blue: " + selectedColor.getBlue() + " Green: " + selectedColor.getGreen());
                }
            }
        });
        pnl.add(showButton);
        JButton createButton = new JButton("Create Color");
        createButton.setActionCommand("Create Color");
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                final JColorChooser colorChooser = new JColorChooser();
                JDialog dialog = JColorChooser.createDialog(myFrame, "Chane TextArea color", false, colorChooser,
                        new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent event) {
                                ta.append("\n Now my color is changed to " + colorChooser.getColor());
                                ta.setBackground(colorChooser.getColor());
                            }
                        }, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent event) {
                                ta.append("\nYou  clicked on cancel..");
                            }
                        });
                dialog.setVisible(true);
            }
        });
        pnl.add(createButton);
        myFrame.setVisible(true);
    }
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new ColorChooserDemo();
            }
        });
    }
}
