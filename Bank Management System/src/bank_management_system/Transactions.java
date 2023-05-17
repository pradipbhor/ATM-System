package bank_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Transactions extends JFrame implements ActionListener{
    JButton exit,deposit,withdraw,fastcash,ministatement,pinchange,balanceEnquiry;
    String pinnumber;
	public Transactions(String pinnumber) {
		this.pinnumber=pinnumber;
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		JLabel text=new JLabel("Please Select your Transaction");
		text.setBounds(235, 300, 700, 35);
	    text.setForeground(Color.WHITE);
	    text.setFont(new Font("System",Font.BOLD,16));
	    image.add(text);
		
	    deposit=new JButton("Deposit");
	    deposit.setBounds(170, 415, 150, 30);
	    deposit.addActionListener(this);
	    image.add(deposit);
	    withdraw=new JButton("Cash Withdraw");
	    withdraw.setBounds(355, 415, 150, 30);
	    withdraw.addActionListener(this);
	    image.add(withdraw);
	    fastcash=new JButton("Fast Cash");
	    fastcash.setBounds(170, 450, 150, 30);
	    fastcash.addActionListener(this);
	    image.add(fastcash);
	    ministatement=new JButton("Mini Statement");
	    ministatement.setBounds(355, 450, 150, 30);
	    ministatement.addActionListener(this);
	    image.add(ministatement);
	    pinchange=new JButton("PIN Change");
	    pinchange.setBounds(170, 485, 150, 30);
	    pinchange.addActionListener(this);
	    image.add(pinchange);
	    balanceEnquiry=new JButton("Balance Euquiry");
	    balanceEnquiry.setBounds(355, 485, 150, 30);
	    balanceEnquiry.addActionListener(this);
	    image.add(balanceEnquiry);
	    exit=new JButton("Exit");
	    exit.setBounds(355, 520, 150, 30);
	    exit.addActionListener(this);
	    image.add(exit);
	    
	    
		setSize(900,900);
		setUndecorated(true);
		setVisible(true);
		setLocation(300,0);
		
	}

	public static void main(String[] args) {
		new Transactions("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exit) {
			System.exit(0);
		}else if(e.getSource()==deposit) {
			setVisible(false);
			new Deposit(pinnumber).setVisible(true);
		}else if(e.getSource()==withdraw) {
			setVisible(false);
			new Withdraw(pinnumber).setVisible(true);
		}else if(e.getSource()==fastcash) {
			setVisible(false);
			new FastCash(pinnumber).setVisible(true);;
		}else if(e.getSource()==pinchange) {
			setVisible(false);
			new PinChange(pinnumber).setVisible(true);;
		}else if(e.getSource()==balanceEnquiry) {
			setVisible(false);
			new BalanceEnquiry(pinnumber).setVisible(true);
		}else if(e.getSource()==ministatement) {
			setVisible(false);
			new MiniStatement(pinnumber).setVisible(true);
		}
		
	}

}
