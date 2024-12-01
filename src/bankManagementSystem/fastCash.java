package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.util.Date;

public class fastCash extends JFrame implements ActionListener {
	
	JButton hundred, fiveHundred, oneK, twoK, fiveK, tenK, back;
	String pinNumber;
	
	fastCash(String pinNumber){
		
		this.pinNumber = pinNumber;
		
		setLayout(null);
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		
		JLabel image = new JLabel(i3);
		image.setBounds(0,0, 900, 900);
		add(image);
		
		JLabel text = new JLabel("SELECT WITHDRAW AMOUNT");
		text.setBounds(215,300, 700,30);
		text.setForeground(Color.white);
		text.setFont(new Font("Raleway", Font.BOLD, 16));
		image.add(text);
		
		hundred = new JButton("Rs 100");
		hundred.setBounds(170, 417, 150, 30);
		hundred.setFont(new Font("Raleway", Font.BOLD, 14));
		hundred.addActionListener(this);
		image.add(hundred);

		fiveHundred = new JButton("Rs 500");
		fiveHundred.setBounds(350, 417, 150, 30);
		fiveHundred.setFont(new Font("Raleway", Font.BOLD, 14));
		fiveHundred.addActionListener(this);
		image.add(fiveHundred);

		oneK = new JButton("Rs 1000");
		oneK.setBounds(170, 452, 150, 30);
		oneK.setFont(new Font("Raleway", Font.BOLD, 14));
		oneK.addActionListener(this);
		image.add(oneK);

		twoK = new JButton("Rs 2000");
		twoK.setBounds(350, 452, 150, 30);
		twoK.setFont(new Font("Raleway", Font.BOLD, 14));
		twoK.addActionListener(this);
		image.add(twoK);
		
		fiveK = new JButton("Rs 5000");
		fiveK.setBounds(170, 487, 150, 30);
		fiveK.setFont(new Font("Raleway", Font.BOLD, 14));
		fiveK.addActionListener(this);
		image.add(fiveK);
		
		tenK = new JButton("Rs 10000");
		tenK.setBounds(350, 487, 150, 30);
		tenK.setFont(new Font("Raleway", Font.BOLD, 14));
		tenK.addActionListener(this);
		image.add(tenK);
		
		back = new JButton("Back");
		back.setBounds(350, 522, 150, 28);
		back.setFont(new Font("Raleway", Font.BOLD, 14));
		back.addActionListener(this);
		image.add(back);
		
		

		
		setSize(900, 900);
		setUndecorated(true);
		setLocation(300,0);
		setVisible(true);
		//getContentPane().setBackground(Color.white);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == back) {
			
			setVisible(false);
			new transactions(pinNumber).setVisible(true);
		}
		else {
			String amount = ((JButton)e.getSource()).getText().substring(3);
			Conn conn = new Conn();
			try {
				
				ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");
				
				int balance = 0;
				while(rs.next()) {
					if(rs.getString("type").equals("Deposit")) {
						balance += Integer.parseInt(rs.getString("amount"));
					}else {
						balance -= Integer.parseInt(rs.getString("amount"));
					}
				}
				
				if(e.getSource() != back && balance < Integer.parseInt(amount)) {
					JOptionPane.showMessageDialog(null, "Insufficient Balance");
					return ;
				}
				
				Date date = new Date();
				String query = "insert into bank values('"+pinNumber+"', '"+date+"', 'Withdrawl', '"+amount+"')";
				conn.s.executeUpdate(query);
				
				JOptionPane.showMessageDialog(null, "Rs "+amount+" Debited Successfully.");
				
				setVisible(false);
				new transactions(pinNumber).setVisible(true);
				
			}catch(Exception ex) {
				System.out.println(ex);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new fastCash("");
	}


}
