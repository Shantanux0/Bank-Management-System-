package bankManageSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7;
    String pin;

    public main_Class(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(430,180,700,35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,28));
        l3.add(label);

        Color buttonColor = new Color(30, 144, 255); // Dodger Blue
        Font buttonFont = new Font("System", Font.BOLD, 16);

        b1 = createStyledButton("DEPOSIT", 410, 274, buttonColor, buttonFont, l3);
        b2 = createStyledButton("CASH WITHDRAWL", 700, 274, buttonColor, buttonFont, l3);
        b3 = createStyledButton("FAST CASH", 410, 318, buttonColor, buttonFont, l3);
        b4 = createStyledButton("MINI STATEMENT", 700, 318, buttonColor, buttonFont, l3);
        b5 = createStyledButton("PIN CHANGE", 410, 362, buttonColor, buttonFont, l3);
        b6 = createStyledButton("BALANCE ENQUIRY", 700, 362, buttonColor, buttonFont, l3);
        b7 = createStyledButton("EXIT", 700, 406, buttonColor, buttonFont, l3);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    private JButton createStyledButton(String text, int x, int y, Color bgColor, Font font, Container container) {
        JButton button = new JButton(text);
        button.setBounds(x, y, 150, 35);
        button.setBackground(bgColor);
        button.setForeground(Color.WHITE);
        button.setFont(font);
        button.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        button.setFocusPainted(false);
        button.addActionListener(this);
        container.add(button);
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource() == b7) {
            System.exit(0);
        } else if (e.getSource() == b2) {
            new Withdrawl(pin);
            setVisible(false);
        } else if (e.getSource() == b6) {
            new BalanceEnquriy(pin);
            setVisible(false);
        } else if (e.getSource() == b3) {
            new FastCash(pin);
            setVisible(false);
        } else if (e.getSource() == b5) {
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource() == b4) {
            new mini(pin);
        }
    }

    public static void main(String[] args) {
        new main_Class("");
    }
}
