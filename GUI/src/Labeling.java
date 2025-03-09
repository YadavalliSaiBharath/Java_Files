import javax.swing.*;
import java.awt.*;

public class Labeling {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:\\Users\\Lenovo\\Downloads\\7936639.jpg");

        JLabel label = new JLabel();
        label.setText("Snowdrop");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(Color.BLACK);
        label.setHorizontalAlignment(JLabel.TOP);
        label.setVerticalAlignment(JLabel.CENTER);

        JFrame frame =  new JFrame();
        frame.setVisible(true);
        frame.setTitle("Lucky");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.add(label);

    }
}
