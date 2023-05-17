package bank_management_system;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;

import javax.swing.*;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
public class MiniStatement extends JFrame{
    String pinnumber;
	public MiniStatement(String pinnumber) {
		this.pinnumber=pinnumber;
		setTitle("Mini Statement");
		setLayout(null);
		JLabel bank=new JLabel("BHARAT BANK");
		bank.setFont(new Font("System",Font.BOLD,20));
		bank.setBounds(110, 20, 200, 30);
		add(bank);
		
		
		JLabel card=new JLabel();
		card.setBounds(20, 60, 400, 30);
		card.setFont(new Font("System",Font.BOLD,16));
		add(card);
		
		JLabel mini=new JLabel();
		add(mini);
		
		JLabel balance=new JLabel();
		balance.setBounds(20, 90, 400, 20);
		balance.setFont(new Font("System",Font.BOLD,16));
		add(balance);
		
		try {
			Conn conn=new Conn();
			
			ResultSet rs=conn.s.executeQuery("select * from login where PinNumber='"+pinnumber+"'");
			while(rs.next()) {
				card.setText("Card Number: "+rs.getString("CardNumber").substring(0,4)+"XXXXXXXX"+rs.getString("CardNumber").substring(12));
			}
			 
		}catch(Exception e)
		{
		System.out.println(e);
		}
		
		try {
			Conn conn=new Conn();
			int bal=0;
			ResultSet rs=conn.s.executeQuery("select * from bank where pin='"+pinnumber+"'");
			while(rs.next()) {
			 mini.setText(mini.getText() + "<html>"+rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
			System.out.println("pin="+rs.getString("pin")+" "+rs.getString("amount"));
			if(rs.getString("type").equals("Deposit")) {
				 bal+=Integer.parseInt(rs.getString("amount"));
				 
				 }else {
					 bal-=Integer.parseInt(rs.getString("amount"));
				 }
			}
			 balance.setText("Your current account balance is Rs "+bal);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		mini.setBounds(10, 140, 400, 400);
		setSize(400,600);
		setLocation(20,20);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new MiniStatement("");

	}

}
