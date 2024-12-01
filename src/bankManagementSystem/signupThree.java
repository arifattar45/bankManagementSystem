package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class signupThree extends JFrame implements ActionListener{
	
	JRadioButton r1, r2, r3, r4;
	JCheckBox c1, c2, c3, c4, c5, c6, c7;
	JButton submit, cancel;
	String formno;
	signupThree(String formno)
	{
		this.formno = formno;
		setLayout(null);
		setVisible(true);
		setTitle("Signup Form:Account Details - Page 3");
		
		
		JLabel title = new JLabel("Page 3 - Account Details");
		title.setFont(new Font("Raleway", Font.BOLD, 28));
		title.setBounds(280, 40, 400, 40);
		add(title);
		
		JLabel card = new JLabel("Card Number");
		card.setBounds(100, 300, 300, 30);
		card.setFont(new Font("Raleway", Font.BOLD, 20));
		add(card);
		
		JLabel cardDetail = new JLabel("(Your 16 Digit Card Number)");
		cardDetail.setBounds(100, 330, 300, 20);
		cardDetail.setFont(new Font("Raleway", Font.BOLD, 12));
		add(cardDetail);
		
		JLabel number = new JLabel("XXXX-XXXX-XXXX-0264");
		number.setBounds(350, 300, 300, 30);
		number.setFont(new Font("Raleway", Font.BOLD, 20));
		add(number);
		
		//pin
		JLabel pin = new JLabel("PIN");
		pin.setBounds(100, 370, 300, 30);
		pin.setFont(new Font("Raleway", Font.BOLD, 20));
		add(pin);
		
		JLabel pinDetail = new JLabel("(Your 4 Digit Password)");
		pinDetail.setBounds(100, 400, 300, 20);
		pinDetail.setFont(new Font("Raleway", Font.BOLD, 12));
		add(pinDetail);
		
		JLabel pnumber = new JLabel("XXXX");
		pnumber.setBounds(350, 370, 300, 30);
		pnumber.setFont(new Font("Raleway", Font.BOLD, 20));
		add(pnumber);
		
		//services
		JLabel services = new JLabel("Services Required");
		services.setBounds(100, 450, 300, 30);
		services.setFont(new Font("Raleway", Font.BOLD, 20));
		add(services);
		
		//account type
		JLabel type = new JLabel("Account Type");
		type.setBounds(100, 140, 200, 30);
		type.setFont(new Font("Raleway", Font.BOLD, 20));
		add(type);
		
		r1 = new JRadioButton("Saving Account");
		r1.setBounds(100, 180, 150, 30);
		r1.setFont(new Font("Raleway", Font.BOLD, 14));
		r1.setBackground(Color.white);
		add(r1);
		
		r2 = new JRadioButton("Fixed Deposite Account");
		r2.setBounds(100, 220, 220, 30);
		r2.setFont(new Font("Raleway", Font.BOLD, 14));
		r2.setBackground(Color.white);
		add(r2);
		
		r3 = new JRadioButton("Current Account");
		r3.setBounds(350, 180, 150, 30);
		r3.setFont(new Font("Raleway", Font.BOLD, 14));
		r3.setBackground(Color.white);
		add(r3);
		
		r4 = new JRadioButton("Recurring Deposite Account");
		r4.setBounds(350, 220, 250, 30);
		r4.setFont(new Font("Raleway", Font.BOLD, 14));
		r4.setBackground(Color.white);
		add(r4);
		
		ButtonGroup btnGrp= new ButtonGroup();
		btnGrp.add(r1);
		btnGrp.add(r2);
		btnGrp.add(r3);
		btnGrp.add(r4);
		
		//card
		
		
		//services required
		
		
		c1 = new JCheckBox("ATM Card");
		c1.setBounds(100, 490, 200, 30);
		c1.setFont(new Font("Raleway", Font.BOLD, 14));
		c1.setBackground(Color.white);
		add(c1);
		
		c1 = new JCheckBox("ATM Card");
		c1.setBounds(100, 490, 200, 30);
		c1.setFont(new Font("Raleway", Font.BOLD, 14));
		c1.setBackground(Color.white);
		add(c1);
		
		c2 = new JCheckBox("Internet Banking");
		c2.setBounds(350, 490, 200, 30);
		c2.setFont(new Font("Raleway", Font.BOLD, 14));
		c2.setBackground(Color.white);
		add(c2);
		
		c3 = new JCheckBox("Mobile Banking");
		c3.setBounds(100, 530, 200, 30);
		c3.setFont(new Font("Raleway", Font.BOLD, 14));
		c3.setBackground(Color.white);
		add(c3);
		
		c4 = new JCheckBox("EMAIL & SMS Alert");
		c4.setBounds(350, 530, 200, 30);
		c4.setFont(new Font("Raleway", Font.BOLD, 14));
		c4.setBackground(Color.white);
		add(c4);
		
		c5 = new JCheckBox("Cheque Book");
		c5.setBounds(100, 570, 200, 30);
		c5.setFont(new Font("Raleway", Font.BOLD, 14));
		c5.setBackground(Color.white);
		add(c5);
		
		c6 = new JCheckBox("E-Statement");
		c6.setBounds(350, 570, 200, 30);
		c6.setFont(new Font("Raleway", Font.BOLD, 14));
		c6.setBackground(Color.white);
		add(c6);
		
		c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge.");
		c7.setBounds(100, 630, 600, 30);
		c7.setFont(new Font("Raleway", Font.BOLD, 12));
		c7.setBackground(Color.white);
		add(c7);
		
		//buttons
		
		submit = new JButton("Submit");
		submit.setBackground(Color.black);
		submit.setForeground(Color.white);
		submit.setBounds(250, 680, 100, 30);
		submit.setFont(new Font("Raleway", Font.BOLD, 16));
		submit.addActionListener(this);
		add(submit);
		
		cancel = new JButton("Cancel");
		cancel.setBackground(Color.black);
		cancel.setForeground(Color.white);
		cancel.setBounds(420, 680, 100, 30);
		cancel.setFont(new Font("Raleway", Font.BOLD, 16));
		cancel.addActionListener(this);
		add(cancel);
		
		setSize(850, 800);
		setLocation(350, 10);
		getContentPane().setBackground(Color.white);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource() == submit) {
			
			String accountType = null;
			if(r1.isSelected()) {
				accountType = "Saving Account";
			} else if(r2.isSelected()) {
				accountType = "Fixed Deposite Account";
			} else if (r3.isSelected()) {
				accountType = "Current Account";
			}else if(r4.isSelected()) {
				accountType = "Recurring Deposite Account";
			}
			
			Random ran = new Random();
			String cardNumber = "" + Math.abs((ran.nextLong() % 90000000L)+ 2030507000000000L);
			
			//Random ran = new Random();
			//Generate a random 15-digit number and prepend '2' to make it 16 digits
			//String cardNumber = "2" + String.format("%015d", Math.abs(ran.nextLong() % 1_000_000_000_000_000L));
			System.out.println("Generated Card Number: " + cardNumber);

			
			String pinNumber = "" + Math.abs((ran.nextLong() % 9000L) + 1000); 
			
			//String pinNumber = "" + (Math.abs(ran.nextLong() % 9000L) + 1000L); 
			System.out.println("Generated PIN Number: " + pinNumber);

			String services = "";
			
			if(c1.isSelected()) {
				services = services + " ATM Card";
			} 
			if (c2.isSelected()) {
			    services += " Internet Banking";
			}
			if (c3.isSelected()) {
			    services += " Mobile Banking";
			}
			if (c4.isSelected()) {
			    services += " EMAIL & SMS Alert";
			}
			if (c5.isSelected()) {
			    services += " Cheque Book";
			}
			if (c6.isSelected()) {
			    services += " E-Statement";
			}
			try {
				
				if(accountType.equals(null)) {
					JOptionPane.showMessageDialog(null, "Account Type is Required");
				}
				else if(services.equals("")) {
					JOptionPane.showMessageDialog(null, "select atleast one service is Required");
				}
				else {
					
					Conn con = new Conn();
					
					String query1 = "insert into signupthree values('"+formno+"', '"+accountType+"', '"+cardNumber+"', '"+pinNumber+"', '"+services+"')";
					String query2 = "insert into login values('"+formno+"','"+cardNumber+"', '"+pinNumber+"')";

					con.s.executeUpdate(query1);
					con.s.executeUpdate(query2);
					
					JOptionPane.showMessageDialog(null, "Card Number: "+cardNumber+"\nPIN: "+pinNumber);
				
					setVisible(false);
					new deposit(pinNumber).setVisible(true);
				
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		else if(ae.getSource() == cancel) {
			
			setVisible(false);
			
			new Login().setVisible(true);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new signupThree("");
	}

	

}