package Swing_User_pass;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.lang.*;
import java.util.*;

/*class checked extends Username_password{
	
    
}
class password1 extends Username_password{
	
    
 
    
}*/
public class Username_password extends JFrame {

	private JPanel contentPane;
	public  JTextField usertext;
	public JTextField  passtext;
//usermethod;
	
	
	
//passs method
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Username_password frame = new Username_password();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Username_password() {
		JLabel lblNewLabel;
		JLabel lblNewLabel_1;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 lblNewLabel = new JLabel("USERNAME :");
		lblNewLabel.setForeground(new Color(128, 255, 255));
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel.setBounds(22, 71, 132, 53);
		contentPane.add(lblNewLabel);
		
	     lblNewLabel_1 = new JLabel("LOGIN FORM");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNewLabel_1.setBounds(125, 11, 132, 53);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD :");
		lblNewLabel_2.setForeground(new Color(128, 255, 255));
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_2.setBounds(22, 135, 132, 34);
		contentPane.add(lblNewLabel_2);
		
		
		passtext = new JTextField();
		passtext.setFont(new Font("Times New Roman", Font.BOLD, 19));
		passtext.setBounds(162, 135, 178, 34);
		contentPane.add(passtext);
		passtext.setColumns(10);
		
		JButton clearbut = new JButton("Clear");
		clearbut.setBackground(new Color(254, 80, 97));
		clearbut.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		clearbut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usertext.setText("");
				passtext.setText("");
				
			}
		});
		clearbut.setBounds(47, 199, 107, 40);
		contentPane.add(clearbut);
		
		usertext = new JTextField();
		usertext.setFont(new Font("Times New Roman", Font.BOLD, 19));
		usertext.setBounds(164, 83, 176, 32);
		contentPane.add(usertext);
		usertext.setColumns(10);
		
		JButton loginbut = new JButton("Login");
		loginbut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//**********************************************************
				boolean bool3 = false;
				try {
		    	System.out.println("inside");
		        String username =(String)usertext.getText();
		       //username=new StringBuffer(usertext.getText());
		       //char[] ch = username.toCharArray();
		       
		       int r = 0;
		       for (int i = 0; i < username.length(); i++) {
		           //System.out.println(ch[i]);
		           if ((username.charAt(i) >= 97 && username.charAt(i) <= 122) || (username.charAt(i) >= 65 && username.charAt(i) <= 90)) {
		               r++;
		               if (r == username.length()) {
		                   bool3 = true;
		                   break;
		               }
		           }
		       
		       }
		   }
				catch(Exception s) {
					System.out.println("username"+s);
					
				}
				
//*******************************************************************************
				boolean bool = false;
		        boolean bool1 = false;
		        boolean bool2 = false;
		        boolean bool0 = false;
		        boolean bool5 = false;
		        boolean login = false;
		    	System.out.println("inside");
		    	 String passwords =(String)passtext.getText();
		       // passwords=new StringBuffer(passtext.getText());
		        System.out.println(passwords);
		        
		        //char[] hcl = passwords.toCharArray();
		        for (int i = 0; i < passwords.length(); i++) {
		            if (passwords.length() == 10) {
		                bool = true;
		                // special char
		                if (passwords.charAt(i) >= 33 && passwords.charAt(i) <= 47 || passwords.charAt(i) >= 58 && passwords.charAt(i) <= 64)//(hcl[i]>=65&&hcl[i]<=90))
		                {
		                    bool0 = true;
		                } //numbers
		                else if (passwords.charAt(i) >= 48 && passwords.charAt(i) <= 57) {
		                    bool5 = true;
		                } //alpha
		                else if (passwords.charAt(i) >= 97 && passwords.charAt(i) <= 122) {
		                    bool1 = true;
		                } //capital	  
		                else if ((passwords.charAt(i)>= 65 && passwords.charAt(i) <= 90)) {
		                    bool2 = true;
		                }

		            } else {
		                String msg=("Password must be in '10' Char only Accepted"+"\n"+"You Missed " + (10 - passwords.length()) + "Char");
		               JOptionPane.showMessageDialog(rootPane, msg,"ERROR",JOptionPane.ERROR_MESSAGE);
		                bool = false;
		                break;
		            }
		            if (bool && bool0 && bool1 && bool2 && bool5) {
		                login = true;
		                break;
		            }
		        }
				
				    if (bool3&& login) {
			            String loginmsg=("😁😁😊Congrats😁😁😊"+"\n"+"Login Sucessfull");
			            JOptionPane.showMessageDialog(rootPane, loginmsg,"ERROR",JOptionPane.ERROR_MESSAGE);

			        } else {
			            if (bool3 == false && login == false) {
			                JOptionPane.showMessageDialog(rootPane, "login failed","ERROR",JOptionPane.ERROR_MESSAGE);
			            } else if (bool3 == false) {
			                JOptionPane.showMessageDialog(rootPane,"Username' Must Be in Alphabet Only accepted\n😢login failed","ERROR",JOptionPane.ERROR_MESSAGE );
			            } else if (login == false) {
			                JOptionPane.showMessageDialog(rootPane, "'Password' Must Be Special Char,Numbers,Alphabet in lowercase and Uppercase\n😢login failed","ERROR",JOptionPane.ERROR_MESSAGE);
			            }
			   	    }                
				
				
			}
		});
//***************************************************************
		loginbut.setBackground(new Color(122, 222, 135));
		loginbut.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		loginbut.setBounds(210, 199, 114, 40);
		contentPane.add(loginbut);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(0, 0, 7, 4);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Username_password.class.getResource("/Swing_User_pass/pexels-photo-531880.jpeg")));
		lblNewLabel_4.setBounds(0, -5, 370, 266);
		contentPane.add(lblNewLabel_4);
	}
}
