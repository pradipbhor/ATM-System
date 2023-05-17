 package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;;

public class Signupone extends JFrame implements ActionListener{
	 long random;
	 JTextField nameTextField,fnameTextField,emailTextField,pinTextField,stateTextField,addressTextField
		,cityTextField;
		JButton next;
		JDateChooser dateChooser;
		JRadioButton male,female,married,unmarried;
	public Signupone()
	{
		setLayout(null);
		Random ran=new Random();
	    random=Math.abs((ran.nextLong()%9000L)+ 1000L);
	    JLabel formno=new JLabel("APPLICATION FORM NO."+random);
		formno.setBounds(140, 20, 600, 40);
		formno.setFont(new Font("Raleway",Font.BOLD,30));
		add(formno);
		
		JLabel personDetails=new JLabel("Page 1:Personal Details");
		personDetails.setBounds(290, 80, 400, 40);
		personDetails.setFont(new Font("Raleway",Font.BOLD,30));
		add(personDetails);
		
		JLabel name=new JLabel("Name:");
		name.setBounds(100, 140, 100, 30);
		name.setFont(new Font("Raleway",Font.BOLD,20));
		add(name);
		
		nameTextField=new  JTextField();
		nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
		nameTextField.setBounds(300, 140, 400, 30);
		add(nameTextField);
		
		
		JLabel fname=new JLabel("Father's Name:");
		fname.setBounds(100, 190, 200, 30);
		fname.setFont(new Font("Raleway",Font.BOLD,20));
		add(fname);
	    fnameTextField=new  JTextField();
		fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
		fnameTextField.setBounds(300, 190, 400, 30);
		add(fnameTextField);
		
		
		JLabel dob=new JLabel("Date of Birth:");
		dob.setBounds(100, 240, 200, 30);
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		add(dob);
		dateChooser=new JDateChooser();
		dateChooser.setBounds(300, 240, 400, 30);
		add(dateChooser);
		
		JLabel gender=new JLabel("Gender:");
		gender.setBounds(100, 290, 200, 30);
		gender.setFont(new Font("Raleway",Font.BOLD,20));
		add(gender);
		male=new JRadioButton("Male");
		male.setBounds(300, 290, 60, 30);
		male.setBackground(Color.WHITE);
		add(male);
		female=new JRadioButton("Female");
		female.setBounds(400, 290, 80, 30);
		female.setBackground(Color.WHITE);
		add(female);
		
		ButtonGroup gendergroup=new ButtonGroup();
		gendergroup.add(male);
        gendergroup.add(female);		
		JLabel email=new JLabel("Email Address:");
		email.setBounds(100, 340, 200, 30);
		email.setFont(new Font("Raleway",Font.BOLD,20));
		add(email);
		 emailTextField=new  JTextField();
		emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
		emailTextField.setBounds(300, 340, 400, 30);
		add(emailTextField);
		
		
		JLabel marital=new JLabel("Marital Status:");
		marital.setBounds(100, 390, 200, 30);
		marital.setFont(new Font("Raleway",Font.BOLD,20));
		add(marital);
		married=new JRadioButton("Married");
		married.setBounds(300, 390, 100, 30);
		married.setBackground(Color.WHITE);
		add(married);
		unmarried=new JRadioButton("UnMarried");
		unmarried.setBounds(420, 390, 200, 30);
		unmarried.setBackground(Color.WHITE);
		add(unmarried);;
		ButtonGroup maritalgroup=new ButtonGroup();
		maritalgroup.add(married);
        maritalgroup.add(unmarried);		
		
		JLabel address=new JLabel("Address:");
		address.setBounds(100, 440, 200, 30);
		address.setFont(new Font("Raleway",Font.BOLD,20));
		add(address);
		 addressTextField=new  JTextField();
		addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
		addressTextField.setBounds(300, 440, 400, 30);
		add(addressTextField);
		System.out.println(" hiiii");
		JLabel city=new JLabel("city:");
		city.setBounds(100, 490, 200, 30);
		city.setFont(new Font("Raleway",Font.BOLD,20));
		add(city);
		 cityTextField=new  JTextField();
		cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
		cityTextField.setBounds(300, 490, 400, 30);
		add(cityTextField);
		
		
		JLabel state=new JLabel("State:");
		state.setBounds(100, 540, 200, 30);
		state.setFont(new Font("Raleway",Font.BOLD,20));
		add(state);
		 stateTextField=new  JTextField();
		stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
		stateTextField.setBounds(300, 540, 400, 30);
		add(stateTextField);
		
		JLabel pincode=new JLabel("PIN Code");
		pincode.setBounds(100, 590, 200, 30);
		pincode.setFont(new Font("Raleway",Font.BOLD,20));
		add(pincode);
		pinTextField=new  JTextField();
		pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
		pinTextField.setBounds(300, 590, 400, 30);
		add(pinTextField);
		
		next=new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(620,660,80,30);
		next.addActionListener(this);
		add(next);
		
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
		getContentPane().setBackground(Color.WHITE);
		
	}
	public static void main(String []args) {
	new Signupone();	
	}
	public void actionPerformed(ActionEvent e) {
		String formno =""+ random;
		String name=nameTextField.getText();
		String nameofperson = nameTextField.getText();
		String fname=fnameTextField.getText();
		String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
		String gender=null;
		if(male.isSelected()) {
			gender="mail";
		}else {
			gender="femail"; 
		}
		String email=emailTextField.getText();
		String marital=null;
		if(married.isSelected()) {
			marital="married";
		}else {
			marital="Unmarried";
		}
		String address=addressTextField.getText();
		String city=cityTextField.getText();
		String state=stateTextField.getText();
		String pin=pinTextField.getText();

		try {
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is Required");
			}else {
				Conn c=new Conn();
				String query="insert into signup values('"+formno+"' , '"+name+"','"+fname+"','"+dob+"','"+email+"','"+gender+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
				c.s.executeUpdate(query);
				setVisible(false);
				new signupTwo(formno).setVisible(true);
			}
		}catch(Exception el) {
			System.out.println(el);
		}
		
	}
}
