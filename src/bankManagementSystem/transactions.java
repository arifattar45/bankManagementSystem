package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class transactions extends JFrame implements ActionListener {
	
	JButton deposit, withdraw, miniStatement, pinChange, balanceEnquiry, FastCash, exit;
	String pinNumber;
	transactions(String pinNumber){
		
		this.pinNumber = pinNumber;
		
		setLayout(null);
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		
		JLabel image = new JLabel(i3);
		image.setBounds(0,0, 900, 900);
		add(image);
		
		JLabel text = new JLabel("Please select your transaction");
		text.setBounds(215,300, 700,30);
		text.setForeground(Color.white);
		text.setFont(new Font("Raleway", Font.BOLD, 16));
		image.add(text);
		
		deposit = new JButton("Deposit");
		deposit.setBounds(170, 417, 150, 30);
		deposit.setFont(new Font("Raleway", Font.BOLD, 14));
		deposit.addActionListener(this);
		image.add(deposit);

		withdraw = new JButton("Cash Withdraw");
		withdraw.setBounds(350, 417, 150, 30);
		withdraw.setFont(new Font("Raleway", Font.BOLD, 14));
		withdraw.addActionListener(this);
		image.add(withdraw);

		FastCash = new JButton("Fast Cash");
		FastCash.setBounds(170, 452, 150, 30);
		FastCash.setFont(new Font("Raleway", Font.BOLD, 14));
		FastCash.addActionListener(this);
		image.add(FastCash);

		miniStatement = new JButton("Mini Statement");
		miniStatement.setBounds(350, 452, 150, 30);
		miniStatement.setFont(new Font("Raleway", Font.BOLD, 14));
		miniStatement.addActionListener(this);
		image.add(miniStatement);
		
		pinChange = new JButton("Pin Change");
		pinChange.setBounds(170, 487, 150, 30);
		pinChange.setFont(new Font("Raleway", Font.BOLD, 14));
		pinChange.addActionListener(this);
		image.add(pinChange);
		
		balanceEnquiry = new JButton("Balance Enquiry");
		balanceEnquiry.setBounds(350, 487, 150, 30);
		balanceEnquiry.setFont(new Font("Raleway", Font.BOLD, 14));
		balanceEnquiry.addActionListener(this);
		image.add(balanceEnquiry);
		
		exit = new JButton("Exit");
		exit.setBounds(350, 522, 150, 28);
		exit.setFont(new Font("Raleway", Font.BOLD, 14));
		exit.addActionListener(this);
		image.add(exit);
		
		

		
		setSize(900, 900);
		setUndecorated(true);
		setLocation(300,0);
		setVisible(true);
		//getContentPane().setBackground(Color.white);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == exit) {
			System.exit(0);
		}
		else if(e.getSource() == deposit) {
			
			setVisible(false);
			new deposit(pinNumber).setVisible(true);
		}else if(e.getSource() == withdraw) {
			
			setVisible(false);
			new withdrawl(pinNumber).setVisible(true);
		}
		else if(e.getSource() == FastCash) {
			
			setVisible(false);
			new fastCash(pinNumber).setVisible(true);
		}
		else if(e.getSource() == pinChange) {
			
			setVisible(false);
			new PinChange(pinNumber).setVisible(true);
		}
		else if(e.getSource() == balanceEnquiry) {
			
			setVisible(false);
			new BalanceEnquiry(pinNumber).setVisible(true);
		}
		else if(e.getSource() == miniStatement) {
		
			new MiniStatement(pinNumber).setVisible(true);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new transactions("");
	}


}
