package com.bilgeadam.Marathon2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form {

	private JFrame frame;
	private JTextField txtSonuc;
	private JTextField txtKare;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form window = new Form();
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
	public Form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kare Alan Hesaplama Formu:");
		lblNewLabel.setBounds(30, 11, 138, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Çevre:");
		lblNewLabel_1.setBounds(30, 61, 111, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtSonuc = new JTextField();
		txtSonuc.setText("Sonuc:");
		txtSonuc.setBounds(38, 201, 292, 20);
		frame.getContentPane().add(txtSonuc);
		txtSonuc.setColumns(10);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton.setBounds(241, 50, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		txtKare = new JTextField();
		txtKare.setBounds(241, 12, 86, 20);
		frame.getContentPane().add(txtKare);
		txtKare.setColumns(10);
	}
}
