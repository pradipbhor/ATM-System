package bank_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Deposit extends JFrame implements ActionListener{
	JTextField amount;
	JButton deposit,back;
	String pinnumber;
	public Deposit(String pinnumber) {
		this.pinnumber=pinnumber;
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		JLabel text=new JLabel("Enter the Amount you want to Deposit");
		text.setBounds(170, 300, 400, 20 );
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,16));
		image.add(text);
		
		amount=new JTextField();
		amount.setFont(new Font("Raleway",Font.BOLD,22) );
		amount.setBounds(170,350,320,25);
		image.add(amount);
		
	     deposit=new JButton("Deposit");
	     deposit.setBounds(355, 485, 150, 30);
	     deposit.addActionListener(this);
	     image.add(deposit);
	     
	     back=new JButton("Back");
	     back.setBounds(355, 520, 150, 30);
	     back.addActionListener(this);
	     image.add(back);
	     
		setSize(900,900);
		setLocation(300,0);
		setVisible(true);
		
	}
	public static void main(String []args) {
		new Deposit("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==deposit) {
			 String number=amount.getText();
			 Date date=new Date();
			 if(number.equals("")) {
				 JOptionPane.showMessageDialog(null, "Please Enter the Amount You want To Deposit");
			 }else {
				 try {
				 Conn con=new Conn();
				 String query="insert into bank values('"+ pinnumber+"','"+date+"','Deposit','"+number+"')";
					con.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null,"Rs"+number+" Deposited Successfully");
					setVisible(false);
					new Transactions(pinnumber);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			 } 
		 }else if(e.getSource()==back) {
			 setVisible(false);
			 new Transactions(pinnumber).setVisible(true);
			
		 }
		
	}

}
