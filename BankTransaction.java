package GUI;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingConstants;

public class BankTransaction {

	private JFrame frame;
	private JLabel lbl_Title;
	private JLabel lbl_AccountNumber;
	private JLabel lbl_Pin;
	private JButton btn_login;
	private JButton btn_Register;
	private JTextField txt_AccountNumber;
	private JPasswordField txt_Pin;
	private JButton btn_showPin;
	private JLabel lbl_Logo;
	private JLabel lbl_Title2;
	private JButton btn_Balance;
	private JButton btn_Withdraw;
	private JButton btn_Deposit;
	private JLabel lbl_Logo2;
	private JLabel lbl_RemainingBalance;
	private JLabel lbl_WithdrawAmount;
	private JTextField txt_WithdrawAmount;
	private JButton btn_WithdrawConfirm;
	private JButton btn_WithdrawCancel;
	private JLabel lbl_CurrentBal;
	private JButton btn_BalanceConfirm;
	private JLabel lbl_DepositAmount;
	private JTextField txt_DepositAmount;
	private JButton btn_DepositConfirm;
	private JButton btn_DepositCancel;
	int remBal;
	int lineBal;
	int fileAcc;
	int filePin;
	private JButton btn_Back;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankTransaction window = new BankTransaction();
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
	public BankTransaction() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 480, 465);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		lbl_Title = new JLabel("Welcome to NU Bank");
		lbl_Title.setForeground(new Color(65, 105, 225));
		lbl_Title.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lbl_Title.setBounds(105, 28, 287, 23);
		frame.getContentPane().add(lbl_Title);
		
		lbl_AccountNumber = new JLabel("Account Number:");
		lbl_AccountNumber.setForeground(new Color(65, 105, 225));
		lbl_AccountNumber.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lbl_AccountNumber.setBounds(10, 90, 130, 23);
		frame.getContentPane().add(lbl_AccountNumber);
		
		lbl_Pin = new JLabel("PIN:");
		lbl_Pin.setForeground(new Color(65, 105, 225));
		lbl_Pin.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lbl_Pin.setBounds(113, 124, 27, 14);
		frame.getContentPane().add(lbl_Pin);
		
		btn_login = new JButton("LOG IN");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String accNo = txt_AccountNumber.getText();
				String pin = txt_Pin.getText();
				
				String AccountNumber_File = "C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\Account Number.txt";
				String Pin_File = "C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\PIN.txt";
				String Balance_File = "C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\Balance.txt";
				

		        String[] accLines = new String[100];
		        String[] pinLines = new String[100];
		        String[] balLines = new String[100];
		        int acc_numLines = 0;
		        int pin_numLines = 0;
		        int bal_numLines = 0;
		        
		        try (BufferedReader br = new BufferedReader(new FileReader(AccountNumber_File))) {
		            String line;
		            while ((line = br.readLine()) != null) {
		            	accLines[acc_numLines] = line;
		            	acc_numLines++;
		            }
		        } catch (IOException e1) {
		        	JOptionPane.showMessageDialog(btn_Register, "Wrong credentials!");
		            return;
		        }

		        try (BufferedReader br = new BufferedReader(new FileReader(Pin_File))) {
		            String line;
		            while ((line = br.readLine()) != null) {
		            	pinLines[pin_numLines] = line;
		            	pin_numLines++;
		            }
		        } catch (IOException e1) {
		        	JOptionPane.showMessageDialog(btn_Register, "Wrong credentials!");
		            return;
		        }
		        
		        
		        try (BufferedReader br = new BufferedReader(new FileReader(Balance_File))) {
		            String line;
		            while ((line = br.readLine()) != null) {
		            	balLines[bal_numLines] = line;
		            	bal_numLines++;
		            }
		            
		        } catch (IOException e1) {
		        	JOptionPane.showMessageDialog(btn_Register, "Wrong credentials!");
		            return;
		        }
		        
		        fileAcc = findIndex(accLines, accNo);
		        filePin =findIndex(pinLines, pin);
		        
		        		
		        if(fileAcc != -1 && filePin != -1 && fileAcc == filePin) {
		        	JOptionPane.showMessageDialog(btn_Register, "Welcome!");
					lbl_Title2.setVisible(true);
					btn_Balance.setVisible(true);
					btn_Withdraw.setVisible(true);
					btn_Deposit.setVisible(true);
					lbl_Logo2.setVisible(true);
					btn_Back.setVisible(true);
					txt_Pin.setText("");
					txt_AccountNumber.setText("");
					
					remBal = Integer.valueOf(balLines[fileAcc]);
					
					lineBal = fileAcc + 1;
					
					
					btn_login.setVisible(false);
					btn_Register.setVisible(false);
					txt_AccountNumber.setVisible(false);
					txt_Pin.setVisible(false);
					btn_showPin.setVisible(false);
					lbl_Logo.setVisible(false);
					lbl_Title.setVisible(false);
					lbl_AccountNumber.setVisible(false);
					lbl_Pin.setVisible(false);
		        }
		        
		        else if(fileAcc == -1 || filePin == -1) {
		        	JOptionPane.showMessageDialog(btn_Register, "Wrong credentials!");
		        }
					        
		        else {
		        	JOptionPane.showMessageDialog(btn_Register, "Wrong credentials!");
		        }
			}
		});
		btn_login.setForeground(new Color(255, 255, 255));
		btn_login.setBackground(new Color(65, 105, 225));
		btn_login.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btn_login.setFocusable(false);
		btn_login.setBounds(172, 161, 134, 44);
		frame.getContentPane().add(btn_login);
		
		btn_Register = new JButton("Don't have an account yet? Create here.\r\n");
		btn_Register.setForeground(new Color(65, 105, 225));
		btn_Register.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btn_Register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();				
				Registration reg = new Registration();
				reg.setVisible(true);
				
			}
		});
		btn_Register.setBounds(92, 216, 294, 23);
		btn_Register.setFocusable(false);
		btn_Register.setBackground(null);
		btn_Register.setBorder(null);
		frame.getContentPane().add(btn_Register);
		
		txt_AccountNumber = new JTextField();
		txt_AccountNumber.setBounds(143, 92, 203, 23);
		frame.getContentPane().add(txt_AccountNumber);
		txt_AccountNumber.setColumns(10);
		
		txt_Pin = new JPasswordField();
		txt_Pin.setBounds(142, 121, 204, 24);
		frame.getContentPane().add(txt_Pin);
		
		btn_showPin = new JButton("");
		btn_showPin.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				txt_Pin.setEchoChar((char)0);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				txt_Pin.setEchoChar('•');
			}
		});
		btn_showPin.setBounds(356, 122, 30, 23);
		btn_showPin.setBorder(null);
		btn_showPin.setBackground(null);
		btn_showPin.setFocusable(false);
		frame.getContentPane().add(btn_showPin);
		
		ImageIcon show = new ImageIcon("C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\Logo\\show.png");
		Image showImg = show.getImage();
		Image modifiedShow = showImg.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		show = new ImageIcon(modifiedShow);
		btn_showPin.setIcon(show);

		
		lbl_Logo = new JLabel("");
		lbl_Logo.setBounds(130, 235, 216, 191);
		frame.getContentPane().add(lbl_Logo);
		
		ImageIcon logo = new ImageIcon("C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\Logo\\transparent logo.png");
		Image logoImg = logo.getImage();
		Image modifiedLogo = logoImg.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
		logo = new ImageIcon(modifiedLogo);
		lbl_Logo.setIcon(logo);
		
		
//----------------------------------------BANK TRANSACTION-------------------------------------------------------------------------------------------------------
		lbl_Title2 = new JLabel("BANK TRANSACTION");
		lbl_Title2.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lbl_Title2.setVisible(false);
		lbl_Title2.setForeground(new Color(65, 105, 225));
		lbl_Title2.setBounds(107, 11, 257, 19);
		frame.getContentPane().add(lbl_Title2);
		
		btn_Balance = new JButton("BALANCE INQUIRY");
		btn_Balance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_Title2.setVisible(false);
				btn_Balance.setVisible(false);
				btn_Withdraw.setVisible(false);
				btn_Deposit.setVisible(false);
				lbl_RemainingBalance.setVisible(true);
				btn_Back.setVisible(false);
				btn_BalanceConfirm.setVisible(true);
				lbl_CurrentBal.setVisible(true);
				lbl_CurrentBal.setText("$"+remBal);
			}
		});
		btn_Balance.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btn_Balance.setForeground(new Color(255, 255, 255));
		btn_Balance.setVisible(false);
		btn_Balance.setBackground(new Color(65, 105, 225));
		btn_Balance.setFocusable(false);
		btn_Balance.setBounds(122, 129, 211, 72);
		frame.getContentPane().add(btn_Balance);
		
		btn_Withdraw = new JButton("WITHDRAW");
		btn_Withdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_WithdrawAmount.setVisible(true);
				lbl_WithdrawAmount.setVisible(true);
				lbl_Title2.setVisible(false);
				btn_Balance.setVisible(false);
				btn_Withdraw.setVisible(false);
				btn_Deposit.setVisible(false);
				btn_Back.setVisible(false);
				
				btn_WithdrawConfirm.setVisible(true);
				btn_WithdrawCancel.setVisible(true);
			}
		});
		btn_Withdraw.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btn_Withdraw.setForeground(new Color(255, 255, 255));
		btn_Withdraw.setBackground(new Color(65, 105, 225));
		btn_Withdraw.setFocusable(false);
		btn_Withdraw.setVisible(false);
		btn_Withdraw.setBounds(122, 212, 211, 72);
		frame.getContentPane().add(btn_Withdraw);
		
		btn_Deposit = new JButton("DEPOSIT");
		btn_Deposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_Title2.setVisible(false);
				btn_Balance.setVisible(false);
				btn_Withdraw.setVisible(false);
				btn_Deposit.setVisible(false);	
				lbl_DepositAmount.setVisible(true);
				txt_DepositAmount.setVisible(true);
				btn_DepositConfirm.setVisible(true);
				btn_Back.setVisible(false);
				btn_DepositCancel.setVisible(true);
			}
		});
		btn_Deposit.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btn_Deposit.setForeground(new Color(255, 255, 255));
		btn_Deposit.setVisible(false);
		btn_Deposit.setFocusable(false);
		btn_Deposit.setBackground(new Color(65, 105, 225));
		btn_Deposit.setBounds(122, 295, 211, 72);
		frame.getContentPane().add(btn_Deposit);
		
		lbl_DepositAmount = new JLabel("AMOUNT TO DEPOSIT:");
		lbl_DepositAmount.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lbl_DepositAmount.setVisible(false);
		lbl_DepositAmount.setBounds(111, 129, 253, 72);
		frame.getContentPane().add(lbl_DepositAmount);
		
		txt_DepositAmount = new JTextField();
		txt_DepositAmount.setFont(new Font("Century Gothic", Font.BOLD, 20));
		txt_DepositAmount.setVisible(false);
		txt_DepositAmount.setBounds(107, 196, 247, 49);
		frame.getContentPane().add(txt_DepositAmount);
		txt_DepositAmount.setColumns(10);
		
		btn_DepositConfirm = new JButton("CONFIRM");
		btn_DepositConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String a = txt_DepositAmount.getText();
					int b = Integer.valueOf(a);
					
						int amount = JOptionPane.showConfirmDialog(btn_Back, "Are you sure to deposit $"+b);
					
						if(amount == JOptionPane.YES_OPTION) {
						remBal = remBal + b;
						JOptionPane.showMessageDialog(btn_Balance, "You deposited $" +b +" successfully!\nYour new Balance is $"+remBal+".");
						
						String balFile = "C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\Balance.txt";
						
						String newBal = String.valueOf(remBal);
						
						overwriteLine(balFile, lineBal, newBal);
						
						txt_DepositAmount.setText("");					
						lbl_Title2.setVisible(true);
						btn_Balance.setVisible(true);
						btn_Withdraw.setVisible(true);
						btn_Deposit.setVisible(true);
						btn_Back.setVisible(true);
						txt_DepositAmount.setVisible(false);
						lbl_DepositAmount.setVisible(false);
						btn_DepositConfirm.setVisible(false);
						btn_DepositCancel.setVisible(false);
						}
						
						else {
							JOptionPane.showMessageDialog(btn_Back, "Transaction Failed");
						}
					
					}
					catch(NumberFormatException e2) {
						JOptionPane.showMessageDialog(btn_Balance, "Invalid Amount");
					}
			}
		});
		btn_DepositConfirm.setForeground(new Color(255, 255, 255));
		btn_DepositConfirm.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btn_DepositConfirm.setVisible(false);
		btn_DepositConfirm.setBackground(new Color(65, 105, 225));
		btn_DepositConfirm.setBounds(298, 273, 144, 49);
		btn_DepositConfirm.setFocusable(false);
		frame.getContentPane().add(btn_DepositConfirm);
		
		btn_DepositCancel = new JButton("CANCEL");
		btn_DepositCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_Title2.setVisible(true);
				btn_Balance.setVisible(true);
				btn_Withdraw.setVisible(true);
				btn_Deposit.setVisible(true);
				txt_DepositAmount.setVisible(false);
				lbl_DepositAmount.setVisible(false);
				btn_Back.setVisible(true);
				btn_DepositConfirm.setVisible(false);
				btn_DepositCancel.setVisible(false);
				txt_DepositAmount.setText("");
			}
		});
		btn_DepositCancel.setForeground(new Color(255, 255, 255));
		btn_DepositCancel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btn_DepositCancel.setBackground(new Color(65, 105, 225));
		btn_DepositCancel.setVisible(false);
		btn_DepositCancel.setBounds(298, 327, 144, 49);
		btn_DepositCancel.setFocusable(false);
		frame.getContentPane().add(btn_DepositCancel);
		
		
		lbl_Logo2 = new JLabel("");
		lbl_Logo2.setForeground(new Color(255, 255, 255));
		lbl_Logo2.setBackground(new Color(65, 105, 225));
		lbl_Logo2.setVisible(false);
		lbl_Logo2.setBounds(177, 41, 107, 75);
		frame.getContentPane().add(lbl_Logo2);
		
		ImageIcon logo2 = new ImageIcon("C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\Logo\\transparent logo.png");
		Image logoImg2 = logo2.getImage();
		Image modifiedLogo2 = logoImg2.getScaledInstance(100, 75, java.awt.Image.SCALE_SMOOTH);
		logo2 = new ImageIcon(modifiedLogo2);
		lbl_Logo2.setIcon(logo2);
		
		lbl_RemainingBalance = new JLabel("REMAINING BALANCE");
		lbl_RemainingBalance.setFont(new Font("Century Gothic", Font.BOLD, 35));
		lbl_RemainingBalance.setVisible(false);
		lbl_RemainingBalance.setBounds(47, 116, 372, 86);
		frame.getContentPane().add(lbl_RemainingBalance);
		
		lbl_WithdrawAmount = new JLabel("AMOUNT TO WITHDRAW:");
		lbl_WithdrawAmount.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lbl_WithdrawAmount.setVisible(false);
		lbl_WithdrawAmount.setBounds(111, 129, 257, 72);
		frame.getContentPane().add(lbl_WithdrawAmount);
		
		txt_WithdrawAmount = new JTextField();
		txt_WithdrawAmount.setFont(new Font("Century Gothic", Font.BOLD, 20));
		txt_WithdrawAmount.setVisible(false);
		txt_WithdrawAmount.setBounds(107, 196, 247, 49);
		frame.getContentPane().add(txt_WithdrawAmount);
		txt_WithdrawAmount.setColumns(10);
		
		btn_WithdrawConfirm = new JButton("CONFIRM");
		btn_WithdrawConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				
				try {
				String a = txt_WithdrawAmount.getText();
				int b = Integer.valueOf(a);
				
				if(b > remBal) {
					JOptionPane.showMessageDialog(btn_Balance, "Not Enough Balance!");
				}
				else{
					
					int amount = JOptionPane.showConfirmDialog(btn_Back, "Are you sure to withdraw $"+b);
					
					if(amount == JOptionPane.YES_OPTION) {
					remBal = remBal - b;
					
					JOptionPane.showMessageDialog(btn_Balance, "You withdrew $" +b +" successfully!\nYour new Balance is $"+remBal+".");
					
					String balFile = "C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\Balance.txt";
					
					String newBal = String.valueOf(remBal);
					
					overwriteLine(balFile, lineBal, newBal);
					
					txt_WithdrawAmount.setText("");					
					lbl_Title2.setVisible(true);
					btn_Balance.setVisible(true);
					btn_Withdraw.setVisible(true);
					btn_Deposit.setVisible(true);
					btn_Back.setVisible(true);
					txt_WithdrawAmount.setVisible(false);
					lbl_WithdrawAmount.setVisible(false);
					btn_WithdrawConfirm.setVisible(false);
					btn_WithdrawCancel.setVisible(false);
					}
					else {
						JOptionPane.showMessageDialog(btn_Back, "Transaction Failed!");
					}
					
				}
				}
				catch(NumberFormatException e2) {
					JOptionPane.showMessageDialog(btn_Balance, "Invalid Amount");
				}
				
				
				
			}
		});
		btn_WithdrawConfirm.setForeground(new Color(255, 255, 255));
		btn_WithdrawConfirm.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btn_WithdrawConfirm.setVisible(false);
		btn_WithdrawConfirm.setBackground(new Color(65, 105, 225));
		btn_WithdrawConfirm.setFocusable(false);
		btn_WithdrawConfirm.setBounds(298, 273, 144, 49);
		frame.getContentPane().add(btn_WithdrawConfirm);
		
		btn_BalanceConfirm = new JButton("CONFIRM");
		btn_BalanceConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_Title2.setVisible(true);
				btn_Balance.setVisible(true);
				btn_Withdraw.setVisible(true);
				btn_Deposit.setVisible(true);
				txt_WithdrawAmount.setVisible(false);
				lbl_WithdrawAmount.setVisible(false);
				lbl_RemainingBalance.setVisible(false);
				btn_Back.setVisible(true);
				lbl_CurrentBal.setVisible(false);
				btn_WithdrawCancel.setVisible(false);
				btn_BalanceConfirm.setVisible(false);
			}
		});
		btn_BalanceConfirm.setForeground(new Color(255, 255, 255));
		btn_BalanceConfirm.setBackground(new Color(65, 105, 225));
		btn_BalanceConfirm.setVisible(false);
		btn_BalanceConfirm.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btn_BalanceConfirm.setFocusable(false);
		btn_BalanceConfirm.setBounds(298, 273, 144, 49);
		frame.getContentPane().add(btn_BalanceConfirm);
		
		lbl_CurrentBal = new JLabel("$");
		lbl_CurrentBal.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_CurrentBal.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lbl_CurrentBal.setVisible(false);
		lbl_CurrentBal.setBounds(105, 196, 257, 80);
		frame.getContentPane().add(lbl_CurrentBal);
		

		btn_WithdrawCancel = new JButton("CANCEL");
		btn_WithdrawCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lbl_Title2.setVisible(true);
				btn_Balance.setVisible(true);
				btn_Withdraw.setVisible(true);
				btn_Deposit.setVisible(true);
				txt_WithdrawAmount.setVisible(false);
				lbl_WithdrawAmount.setVisible(false);
				btn_Back.setVisible(true);
				btn_WithdrawConfirm.setVisible(false);
				btn_WithdrawCancel.setVisible(false);
				txt_WithdrawAmount.setText("");
				

			}
		});
		btn_WithdrawCancel.setForeground(new Color(255, 255, 255));
		btn_WithdrawCancel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btn_WithdrawCancel.setBackground(new Color(65, 105, 225));
		btn_WithdrawCancel.setFocusable(false);
		btn_WithdrawCancel.setVisible(false);
		btn_WithdrawCancel.setBounds(298, 327, 144, 49);
		frame.getContentPane().add(btn_WithdrawCancel);
		
		btn_Back = new JButton("");
		btn_Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int choice = JOptionPane.showConfirmDialog(btn_Back, "Are you sure to Log Out?");
				
				if(choice == JOptionPane.YES_OPTION) {
				lbl_Title2.setVisible(false);
				btn_Balance.setVisible(false);
				btn_Withdraw.setVisible(false);
				btn_Deposit.setVisible(false);
				btn_Back.setVisible(false);
				lbl_Logo2.setVisible(false);
				
				lbl_Title.setVisible(true);
				lbl_AccountNumber.setVisible(true);
				lbl_Pin.setVisible(true);
				btn_login.setVisible(true);
				btn_Register.setVisible(true);
				txt_AccountNumber.setVisible(true);
				lbl_Logo.setVisible(true);
				txt_Pin.setVisible(true);
				btn_showPin.setVisible(true);
				}
			}
		});
		btn_Back.setBounds(6, 15, 30, 31);
		frame.getContentPane().add(btn_Back);
		btn_Back.setBorder(null);
		btn_Back.setBackground(null);
		btn_Back.setFocusable(false);
		btn_Back.setVisible(false);
		
		ImageIcon back = new ImageIcon("C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\Logo\\back.png");
		Image backImg = back.getImage();
		Image modifiedBack = backImg.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		back = new ImageIcon(modifiedBack);
		btn_Back.setIcon(back);
	}
	
	public void setVisible(boolean a) {
		frame.setVisible(a);
	}
	public static int findIndex(String[] lines, String t)
    {
        // Creating ArrayList
        ArrayList<String> clist = new ArrayList<>();
  
        // adding elements of array
        // to ArrayList
        for (String i : lines)
            clist.add(i);
  
        // returning index of the element
        return clist.indexOf(t);
    }
    public static void overwriteLine(String filePath, int lineNumber, String newContent) {
        try {
            // Read the contents of the file into memory
            List<String> lines = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            // Modify the specific line with new content
            if (lineNumber >= 1 && lineNumber <= lines.size()) {
                lines.set(lineNumber - 1, newContent); // Line numbers start from 1
            } else {
                System.out.println("Invalid line number");
                return;
            }

            // Open the FileWriter in overwrite mode
            FileWriter writer = new FileWriter(filePath);

            // Write the modified content back to the file
            for (String modifiedLine : lines) {
                writer.write(modifiedLine);
                writer.write(System.lineSeparator()); // Add a new line after each line
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
