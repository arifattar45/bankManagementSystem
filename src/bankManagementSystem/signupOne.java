package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class signupOne extends JFrame implements ActionListener{
	
	long random;
	JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField;
	JButton next;
	JRadioButton male, female, other, married, unmarried;
	JDateChooser dateChooser;
	
	signupOne(){
		
		
		setLayout(null); // Null layout for custom positioning
	    setTitle("Signup Form: Personal Details - Page 1");
	    		
		//random numbers
		Random ran = new Random();
		random = Math.abs((ran.nextLong() % 9000L)+1000L);
		//System.out.println(random);
		
		//application form number label
		JLabel formno = new JLabel("APPLICATION FORM NO. "+random);
		formno.setFont(new Font("Raleway", Font.BOLD, 38));
		formno.setBounds(140, 20, 600, 40);
		add(formno);
		
		//personal detail title
		JLabel personalDetails = new JLabel("Page 1: Personal Details");
		personalDetails.setBounds(290, 80, 400, 30);
		personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		add(personalDetails);
		
		//name label and text field
		JLabel name = new JLabel("Name: ");
		name.setBounds(100, 140, 100, 30 );
		name.setFont(new Font("Raleway", Font.BOLD, 20));
		add(name);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		nameTextField.setBounds(300, 140, 400, 30);
		add(nameTextField);
		
		
		//father name label and text field
		JLabel fname = new JLabel("Father's Name: ");
		fname.setBounds(100, 190, 200, 30);
		fname.setFont(new Font("Raleway", Font.BOLD, 20));
		add(fname);
		
		fnameTextField = new JTextField();
		fnameTextField.setBounds(300, 190, 400, 30);
		fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		add(fnameTextField);
		
		
		//date of birth label
		JLabel dob = new JLabel("Date of Birth: ");
		dob.setBounds(100, 240, 200, 30);
		dob.setFont(new Font("Raleway", Font.BOLD, 20));
		add(dob);
		
		dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(300, 240, 400, 30);
		add(dateChooser);
		
		//gender label and radio button
		JLabel gender = new JLabel("Gender:");
		gender.setBounds(100, 290, 200, 30);
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		add(gender);
		
		male = new JRadioButton("Male");
		male.setBounds(300, 290, 100, 30);
		male.setBackground(Color.white);
		add(male);
		
		female = new JRadioButton("Female");
		female.setBounds(450, 290, 100, 30);
		female.setBackground(Color.white);
		add(female);
		
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(male);
		genderGroup.add(female);
		
		
		//email address label and text field
		JLabel email = new JLabel("Email Address:");
		email.setBounds(100, 340, 200, 30);
		email.setFont(new Font("Raleway", Font.BOLD, 20));
		add(email);
		
		emailTextField = new JTextField();
		emailTextField.setBounds(300, 340, 400, 30);
		emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		add(emailTextField);
		
		//Marital status
		JLabel marital = new JLabel("Marital Status: ");
		marital.setBounds(100, 390, 200, 30);
		marital.setFont(new Font("Raleway", Font.BOLD, 20));
		add(marital);
		
		married = new JRadioButton("Married");
		married.setBounds(300, 390, 100, 30);
		married.setBackground(Color.white);
		add(married);
		
		unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(450, 390, 100, 30);
		unmarried.setBackground(Color.white);
		add(unmarried);
		
		other = new JRadioButton("Other");
		other.setBounds(600, 390, 100, 30);
		other.setBackground(Color.white);
		add(other);
		
		ButtonGroup maritalGroup = new ButtonGroup();
		maritalGroup.add(married);
		maritalGroup.add(unmarried);
		maritalGroup.add(other);
		
		//address label and text field
		JLabel address = new JLabel("Address:");
		address.setBounds(100, 440, 200, 30);
		address.setFont(new Font("Raleway", Font.BOLD, 20));
		add(address);
		
		addressTextField = new JTextField();
		addressTextField.setBounds(300, 440, 400, 30);
		addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		add(addressTextField);
		
		//city label and text field
		JLabel city = new JLabel("City:");
		city.setBounds(100, 490, 200, 30);
		city.setFont(new Font("Raleway", Font.BOLD, 20));
		add(city);
		
		cityTextField = new JTextField();
		cityTextField.setBounds(300, 490, 400, 30);
		cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		add(cityTextField);
		
		//state label and text field
		JLabel state = new JLabel("State:");
		state.setBounds(100, 540, 200, 30);
		state.setFont(new Font("Raleway", Font.BOLD, 20));
		add(state);
		
		stateTextField = new JTextField();
		stateTextField.setBounds(300, 540, 400, 30);
		stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		add(stateTextField);
		
		//pin code label and text field
		JLabel pincode = new JLabel("Pin Code:");
		pincode.setBounds(100, 590, 200, 30);
		pincode.setFont(new Font("Raleway", Font.BOLD, 20));
		add(pincode);
		
		pincodeTextField = new JTextField();
		pincodeTextField.setBounds(300, 590, 400, 30);
		pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		add(pincodeTextField);
		
		
		//next button
		
		next =new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setBounds(600, 650, 100, 30);
		next.setFont(new Font("Raleway", Font.BOLD, 15));
		next.addActionListener(this);
		add(next);
		
		
		
		//background color
		
		getContentPane().setBackground(Color.white);
		setSize(850, 800); // Ensure the size is large enough
	    setLocation(350, 10);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true); // Make the frame visible

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String formno = ""+random;
		String name = nameTextField.getText();
		String fname = fnameTextField.getText();
		String dob =((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		String  gender = null;
		if(male.isSelected()) {
			gender = "Male";
		}
		else if(female.isSelected()) {
			gender = "Female";
		}
		
		String email = emailTextField.getText();
		
		String marital = null;
		if(married.isSelected()) {
			marital = "Married";
		}else if(unmarried.isSelected()) {
			marital = "Unmarried";
		}
		else if(other.isSelected()) {
			marital = "Other";
		}
		
		String address = addressTextField.getText();
		String city = cityTextField.getText();
		String state = stateTextField.getText();
		String pincode = pincodeTextField.getText();
		
		try {
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is Required");
			}
			else if(fname.equals("")) {
				JOptionPane.showMessageDialog(null, "Father Name is Required");
			}
			else if(email.equals("")) {
				JOptionPane.showMessageDialog(null, "Email is Required");
			}
			else if(address.equals("")) {
				JOptionPane.showMessageDialog(null, "Address is Required");
			}
			else if(city.equals("")) {
				JOptionPane.showMessageDialog(null, "City is Required");
			}
			else if(state.equals("")) {
				JOptionPane.showMessageDialog(null, "State is Required");
			}
			else if(pincode.equals("")) {
				JOptionPane.showMessageDialog(null, "Pincode is Required");
			}
			
			else {
				Conn c = new Conn();
				String q1 = "insert into signup values('"+formno+"', '"+name+"', '"+dob+"','"+fname+"',  '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pincode+"')";
				c.s.executeUpdate(q1);
				
				//sign up 2 object
				setVisible(false);
				new signupTwo(formno).setVisible(true);
			}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new signupOne();
	}

	

}
