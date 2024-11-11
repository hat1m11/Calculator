package calculatorv2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.text.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Component;


public class s extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField answerField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					s frame = new s();
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
	
	
	private double numOne = 0;
	private double numTwo = 0;
	private String operator = "";
	private boolean newNum = true;
	
	
	
	
	
	
	public s() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 629);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		answerField = new JTextField(); 
		answerField.setBorder(null);
		answerField.setSelectedTextColor(new Color(0, 0, 0));
		answerField.setDisabledTextColor(new Color(0, 0, 0));
		answerField.setBackground(new Color(0, 0, 0));
		answerField.setForeground(new Color(248, 248, 255));
		answerField.setFont(new Font("SimSun", Font.PLAIN, 40)); 
		answerField.setBounds(10, 10, 562, 96); 
		contentPane.add(answerField); 
		answerField.setColumns(10);
		
		JButton btn_AC = new JButton("AC");
		btn_AC.setBorder(null);
		btn_AC.setAlignmentX(Component.CENTER_ALIGNMENT);
		btn_AC.setBackground(new Color(255, 165, 0));
		btn_AC.setForeground(new Color(0, 0, 0));
		btn_AC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerField.setText("");
				
			}
		});
		btn_AC.setFont(new Font("SimSun-ExtB", Font.PLAIN, 25));
		btn_AC.setBounds(10, 144, 129, 83);
		contentPane.add(btn_AC);
		
		JButton btn_percentage = new JButton("%");
		btn_percentage.setBorder(null);
		btn_percentage.setBackground(new Color(255, 165, 0));
		btn_percentage.setForeground(new Color(0, 0, 0));
		btn_percentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerField.setText(answerField.getText());
			
			numOne = Double.parseDouble(answerField.getText());
			double result = numOne / 100;
			answerField.setText(String.valueOf(result));
			
				
			}
		});
		btn_percentage.setFont(new Font("SimSun-ExtB", Font.PLAIN, 25));
		btn_percentage.setBounds(150, 144, 129, 83);
		contentPane.add(btn_percentage);
		
		JButton btn_00 = new JButton("00");
		btn_00.setBorder(null);
		btn_00.setBackground(new Color(255, 165, 0));
		btn_00.setForeground(new Color(0, 0, 0));
		btn_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerField.setText(answerField.getText()+ "00");
			}
		});
		btn_00.setFont(new Font("SimSun-ExtB", Font.PLAIN, 25));
		btn_00.setBounds(289, 144, 129, 83);
		contentPane.add(btn_00);
		
		JButton btn_plus = new JButton("+\r\n");
		btn_plus.setBorder(null);
		btn_plus.setBackground(new Color(255, 165, 0));
		btn_plus.setForeground(new Color(0, 0, 0));
		btn_plus.addKeyListener(new KeyAdapter() {
		});
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numOne = Double.parseDouble(answerField.getText());
				operator = "+";
				answerField.setText("");
			}
		});
		btn_plus.setFont(new Font("SimSun-ExtB", Font.PLAIN, 25));
		btn_plus.setBounds(443, 144, 129, 83);
		contentPane.add(btn_plus);
		
		JButton btn_minus = new JButton("-\r\n");
		btn_minus.setBorder(null);
		btn_minus.setBackground(new Color(255, 165, 0));
		btn_minus.setForeground(new Color(0, 0, 0));
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numOne = Double.parseDouble(answerField.getText());
				operator = "-";
				answerField.setText("");
			}
		});
		btn_minus.setFont(new Font("SimSun-ExtB", Font.PLAIN, 25));
		btn_minus.setBounds(443, 252, 129, 83);
		contentPane.add(btn_minus);
		
		JButton btn_1 = new JButton("1");
		btn_1.setBorder(null);
		btn_1.setBackground(new Color(255, 165, 0));
		btn_1.setForeground(new Color(0, 0, 0));
		btn_1.setFont(new Font("SimSun-ExtB", Font.PLAIN, 25));
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerField.setText(answerField.getText()+ "1");
			}
		});
		btn_1.setBounds(10, 252, 129, 83);
		contentPane.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.setBorder(null);
		btn_2.setBackground(new Color(255, 165, 0));
		btn_2.setForeground(new Color(0, 0, 0));
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerField.setText(answerField.getText()+ "2");
			}
		});
		btn_2.setFont(new Font("SimSun-ExtB", Font.PLAIN, 25));
		btn_2.setBounds(150, 252, 129, 83);
		contentPane.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.setBorder(null);
		btn_3.setBackground(new Color(255, 165, 0));
		btn_3.setForeground(new Color(0, 0, 0));
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerField.setText(answerField.getText()+ "3");
			}
		});
		btn_3.setFont(new Font("SimSun-ExtB", Font.PLAIN, 25));
		btn_3.setBounds(289, 252, 129, 83);
		contentPane.add(btn_3);
		
		JButton btn_multiply = new JButton("x");
		btn_multiply.setBorder(null);
		btn_multiply.setBackground(new Color(255, 165, 0));
		btn_multiply.setForeground(new Color(0, 0, 0));
		btn_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numOne = Double.parseDouble(answerField.getText());
				operator = "x";
				answerField.setText("");
			}
		});
		btn_multiply.setFont(new Font("SimSun-ExtB", Font.PLAIN, 25));
		btn_multiply.setBounds(443, 359, 129, 83);
		contentPane.add(btn_multiply);
		
		JButton btn_4 = new JButton("4");
		btn_4.setBorder(null);
		btn_4.setBackground(new Color(255, 165, 0));
		btn_4.setForeground(new Color(0, 0, 0));
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerField.setText(answerField.getText()+ "4");
			}
		});
		btn_4.setFont(new Font("SimSun-ExtB", Font.PLAIN, 25));
		btn_4.setBounds(10, 346, 129, 83);
		contentPane.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.setBorder(null);
		btn_5.setBackground(new Color(255, 165, 0));
		btn_5.setForeground(new Color(0, 0, 0));
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerField.setText(answerField.getText()+ "5");
			}
		});
		btn_5.setFont(new Font("SimSun-ExtB", Font.PLAIN, 25));
		btn_5.setBounds(150, 346, 129, 83);
		contentPane.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.setBorder(null);
		btn_6.setBackground(new Color(255, 165, 0));
		btn_6.setForeground(new Color(0, 0, 0));
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerField.setText(answerField.getText()+ "6");
			}
		});
		btn_6.setFont(new Font("SimSun-ExtB", Font.PLAIN, 25));
		btn_6.setBounds(289, 346, 129, 83);
		contentPane.add(btn_6);
		
		JButton btn_division = new JButton("/");
		btn_division.setBorder(null);
		btn_division.setBackground(new Color(255, 165, 0));
		btn_division.setForeground(new Color(0, 0, 0));
		btn_division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numOne = Double.parseDouble(answerField.getText());
				operator = "/";
				answerField.setText(""); 
			}
		});
		btn_division.setFont(new Font("SimSun-ExtB", Font.PLAIN, 25));
		btn_division.setBounds(443, 469, 129, 83);
		contentPane.add(btn_division);
		
		JButton btn_7 = new JButton("7");
		btn_7.setBorder(null);
		btn_7.setBackground(new Color(255, 165, 0));
		btn_7.setForeground(new Color(0, 0, 0));
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerField.setText(answerField.getText()+ "7");
			}
		});
		btn_7.setFont(new Font("SimSun-ExtB", Font.PLAIN, 25));
		btn_7.setBounds(10, 440, 129, 83);
		contentPane.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.setBorder(null);
		btn_8.setBackground(new Color(255, 165, 0));
		btn_8.setForeground(new Color(0, 0, 0));
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerField.setText(answerField.getText()+ "8");
			}
		});
		btn_8.setFont(new Font("SimSun-ExtB", Font.PLAIN, 25));
		btn_8.setBounds(150, 440, 129, 83);
		contentPane.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setBorder(null);
		btn_9.setBackground(new Color(255, 165, 0));
		btn_9.setForeground(new Color(0, 0, 0));
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerField.setText(answerField.getText()+ "9");
			}
		});
		btn_9.setFont(new Font("SimSun-ExtB", Font.PLAIN, 25));
		btn_9.setBounds(289, 440, 129, 83);
		contentPane.add(btn_9);
		
		JButton btn_0 = new JButton("0");
		btn_0.setBorder(null);
		btn_0.setBackground(new Color(255, 165, 0));
		btn_0.setForeground(new Color(0, 0, 0));
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerField.setText(answerField.getText()+ "0");
			}
		});
		btn_0.setFont(new Font("SimSun-ExtB", Font.PLAIN, 25));
		btn_0.setBounds(10, 534, 269, 58);
		contentPane.add(btn_0);
		
		JButton btn_equal = new JButton("=");
		btn_equal.setBorder(null);
		btn_equal.setBackground(new Color(255, 165, 0));
		btn_equal.setForeground(new Color(0, 0, 0));
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numTwo = Double.parseDouble(answerField.getText());
				double result = 0;
				
				switch(operator) {
				
				case "+":
					result = numOne + numTwo;
					break;
			
				case "-":
					result = numOne - numTwo;
					break;
				case "x":
					result = numOne * numTwo;
					break;
				case "/":
					if(numTwo !=0){
						result = numOne / numTwo;
					}else {
						answerField.setText("Error");
						return;
					}
				break;
				}
				
				answerField.setText(String.valueOf(result));
			}
		});
		btn_equal.setFont(new Font("SimSun-ExtB", Font.PLAIN, 25));
		btn_equal.setBounds(289, 534, 129, 58);
		contentPane.add(btn_equal);
	}

}
