import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    Login(){
        setTitle("ATM");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osword",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardNo = new JLabel("Card No");
        cardNo.setFont(new Font("Osword",Font.BOLD,18));
       cardNo.setBounds(120,150,100,40);
        add(cardNo);

        JTextField cardTextField = new JTextField();
        cardTextField.setBounds(250,150,250 ,40);
        add(cardTextField);

        JLabel pin = new JLabel("Pin no ");
        pin.setFont(new Font("Osword",Font.BOLD,18));
        pin.setBounds(120,220,100,40);
        add(pin);

        JTextField pinTextField = new JTextField();
        pinTextField.setBounds(250,220,250 ,40);
        add(pinTextField);

        JButton login = new JButton("Sign In");
        login.setBounds(250,300,100,40);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        add(login);

        JButton clear = new JButton("Clear");
        clear.setBounds(400,300,100,40);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        add(clear);

        JButton signup = new JButton("Sign Up");
        signup.setBounds(250,350,250,40);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        add(signup);

        getContentPane().setBackground(Color.white);

        setSize(800,480);
        setVisible(true);
        setLocation(300,180);
    }
    public static void main(String[] args) {
           new Login();
    }
}
