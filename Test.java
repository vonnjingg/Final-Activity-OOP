package GUI;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test {

	private JFrame frame;
	private JLabel lbl_Background;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btn_0;
	private JTextField textField;
	private JButton btn_Cancel;
	private JButton btn_Clear;
	private JButton btn_Enter;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
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
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 472, 587);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ImageIcon bg = new ImageIcon("C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\Logo\\bank1.jpg");
		Image bgImg = bg.getImage();
		Image modifiedbg = bgImg.getScaledInstance(472, 554, java.awt.Image.SCALE_SMOOTH);
		bg = new ImageIcon(modifiedbg);
		
		btn_Cancel = new JButton("");
		btn_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btn_Cancel.setBounds(335, 465, 54, 9);
		frame.getContentPane().add(btn_Cancel);
		
		textField = new JTextField();
		textField.setBounds(234, 105, 113, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btn_1 = new JButton("");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();	
				textField.setText(a + "1");
			}
		});
		btn_1.setBounds(190, 458, 22, 16);
		frame.getContentPane().add(btn_1);
		btn_1.setOpaque(false);
		btn_1.setContentAreaFilled(false);
		btn_1.setBorderPainted(false);
		
		btn_2 = new JButton("");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String a = textField.getText();	
				textField.setText(a + "2");
			}
		});
		btn_2.setBounds(236, 458, 22, 16);
		frame.getContentPane().add(btn_2);
		btn_2.setOpaque(false);
		btn_2.setContentAreaFilled(false);
		btn_2.setBorderPainted(false);
		
		btn_3 = new JButton("");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();	
				textField.setText(a + "3");
			}
		});
		btn_3.setBounds(281, 458, 22, 16);
		frame.getContentPane().add(btn_3);
		btn_3.setOpaque(false);
		btn_3.setContentAreaFilled(false);
		btn_3.setBorderPainted(false);
		
		btn_4 = new JButton("");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();	
				textField.setText(a + "4");
			}
		});
		btn_4.setBounds(190, 479, 22, 16);
		frame.getContentPane().add(btn_4);
		btn_4.setOpaque(false);
		btn_4.setContentAreaFilled(false);
		btn_4.setBorderPainted(false);
		
		btn_5 = new JButton("");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();	
				textField.setText(a + "5");
			}
		});
		btn_5.setBounds(236, 479, 22, 16);
		frame.getContentPane().add(btn_5);
		btn_5.setOpaque(false);
		btn_5.setContentAreaFilled(false);
		btn_5.setBorderPainted(false);
		
		
		btn_6 = new JButton("");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();	
				textField.setText(a + "6");
			}
		});
		btn_6.setBounds(281, 479, 22, 16);
		frame.getContentPane().add(btn_6);
		btn_6.setOpaque(false);
		btn_6.setContentAreaFilled(false);
		btn_6.setBorderPainted(false);
		
		btn_7 = new JButton("");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();	
				textField.setText(a + "7");
			}
		});
		btn_7.setBounds(190, 500, 22, 16);
		frame.getContentPane().add(btn_7);
		btn_7.setOpaque(false);
		btn_7.setContentAreaFilled(false);
		btn_7.setBorderPainted(false);
		
		btn_8 = new JButton("");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();	
				textField.setText(a + "8");
			}
		});
		btn_8.setBounds(236, 500, 22, 16);
		frame.getContentPane().add(btn_8);
		btn_8.setOpaque(false);
		btn_8.setContentAreaFilled(false);
		btn_8.setBorderPainted(false);
		
		btn_9 = new JButton("");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();	
				textField.setText(a + "9");
			}
		});
		btn_9.setBounds(281, 500, 22, 16);
		frame.getContentPane().add(btn_9);
		btn_9.setOpaque(false);
		btn_9.setContentAreaFilled(false);
		btn_9.setBorderPainted(false);
		
		btn_0 = new JButton("");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();	
				textField.setText(a + "0");
			}
		});
		btn_0.setBounds(226, 521, 32, 16);
		frame.getContentPane().add(btn_0);
		btn_0.setOpaque(false);
		btn_0.setContentAreaFilled(false);
		btn_0.setBorderPainted(false);
		
		btn_Clear = new JButton("");
		btn_Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btn_Clear.setBounds(335, 486, 67, 9);
		frame.getContentPane().add(btn_Clear);
		
		btn_Enter = new JButton("");
		btn_Enter.setBounds(335, 504, 67, 12);
		frame.getContentPane().add(btn_Enter);
		
		lbl_Background = new JLabel("");
		lbl_Background.setBounds(0, 0, 456, 548);
		frame.getContentPane().add(lbl_Background);
		lbl_Background.setIcon(bg);
	}
}
