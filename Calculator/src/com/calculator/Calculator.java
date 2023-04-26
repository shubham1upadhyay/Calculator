package com.calculator;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Calculator 
{
	private JFrame frame;
	private JTextField input_field1;
	private JTextField result_field;
	private JTextField input_field2;
	
	public Calculator() {
		
		frame = new JFrame();
		frame.setTitle("Calculator");
		frame.setBounds(100, 100, 512, 693);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel main_panel = new JPanel();
		main_panel.setBackground(Color.WHITE);
		main_panel.setBounds(10, 10, 478, 636);
		frame.getContentPane().add(main_panel);
		main_panel.setLayout(null);
		
		JLabel title = new JLabel("    CALCULATOR");
		title.setBackground(new Color(0, 0, 0));
		title.setBorder(null);
		title.setBounds(0, 0, 478, 47);
		main_panel.add(title);
		title.setFont(new Font("Tw Cen MT", Font.BOLD, 28));
		title.setForeground(new Color(0, 0, 0));
		
		JPanel logical_panel = new JPanel();
		logical_panel.setBorder(new MatteBorder(1, 16, 4, 7, (Color) new Color(255, 255, 0)));
		logical_panel.setBackground(Color.WHITE);
		logical_panel.setBounds(300, 250, 178, 376);
		main_panel.add(logical_panel);
		logical_panel.setLayout(null);
		
		JButton addition = new JButton("+");
		addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = input_field1.getText();
				String b = input_field2.getText();
				long c = Long.valueOf(a); 
				long d = Long.valueOf(b);
				long ans = c + d;
				String ans1 = String.valueOf(ans);
				result_field.setText(ans1);
				
			}
		});
		addition.setFocusPainted(false);
		addition.setFocusTraversalKeysEnabled(false);
		addition.setBackground(Color.WHITE);
		addition.setForeground(Color.BLUE);
		addition.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addition.setBorderPainted(false);
		addition.setFont(new Font("Tahoma", Font.BOLD, 40));
		addition.setBounds(0, 10, 85, 103);
		logical_panel.add(addition);
		
		JButton multiply = new JButton("*");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = input_field1.getText();
				String b = input_field2.getText();
				long c = Long.valueOf(a); 
				long d = Long.valueOf(b);
				long ans = c * d;
				String ans1 = String.valueOf(ans);
				result_field.setText(ans1);
			}
		});
		multiply.setFocusTraversalKeysEnabled(false);
		multiply.setFocusPainted(false);
		multiply.setBackground(Color.WHITE);
		multiply.setForeground(Color.RED);
		multiply.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		multiply.setBorderPainted(false);
		multiply.setFont(new Font("Tahoma", Font.BOLD, 40));
		multiply.setBounds(0, 123, 85, 103);
		logical_panel.add(multiply);
		
		JButton percentage = new JButton("%");
		percentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = input_field1.getText();
				String b = input_field2.getText();
				long c = Long.valueOf(a); 
				long d = Long.valueOf(b);
				long ans = 0;
				
				if(c>d)
				{
					ans = (d*100)/c;
				}
				else if(c<d)
				{
					ans = (c*100)/d;
				}
				String ans1 = String.valueOf(ans);
				result_field.setText(ans1);
			}
		});
		percentage.setFocusTraversalKeysEnabled(false);
		percentage.setFocusPainted(false);
		percentage.setBorderPainted(false);
		percentage.setBorder(new MatteBorder(6, 7, 1, 15, (Color) Color.RED));
		percentage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		percentage.setBackground(Color.WHITE);
		percentage.setForeground(Color.GREEN);
		percentage.setFont(new Font("Tahoma", Font.BOLD, 40));
		percentage.setBounds(0, 236, 85, 103);
		logical_panel.add(percentage);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = input_field1.getText();
				String b = input_field2.getText();
				long c = Long.valueOf(a); 
				long d = Long.valueOf(b);
				long ans = 0;
				
				if(c<d)
				{
					ans = d-c;
				}
				else if(c > d)
				{
					ans = c-d;
				}
				String ans1 = String.valueOf(ans);
				result_field.setText(ans1);
			}
		});
		minus.setFocusTraversalKeysEnabled(false);
		minus.setFocusPainted(false);
		minus.setBackground(Color.WHITE);
		minus.setForeground(new Color(255, 0, 255));
		minus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		minus.setBorderPainted(false);
		minus.setFont(new Font("Tahoma", Font.BOLD, 40));
		minus.setBounds(83, 10, 85, 103);
		logical_panel.add(minus);
		
		JButton divide = new JButton("/");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = input_field1.getText();
				String b = input_field2.getText();
				long c = Long.valueOf(a); 
				long d = Long.valueOf(b);
				long ans = 0;
				
				if(c<d)
				{
					ans = d/c;
				}
				else if(c>d)
				{
					ans = c/d;
				}
				String ans1 = String.valueOf(ans);
				result_field.setText(ans1);
			}
		});
		divide.setFocusPainted(false);
		divide.setFocusTraversalKeysEnabled(false);
		divide.setBackground(Color.WHITE);
		divide.setForeground(new Color(148, 0, 211));
		divide.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		divide.setBorderPainted(false);
		divide.setFont(new Font("Tahoma", Font.BOLD, 40));
		divide.setBounds(83, 123, 85, 103);
		logical_panel.add(divide);
		
		JButton calculate = new JButton("=");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		calculate.setFocusPainted(false);
		calculate.setFocusTraversalKeysEnabled(false);
		calculate.setBackground(Color.WHITE);
		calculate.setForeground(new Color(255, 140, 0));
		calculate.setFont(new Font("Tahoma", Font.BOLD, 40));
		calculate.setBorderPainted(false);
		calculate.setBounds(83, 236, 85, 103);
		logical_panel.add(calculate);
		
		JPanel keypad_panel = new JPanel();
		keypad_panel.setBorder(new MatteBorder(0, 17, 6, 3, (Color) Color.RED));
		keypad_panel.setBackground(Color.WHITE);
		keypad_panel.setBounds(10, 250, 267, 376);
		main_panel.add(keypad_panel);
		keypad_panel.setLayout(null);
		
		JButton number_1 = new JButton("1");
		number_1.setBorderPainted(false);
		number_1.setFocusTraversalKeysEnabled(false);
		number_1.setFocusPainted(false);
		number_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number_1.setBackground(Color.WHITE);
		number_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		number_1.setBounds(10, 10, 75, 85);
		keypad_panel.add(number_1);
		
		JButton number_2 = new JButton("2");
		number_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number_2.setFocusTraversalKeysEnabled(false);
		number_2.setFocusPainted(false);
		number_2.setBorderPainted(false);
		number_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		number_2.setBackground(Color.WHITE);
		number_2.setBounds(97, 10, 75, 85);
		keypad_panel.add(number_2);
		
		JButton number_3 = new JButton("3");
		number_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number_3.setFocusPainted(false);
		number_3.setBorderPainted(false);
		number_3.setFocusTraversalKeysEnabled(false);
		number_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		number_3.setBackground(Color.WHITE);
		number_3.setBounds(182, 10, 75, 85);
		keypad_panel.add(number_3);
		
		JButton number_4 = new JButton("4");
		number_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number_4.setBorderPainted(false);
		number_4.setFocusPainted(false);
		number_4.setFocusTraversalKeysEnabled(false);
		number_4.setFont(new Font("Tahoma", Font.BOLD, 40));
		number_4.setBackground(Color.WHITE);
		number_4.setBounds(10, 100, 75, 85);
		keypad_panel.add(number_4);
		
		JButton number_5 = new JButton("5");
		number_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number_5.setFocusTraversalKeysEnabled(false);
		number_5.setFocusPainted(false);
		number_5.setBorderPainted(false);
		number_5.setFont(new Font("Tahoma", Font.BOLD, 40));
		number_5.setBackground(Color.WHITE);
		number_5.setBounds(97, 100, 75, 85);
		keypad_panel.add(number_5);
		
		JButton number_6 = new JButton("6");
		number_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number_6.setFocusTraversalKeysEnabled(false);
		number_6.setFocusPainted(false);
		number_6.setBorderPainted(false);
		number_6.setFont(new Font("Tahoma", Font.BOLD, 40));
		number_6.setBackground(Color.WHITE);
		number_6.setBounds(182, 100, 75, 85);
		keypad_panel.add(number_6);
		
		JButton number_7 = new JButton("7");
		number_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number_7.setBorderPainted(false);
		number_7.setFocusPainted(false);
		number_7.setFocusTraversalKeysEnabled(false);
		number_7.setFont(new Font("Tahoma", Font.BOLD, 40));
		number_7.setBackground(Color.WHITE);
		number_7.setBounds(10, 189, 75, 85);
		keypad_panel.add(number_7);
		
		JButton number_8 = new JButton("8");
		number_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number_8.setFocusTraversalKeysEnabled(false);
		number_8.setFocusPainted(false);
		number_8.setBorderPainted(false);
		number_8.setFont(new Font("Tahoma", Font.BOLD, 40));
		number_8.setBackground(Color.WHITE);
		number_8.setBounds(97, 189, 75, 85);
		keypad_panel.add(number_8);
		
		
		JButton number_9 = new JButton("9");
		number_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number_9.setBorderPainted(false);
		number_9.setFocusPainted(false);
		number_9.setFocusTraversalKeysEnabled(false);
		number_9.setFont(new Font("Tahoma", Font.BOLD, 40));
		number_9.setBackground(Color.WHITE);
		number_9.setBounds(182, 189, 75, 85);
		keypad_panel.add(number_9);
		
		JButton number_decimal = new JButton(".");
		number_decimal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number_decimal.setFocusTraversalKeysEnabled(false);
		number_decimal.setFocusPainted(false);
		number_decimal.setBorderPainted(false);
		number_decimal.setFont(new Font("Tahoma", Font.BOLD, 40));
		number_decimal.setBackground(Color.WHITE);
		number_decimal.setBounds(10, 281, 75, 85);
		keypad_panel.add(number_decimal);
		
		JButton number_0 = new JButton("0");
		number_0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number_0.setBorderPainted(false);
		number_0.setFocusPainted(false);
		number_0.setFocusTraversalKeysEnabled(false);
		number_0.setFont(new Font("Tahoma", Font.BOLD, 40));
		number_0.setBackground(Color.WHITE);
		number_0.setBounds(97, 281, 75, 85);
		keypad_panel.add(number_0);
		
//		clear button
		
		JButton clear_btn = new JButton("CE");
		clear_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input_field1.setText("");
				input_field2.setText("");
				result_field.setText("");			
			}
		});
		
		clear_btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		clear_btn.setFocusTraversalKeysEnabled(false);
		clear_btn.setFocusPainted(false);
		clear_btn.setBorderPainted(false);
		clear_btn.setFont(new Font("Tahoma", Font.BOLD, 25));
		clear_btn.setBackground(Color.WHITE);
		clear_btn.setBounds(182, 281, 75, 85);
		keypad_panel.add(clear_btn);
		
		
//		result and input field
		
		JPanel result_panel = new JPanel();
		result_panel.setBorder(new MatteBorder(1, 19, 1, 1, (Color) Color.GRAY));
		result_panel.setBackground(Color.WHITE);
		result_panel.setBounds(10, 45, 468, 195);
		main_panel.add(result_panel);
		result_panel.setLayout(null);
		
		input_field1 = new JTextField();
		input_field1.setBorder(new MatteBorder(1, 14, 4, 7, (Color) Color.CYAN));
		input_field1.setFocusTraversalKeysEnabled(false);
		input_field1.setHorizontalAlignment(SwingConstants.RIGHT);
		input_field1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		input_field1.setBounds(10, 125, 232, 70);
		result_panel.add(input_field1);
		input_field1.setColumns(10);
		
		result_field = new JTextField();
		result_field.setEditable(false);
		result_field.setBorder(new MatteBorder(5, 5, 4, 26, (Color) new Color(139, 69, 19)));
		result_field.setFocusTraversalKeysEnabled(false);
		result_field.setHorizontalAlignment(SwingConstants.LEFT);
		result_field.setForeground(Color.BLUE);
		result_field.setFont(new Font("Tahoma", Font.BOLD, 30));
		result_field.setBackground(Color.WHITE);
		result_field.setBounds(10, 0, 468, 124);
		result_panel.add(result_field);
		result_field.setColumns(10);
		
		input_field2 = new JTextField();
		input_field2.setHorizontalAlignment(SwingConstants.RIGHT);
		input_field2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		input_field2.setFocusTraversalKeysEnabled(false);
		input_field2.setColumns(10);
		input_field2.setBorder(new MatteBorder(1, 14, 4, 7, (Color) Color.CYAN));
		input_field2.setBounds(236, 125, 232, 70);
		result_panel.add(input_field2);
		frame.setVisible(true);
		
	}
}
