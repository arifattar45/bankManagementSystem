//package bankManagementSystem;
//
//import javax.swing.ImageIcon;
//
//import java.sql.*;
//import java.awt.*;
//import java.awt.event.*;
//
//import javax.swing.*;
//import javax.swing.JLabel;
//
//
//public class Login extends JFrame implements ActionListener{
//	
//	JButton login, clear, signup;
//	JTextField cardTextField;
//	JPasswordField  pinTextField;
//	
//	Login(){
//		
//		setTitle("AUTOMATED TELLER MACHINE");
//		
//		setLayout(null); //no default layout
//		
//		//adding icon
//		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg")); //icon access
//		Image i2 = i1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT); //icon height width
//		ImageIcon i3 = new ImageIcon(i2); //converting image to icon
//		
//		JLabel label = new JLabel(i3); //storing icon in label
//		label.setBounds(70, 20, 100, 100); //label position
//		
//		add(label);
//		
//		//text title
//		
//		JLabel text  = new JLabel("Welcom to ATM");
//		text.setFont(new Font("Osward", Font.BOLD, 38));
//		text.setBounds(200, 50, 400, 40);
//		
//		add(text);
//		
//		//card number label
//		
//		JLabel cardno  = new JLabel("Card No. ");
//		cardno.setFont(new Font("Raleway", Font.BOLD, 24));
//		cardno.setBounds(120, 150, 150, 30);
//		
//		add(cardno);
//		
//		//card textfield
//		
//		cardTextField = new JTextField();
//		cardTextField.setBounds(300, 150, 250, 30);
//		cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
//		add(cardTextField);
//		
//		//pin label
//		
//		JLabel pin  = new JLabel("PIN ");
//		pin.setFont(new Font("Raleway", Font.BOLD, 24));
//		pin.setBounds(120, 220, 150, 30);
//		
//		//pin text field
//		
//		pinTextField = new JPasswordField();
//		pinTextField.setBounds(300, 220, 250, 30);
//		pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
//		add(pinTextField);
//		
//		add(pin);
//		
//		
//		//login buttons 
//		
//		login = new JButton("SIGN IN");
//		login.setBounds(300, 300, 100, 30);
//		login.setBackground(Color.black);
//		login.setForeground(Color.white);
//		add(login);
//		login.addActionListener(this);
//		
//		//clear button
//		
//		clear = new JButton("CLEAR");
//		clear.setBounds(450, 300, 100, 30);
//		clear.setBackground(Color.black);
//		clear.setForeground(Color.white);
//		add(clear);
//		clear.addActionListener(this);
//		
//		//sign up button
//		
//		signup = new JButton("SIGN UP");
//		signup.setBounds(300, 350, 250, 30);
//		signup.setBackground(Color.black);
//		signup.setForeground(Color.white);
//		add(signup);
//		signup.addActionListener(this);
//		
//		
//		//frame background color
//		getContentPane().setBackground(Color.white);
//	}
//	
//	@Override
//	public void actionPerformed(ActionEvent ae) {
//		// TODO Auto-generated method stub
//		if(ae.getSource() == clear) {
//			
//			cardTextField.setText("");
//			pinTextField.setText("");
//		}
//		else if(ae.getSource() == login) {
//			
//			Conn conn = new Conn();
//			String cardNumber = cardTextField.getText();
//			String pinNumber = pinTextField.getText();
//			
//			String query = " select * from login where cardNumber = '"+cardNumber+"' and pinNumber = '"+pinNumber+"'";
//			
//			try {
//				ResultSet rs = conn.s.executeQuery(query);
//				
//				if(rs.next()) {
//					setVisible(false);
//					new transactions(pinNumber).setVisible(true);
//				}
//				else {
//					JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
//				}
//			}catch(Exception e) {
//				System.out.println(e);
//			}
//		}
//		else if(ae.getSource() == signup) {
//		    System.out.println("Opening signup page...");
//		    
//		    //sign up 1 object
//		    setVisible(false);  
//		    new signupOne().setVisible(true);  
//		}
//
//		
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Login l = new Login();
//		l.setSize(800, 500);
//		l.setVisible(true);
//		l.setLocation(350, 180);
//		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//
//	
//
//}
package bankManagementSystem;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JButton login, clear, signup;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);

        // Gradient background panel
        JPanel gradientPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                Color color1 = Color.BLACK; // Top color
                Color color2 = Color.WHITE; // Bottom color
                GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        gradientPanel.setLayout(null);
        gradientPanel.setBounds(0, 0, 800, 500);
        add(gradientPanel);

        // Adding icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(340, 30, 120, 120);
        gradientPanel.add(label);

        // Title text
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Oswald", Font.BOLD, 36));
        text.setForeground(Color.WHITE);
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setBounds(200, 150, 400, 40);
        gradientPanel.add(text);

        // Card number label
        JLabel cardno = new JLabel("Card Number");
        cardno.setFont(new Font("Raleway", Font.BOLD, 20));
        cardno.setForeground(Color.WHITE);
        cardno.setBounds(150, 220, 200, 30);
        gradientPanel.add(cardno);

        // Card text field
        cardTextField = new JTextField();
        styleTextField(cardTextField);
        cardTextField.setBounds(300, 220, 300, 30);
        gradientPanel.add(cardTextField);

        // PIN label
        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setForeground(Color.WHITE);
        pin.setBounds(150, 270, 200, 30);
        gradientPanel.add(pin);

        // PIN text field
        pinTextField = new JPasswordField();
        styleTextField(pinTextField);
        pinTextField.setBounds(300, 270, 300, 30);
        gradientPanel.add(pinTextField);

        // Login button
        login = new JButton("SIGN IN");
        styleButton(login);
        login.setBounds(300, 330, 140, 40);
        gradientPanel.add(login);

        // Clear button
        clear = new JButton("CLEAR");
        styleButton(clear);
        clear.setBounds(460, 330, 140, 40);
        gradientPanel.add(clear);

        // Signup button
        signup = new JButton("SIGN UP");
        styleButton(signup);
        signup.setBounds(300, 390, 300, 40);
        gradientPanel.add(signup);

        // Adding action listeners
        login.addActionListener(this);
        clear.addActionListener(this);
        signup.addActionListener(this);

        // Frame properties
        setSize(800, 500);
        setLocation(350, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void styleTextField(JTextField textField) {
        textField.setFont(new Font("Arial", Font.PLAIN, 16));
        textField.setBorder(new LineBorder(Color.WHITE, 2, true));
        textField.setOpaque(false);
        textField.setForeground(Color.WHITE);
        textField.setCaretColor(Color.WHITE);
    }

    private void styleButton(JButton button) {
        button.setFont(new Font("Raleway", Font.BOLD, 16));
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(new LineBorder(Color.WHITE, 2));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (ae.getSource() == login) {
            Conn conn = new Conn();
            String cardNumber = cardTextField.getText();
            String pinNumber = pinTextField.getText();

            String query = "SELECT * FROM login WHERE cardNumber = '" + cardNumber + "' AND pinNumber = '" + pinNumber + "'";

            try {
                ResultSet rs = conn.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new transactions(pinNumber).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (ae.getSource() == signup) {
            setVisible(false);
            new signupOne().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
