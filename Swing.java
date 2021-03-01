import javax.swing.*;
public class Swing {
    public static void main(String[] args) {
        int input = JOptionPane.showConfirmDialog(null, "Do you like bacon?");

        System.out.println(input);

        String m = JOptionPane.showInputDialog("Anyone there?");
        System.out.println(m);

    }
}