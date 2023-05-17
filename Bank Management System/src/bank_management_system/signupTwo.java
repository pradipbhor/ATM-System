package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
	
public class signupTwo extends JFrame implements ActionListener{
long random;
JTextField panTextField,adharTextField;
JButton next;
JComboBox religion,category,income,qualification,occuption;
JRadioButton syes ,sno,eyes,eno;
String formno;
public signupTwo(String formno){
	this.formno=formno;
			setLayout(null);
		    setTitle("NEW APPLICATION FORM PAGE 2:");	
			JLabel personDetails=new JLabel("Page 1:Additional Details");
			personDetails.setBounds(290, 80, 400, 40);
			personDetails.setFont(new Font("Raleway",Font.BOLD,30));
			add(personDetails);
			
			JLabel rel=new JLabel("religion");
			rel.setBounds(100, 140, 100, 30);
			rel.setFont(new Font("Raleway",Font.BOLD,20));
			add(rel);
			String valReligion[] ={"Hindu","muslim","sikh","christian","other"};
			religion=new JComboBox(valReligion);
			religion.setBackground(Color.WHITE);
			religion.setBounds(300, 140, 400, 30);
		     add(religion);	
		
			JLabel cateGory=new JLabel(" Category:");
			cateGory.setBounds(90, 190, 200, 30);
			cateGory.setFont(new Font("Raleway",Font.BOLD,20));
			add(cateGory);
			String valcategory[] ={"General","OBC","SC","ST","NT","other"};
			category=new JComboBox(valcategory);
			category.setBackground(Color.WHITE);
			category.setBounds(300, 190, 400, 30);
			add(category);
			
			
			JLabel inCome=new JLabel("Income:");
			inCome.setBounds(100, 240, 200, 30);
			inCome.setFont(new Font("Raleway",Font.BOLD,20));
			add(inCome);
			String valIncome[] ={">10000",">150000",">200000",">5000000","Upto 1000000",};
			income=new JComboBox(valIncome);
			income.setBackground(Color.WHITE);
			income.setBounds(300, 240, 400, 30);
			add(income);
			
			JLabel education=new JLabel("Educational");
			education.setBounds(100, 290, 200, 30);
			education.setFont(new Font("Raleway",Font.BOLD,20));
			add(education);		
			JLabel Lqualification=new JLabel("Qualification");
			Lqualification.setBounds(100, 315, 200, 30);
			Lqualification.setFont(new Font("Raleway",Font.BOLD,20));
			add(Lqualification);
			String valqualification[] ={"Matiriculation","12th","Gradution","Post Gradution","other",};
			qualification=new JComboBox(valqualification);
			qualification.setBackground(Color.WHITE);
			qualification.setBounds(300, 290, 400, 30);
			add(qualification);
			
			JLabel Loccupation=new JLabel("Occupation:");
			Loccupation.setBounds(100, 390, 200, 30);
			Loccupation.setFont(new Font("Raleway",Font.BOLD,20));
			add(Loccupation);
			String  Occuption[] ={"Salarid","sef-Employ","Business","Student","retired","others"};
			occuption=new JComboBox(Occuption);
			occuption.setBackground(Color.WHITE);
			occuption.setBounds(300, 390, 400, 30);
			add(occuption);
		
			JLabel pan=new JLabel("PAN CARD:");
			pan.setBounds(100, 440, 200, 30);
			pan.setFont(new Font("Raleway",Font.BOLD,20));
			add(pan);
			panTextField=new  JTextField();
			panTextField.setFont(new Font("Raleway",Font.BOLD,14));
			panTextField.setBounds(300, 440, 400, 30);
			add(panTextField);
			JLabel adhar=new JLabel("Adhar Number:");
			adhar.setBounds(100, 490, 200, 30);
			adhar.setFont(new Font("Raleway",Font.BOLD,20));
			add(adhar);
			 adharTextField=new  JTextField();
			 adharTextField.setFont(new Font("Raleway",Font.BOLD,14));
			 adharTextField.setBounds(300, 490, 400, 30);
			add(adharTextField);
			
			
			JLabel citizen=new JLabel("Senior citizen:");
			citizen.setBounds(100, 540, 200, 30);
			citizen.setFont(new Font("Raleway",Font.BOLD,20));
			add(citizen);
			  
			
			syes=new JRadioButton("Yes");
			syes.setBounds(300, 540, 100, 30);
			syes.setBackground(Color.WHITE);
			add(syes);
			sno=new JRadioButton("No");
			sno.setBounds(420, 540, 100, 30);
			sno.setBackground(Color.WHITE);
			add(sno);
			ButtonGroup citizengroup=new ButtonGroup();
			citizengroup.add(syes);
			citizengroup.add(sno);
			
			JLabel pincode=new JLabel("Existing Account");
			pincode.setBounds(100, 590, 200, 30);
			pincode.setFont(new Font("Raleway",Font.BOLD,20));
			add(pincode);
			eyes=new JRadioButton("Yes");
			eyes.setBounds(300, 590, 100, 30);
			eyes.setBackground(Color.WHITE);
			add(eyes);
			eno=new JRadioButton("No");
			eno.setBounds(420, 590, 100, 30);
			eno.setBackground(Color.WHITE);
			add(eno);
			ButtonGroup ExistingAccountgroup=new ButtonGroup();
			ExistingAccountgroup.add(eyes);
			ExistingAccountgroup.add(eno);
			
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
		new signupTwo("");	
		}
		public void actionPerformed(ActionEvent e) {
			String sreligion=(String)religion.getSelectedItem();
			String Scategory= (String)category.getSelectedItem();
			String Sincome= (String)income.getSelectedItem();
			String Squlification= (String)qualification.getSelectedItem();
			String soccuption= (String)occuption.getSelectedItem();
			String senior=null;
			if(syes.isSelected()) {
				senior="YES";
			}else {
				senior="NO"; 
			}
			String Existing=null;
			if(eyes.isSelected()) {
				Existing="YES";
			}else {
				Existing="NO"; 
			}
			String span=panTextField.getText();
			String sadhar=adharTextField.getText();
			

			try {
					Conn c=new Conn();
		String query="insert into signuptwo values('"+formno+"' , '"+sreligion+"','"+Scategory+"',"
				+ "'"+Sincome+"','"+Squlification+"','"+soccuption+"','"+Existing+"','"+span+"',"
								+ "'"+sadhar+"')";
					c.s.executeUpdate(query);
					setVisible(false);
					new signupThree(formno).setVisible(true);
				
			}catch(Exception el) {
				System.out.println(el);
			}
			
		
	}
}


