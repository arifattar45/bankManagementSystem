package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class MiniStatement extends JFrame{
	
	String pinNumber;

	MiniStatement(String pinNumber){
		
		this.pinNumber = pinNumber;
		
		setLayout(null);
		
		JLabel mini = new JLabel("");
		mini.setBounds(10, 70, 400, 200);
		add(mini);
		
		JLabel bank = new JLabel("UNION BANK");
		bank.setBounds(150, 30, 100, 30);
		bank.setFont(new Font("Arial", Font.BOLD, 16));
		add(bank);
		
		JLabel card = new JLabel();
		card.setBounds(10, 90, 400, 30);
		card.setFont(new Font("Arial", Font.BOLD, 14));
		add(card);
		
		JLabel balance = new JLabel();
		balance.setBounds(10, 400, 300, 20);
		add(balance);
		
		
		try {
			
			Conn conn = new Conn();
			
			
			ResultSet rs = conn.s.executeQuery("select * from login where pinNumber = '"+pinNumber+"'");
		
			while(rs.next()) {
				card.setText("Card Number: "+ rs.getString("cardNumber").substring(0,4)+"XXXXXXXX"+rs.getString("cardNumber").substring(12));
			
				
			}
			
		}catch(Exception ex) {
			
			System.out.println(ex);
		}
		
		try {
			
			Conn conn =new Conn();
			int bal = 0;
			ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");
			
			while(rs.next()) {
				mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") +"<br><br><html>");
			
				if(rs.getString("type").equals("Deposit")) {
					bal += Integer.parseInt(rs.getString("amount"));
				}else {
					bal -= Integer.parseInt(rs.getString("amount"));
				}
			
			}
			balance.setText("Your Current Account Balance is Rs "+bal);
			
		}catch(Exception e) {
			
		}
		
		setTitle("Mini Statement");
		setSize(400, 600);
		setLocation(10, 10);
		getContentPane().setBackground(Color.white);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		
		new MiniStatement("");
	}

}
