import javax.swing.*;       
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
     
public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIdLabel = new JLabel("user id:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel();


    HashMap<String,String> loginInfo = new HashMap<String,String>();
    public LoginPage(HashMap<String, String> loginInfoOriginal) {

        loginInfo = loginInfoOriginal; // COPY

        userIdLabel.setBounds(50,100,75,25);
        userIdLabel.setFont(new Font("Garamond", Font.PLAIN,20));
        userIdLabel.setForeground(Color.cyan);

        userPasswordLabel.setBounds(50,150,75,25);
        userPasswordLabel.setFont(new Font("Garamond", Font.PLAIN,18));
        userPasswordLabel.setForeground(Color.cyan);

        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font("Garamond", Font.BOLD,30));


        userIdField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.setForeground(Color.CYAN);
        loginButton.setBackground(Color.darkGray);
        loginButton.addActionListener(this);

        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.setForeground(Color.CYAN);
        resetButton.setBackground(Color.darkGray);
        resetButton.addActionListener(this);

        frame.setTitle("Login Page");
        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIdField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(userPasswordField);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton){
            userIdField.setText("");
            userPasswordField.setText("");
        }
        if (e.getSource() == loginButton){
            String userID = userIdField.getText();
            String password = String.valueOf(userPasswordField.getPassword());
            if (loginInfo.containsKey(userID)){
                if (loginInfo.get(userID).equals(password)){
                    messageLabel.setForeground(Color.GREEN);
                    frame.dispose();
                    messageLabel.setText("Login successful");

                    WelcomePage welcomePage = new WelcomePage(userID);
                }
            }else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Login Failed ");
            }
        }

    }
}
