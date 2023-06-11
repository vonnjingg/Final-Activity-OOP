package GUI;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Component;
import java.util.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Font;
import java.awt.Graphics;
public class Intro {

	private JFrame frame;
	JButton btn_Register;
	JButton btn_login;
	JButton btn_Exit;
	private JButton btn_FAQ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Intro window = new Intro();
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
	public Intro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Main Menu");
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 480, 520);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lbl_Logo = new JLabel("");
		lbl_Logo.setForeground(new Color(255, 255, 255));
		lbl_Logo.setBackground(new Color(65, 105, 225));
		lbl_Logo.setBounds(21, 22, 404, 351);
		frame.getContentPane().add(lbl_Logo);
		
		ImageIcon logo = new ImageIcon("C:\\Users\\karl\\Desktop\\Vonn\\Final Project OOP\\Logo\\transparent logo.png");
		Image logoImg = logo.getImage();
		Image modifiedLogo = logoImg.getScaledInstance(400, 350, java.awt.Image.SCALE_SMOOTH);
		logo = new ImageIcon(modifiedLogo);
		lbl_Logo.setIcon(logo);
		
		btn_Register = new JButton("REGISTER");
		btn_Register.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btn_Register.setBackground(new Color(65, 105, 225));

		btn_Register.setForeground(Color.WHITE);
		btn_Register.setFocusable(false);
		btn_Register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Registration reg = new Registration();
				reg.setVisible(true);
			}
		});
		btn_Register.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_Register.setBounds(10, 395, 104, 63);
				btn_login.setBounds(178, 395, 104, 43);
				btn_Exit.setBounds(350, 395, 104, 43);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_Register.setBounds(10, 395, 104, 43);
				btn_login.setBounds(178, 395, 104, 43);
				btn_Exit.setBounds(350, 395, 104, 43);
			}
		});
		btn_Register.setBounds(10, 395, 104, 43);
		frame.getContentPane().add(btn_Register);
		
		btn_login = new JButton("LOG IN");
		btn_login.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btn_login.setBackground(new Color(65, 105, 225));
		btn_login.setForeground(new Color(255, 255, 255));
		btn_login.setFocusable(false);
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				BankTransaction login = new BankTransaction();
				login.setVisible(true);
			}
		});
		btn_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_Register.setBounds(10, 395, 104, 43);
				btn_login.setBounds(178, 395, 104, 63);
				btn_Exit.setBounds(350, 395, 104, 43);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_Register.setBounds(10, 395, 104, 43);
				btn_login.setBounds(178, 395, 104, 43);
				btn_Exit.setBounds(350, 395, 104, 43);
			}
		});
		btn_login.setBounds(178, 395, 104, 43);
		frame.getContentPane().add(btn_login);
		
		btn_Exit = new JButton("EXIT");
		btn_Exit.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btn_Exit.setForeground(new Color(255, 255, 255));
		btn_Exit.setBackground(new Color(65, 105, 225));
		btn_Exit.setFocusable(false);
		btn_Exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	
				btn_Register.setBounds(10, 395, 104, 43);
				btn_login.setBounds(178, 395, 104, 43);
				btn_Exit.setBounds(350, 395, 104, 63);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_Register.setBounds(10, 395, 104, 43);
				btn_login.setBounds(178, 395, 104, 43);
				btn_Exit.setBounds(350, 395, 104, 43);
				}
		});
		btn_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btn_Exit.setBounds(350, 395, 104, 43);
		frame.getContentPane().add(btn_Exit);
		
		btn_FAQ = new JButton("FAQ");
		btn_FAQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(lbl_Logo, "If you don't have an account click REGISTER.\nIf you have an account click LOG IN.\nIf you wish to exit click EXIT.");
			}
		});
		btn_FAQ.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btn_FAQ.setForeground(new Color(255, 255, 255));
		btn_FAQ.setBackground(new Color(65, 105, 225));
		btn_FAQ.setFocusable(false);
		btn_FAQ.setBounds(385, 11, 69, 23);
		frame.getContentPane().add(btn_FAQ);
		

	}
	
	public void setVisible(boolean a) {
		frame.setVisible(a);
	}
	}
	

