package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class deposit extends JFrame implements ActionListener{

	JTextField amount;
	JButton deposit, back;
	String pinNumber;
	
	deposit(String pinNumber){
		
		this.pinNumber = pinNumber;
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text = new JLabel("Enter the amount you want to deposit");
		text.setBounds(190, 300, 400, 30);
		text.setFont(new Font("Raleway", Font.BOLD, 16));
		text.setForeground(Color.white);
		image.add(text);
		
		amount = new JTextField();
		amount.setFont(new Font("Raleway", Font.BOLD, 20));
		amount.setBounds(190, 340, 285, 25);
		image.add(amount);
		
		deposit = new JButton("Deposit");
		deposit.setBounds(350, 485, 150, 30);
		deposit.setFont(new Font("Raleway", Font.BOLD, 14));
		deposit.addActionListener(this);
		image.add(deposit);
		
		back = new JButton("Back");
		back.setBounds(350, 520, 150, 30);
		back.setFont(new Font("Raleway", Font.BOLD, 14));
		back.addActionListener(this);
		image.add(back);
		
		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == deposit) {
			
			String number = amount.getText();
			Date date = new Date();
			
			if(number.equals("")) {
				JOptionPane.showMessageDialog(null, "please enter the amount you want to deposit.");
			}
			else {
				
				try {
					
					Conn conn = new Conn();
					String query = "insert into bank values('"+pinNumber+"', '"+date+"', 'Deposit', '"+number+"')";
					
					conn.s.executeUpdate(query);
					
					JOptionPane.showMessageDialog(null, "Rs. "+number+" Deposited Successfully.");
					
					setVisible(false);
					new transactions(pinNumber).setVisible(true);
				}catch(Exception ex) {
					System.out.println(ex);
				}
			}
			
		}else if(e.getSource() == back) {
			setVisible(false);
			
			new transactions(pinNumber).setVisible(true);
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new deposit("");
	}
	

}
