package bankManagementSystem;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class signupTwo extends JFrame implements ActionListener{
	
	JTextField panTextField, aadharTextField;
	JRadioButton syes, sno, eyes, eno;
	JComboBox religionComboBox, categoryComboBox,incomeComboBox,educationalComboBox,occupationComboBox;
	JButton next;
	String formno;
	
	
	signupTwo(String formno){
		
		this.formno = formno;
		setLayout(null);
		setTitle("Signup Form:Addition Details - Page 2");
				
		//personal detail title
		JLabel additionalDetails = new JLabel("Page 2: Additional Details");
		additionalDetails .setBounds(290, 80, 400, 30);
		additionalDetails .setFont(new Font("Raleway", Font.BOLD, 22));
		add(additionalDetails);
		
		//religion label and text field
		JLabel religion = new JLabel("Religion: ");
		religion.setBounds(100, 140, 100, 30 );
		religion.setFont(new Font("Raleway", Font.BOLD, 20));
		add(religion);
		
		String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
		religionComboBox = new JComboBox(valReligion);
		religionComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
		religionComboBox.setBounds(300, 140, 400, 30);
		religionComboBox.setBackground(Color.white);
		add(religionComboBox);
		
		
		//category label and text field
		JLabel category = new JLabel("Category: ");
		category.setBounds(100, 190, 200, 30);
		category.setFont(new Font("Raleway", Font.BOLD, 20));
		add(category);
		
		String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
		categoryComboBox = new JComboBox(valCategory);
		categoryComboBox.setBounds(300, 190, 400, 30);
		categoryComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
		categoryComboBox.setBackground(Color.white);
		add(categoryComboBox);
		
		
		
		
		//income label
		JLabel income = new JLabel("Income: ");
		income.setBounds(100, 240, 200, 30);
		income.setFont(new Font("Raleway", Font.BOLD, 20));
		add(income);
		
		String valIncome[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
		incomeComboBox = new JComboBox(valIncome);
		incomeComboBox.setBounds(300, 240, 400, 30);
		incomeComboBox.setBackground(Color.white);
		incomeComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
		add(incomeComboBox);
		
		
		
		//educational qualification label and radio button
		JLabel educational = new JLabel("Educational:");
		educational.setBounds(100, 290, 200, 30);
		educational.setFont(new Font("Raleway", Font.BOLD, 20));
		add(educational);
		
		JLabel qualification = new JLabel("Qualification:");
		qualification.setBounds(100, 315, 200, 30);
		qualification.setFont(new Font("Raleway", Font.BOLD, 20));
		add(qualification);
		
		String valEducational[] = {"Non Graduation", "Under Graduation", "Graduation", "Post Graduation", "Doctarate", "Other"};
		educationalComboBox = new JComboBox(valEducational);
		educationalComboBox.setBounds(300, 290, 400, 30);
		educationalComboBox.setBackground(Color.white);
		educationalComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
		add(educationalComboBox);
		
		
		//occupation status
		JLabel occupation = new JLabel("Occupation: ");
		occupation.setBounds(100, 390, 200, 30);
		occupation.setFont(new Font("Raleway", Font.BOLD, 20));
		add(occupation);
		
		String valOccupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
		occupationComboBox = new JComboBox(valOccupation);
		occupationComboBox.setBounds(300, 390, 400, 30);
		occupationComboBox.setBackground(Color.white);
		occupationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
		add(occupationComboBox);

		
		//PAN label and text field
		JLabel panNumber = new JLabel("PAN Number:");
		panNumber.setBounds(100, 440, 200, 30);
		panNumber.setFont(new Font("Raleway", Font.BOLD, 20));
		add(panNumber);
		
		panTextField = new JTextField();
		panTextField.setBounds(300, 440, 400, 30);
		panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		add(panTextField);
		
		//Aadhar label and text field
		JLabel aadharNumber = new JLabel("Aadhar Number:");
		aadharNumber.setBounds(100, 490, 200, 30);
		aadharNumber.setFont(new Font("Raleway", Font.BOLD, 20));
		add(aadharNumber);
		
		aadharTextField = new JTextField();
		aadharTextField.setBounds(300, 490, 400, 30);
		aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		add(aadharTextField);
		
		//Senior Citizen label and text field
		JLabel seniorCitizen = new JLabel("Senior Citizen:");
		seniorCitizen.setBounds(100, 540, 200, 30);
		seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
		add(seniorCitizen);
		
		syes = new JRadioButton("Yes");
		syes.setBounds(300, 540, 100, 30);
		syes.setFont(new Font("Raleway", Font.BOLD, 14));
		syes.setBackground(Color.white);
		add(syes);
		
		sno = new JRadioButton("No");
		sno.setBounds(450, 540, 100, 30);
		sno.setFont(new Font("Raleway", Font.BOLD, 14));
		sno.setBackground(Color.white);
		add(sno);
		
		ButtonGroup sbtnGroup = new ButtonGroup();
		sbtnGroup.add(syes);
		sbtnGroup.add(sno);
		
		//Existing Account label and text field
		JLabel existingAccount = new JLabel("Existing Account:");
		existingAccount.setBounds(100, 590, 200, 30);
		existingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
		add(existingAccount);
		
		eyes = new JRadioButton("Yes");
		eyes.setBounds(300, 590, 100, 30);
		eyes.setFont(new Font("Raleway", Font.BOLD, 14));
		eyes.setBackground(Color.white);
		add(eyes);
		
		eno = new JRadioButton("No");
		eno.setBounds(450, 590, 100, 30);
		eno.setFont(new Font("Raleway", Font.BOLD, 14));
		eno.setBackground(Color.white);
		add(eno);
		
		ButtonGroup ebtnGroup = new ButtonGroup();
		ebtnGroup.add(eyes);
		ebtnGroup.add(eno);
		
		
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
		setSize(850, 800);
		setVisible(true);
		setLocation(350, 10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e) {
		
		String religion = (String)religionComboBox.getSelectedItem();
		String category = (String)categoryComboBox.getSelectedItem();
		String income = (String)incomeComboBox.getSelectedItem();
		String educational = (String)educationalComboBox.getSelectedItem();
		String occupation = (String)occupationComboBox.getSelectedItem();
		
		String panNumber = panTextField.getText();
		String aadharNumber = aadharTextField.getText();
		
		String seniorCitizen = "";
		if(syes.isSelected())
			seniorCitizen = "Yes";
		else if(sno.isSelected())
			seniorCitizen = "No";
		
		String existingAccount = "";
		if(eyes.isSelected())
			existingAccount = "Yes";
		else if(eno.isSelected())
			existingAccount = "No";
		
		try {
			if(panNumber.equals("")) {
				JOptionPane.showMessageDialog(null, "PAN Number is Required");
			}
			else if(aadharNumber.equals("")) {
				JOptionPane.showMessageDialog(null, "Aadhar Number is Required");
			}
			else {
				String query = "insert into signuptwo values('"+formno+"', '"+religion+"','"+category+"','"+income+"', '"+educational+"', '"+occupation+"', '"+panNumber+"', '"+aadharNumber+"', '"+seniorCitizen+"', '"+existingAccount+"')";
				Conn c = new Conn();
				c.s.executeUpdate(query);
				
				//
				setVisible(false);
				new signupThree(formno).setVisible(true);
			}
		}
		catch(Exception ae) {
			System.out.println(ae);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new signupTwo("");
	}

}
