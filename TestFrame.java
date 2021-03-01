
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame extends JFrame {

    private JTextField tfSlogan;
    public TestFrame() {

        JPanel content = new JPanel();
        content.setLayout(null);

        this.tfSlogan = new JTextField(20);

        tfSlogan.setBounds(45, 5, 220, 21);

        JButton btnAct = new JButton("Скажи что-нибудь");
        btnAct.setBounds(45, 90, 220, 21);

        content.add(tfSlogan);

        content.add(btnAct);

        setSize(330, 230);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(content);



    }


    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tfSlogan.setText("АТБ прийде - порядок наведе!");
        }
    }


    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Throwable thrown) {
            thrown.printStackTrace();
        }
        TestFrame frm = new TestFrame();
        frm.setVisible(true);
    }
}
