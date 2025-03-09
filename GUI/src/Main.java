import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame jframe = new JFrame();

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setResizable(false);
        jframe.setTitle("Lucky");
        jframe.setSize(420,420);
        jframe.setVisible(true);

        ImageIcon image = new ImageIcon("C:\\Users\\Lenovo\\AppData\\Local\\Temp\\49553636-fe2f-453d-8426-cdad6542c960_15-leojqx.zip.960\\15.jpg");
        jframe.setIconImage(image.getImage());
        jframe.getContentPane().setBackground(Color.BLACK);
    }
}