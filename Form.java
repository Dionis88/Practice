import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Form extends JFrame {

    private JTextField textField;

    public Form() {
        super("Form");
        createGUI();
    }

    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());


        JButton button = new JButton("Скажи что-нибудь");
        button.setActionCommand("АТБ прийде - порядок наведе!");
        panel.add(button);

        textField = new JTextField();
        textField.setColumns(25);
        panel.add(textField);

        ActionListener actionListener = new TestActionListener();


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(e.getActionCommand());
            }
        });


        getContentPane().add(panel);
        setPreferredSize(new Dimension(320, 100));
    }

    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textField.setText(e.getActionCommand());
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                Form frame = new Form();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}





