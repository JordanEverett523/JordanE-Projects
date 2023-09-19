//Jordan Everett, COMP 167 Section 001

package Calcuator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class SciCalc extends JFrame implements ActionListener 
{
	private JButton userOne = new JButton("1");
	private JButton userTwo = new JButton("2");
	private JButton userThree = new JButton("3");
	private JButton userFour = new JButton("4");
	private JButton userFive = new JButton("5");
	private JButton userSix = new JButton("6");
	private JButton userSeven = new JButton("7");
	private JButton userEight = new JButton("8");
	private JButton userNine = new JButton("9");
	private JButton userZero = new JButton("0");
	private JButton Multiply = new JButton("\u00D7");
	private JButton Divide = new JButton("\u00F7");
	private JButton uAdd = new JButton("+");
	private JButton uSubt = new JButton("\u02D7");
	private JButton userEqual = new JButton("=");
	private JButton userPoint = new JButton(".");
	private JButton userDE = new JButton("DE");
	private JButton userErase = new JButton("C");
	private JButton userSquare = new JButton("x\u00B2");
	private JButton userCube = new JButton("x\u00B3");
	private JButton userSqrt = new JButton("\u221A");
	private JButton userPercent = new JButton("%");
	private JButton Mod = new JButton("Mod");
	private JButton userOneByN = new JButton("1/n");
	private JButton PlusMinus = new JButton("\u00B1");
	
			
	private JButton Sin = new JButton("sin");
	private JButton Cos = new JButton("cos");
	private JButton Tan = new JButton("tan");
	private JButton Asin = new JButton("asin");
	private JButton Acos = new JButton("acos");
	private JButton Atan = new JButton("atan");
	private JButton SinH = new JButton("sinh");
	private JButton CosH = new JButton("cosh");
	private JButton TanH = new JButton("tanh");
	private JButton PowerOfTen = new JButton("10^n");
	private JButton Log = new JButton("log");
	private JButton naturalLog = new JButton("ln");
	private JButton Abs = new JButton("abs");
	private JButton userExit = new JButton("EXIT");
	
			
	private JTextField tfDisplay = new JTextField();//result displaying screen
	private JTextField tfRawInput = new JTextField();
	private String sRawInput = "";
	private String sDisplay = "";//Input string
	private boolean isPlus = true;//Is the sign of the operand is plus
	private boolean isPoint = false;//is there is decimal point in the operands
	private boolean isOperation = false;
	private double operandOne = 0;// 1st operand
	private double operandTwo = 0;// 2nd operand
	private double result = 0;// Result
	private char operation = ' ';// Operation
	static Color windowColor = new Color(57, 40, 129);//Color of container window

	
	
	public SciCalc()
	{
		setBackground(windowColor);
		setLayout(null);
		JPanel inputScreen = new JPanel(); // The screen that display the input
		JPanel resultScreen = new JPanel(); // The screen that show the result
		JPanel comKeypad = new JPanel(); // The keypad that contain the common keys
		JPanel sciKeypad = new JPanel(); // The keypad that contains the scientific keys.
		
		//---------------------Fonts & Colors------------------------
		Font fontResDisplay = new Font("Times New Roman", Font.BOLD, 35);//Font for displaying result
		Font fontKeypad = new Font("Times New Roman", Font.PLAIN, 20);//Font for key character
		Font fontKeypad1 = new Font("Times New Roman", Font.PLAIN, 15);//Font for key character
		
		Color screenColor = new Color(150, 145, 30);
		Color numberKeyColor = new Color(212, 212, 212);
		Color equalColor = new Color(63, 132, 243);
		Color exitColor = new Color(224, 67, 67);
		Color otherColor = new Color(247, 247, 247);
		Color copyRightColor = new Color(0, 0, 255);
		
		
		add(inputScreen).setBounds(0, 0, 343, 30);
		inputScreen.add(tfRawInput);
		inputScreen.setLayout(null);
		tfRawInput.setBounds(0, 0, 343, 30);
		tfRawInput.setHorizontalAlignment(JTextField.LEFT);
		tfRawInput.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		tfRawInput.setText("0");
		tfRawInput.setEditable(false);
		tfRawInput.setBackground(screenColor);
		tfRawInput.setForeground(Color.BLACK);

		add(resultScreen).setBounds(0, 30, 343, 50);
		resultScreen.add(tfDisplay);
		resultScreen.setLayout(null);
		tfDisplay.setBounds(0, 0, 343, 50);
		tfDisplay.setHorizontalAlignment(JTextField.RIGHT);
		tfDisplay.setFont(fontResDisplay);
		tfDisplay.setText("0");
		tfDisplay.setEditable(false);
		tfDisplay.setBackground(screenColor);
		tfDisplay.setForeground(Color.BLACK);


		add(comKeypad).setBounds(0, 100, 343, 190);
		comKeypad.setLayout(null);
		comKeypad.setBackground(windowColor);
	

		userOne.setFont(fontKeypad);	
		userOne.setBackground(numberKeyColor);	
		userOne.setFocusable(false);
		userTwo.setFont(fontKeypad);	
		userTwo.setBackground(numberKeyColor);	
		userTwo.setFocusable(false);
		userThree.setFont(fontKeypad);	
		userThree.setBackground(numberKeyColor);	
		userThree.setFocusable(false);
		userFour.setFont(fontKeypad);	
		userFour.setBackground(numberKeyColor);	
		userFour.setFocusable(false);
		userFive.setFont(fontKeypad);	
		userFive.setBackground(numberKeyColor);	
		userFive.setFocusable(false);
		userSix.setFont(fontKeypad);	
		userSix.setBackground(numberKeyColor);	
		userSix.setFocusable(false);
		userSeven.setFont(fontKeypad);	
		userSeven.setBackground(numberKeyColor);	
		userSeven.setFocusable(false);
		userEight.setFont(fontKeypad);	
		userEight.setBackground(numberKeyColor);	
		userEight.setFocusable(false);
		userNine.setFont(fontKeypad);	
		userNine.setBackground(numberKeyColor);	
		userNine.setFocusable(false);
		userZero.setFont(fontKeypad);	
		userZero.setBackground(numberKeyColor);	
		userZero.setFocusable(false);
		uAdd.setFont(fontKeypad);	
		uAdd.setBackground(otherColor);	
		uAdd.setFocusable(false);
		uSubt.setFont(fontKeypad);	
		uSubt.setBackground(otherColor);	
		uSubt.setFocusable(false);
		Multiply.setFont(fontKeypad);	
		Multiply.setBackground(otherColor);	
		Multiply.setFocusable(false);
		Divide.setFont(fontKeypad);	
		Divide.setBackground(otherColor);	
		Divide.setFocusable(false);
		userPoint.setFont(fontKeypad);	
		userPoint.setBackground(numberKeyColor);	
		userPoint.setFocusable(false);
		userEqual.setFont(new Font("Times New Roman", Font.PLAIN, 40));	
		userEqual.setBackground(equalColor);	
		userEqual.setFocusable(false);
		userDE.setFont(fontKeypad1);	
		userDE.setBackground(Color.ORANGE);	
		userDE.setFocusable(false);
		userErase.setFont(fontKeypad);	
		userErase.setBackground(exitColor);	
		userErase.setFocusable(false);
		userSquare.setFont(fontKeypad);	
		userSquare.setBackground(otherColor);	
		userSquare.setFocusable(false);
		userSqrt.setFont(fontKeypad);	
		userSqrt.setBackground(otherColor);	
		userSqrt.setFocusable(false);
		userCube.setFont(fontKeypad);	
		userCube.setBackground(otherColor);	
		userCube.setFocusable(false);
		userPercent.setFont(fontKeypad);	
		userPercent.setBackground(otherColor);	
		userPercent.setFocusable(false);
		Mod.setFont(new Font("Times New Roman", Font.PLAIN, 10));  
		Mod.setBackground(otherColor);	
		Mod.setFocusable(false);
		userOneByN.setFont(fontKeypad1);	
		userOneByN.setBackground(otherColor);	
		userOneByN.setFocusable(false);
		PlusMinus.setFont(fontKeypad);	
		PlusMinus.setBackground(numberKeyColor);	
		PlusMinus.setFocusable(false);
		
		// 1st row
		comKeypad.add(userDE).setBounds(226, 0, 54, 38);		
		comKeypad.add(userErase).setBounds(280, 0, 54, 38);
		// 2nd row
		comKeypad.add(userSeven).setBounds(10, 38, 54, 38);
		comKeypad.add(userEight).setBounds(64, 38, 54, 38);
		comKeypad.add(userNine).setBounds(118, 38, 54, 38);	
		comKeypad.add(Multiply).setBounds(172, 38, 54, 38);
		comKeypad.add(Divide).setBounds(226, 38, 54, 38);
		comKeypad.add(userSquare).setBounds(280, 38, 54, 38);
		// 3rd row
		comKeypad.add(userFour).setBounds(10, 76, 54, 38);
		comKeypad.add(userFive).setBounds(64, 76, 54, 38);
		comKeypad.add(userSix).setBounds(118, 76, 54, 38);
		comKeypad.add(uAdd).setBounds(172, 76, 54, 38);
		comKeypad.add(uSubt).setBounds(226, 76, 54, 38);
		comKeypad.add(userCube).setBounds(280, 76, 54, 38);
		// 4th row
		comKeypad.add(userOne).setBounds(10, 114, 54, 38);
		comKeypad.add(userTwo).setBounds(64, 114, 54, 38);
		comKeypad.add(userThree).setBounds(118, 114, 54, 38);
		comKeypad.add(userEqual).setBounds(172, 114, 108, 38);
		comKeypad.add(Mod).setBounds(280, 114, 54, 38);
		// 5th row
		comKeypad.add(userZero).setBounds(10, 152, 54, 38);
		comKeypad.add(userPoint).setBounds(64, 152, 54, 38);
		comKeypad.add(PlusMinus).setBounds(118, 152, 54, 38);
		comKeypad.add(userOneByN).setBounds(172, 152, 54, 38);
		comKeypad.add(userPercent).setBounds(226, 152, 54, 38);
		comKeypad.add(userSqrt).setBounds(280, 152, 54, 38);	
		
		
			
		add(sciKeypad).setBounds(0, 310, 343, 145);
		sciKeypad.setLayout(null);
		sciKeypad.setBackground(windowColor);
		
		JLabel copyRight = new JLabel("\u00A9 2013  CI- Soft. Tech.");
		copyRight.setForeground(copyRightColor);
		sciKeypad.add(copyRight).setBounds(205, 130, 150, 15);
		
		sciKeypad.add(Sin).setBounds(10, 0, 65, 38);
		sciKeypad.add(Cos).setBounds(75, 0, 65, 38);
		sciKeypad.add(Tan).setBounds(140, 0, 65, 38);
		sciKeypad.add(Log).setBounds(205, 0, 65, 38);
		sciKeypad.add(naturalLog).setBounds(270, 0, 64, 38);
		sciKeypad.add(Asin).setBounds(10, 38, 65, 38);
		sciKeypad.add(Acos).setBounds(75, 38, 65, 38);
		sciKeypad.add(Atan).setBounds(140, 38, 65, 38);
		sciKeypad.add(PowerOfTen).setBounds(205, 38, 65, 38);
		sciKeypad.add(Abs).setBounds(270, 38, 64, 38);
		sciKeypad.add(SinH).setBounds(10, 76, 65, 38);
		sciKeypad.add(CosH).setBounds(75, 76, 65, 38);
		sciKeypad.add(TanH).setBounds(140, 76, 65, 38);
		sciKeypad.add(userExit).setBounds(205, 76, 130, 38);
		
		
		Sin.setFont(fontKeypad);	
		Sin.setBackground(otherColor);	
		Sin.setFocusable(false);
		Cos.setFont(fontKeypad);	
		Cos.setBackground(otherColor);	
		Cos.setFocusable(false);
		Tan.setFont(fontKeypad);	
		Tan.setBackground(otherColor);	
		Tan.setFocusable(false);
		Asin.setFont(fontKeypad1);	
		Asin.setBackground(otherColor);	
		Asin.setFocusable(false);
		Acos.setFont(fontKeypad1);	
		Acos.setBackground(otherColor);	
		Acos.setFocusable(false);
		Atan.setFont(fontKeypad1);	
		Atan.setBackground(otherColor);	
		Atan.setFocusable(false);
		SinH.setFont(fontKeypad1);	
		SinH.setBackground(otherColor);	
		SinH.setFocusable(false);
		CosH.setFont(fontKeypad1);	
		CosH.setBackground(otherColor);	
		CosH.setFocusable(false);
		TanH.setFont(fontKeypad1);	
		TanH.setBackground(otherColor);	
		TanH.setFocusable(false);
		Log.setFont(fontKeypad);	
		Log.setBackground(otherColor);	
		Log.setFocusable(false);
		naturalLog.setFont(fontKeypad);	
		naturalLog.setBackground(otherColor);		
		naturalLog.setFocusable(false);
		Abs.setFont(fontKeypad);	
		Abs.setBackground(otherColor);	
		Abs.setFocusable(false);
		userExit.setFont(fontKeypad);	
		userExit.setBackground(exitColor);		
		userExit.setFocusable(false);
		PowerOfTen.setFont(fontKeypad1);	
		PowerOfTen.setBackground(otherColor);	
		PowerOfTen.setFocusable(false);
		
		
		userOne.addActionListener(this);
		userTwo.addActionListener(this);
		userThree.addActionListener(this);
		userFour.addActionListener(this);
		userFive.addActionListener(this);
		userSix.addActionListener(this);
		userSeven.addActionListener(this);
		userEight.addActionListener(this);
		userNine.addActionListener(this);
		userZero.addActionListener(this);
		uAdd.addActionListener(this);
		uSubt.addActionListener(this);
		Multiply.addActionListener(this);
		Divide.addActionListener(this);
		userPoint.addActionListener(this);
		userEqual.addActionListener(this);
		userDE.addActionListener(this);
		userErase.addActionListener(this);
		userSquare.addActionListener(this);
		userSqrt.addActionListener(this);
		userCube.addActionListener(this);
		userPercent.addActionListener(this);
		Mod.addActionListener(this);
		userOneByN.addActionListener(this);
		PlusMinus.addActionListener(this);
		//scientific keys
		Sin.addActionListener(this);
		Cos.addActionListener(this);
		Tan.addActionListener(this);
		Asin.addActionListener(this);
		Acos.addActionListener(this);
		Atan.addActionListener(this);
		SinH.addActionListener(this);
		CosH.addActionListener(this);
		TanH.addActionListener(this);
		PowerOfTen.addActionListener(this);
		Log.addActionListener(this);
		naturalLog.addActionListener(this);
		Abs.addActionListener(this);
		userExit.addActionListener(this);

	}

	public static void main(String[] CHAND) 
	{
		SciCalc frame = new SciCalc();
		frame.setTitle("CI- Calculator");
		frame.setSize(350, 500);
		frame.getContentPane().setBackground(windowColor);
		frame.setLocationRelativeTo(null);
		//frame.setMaximizedBounds(new Rectangle(300, 200));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == userOne) 
		{
			if(operation == '=')
			{
				sDisplay = "1";
				sRawInput = "1";
				tfRawInput.setText(sRawInput);
				operation = ' ';
			}
			else 
			{
				sDisplay = sDisplay + "1";
				sRawInput += "1";
				tfRawInput.setText(sRawInput);
			}
		} 
		else if (e.getSource() == userTwo) 
		{
			if(operation == '=')
			{
				sDisplay = "2";
				sRawInput = "2";
				tfRawInput.setText(sRawInput);
				operation = ' ';
			}
			else 
			{
				sDisplay = sDisplay + "2";
				sRawInput += "2";
				tfRawInput.setText(sRawInput);
			}
		} 
		else if (e.getSource() == userThree)
		{
			if(operation == '=')
			{
				sDisplay = "3";
				sRawInput = "3";
				tfRawInput.setText(sRawInput);
				operation = ' ';
			}
			else 
			{
				sDisplay = sDisplay + "3";
				sRawInput += "3";
				tfRawInput.setText(sRawInput);
			}
		} 
		else if (e.getSource() == userFour) 
		{
			if(operation == '=')
			{
				sDisplay = "4";
				sRawInput = "4";
				tfRawInput.setText(sRawInput);
				operation = ' ';
			}
			else 
			{
				sDisplay = sDisplay + "4";
				sRawInput += "4";
				tfRawInput.setText(sRawInput);
			}
		} 
		else if (e.getSource() == userFive) 
		{
			if(operation == '=')
			{
				sDisplay = "5";
				sRawInput = "5";
				tfRawInput.setText(sRawInput);
				operation = ' ';
			}
			else 
			{
				sDisplay = sDisplay + "5";
				sRawInput += "5";
				tfRawInput.setText(sRawInput);
			}
		}
		else if (e.getSource() == userSix) 
		{
			if(operation == '=')
			{
				sDisplay = "6";
				sRawInput = "6";
				tfRawInput.setText(sRawInput);
				operation = ' ';
			}
			else 
			{
				sDisplay = sDisplay + "6";
				sRawInput += "6";
				tfRawInput.setText(sRawInput);
			}
		} 
		else if (e.getSource() == userSeven) 
		{
			if(operation == '=')
			{
				sDisplay = "7";
				sRawInput = "7";
				tfRawInput.setText(sRawInput);
				operation = ' ';
			}
			else 
			{
				sDisplay = sDisplay + "7";
				sRawInput += "7";
				tfRawInput.setText(sRawInput);
			}
		}
		else if (e.getSource() == userEight) 
		{
			if(operation == '=')
			{
				sDisplay = "8";
				sRawInput = "8";
				tfRawInput.setText(sRawInput);
				operation = ' ';
			}
			else 
			{
				sDisplay = sDisplay + "8";
				sRawInput += "8";
				tfRawInput.setText(sRawInput);
			}
		} 
		else if (e.getSource() == userNine) 
		{
			if(operation == '=')
			{
				sDisplay = "9";
				sRawInput = "9";
				tfRawInput.setText(sRawInput);
				operation = ' ';
			}
			else 
			{
				sDisplay = sDisplay + "9";
				sRawInput += "9";
				tfRawInput.setText(sRawInput);
			}
		} 
		else if (e.getSource() == userZero) 
		{
			if(sDisplay.equals(""))//zero at first
			{
				sDisplay = "0";
				sRawInput += "0";
				tfRawInput.setText(sRawInput);
			}
			else
			{
				sDisplay = sDisplay + "0";
				sRawInput += "0";
				tfRawInput.setText(sRawInput);
			}
		} 
		else if (e.getSource() == userPoint) ///when userPoint is clicked
		{
			if(sDisplay.equals(""))//userPoint at starting of a number
			{
				sDisplay = "0.";
				sRawInput += "0.";
				tfRawInput.setText(sRawInput);
			}
			else if(!isPoint)
			{
				sDisplay = sDisplay + ".";
				sRawInput += ".";
				tfRawInput.setText(sRawInput);
			}
			isPoint = true;
		} 
		else if(e.getSource() == PlusMinus && !sDisplay.equals("") && !isOperation)//plus minus(sign) button
		{
			if(isPlus)
			{
				sDisplay = "-" + sDisplay;
				sRawInput = sDisplay;
				tfRawInput.setText(sRawInput);
				isPlus = false;
			}
			else
			{
				sDisplay = sDisplay.substring(1, sDisplay.length());
				sRawInput = sDisplay.substring(1, sDisplay.length());
				tfRawInput.setText(sRawInput);
				isPlus = true;
			}
		}
		else if (e.getSource() == uAdd && (!sDisplay.equals("") || operation == '=')) // + button is clicked and input is not empty
		{
			if(!isOperation)//to check if plus without operandOne
			{
				operandOne = Double.parseDouble(sDisplay);
				sDisplay = "";
				operation = '+';
				isPlus = true;
				sRawInput += " + ";
				tfRawInput.setText(sRawInput);
				if(isPoint)
				{
					tfDisplay.setText(""+operandOne);
				}
				else if(!isPoint)//when there is no userPoint in the result
				{
					tfDisplay.setText(""+(long)operandOne);
				}
			}
			else if(isOperation && operation != '=')
			{
				operandTwo  = Double.parseDouble(sDisplay);
				
				if(operation == '+')
				{
					result = operandOne + operandTwo;
				}
				else if(operation == '-')
				{
					result = operandOne - operandTwo;
				}
				else if(operation == '*')
				{
					result = operandOne * operandTwo;
				}
				else if(operation == '/')
				{
					result = operandOne / operandTwo;
				}
				else if(operation == '%')
				{
					result = operandOne % operandTwo;
				}
				else
				{
					result = operandTwo;
				}
				String temp = "";
				if(isPoint || operation == '/')
				{
					tfDisplay.setText(""+result);
					temp = ""+result;
				}
				else if(!isPoint)//when there is no userPoint in the result
				{
					tfDisplay.setText(""+(long)result);
					temp = ""+(long)result;
				}
				operation = '+';
				sDisplay = "";
				operandOne = result;
				isPlus = true;
				isPoint = false;
				isOperation = true;
				sRawInput += " + ";
				tfRawInput.setText(sRawInput);
				sRawInput = temp + " + ";
			}
			else if(operation == '=')
			{
				sDisplay = "";
				operation = '+';
				isPlus = true;
				isOperation = true;
				sRawInput += " + ";
				tfRawInput.setText(sRawInput);
			}
			isOperation = true;
		}
		else if (e.getSource() == uSubt && (!sDisplay.equals("") || operation == '='))  // - button is clicked and input is not empty
		{
			if(!isOperation)//to check if plus without operandOne
			{
				operandOne = Double.parseDouble(sDisplay);
				sDisplay = "";
				operation = '-';
				isPlus = true;
				sRawInput += " - ";
				tfRawInput.setText(sRawInput);
				if(isPoint)
				{
					tfDisplay.setText(""+operandOne);
				}
				else if(!isPoint)//when there is no userPoint in the result
				{
					tfDisplay.setText(""+(long)operandOne);
				}
			}
			else if(isOperation && operation != '=')
			{
				operandTwo  = Double.parseDouble(sDisplay);
				
				if(operation == '+')
				{
					result = operandOne + operandTwo;
				}
				else if(operation == '-')
				{
					result = operandOne - operandTwo;
				}
				else if(operation == '*')
				{
					result = operandOne * operandTwo;
				}
				else if(operation == '/')
				{
					result = operandOne / operandTwo;
				}
				else if(operation == '%')
				{
					result = operandOne % operandTwo;
				}
				else
				{
					result = operandTwo;
				}
				String temp = "";
				if(isPoint || operation == '/')
				{
					tfDisplay.setText(""+result);
					temp = ""+result;
				}
				else if(!isPoint)//when there is no userPoint in the result
				{
					tfDisplay.setText(""+(long)result);
					temp = ""+(long)result;
				}
				operation = '-';
				sDisplay = "";
				operandOne = result;
				isPlus = true;
				isPoint = false;
				isOperation = true;
				sRawInput += " - ";
				tfRawInput.setText(sRawInput);
				sRawInput = temp + " + ";
			}
			else if(operation == '=')
			{
				sDisplay = "";
				operation = '-';
				isPlus = true;
				isOperation = true;
				sRawInput += " - ";
				tfRawInput.setText(sRawInput);
			}
			isOperation = true;
		}
		else if (e.getSource() == Multiply && (!sDisplay.equals("") || operation == '='))  // * button is clicked and input is not empty
		{
			if(!isOperation)//to check if plus without operandOne
			{
				operandOne = Double.parseDouble(sDisplay);
				sDisplay = "";
				operation = '*';
				isPlus = true;
				sRawInput += " \u00D7 ";
				tfRawInput.setText(sRawInput);
				if(isPoint)
				{
					tfDisplay.setText(""+operandOne);
				}
				else if(!isPoint)//when there is no userPoint in the result
				{
					tfDisplay.setText(""+(long)operandOne);
				}
			}
			else if(isOperation && operation != '=')
			{
				operandTwo  = Double.parseDouble(sDisplay);
				
				if(operation == '+')
				{
					result = operandOne + operandTwo;
				}
				else if(operation == '-')
				{
					result = operandOne - operandTwo;
				}
				else if(operation == '*')
				{
					result = operandOne * operandTwo;
				}
				else if(operation == '/')
				{
					result = operandOne / operandTwo;
				}
				else if(operation == '%')
				{
					result = operandOne % operandTwo;
				}
				else
				{
					result = operandTwo;
				}
				String temp = "";
				if(isPoint || operation == '/')
				{
					tfDisplay.setText(""+result);
					temp = ""+result;
				}
				else if(!isPoint)//when there is no userPoint in the result
				{
					tfDisplay.setText(""+(long)result);
					temp = ""+(long)result;
				}
				operation = '*';
				sDisplay = "";
				operandOne = result;
				isPlus = true;
				isPoint = false;
				isOperation = true;
				sRawInput += " \u00D7 ";
				tfRawInput.setText(sRawInput);
				sRawInput = temp + " \u00D7 ";
			}
			else if(operation == '=')
			{
				sDisplay = "";
				operation = '*';
				isPlus = true;
				isOperation = true;
				sRawInput += " \u00D7 ";
				tfRawInput.setText(sRawInput);
			}
			isOperation = true;
		}
		else if (e.getSource() == Divide && (!sDisplay.equals("") || operation == '=')) 
		{
			if(!isOperation)//to check if plus without operandOne
			{
				operandOne = Double.parseDouble(sDisplay);
				sDisplay = "";
				operation = '/';
				isPlus = true;
				sRawInput += " / ";
				tfRawInput.setText(sRawInput);
				if(isPoint)
				{
					tfDisplay.setText(""+operandOne);
				}
				else if(!isPoint)//when there is no userPoint in the result
				{
					tfDisplay.setText(""+(long)operandOne);
				}
			}
			else if(isOperation && operation != '=')
			{
				operandTwo  = Double.parseDouble(sDisplay);
				
				if(operation == '+')
				{
					result = operandOne + operandTwo;
				}
				else if(operation == '-')
				{
					result = operandOne - operandTwo;
				}
				else if(operation == '*')
				{
					result = operandOne * operandTwo;
				}
				else if(operation == '/')
				{
					result = operandOne / operandTwo;
				}
				else if(operation == '%')
				{
					result = operandOne % operandTwo;
				}
				else
				{
					result = operandTwo;
				}
				String temp = "";
				if(isPoint || operation == '/')
				{
					tfDisplay.setText(""+result);
					temp = ""+result;
				}
				else if(!isPoint)//when there is no userPoint in the result
				{
					tfDisplay.setText(""+(long)result);
					temp = ""+(long)result;
				}
				operation = '*';
				sDisplay = "";
				operandOne = result;
				isPlus = true;
				isPoint = false;
				isOperation = true;
				sRawInput += " / ";
				tfRawInput.setText(sRawInput);
				sRawInput = temp + " / ";
			}
			else if(operation == '=')
			{
				sDisplay = "";
				operation = '/';
				isPlus = true;
				isOperation = true;
				sRawInput += " / ";
				tfRawInput.setText(sRawInput);
			}
			isOperation = true;
		} 
		else if (e.getSource() == Mod && (!sDisplay.equals("") || operation == '='))//Modules button
		{
			if(!isOperation)//to check if plus without operandOne
			{
				operandOne = Double.parseDouble(sDisplay);
				sDisplay = "";
				operation = '%';
				isPlus = true;
				sRawInput += " mod ";
				tfRawInput.setText(sRawInput);
				if(isPoint)
				{
					tfDisplay.setText(""+operandOne);
				}
				else if(!isPoint)//when there is no userPoint in the result
				{
					tfDisplay.setText(""+(long)operandOne);
				}
			}
			else if(isOperation && operation != '=')
			{
				operandTwo  = Double.parseDouble(sDisplay);
				
				if(operation == '+')
				{
					result = operandOne + operandTwo;
				}
				else if(operation == '-')
				{
					result = operandOne - operandTwo;
				}
				else if(operation == '*')
				{
					result = operandOne * operandTwo;
				}
				else if(operation == '/')
				{
					result = operandOne / operandTwo;
				}
				else if(operation == '%')
				{
					result = operandOne % operandTwo;
				}
				else
				{
					result = operandTwo;
				}
				String temp = "";
				if(isPoint || operation == '/')
				{
					tfDisplay.setText(""+result);
					temp = ""+result;
				}
				else if(!isPoint)//when there is no userPoint in the result
				{
					tfDisplay.setText(""+(long)result);
					temp = ""+(long)result;
				}
				operation = '%';
				sDisplay = "";
				operandOne = result;
				isPlus = true;
				isPoint = false;
				isOperation = true;
				sRawInput += " mod ";
				tfRawInput.setText(sRawInput);
				sRawInput = temp + " * ";
			}
			else if(operation == '=')
			{
				sDisplay = "";
				operation = '%';
				isPlus = true;
				isOperation = true;
				sRawInput += " mod ";
				tfRawInput.setText(sRawInput);
			}
			isOperation = true;
		}
		else if (e.getSource() == userEqual && !sDisplay.equals(""))
		{
			operandTwo  = Double.parseDouble(sDisplay);
			
			if(operation == '+')
			{
				result = operandOne + operandTwo;
			}
			else if(operation == '-')
			{
				result = operandOne - operandTwo;
			}
			else if(operation == '*')
			{
				result = operandOne * operandTwo;
			}
			else if(operation == '/')
			{
				result = operandOne / operandTwo;
			}
			else if(operation == '%')
			{
				result = operandOne % operandTwo;
			}
			else
			{
				result = operandTwo;
			}
			String temp = "";
			if(isPoint || operation == '/')
			{
				tfDisplay.setText(""+result);
				temp = ""+result;
			}
			else if(!isPoint)//when there is no userPoint in the result
			{
				tfDisplay.setText(""+(long)result);
				temp = ""+(long)result;
			}
			sDisplay = "";
			operandOne = result;
			isPlus = true;
			isPoint = false;
			isOperation = true;
			sRawInput += " = ";
			tfRawInput.setText(sRawInput);
			sRawInput = temp;
			operation = '=';
		}
		else if (e.getSource() == userDE && !sDisplay.equals(""))//DE button
		{
			sDisplay = sDisplay.substring(0, sDisplay.length()-1);
			sRawInput = sRawInput.substring(0, sRawInput.length()-1);
			if(sRawInput.equals(""))//after deleting the last digit
			{
				//tfDisplay.setText("0");
				tfRawInput.setText("0");
			}
			else 
			{
				//tfDisplay.setText(sDisplay);
				tfRawInput.setText(sRawInput);
			}
		} 
		else if (e.getSource() == userErase)//Clear button
		{
			operandOne = operandTwo = result = 0;
			sDisplay = "";
			operation = ' ';
			tfDisplay.setText("0");
			isPoint = false;
			isPlus = true;
			isOperation = false;
			sRawInput = "";
			tfRawInput.setText("0");
		} 
		else if (e.getSource() == userSquare && !sDisplay.equals(""))//Square button
		{
			operandOne = Double.parseDouble(sDisplay);
			result = Math.pow(operandOne, 2);
			String temp = "";
			if(!isPoint)
			{
				tfDisplay.setText(""+(long)result);
				temp = ""+(long)result;
			}
			else 
			{
				tfDisplay.setText(""+result);
				temp = ""+result;
			}
			sRawInput += "^2 = ";
			tfRawInput.setText(sRawInput);
			sRawInput = temp;
			sDisplay = "";
			operandOne = result;
			operation = '=';
			isPoint = false;
			isOperation = true;
			isPlus = true;
		} 
		else if (e.getSource() == userSqrt && !sDisplay.equals(""))//root button
		{
			operandOne = Double.parseDouble(sDisplay);
			result = Math.sqrt(operandOne);
			sRawInput =  "\u221A" + sRawInput;
			tfRawInput.setText(sRawInput);
			tfDisplay.setText(""+result);
			sRawInput = ""+result;
			sDisplay = "";
			operandOne = result;
			operation = '=';
			isPoint = true;
			isOperation = true;
			isPlus = true;
		}
		else if (e.getSource() == userCube && !sDisplay.equals("")) //Cube button
		{
			operandOne = Double.parseDouble(sDisplay);
			result = Math.pow(operandOne, 3);
			String temp = "";
			if(!isPoint)
			{
				tfDisplay.setText(""+(long)result);
				temp = ""+(long)result;
			}
			else 
			{
				tfDisplay.setText(""+result);
				temp = ""+result;
			}
			sRawInput +="^3 = ";
			tfRawInput.setText(sRawInput);
			sRawInput = temp;
			sDisplay = "";
			operandOne = result;
			operation = '=';
			isPoint = false;
			isOperation = true;
			isPlus = true;
			
		}
		else if (e.getSource() == userOneByN && !sDisplay.equals(""))// 1/n button
		{
			operandOne = Double.parseDouble(sDisplay);
			result = 1 / operandOne;
			if(isPoint)
			{
				sRawInput = "1 / " + operandOne;
			}
			else 
			{
				sRawInput = "1 / " + (long)operandOne;
			}
			tfRawInput.setText(sRawInput);
			tfDisplay.setText(""+result);
			sDisplay = "";
			sRawInput = ""+result;
			operandOne = result;
			operation = '=';
			isPoint = true;
			isOperation = true;
			isPlus = true;
		}
		else if(e.getSource() == userPercent && !sDisplay.equals("") && operation=='*')// % button is pressed
		{
			operandTwo  = Double.parseDouble(sDisplay);
			result = operandOne * (operandTwo / 100);
			sRawInput = operandOne+" \u00D7 "+operandTwo+"%";
			tfRawInput.setText(sRawInput);
			tfDisplay.setText(""+result);
			sDisplay = "";
			operandOne = result;
			operation = '=';
			isPlus = true;
			isOperation = true;
			isPoint = true;
			sRawInput = ""+result;
		}
		else if(e.getSource() == Sin && !sDisplay.equals(""))//sin 
		{
			operandOne = Double.parseDouble(sDisplay);
			if(operandOne == 30)
			{
				result = Math.sin(Math.toRadians(operandOne)) + 0.0000000000000001;
			}
			else
			{
				result = Math.sin(Math.toRadians(operandOne));
			}
			sRawInput =  "sin("+sRawInput+")";
			tfRawInput.setText(sRawInput);
			tfDisplay.setText(""+result);
			sRawInput = ""+result;
			sDisplay = "";
			operandOne = result;
			operation = '=';
			isPoint = true;
			isOperation = true;
			isPlus = true;
		}
		else if(e.getSource() == Cos && !sDisplay.equals(""))//cosine 
		{
			operandOne = Double.parseDouble(sDisplay);
			if(operandOne == 60)
			{
				result = Math.cos(Math.toRadians(operandOne)) - 0.0000000000000001;
			}
			else if (operandOne == 90)
			{
				result = 0;
			}
			else 
			{
				result = Math.cos(Math.toRadians(operandOne));
			}
			sRawInput =  "cos("+sRawInput+")";
			tfRawInput.setText(sRawInput);
			tfDisplay.setText(""+result);
			sRawInput = ""+result;
			sDisplay = "";
			operandOne = result;
			operation = '=';
			isPoint = true;
			isOperation = true;
			isPlus = true;
		}
		else if(e.getSource() == Tan && !sDisplay.equals(""))//tan 
		{
			operandOne = Double.parseDouble(sDisplay);
			if(operandOne == 45)
			{
				result = Math.tan(Math.toRadians(operandOne)) + 0.0000000000000001;
			}
			else if(operandOne == 90)
			{
				result = 0;
				tfDisplay.setText("Invalid");
			}
			else
			{
				result = Math.tan(Math.toRadians(operandOne));
			}
			sRawInput =  "tan("+sRawInput+")";
			tfRawInput.setText(sRawInput);
			if(operandOne != 90)
			{
				tfDisplay.setText(""+result);
			}
			sRawInput = ""+result;
			sDisplay = "";
			operandOne = result;
			operation = '=';
			isPoint = true;
			isOperation = true;
			isPlus = true;
		}
		else if(e.getSource() == SinH && !sDisplay.equals(""))//sinh 
		{
			operandOne = Double.parseDouble(sDisplay);
			result = Math.sinh(Math.toRadians(operandOne));
			sRawInput =  "sinh("+sRawInput+")";
			tfRawInput.setText(sRawInput);
			tfDisplay.setText(""+result);
			sRawInput = ""+result;
			sDisplay = "";
			operandOne = result;
			operation = '=';
			isPoint = true;
			isOperation = true;
			isPlus = true;
		}
		else if(e.getSource() == CosH && !sDisplay.equals(""))//cosh 
		{
			operandOne = Double.parseDouble(sDisplay);
			result = Math.cosh(Math.toRadians(operandOne));
			sRawInput =  "cosh("+sRawInput+")";
			tfRawInput.setText(sRawInput);
			tfDisplay.setText(""+result);
			sRawInput = ""+result;
			sDisplay = "";
			operandOne = result;
			operation = '=';
			isPoint = true;
			isOperation = true;
			isPlus = true;
		}
		else if(e.getSource() == TanH && !sDisplay.equals(""))//tanh function
		{
			operandOne = Double.parseDouble(sDisplay);
			result = Math.tanh(Math.toRadians(operandOne));
			sRawInput =  "tanH("+sRawInput+")";
			tfRawInput.setText(sRawInput);
			tfDisplay.setText(""+result);
			sRawInput = ""+result;
			sDisplay = "";
			operandOne = result;
			operation = '=';
			isPoint = true;
			isOperation = true;
			isPlus = true;
		}
		else if(e.getSource() == Asin && !sDisplay.equals(""))//asin function
		{
			operandOne = Double.parseDouble(sDisplay);
			result = Math.asin(Math.toRadians(operandOne));
			sRawInput =  "asin("+sRawInput+")";
			tfRawInput.setText(sRawInput);
			tfDisplay.setText(""+result);
			sRawInput = ""+result;
			sDisplay = "";
			operandOne = result;
			operation = '=';
			isPoint = true;
			isOperation = true;
			isPlus = true;
		}
		else if(e.getSource() == Acos && !sDisplay.equals(""))//acos function
		{
			operandOne = Double.parseDouble(sDisplay);
			result = Math.acos(Math.toRadians(operandOne));
			sRawInput =  "acos("+sRawInput+")";
			tfRawInput.setText(sRawInput);
			tfDisplay.setText(""+result);
			sRawInput = ""+result;
			sDisplay = "";
			operandOne = result;
			operation = '=';
			isPoint = true;
			isOperation = true;
			isPlus = true;
		}
		else if(e.getSource() == Atan && !sDisplay.equals(""))//atan function
		{
			operandOne = Double.parseDouble(sDisplay);
			result = Math.atan(Math.toRadians(operandOne));
			sRawInput =  "atan("+sRawInput+")";
			tfRawInput.setText(sRawInput);
			tfDisplay.setText(""+result);
			sRawInput = ""+result;
			sDisplay = "";
			operandOne = result;
			operation = '=';
			isPoint = true;
			isOperation = true;
			isPlus = true;
		}
		else if(e.getSource() == Log && !sDisplay.equals(""))//log function
		{
			operandOne = Double.parseDouble(sDisplay);
			result = Math.log10(operandOne);
			sRawInput =  "log"+sRawInput;
			tfRawInput.setText(sRawInput);
			tfDisplay.setText(""+result);
			sRawInput = ""+result;
			sDisplay = "";
			operandOne = result;
			operation = '=';
			isPoint = true;
			isOperation = true;
			isPlus = true;
		}
		else if(e.getSource() == naturalLog && !sDisplay.equals(""))//ln function
		{
			operandOne = Double.parseDouble(sDisplay);
			result = Math.log(operandOne);
			sRawInput =  "ln"+sRawInput;
			tfRawInput.setText(sRawInput);
			tfDisplay.setText(""+result);
			sRawInput = ""+result;
			sDisplay = "";
			operandOne = result;
			operation = '=';
			isPoint = true;
			isOperation = true;
			isPlus = true;
		}
		else if(e.getSource() == Abs && !sDisplay.equals(""))//abs function
		{
			operandOne = Double.parseDouble(sDisplay);
			result = Math.abs(operandOne);
			sRawInput =  "abs("+sRawInput+")";
			tfRawInput.setText(sRawInput);
			tfDisplay.setText(""+result);
			sRawInput = ""+result;
			sDisplay = "";
			operandOne = result;
			operation = '=';
			isPoint = true;
			isOperation = true;
			isPlus = true;
		}
		else if(e.getSource() == PowerOfTen && !sDisplay.equals(""))//power of ten function
		{
			operandOne = Double.parseDouble(sDisplay);
			result = Math.pow(10, operandOne);
			sRawInput =  "10^"+sRawInput;
			tfRawInput.setText(sRawInput);
			tfDisplay.setText(""+result);
			sRawInput = ""+result;
			sDisplay = "";
			operandOne = result;
			operation = '=';
			isPoint = true;
			isOperation = true;
			isPlus = true;
		}
		else if(e.getSource() == userExit)//exit button
		{
			System.exit(0);
		}
	}
}