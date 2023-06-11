package GUI;

import java.awt.EventQueue;

import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
public class Registration {

	private JFrame frame;
	private JTextField txt_FirstName;
	private JTextField txt_MiddleName;
	private JTextField txt_LastName;
	private JTextField txt_BirthDate;
	private JTextField txt_Address;
	private JTextField txt_FatherName;
	private JButton btn_login;
	private JTextField txt_MotherName;
	private JLabel lbl_Title2;
	private JLabel lbl_AccountNumber;
	private JLabel lbl_Pin;
	private JTextField txt_ContactNo;
	private JLabel lbl_InitialDep;
	private JLabel lbl_Logo;
	private final ButtonGroup buttonGroup_Gender = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 480, 465);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
	    try {
	        File file = new File("C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\Account Number.txt");
	        File file1 = new File("C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\NewAccount.txt");
	        File file2 = new File("C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\PIN.txt");
	        File file3 = new File("C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\Balance.txt");
	        
	        file.createNewFile();
	        file1.createNewFile();
	        file2.createNewFile();
	        file3.createNewFile();
	        
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
		
		JLabel lbl_Title = new JLabel("Bank Registration Form");
		lbl_Title.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lbl_Title.setBounds(125, 0, 233, 57);
		frame.getContentPane().add(lbl_Title);
		
		JLabel lbl_FirstName = new JLabel("First Name");
		lbl_FirstName.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lbl_FirstName.setBounds(10, 70, 88, 14);
		frame.getContentPane().add(lbl_FirstName);
		
		JLabel lbl_MiddleName = new JLabel("Middle Name");
		lbl_MiddleName.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lbl_MiddleName.setBounds(170, 68, 99, 14);
		frame.getContentPane().add(lbl_MiddleName);
		
		JLabel lbl_Lastname = new JLabel("Last Name");
		lbl_Lastname.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lbl_Lastname.setBounds(330, 70, 88, 14);
		frame.getContentPane().add(lbl_Lastname);
		
		txt_FirstName = new JTextField();
		txt_FirstName.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txt_FirstName.setHorizontalAlignment(SwingConstants.CENTER);
		txt_FirstName.setBounds(10, 90, 125, 28);
		frame.getContentPane().add(txt_FirstName);
		txt_FirstName.setColumns(10);
		
		txt_MiddleName = new JTextField();
		txt_MiddleName.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txt_MiddleName.setHorizontalAlignment(SwingConstants.CENTER);
		txt_MiddleName.setColumns(10);
		txt_MiddleName.setBounds(170, 90, 125, 26);
		frame.getContentPane().add(txt_MiddleName);
		
		txt_LastName = new JTextField();
		txt_LastName.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txt_LastName.setHorizontalAlignment(SwingConstants.CENTER);
		txt_LastName.setColumns(10);
		txt_LastName.setBounds(330, 90, 125, 28);
		frame.getContentPane().add(txt_LastName);
		
		JLabel lbl_BirthDate = new JLabel("Birth Date");
		lbl_BirthDate.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lbl_BirthDate.setBounds(10, 220, 88, 14);
		frame.getContentPane().add(lbl_BirthDate);
		
		JLabel lbl_Address = new JLabel("Address");
		lbl_Address.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lbl_Address.setBounds(170, 220, 88, 14);
		frame.getContentPane().add(lbl_Address);
		
		txt_BirthDate = new JTextField();
		txt_BirthDate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt_BirthDate.setText("");
				txt_BirthDate.setForeground(Color.BLACK);
			}
		});
		txt_BirthDate.setForeground(Color.GRAY);
		txt_BirthDate.setText("MM/DD/YY");
		txt_BirthDate.setHorizontalAlignment(SwingConstants.CENTER);
		txt_BirthDate.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txt_BirthDate.setColumns(10);
		txt_BirthDate.setBounds(10, 240, 125, 28);
		frame.getContentPane().add(txt_BirthDate);
		
		txt_Address = new JTextField();
		txt_Address.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txt_Address.setColumns(10);
		txt_Address.setBounds(170, 240, 285, 28);
		frame.getContentPane().add(txt_Address);
		
		JLabel lbl_FatherName = new JLabel("Father's Name");
		lbl_FatherName.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lbl_FatherName.setBounds(10, 150, 125, 14);
		frame.getContentPane().add(lbl_FatherName);
		
		JLabel lbl_MotherName = new JLabel("Mother's Name");
		lbl_MotherName.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lbl_MotherName.setBounds(170, 150, 125, 14);
		frame.getContentPane().add(lbl_MotherName);
		
		JLabel lbl_ContactNo = new JLabel("Contact Number");
		lbl_ContactNo.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lbl_ContactNo.setBounds(330, 150, 125, 14);
		frame.getContentPane().add(lbl_ContactNo);
		
		txt_FatherName = new JTextField();
		txt_FatherName.setHorizontalAlignment(SwingConstants.CENTER);
		txt_FatherName.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txt_FatherName.setColumns(10);
		txt_FatherName.setBounds(10, 170, 125, 28);
		frame.getContentPane().add(txt_FatherName);
		
		txt_MotherName = new JTextField();
		txt_MotherName.setHorizontalAlignment(SwingConstants.CENTER);
		txt_MotherName.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txt_MotherName.setColumns(10);
		txt_MotherName.setBounds(170, 170, 125, 28);
		frame.getContentPane().add(txt_MotherName);
		
		txt_ContactNo = new JTextField();
		txt_ContactNo.setHorizontalAlignment(SwingConstants.CENTER);
		txt_ContactNo.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txt_ContactNo.setColumns(10);
		txt_ContactNo.setBounds(330, 170, 125, 28);
		frame.getContentPane().add(txt_ContactNo);
		
		JLabel lbl_Gender = new JLabel("Gender");
		lbl_Gender.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lbl_Gender.setBounds(10, 289, 88, 14);
		frame.getContentPane().add(lbl_Gender);
		
		JRadioButton rdbtn_Male = new JRadioButton("Male");
		rdbtn_Male.setBackground(new Color(255, 255, 255));
		rdbtn_Male.setFocusable(false);
		buttonGroup_Gender.add(rdbtn_Male);
		rdbtn_Male.setFont(new Font("Century Gothic", Font.BOLD, 12));
		rdbtn_Male.setBounds(10, 310, 109, 34);
		frame.getContentPane().add(rdbtn_Male);
		
		JRadioButton rdbtn_Female = new JRadioButton("Female");
		rdbtn_Female.setBackground(new Color(255, 255, 255));
		rdbtn_Female.setFocusable(false);
		buttonGroup_Gender.add(rdbtn_Female);
		rdbtn_Female.setFont(new Font("Century Gothic", Font.BOLD, 12));
		rdbtn_Female.setBounds(10, 347, 109, 34);
		frame.getContentPane().add(rdbtn_Female);
		
		JRadioButton rdbtn_None = new JRadioButton("Prefer not to say");
		rdbtn_None.setBackground(new Color(255, 255, 255));
		buttonGroup_Gender.add(rdbtn_None);
		rdbtn_None.setFont(new Font("Century Gothic", Font.BOLD, 12));
		rdbtn_None.setFocusable(false);
		rdbtn_None.setBounds(10, 384, 125, 34);
		frame.getContentPane().add(rdbtn_None);
		
		JButton btn_Register = new JButton("CREATE ACCOUNT");
		btn_Register.setFocusable(false);
		btn_Register.setForeground(new Color(255, 255, 255));
		btn_Register.setBackground(new Color(65, 105, 225));
		btn_Register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					FileWriter an_Writer = new FileWriter("C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\Account Number.txt",true);
					FileWriter new_Writer = new FileWriter("C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\NewAccount.txt",true);
					FileWriter pin_Writer = new FileWriter("C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\PIN.txt",true);
					FileWriter balance_Writer = new FileWriter("C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\Balance.txt",true);
					
					String firstName = txt_FirstName.getText();
					String lastName = txt_LastName.getText();
					String middleName = txt_MiddleName.getText();
					String fatherName = txt_FatherName.getText();
					String motherName = txt_MotherName.getText();
					String bday = txt_BirthDate.getText();
					String address = txt_Address.getText();
					String contactNo = txt_ContactNo.getText();
					
					String accFile = "";
					boolean male = rdbtn_Male.isSelected();
					boolean female = rdbtn_Female.isSelected();
					boolean none = rdbtn_None.isSelected();
					
					if(firstName.equals("") || lastName.equals("") || middleName.equals("") ||
					   fatherName.equals("") || motherName.equals("") || bday.equals("") || address.equals("") || contactNo.equals("")) {			
					   JOptionPane.showMessageDialog(btn_Register, "Make sure you fill out all the blank!");
								
					}	
					else if(male == false && female == false && none == false) {				
					   JOptionPane.showMessageDialog(btn_Register, "Make sure you fill out all the blank!");
					}
					
					
					else {
					long accNo = 2023100000L;
					
					String lastLine = readLastLine("C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\Account Number.txt");
					
					if(lastLine != null) {
						int x = Integer.valueOf(lastLine);
						x = x+1;
						accFile = String.valueOf(x);
						an_Writer.write(accFile + "\n");
						new_Writer.write("Account number:" + accFile + "\n");
					}
					else {
						accFile = String.valueOf(accNo);
						new_Writer.write("Account number:" + accFile + "\n");
						an_Writer.write(accFile + "\n");			
					}
					
					new_Writer.write("First Name:" + firstName + "\n");
					new_Writer.write("Middle Name:" + middleName + "\n");
					new_Writer.write("Last Name:" + lastName + "\n");
					
					if(rdbtn_Male.isSelected()) {
						new_Writer.write("Gender:Male\n");
					}
					else if (rdbtn_Female.isSelected()) {
						new_Writer.write("Gender:Female\n");
					}
					else {
						new_Writer.write("Prefer not to say");
					}
					
					new_Writer.write("Father's Name:" + fatherName + "\n");
					new_Writer.write("Mother's Name:" + motherName + "\n");
					new_Writer.write("Birthdate:" + bday + "\n");
					new_Writer.write("Address:" + address + "\n");
					new_Writer.write("Contact Number:" + contactNo + "\n\n");
					
					String bal = String.valueOf(500);
					
					balance_Writer.write(bal + "\n");
					
					Random random = new Random();
					int rand = random.nextInt(1001,9999);
					String a = String.valueOf(rand);
					
					pin_Writer.write(a + "\n");
					
					JOptionPane.showMessageDialog(btn_Register, "Your Account has been created!");
					
					lbl_Title.setVisible(false);
					lbl_FirstName.setVisible(false);
					lbl_MiddleName.setVisible(false);
					lbl_Lastname.setVisible(false);
					txt_FirstName.setVisible(false);
					txt_MiddleName.setVisible(false);
					txt_LastName.setVisible(false);
					lbl_BirthDate.setVisible(false);
					lbl_Address.setVisible(false);
					txt_BirthDate.setVisible(false);
					txt_Address.setVisible(false);
					lbl_FatherName.setVisible(false);
					lbl_MotherName.setVisible(false);
					lbl_ContactNo.setVisible(false);
					txt_FatherName.setVisible(false);
					txt_MotherName.setVisible(false);
					txt_ContactNo.setVisible(false);
					lbl_Gender.setVisible(false);
					lbl_InitialDep.setVisible(false);
					rdbtn_Male.setVisible(false);
					rdbtn_Female.setVisible(false);
					rdbtn_None.setVisible(false);
					btn_Register.setVisible(false);
					btn_login.setText("Go to Log In Page.");
					btn_login.setBounds(261,377,213,41);
					btn_login.setFont(new Font("Century Gothic", Font.PLAIN, 16));
					lbl_AccountNumber.setText("Account Number: " + accFile);
					lbl_Pin.setText("PIN: " + a);
					lbl_Title2.setVisible(true);
					lbl_AccountNumber.setVisible(true);
					lbl_Pin.setVisible(true);
					lbl_Logo.setVisible(true);
					
					
					}
					
					an_Writer.close();
					new_Writer.close();
					pin_Writer.close();
					balance_Writer.close();

				} 
				
				catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					
				}
	
			}
		});
		btn_Register.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn_Register.setBounds(279, 337, 176, 57);
		frame.getContentPane().add(btn_Register);
		
		btn_login = new JButton("Already have an account? ");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				
				BankTransaction log = new BankTransaction();
				
				log.setVisible(true);
			}
		});
		btn_login.setForeground(new Color(65, 105, 225));
		btn_login.setBackground(Color.WHITE);
		btn_login.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btn_login.setFocusable(false);
		btn_login.setBounds(261, 404, 213, 14);
		btn_login.setBackground(null);
		btn_login.setBorder(null);
		btn_login.setContentAreaFilled(false);
		frame.getContentPane().add(btn_login);
		
		lbl_Title2 = new JLabel("Account Created Successfully!");
		lbl_Title2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lbl_Title2.setVisible(false);
		lbl_Title2.setBounds(80, 0, 384, 57);
		frame.getContentPane().add(lbl_Title2);
		
		lbl_AccountNumber = new JLabel("Account Number:");
		lbl_AccountNumber.setVisible(false);
		lbl_AccountNumber.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lbl_AccountNumber.setBounds(80, 73, 375, 57);
		frame.getContentPane().add(lbl_AccountNumber);
		
		lbl_Pin = new JLabel("PIN:");
		lbl_Pin.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lbl_Pin.setVisible(false);
		lbl_Pin.setBounds(80, 129, 233, 57);
		frame.getContentPane().add(lbl_Pin);
		
		ImageIcon logo = new ImageIcon("C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\Logo\\transparent logo.png");
		Image logoImg = logo.getImage();
		Image modifiedLogo = logoImg.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
		logo = new ImageIcon(modifiedLogo);
		
		lbl_InitialDep = new JLabel("Initial Deposit : $500");
		lbl_InitialDep.setFont(new Font("Century Gothic", Font.PLAIN, 15));

		lbl_InitialDep.setBounds(170, 282, 152, 28);
		frame.getContentPane().add(lbl_InitialDep);
		
		lbl_Logo = new JLabel("");
		lbl_Logo.setBounds(125, 186, 213, 190);
		lbl_Logo.setVisible(false);
		frame.getContentPane().add(lbl_Logo);
		lbl_Logo.setIcon(logo);
	}
	
    private static String readLastLine(final String filePath) {
        String lastLine = null;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lastLine = line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lastLine;
    }
    public void setVisible(boolean a) {
    	frame.setVisible(a);
    }
}
