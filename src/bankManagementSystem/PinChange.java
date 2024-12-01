package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange  extends JFrame implements ActionListener{

	JPasswordField pin, repin;
	JButton change, back;
	String pinNumber;
	
	PinChange(String pinNumber){
		
		this.pinNumber = pinNumber;
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		
		
		JLabel text = new JLabel("Change Your PIN");
		text.setBounds(270, 300, 400, 30);
		text.setForeground(Color.white);
		text.setFont(new Font("Raleway", Font.BOLD, 18));
		image.add(text);
		
		JLabel pintext = new JLabel("Enter New PIN");
		pintext.setBounds(165, 350, 200, 30);
		pintext.setFont(new Font("Raleway", Font.BOLD, 16));
		pintext.setForeground(Color.white);
		image.add(pintext);
		
		pin = new JPasswordField();
		pin.setBounds(320, 350, 180, 25);
		pin.setFont(new Font("Raleway", Font.BOLD, 14));
		image.add(pin);
		
		
		JLabel repintext = new JLabel("Re-Enter New PIN");
		repintext.setBounds(165, 400, 200, 30);
		repintext.setForeground(Color.white);
		repintext.setFont(new Font("Raleway", Font.BOLD, 16));
		image.add(repintext);
		
		repin = new JPasswordField(); 
		repin.setBounds(320, 400, 180, 25);
		repin.setFont(new Font("Raleway", Font.BOLD, 14));
		image.add(repin);
		
		change = new JButton("Change");
		change.setBounds(350, 490, 150, 25);
		change.setFont(new Font("Raleway", Font.BOLD, 16));
		change.setBackground(Color.white);
		change.addActionListener(this);
		image.add(change);
		
		back = new JButton("Back");
		back.setBounds(350, 520, 150, 25);
		back.setFont(new Font("Raleway", Font.BOLD, 16));
		back.setBackground(Color.white);
		back.addActionListener(this);
		image.add(back);
		
		setSize(900, 900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == change) {
			try {

				String npin = pin.getText();
				String rpin = repin.getText();

				if (!npin.equals(rpin)) {
					JOptionPane.showMessageDialog(null, "Enter PIN Does not Match");
					return;
				}
				
				if(npin.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter new PIN");
					return;
				}
				
				if(rpin.equals("")) {
					JOptionPane.showMessageDialog(null, "Please re-enter new PIN");
				}
				
				Conn conn = new Conn();
				
				String query1 = "Update bank set pin = '"+rpin+"' where pin='"+pinNumber+"'";
				String query2 = "Update login set pinNumber = '"+rpin+"' where pinNumber='"+pinNumber+"'";
				String query3 = "Update signupthree set pinNumber = '"+rpin+"' where pinNumber='"+pinNumber+"'";

				conn.s.executeUpdate(query1);
				conn.s.executeUpdate(query2);
				conn.s.executeUpdate(query3);
				
				JOptionPane.showMessageDialog(null, "PIN changed successfully.");
				
				setVisible(false);
				
				new transactions(rpin).setVisible(true);

			} catch (Exception ex) {
				System.out.println(ex);
			}
		}
		else if(e.getSource() == back) {
			
			setVisible(false);
			
			new transactions(pinNumber).setVisible(true);

			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PinChange("");
		
	}

}
