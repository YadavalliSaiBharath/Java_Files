import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Myframe extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    Myframe(){

        ImageIcon icon = new ImageIcon("C:\\Users\\Lenovo\\Downloads\\3561841_emoji_expression_glared_shocked_surprised_icon.png");

        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(150,250,150,150);
        label.setVisible(false);


        button = new JButton();
        button.setBounds(200,170,100,50);
        button.addActionListener(this);
        //button.addActionListener(e -> System.out.println("Lucky"));
        button.setText("Press me");
        button.setFocusable(false);
        button.setIconTextGap(-15);
        button.setBackground(Color.cyan);
        button.setForeground(Color.BLACK);

        JFrame frame = new JFrame();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.add(button);
        this.add(label);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            //System.out.println("Lucky");
            //button.setEnabled(false);
            label.setVisible(true);
        }

    }
}
