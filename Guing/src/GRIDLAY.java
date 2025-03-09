import javax.swing.*;
import java.awt.*;

public class GRIDLAY {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,3,10,10));



       // Button button = new Button();
        //button.setBackground(Color.BLACK);

        //frame.add(button);

        frame.add(new Button("1"));
        frame.add(new Button("2"));
        frame.add(new Button("3"));
        frame.add(new Button("4"));
        frame.add(new Button("5"));
        frame.add(new Button("6"));
        frame.add(new Button("7"));
        frame.add(new Button("8"));
        frame.add(new Button("9"));






    }
}
