
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;

public class JCustomDialogs extends JFrame {

    public JCustomDialogs() throws HeadlessException {
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton btnErrorMessage = new JButton("Error message");
        JButton btnChooseColor = new JButton("Color");
        JButton btnFileChooser = new JButton("File Chooser");

        btnErrorMessage.setBounds(10, 10, 120, 30);
        btnChooseColor.setBounds(10, 50, 120, 30);
        btnFileChooser.setBounds(10, 100, 120, 30);

        btnErrorMessage.addActionListener(e -> Dialogs.errorMessage(this));
        btnChooseColor.addActionListener(e -> {
            Color color = Dialogs.colorDialog(this);
            System.out.println(color);
        });
        btnFileChooser.addActionListener(e -> {
            JFileChooser f = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            int r = f.showOpenDialog(null);
        });

        add(btnFileChooser);
        add(btnChooseColor);
        add(btnErrorMessage);

        setLayout(null);
        setVisible(Boolean.TRUE);
    }
}
