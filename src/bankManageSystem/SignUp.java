package bankManageSystem;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {
    JRadioButton r1, r2,m1,m2,m3;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L)+ 1000L;
    String first = " "+ Math.abs(first4);
    JLabel jLabel, jLabel2, jLabel3, jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel15;
    JTextField TextField,TextFieldF,TextFieldE,TextFieldA,TextFieldC,TextFieldS,TextFieldP;
    JDateChooser dateChooser;
   JButton Next;
    public SignUp(){
        super("APPLICATION FORM");

        // Bank Logo
        ImageIcon bankig = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image bankig2 = bankig.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        JLabel image = new JLabel(new ImageIcon(bankig2));
        image.setBounds(25, 10, 100, 100);
        add(image);
//
        jLabel = new JLabel("APPLICATION FORM NO. "+ first);
        jLabel.setBounds(160,20,600,40);
        jLabel.setFont(new Font("Raleway",Font.BOLD,38));
        add(jLabel);
//
        jLabel2 = new JLabel("Page 1 ");
        jLabel2.setBounds(330,70,600,30);
        jLabel2.setFont(new Font("Raleway",Font.BOLD,22));
        add(jLabel2);
//
        jLabel3 = new JLabel("Personal Details ");
        jLabel3.setBounds(290,90,600,30);
        jLabel3.setFont(new Font("Raleway",Font.BOLD,22));
        add(jLabel3);
//
        jLabel4 = new JLabel("Name: ");
        jLabel4.setBounds(100,190,100,30);
        jLabel4.setFont(new Font("Raleway",Font.BOLD,20));
        add(jLabel4);

        TextField = new JTextField();
        TextField.setBounds(300, 190, 400, 30);
        TextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(TextField);
//
        jLabel5 = new JLabel("Father's Name: ");
        jLabel5.setFont(new Font("Raleway",Font.BOLD,20));
        jLabel5.setBounds(100,240,200,30);

        add(jLabel5);

        TextFieldF = new JTextField();
        TextFieldF.setBounds(300, 240, 400, 30);
        TextFieldF.setFont(new Font("Arial", Font.BOLD, 14));
        add(TextFieldF);

//
        jLabel6 = new JLabel("Gender:");
        jLabel6.setBounds(100,290,100,30);
        jLabel6.setFont(new Font("Raleway",Font.BOLD,20));
        add(jLabel6);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(300,290,90,30);
        r1.setSelected(false); // Explicitly set selection state
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(400,290,90,30);
        r2.setSelected(false); // Explicitly set selection state
        add(r2);
        m3 = new JRadioButton("Other");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBounds(500,290,90,30);
        m3.setSelected(false); // Explicitly set selection state
        add(m3);


        ButtonGroup buttonGroup= new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(m3);


//
        jLabel7 = new JLabel("Date of Birth: ");
        jLabel7.setBounds(100,340,200,30);
        jLabel7.setFont(new Font("Raleway",Font.BOLD,20));
        add(jLabel7);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);


//
        jLabel8 = new JLabel("Marital Status: ");
        jLabel8.setBounds(100,440,200,30);
        jLabel8.setFont(new Font("Raleway",Font.BOLD,20));
        add(jLabel8);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBounds(300,440,90,30);
        m1.setSelected(false); // Explicitly set selection state
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBounds(400,440,150,30);
        m2.setSelected(false); // Explicitly set selection state
        add(m2);


        ButtonGroup buttonGroupMS = new ButtonGroup();
        buttonGroupMS.add(m1);
        buttonGroupMS.add(m2);

//

        jLabel9 = new JLabel("Address: ");
        jLabel9.setBounds(100,490,200,30);
        jLabel9.setFont(new Font("Raleway",Font.BOLD,20));
        add(jLabel9);

        TextFieldA = new JTextField();
        TextFieldA.setBounds(300, 490, 400, 30);
        TextFieldA.setFont(new Font("Arial", Font.BOLD, 14));
        add(TextFieldA);
//
        jLabel10 = new JLabel("City: ");
        jLabel10.setBounds(100,540,200,30);
        jLabel10.setFont(new Font("Raleway",Font.BOLD,20));
        add(jLabel10);

        TextFieldC = new JTextField();
        TextFieldC.setBounds(300, 540, 400, 30);
        TextFieldC.setFont(new Font("Arial", Font.BOLD, 14));
        add(TextFieldC);

//

        jLabel11 = new JLabel("State: ");
        jLabel11.setBounds(100,590,200,30);
        jLabel11.setFont(new Font("Raleway",Font.BOLD,20));
        add(jLabel11);

        TextFieldS = new JTextField();
        TextFieldS.setBounds(300, 590, 400, 30);
        TextFieldS.setFont(new Font("Arial", Font.BOLD, 14));
        add(TextFieldS);

//
        jLabel12 = new JLabel("Pin Code: ");
        jLabel12.setBounds(100,640,200,30);
        jLabel12.setFont(new Font("Raleway",Font.BOLD,20));
        add(jLabel12);

        TextFieldP = new JTextField();
        TextFieldP.setBounds(300, 640, 400, 30);
        TextFieldP.setFont(new Font("Arial", Font.BOLD, 14));
        add(TextFieldP);


//
        jLabel13 = new JLabel("Email Address: ");
        jLabel13.setBounds(100,390,200,30);
        jLabel13.setFont(new Font("Raleway",Font.BOLD,20));
        add(jLabel13);

        TextFieldE = new JTextField();
        TextFieldE.setBounds(300, 390, 400, 30);
        TextFieldE.setFont(new Font("Arial", Font.BOLD, 14));
        add(TextFieldE);

//
        //Next Button
        Next = new JButton("NEXT");
        Next.setFont(new Font("Arial", Font.BOLD, 14));
        Next.setForeground(Color.WHITE);
        Next.setBackground(Color.BLACK);
        Next.setBounds(600,690,100,30);
        Next.setOpaque(true);  // Ensures background color is visible
        Next.setBorderPainted(false);
        Next.addActionListener(this);
        add(Next);





        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignUp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String FormN= first;
        String Name = TextField.getText();
        String FName= TextFieldF.getText();
        String Dob = ((JTextField)  dateChooser.getDateEditor().getUiComponent()).getText();
        String Gender = null;
        if(r1.isSelected()){
            Gender= "Male";
        }
        else if(r2.isSelected()){
            Gender= "Female";
        }
        else if(m3.isSelected()){
            Gender= "Other";
        }
        String Add = TextFieldA.getText();
        String Email= TextFieldE.getText();
        String Marital = null;
        if(m1.isSelected()){
            Marital= "Married";
        } else if (m2.isSelected()) {
            Marital = "Unmarried";

        }
        String City = TextFieldC.getText();
        String State = TextFieldS.getText();
        String PinCode = TextFieldP.getText();

        try{
            if(TextField.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the Filed");

            }else {
                Con con1 = new Con();
                String q = "insert into SignUpForm values ('"+FormN+"','"+Name+"','"+FName+"','"+Dob+"','"+Gender+"','"+Add+"','"+Email+"','"+Marital+"','"+City+"','"+State+"','"+PinCode+"')";
                con1.statement.execute(q);
                new Signup2(FormN);
                setVisible(false);


            }

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }
}
