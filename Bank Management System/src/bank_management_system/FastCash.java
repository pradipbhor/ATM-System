package bank_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FastCash extends JFrame implements ActionListener{
    JButton hundread,fiveHundread,back,tenThousand,twoThousand,threeThousand,fiveThousand,exit;
    String pinnumber;
	public FastCash(String pinnumber) {
		this.pinnumber=pinnumber;
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		JLabel text=new JLabel("SELECT WITHDRAWAL AMOUNT");
		text.setBounds(235, 300, 700, 35);
	    text.setForeground(Color.WHITE);
	    text.setFont(new Font("System",Font.BOLD,16));
	    image.add(text);
		
	    hundread=new JButton("RS 100");
	    hundread.setBounds(170, 415, 150, 30);
	    hundread.addActionListener(this);
	    image.add(hundread);
	    fiveHundread=new JButton("RS 500");
	    fiveHundread.setBounds(355, 415, 150, 30);
	    fiveHundread.addActionListener(this);
	    image.add(fiveHundread);
	    twoThousand=new JButton("RS 2000");
	    twoThousand.setBounds(170, 450, 150, 30);
	    twoThousand.addActionListener(this);
	    image.add(twoThousand);
	    threeThousand=new JButton("RS 3000");
	    threeThousand.setBounds(355, 450, 150, 30);
	    threeThousand.addActionListener(this);
	    image.add(threeThousand);
	    fiveThousand=new JButton("RS 5000");
	    fiveThousand.setBounds(170, 485, 150, 30);
	    fiveThousand.addActionListener(this);
	    image.add(fiveThousand);
	    tenThousand=new JButton("RS 10000");
	    tenThousand.setBounds(355, 485, 150, 30);
	    tenThousand.addActionListener(this);
	    image.add(tenThousand);
	    back=new JButton("BACK");
	    back.setBounds(355, 520, 150, 30);
	    back.addActionListener(this);
	    image.add(back);
//	    exit=new JButton("EXIT");
//	    exit.setBounds(170, 520, 150, 30);
//	    exit.addActionListener(this);
//	    image.add(exit);
	    
	    
		setSize(900,900);
		setUndecorated(true);
		setVisible(true);
		setLocation(300,0);
		
	}

	public static void main(String[] args) {
		new FastCash("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back) {
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}else {
			 String amount= ((JButton)e.getSource()).getText().substring(3);
			 Conn c=new Conn();
			 try {
				
				 ResultSet rs= c.s.executeQuery("select * from bank where pin='"+pinnumber+"'");
				 int balance=0;
				 while(rs.next()) {
					 if(rs.getString("type").equals("Deposit")) {
					 balance+=Integer.parseInt(rs.getString("amount"));
					 
					 }else {
						 balance-=Integer.parseInt(rs.getString("amount"));
					 }
					 
				 }
				 if(e.getSource() != exit && balance < Integer.parseInt(amount)) {
					 JOptionPane.showMessageDialog(null, "Insufficient Balance");
					 return;
				 }
				 Date date=new Date();
				 String query="insert into Bank values('"+pinnumber+"','"+date+"','Withdraw','"+amount+"')";
				 c.s.executeUpdate(query);
				 JOptionPane.showMessageDialog(null, "Rs"+amount+" Debited Successfully");
				 
				 setVisible(false);
				 new Transactions(pinnumber).setVisible(true);
			 }catch(Exception ex) {
				 System.out.println(ex);
			 }
		}
		
	}

}

