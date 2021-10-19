import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel();

    WelcomePage(String userID){

        welcomeLabel.setBounds(0,0,2000,35);
        welcomeLabel.setFont(new Font("Garamond", Font.BOLD,30));
        welcomeLabel.setForeground(Color.CYAN);
        welcomeLabel.setText("Welcome home "+userID);

        frame.add(welcomeLabel);
        frame.setTitle("Welcome Page");
        frame.setBackground(Color.BLACK);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(360,360);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
