package bank_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.*;

public class signupThree extends JFrame implements ActionListener{
     JRadioButton savingAccount,fixedDeposit,currentAccount,recurringDeposit;
     JCheckBox c1,c2,c3,c4,c5,c6,c7;
     JButton submit,cancel;
     String formno;
	public signupThree(String formno) {
		this.formno=formno;
		setLayout(null);
		setVisible(true);
		setSize(850,820);
		setLocation(350,40);
		getContentPane().setBackground(Color.WHITE);
		JLabel i1=new JLabel("Page 3:Account Details");
		i1.setFont(new Font("Railway",Font.BOLD,22));
		i1.setBounds(280, 40, 400, 40);
		add(i1);
		
		JLabel type=new JLabel("Account Type");
		type.setFont(new Font("Railway",Font.BOLD,22));
		type.setBounds(100, 140, 200, 30);
		add(type);
		savingAccount=new  JRadioButton("Saving Account");
		savingAccount.setFont(new Font("Raleway",Font.BOLD,16));
		savingAccount.setBackground(Color.WHITE);
		savingAccount.setBounds(100, 180, 150, 20);
		add(savingAccount);
		fixedDeposit=new  JRadioButton("Fixed Deposit Account");
		fixedDeposit.setFont(new Font("Raleway",Font.BOLD,16));
		fixedDeposit.setBackground(Color.WHITE);
		fixedDeposit.setBounds(350, 180, 250, 20);
		add(fixedDeposit);
		currentAccount=new  JRadioButton("Current Account");
		currentAccount.setFont(new Font("Raleway",Font.BOLD,16));
		currentAccount.setBackground(Color.WHITE);
		currentAccount.setBounds(100, 220, 150, 20);
		add(currentAccount);
		recurringDeposit=new  JRadioButton("Recurring Deposit Account");
		recurringDeposit.setFont(new Font("Raleway",Font.BOLD,16));
		recurringDeposit.setBackground(Color.WHITE);
		recurringDeposit.setBounds(350, 220, 250, 20);
		add(recurringDeposit);
		ButtonGroup groupaccount=new ButtonGroup();
		groupaccount.add(currentAccount);
		groupaccount.add(fixedDeposit);
		groupaccount.add(recurringDeposit);
		groupaccount.add(savingAccount);
		
		JLabel card=new JLabel("Card Number");
		card.setFont(new Font("Railway",Font.BOLD,22));
		card.setBounds(100, 300, 200, 30);
		add(card);
		JLabel number=new JLabel("XXXX-XXXX-XXXX-4184");
		number.setFont(new Font("Railway",Font.BOLD,22));
		number.setBounds(330, 300, 300, 30);
		add(number);
		JLabel pindeatails=new JLabel("Your 16 Digit Card Number");
		pindeatails.setFont(new Font("Railway",Font.BOLD,12));
		pindeatails.setBounds(100, 400, 200, 20);
		add(pindeatails);
		JLabel pin=new JLabel("PIN");
		pin.setFont(new Font("Railway",Font.BOLD,22));
		pin.setBounds(100, 370, 300, 30);
		add(pin);
		JLabel carddeatails=new JLabel("Your 4 Digit Password");
		carddeatails.setFont(new Font("Railway",Font.BOLD,12));
		carddeatails.setBounds(100, 330, 200, 20);
		add(carddeatails);
		JLabel pnumber=new JLabel("XXXX");
		pnumber.setFont(new Font("Railway",Font.BOLD,22));
		pnumber.setBounds(330, 370, 300, 30);
		add(pnumber);
		JLabel services=new JLabel("Services Required");
		services.setFont(new Font("Railway",Font.BOLD,22));
		services.setBounds(100, 450, 300, 30);
		add(services);
		c1=new JCheckBox("ATM CARD");
		c1.setBackground(Color.WHITE);
		c1.setFont(new Font("Raileway",Font.BOLD,16));
		c1.setBounds(100,500,200,30);
		add(c1);
		c2=new JCheckBox("Internet Banking");
		c2.setBackground(Color.WHITE);
		c2.setFont(new Font("Raileway",Font.BOLD,16));
		c2.setBounds(350,500,200,30);
		add(c2);
		c3=new JCheckBox("Mobile Banking");
		c3.setBackground(Color.WHITE);
		c3.setFont(new Font("Raileway",Font.BOLD,16));
		c3.setBounds(100,550,200,30);
		add(c3);
		c4=new JCheckBox("Email & SMS Alerts");
		c4.setBackground(Color.WHITE);
		c4.setFont(new Font("Raileway",Font.BOLD,16));
		c4.setBounds(350,550,200,30);
		add(c4);
		c5=new JCheckBox("Cheque Book");
		c5.setBackground(Color.WHITE);
		c5.setFont(new Font("Raileway",Font.BOLD,16));
		c5.setBounds(100,600,200,30);
		add(c5);
		c6=new JCheckBox("E-Statement");
		c6.setBackground(Color.WHITE);
		c6.setFont(new Font("Raileway",Font.BOLD,16));
		c6.setBounds(350,600,200,30);
		add(c6);
		c7=new JCheckBox("Hereby declares that the above entered details are correct to the best of my knowledge ");
		c7.setBackground(Color.WHITE);
		c7.setFont(new Font("Raileway",Font.BOLD,12));
		c7.setBounds(100,680,600,30);
		add(c7);
		 submit =new JButton("SUBMIT");
		 submit.setBackground(Color.BLACK);
		 submit.setForeground(Color.WHITE);
		 submit.setFont(new Font("Railway",Font.BOLD,14));
		 submit.setBounds(250, 720, 100, 30);
		 submit.addActionListener(this);
		 add(submit);
		 cancel =new JButton("CANCEL");
		 cancel.setBackground(Color.BLACK);
		 cancel.setForeground(Color.WHITE);
		 cancel.setFont(new Font("Railway",Font.BOLD,14));
		 cancel.setBounds(420, 720, 100, 30);
		 cancel.addActionListener(this);
		 add(cancel);
		 
		
		
		
	}

	public static void main(String[] args) {
	new signupThree("");
	

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String AccountType=null; 
		if(ae.getSource()==submit) {
			if(savingAccount.isSelected()) {
				AccountType="Saving Account";
			}else if(fixedDeposit.isSelected()) {
				AccountType="Fixed Deposit Account";
			}else if(currentAccount.isSelected()) {
				AccountType="Current Account";
			}else if(recurringDeposit.isSelected()) {
				AccountType="Recurring Deposit Account";
			}
			Random random=new Random();
			String cardNumber=""+Math.abs(random.nextLong() %90000000L+ 5040936000000000L);
			String pinNumber=""+Math.abs(random.nextLong()%9000L+1000L);
			
			String facility="";
			if(c1.isSelected()) {
				facility=facility+"ATM CARD";
			}else if(c2.isSelected()) {
				facility=facility+"Internet Banking";
			}else if(c3.isSelected()) {
				facility=facility+"Mobile Banking";
			}else if(c4.isSelected()) {
				facility=facility+"Email & SMS alert";
			}else if(c5.isSelected()) {
				facility=facility+"Cheqe Book";
			}else if(c6.isSelected()) {
				facility=facility+"E-Statement";
			}else if(c7.isSelected()) {
				facility=facility+"Internet Banking";
			}
			try {
				if(AccountType==null) {
					JOptionPane.showMessageDialog(null,"Account type is Required");
					
				}else {
				
					Conn c=new Conn();
					String query="insert into signupthree values('"+formno+"','"+AccountType+"','"+cardNumber+"','"+pinNumber+"','"+facility+"')";
					c.s.executeUpdate(query);
					String query2="insert into login values('"+formno+"','"+cardNumber+"','"+pinNumber+"')";
					c.s.executeUpdate(query2);
					JOptionPane.showMessageDialog(null,"Card Number:"+cardNumber+"\n"+"PIN:"+pinNumber);
					System.out.println("hiiii");
				}
				setVisible(false);
				new Deposit(pinNumber).setVisible(false);
				
				
			}catch(Exception e) {
				System.out.println();
			}
			
		}else if(ae.getSource()==cancel) {
			setVisible(false);
			new Login().setVisible(true);
		}
		
	}

}
