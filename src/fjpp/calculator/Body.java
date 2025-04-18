package fjpp.calculator;

import javax.swing.*;
import java.awt.*;

public class Body {
	
	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] operationButtons = new JButton[9];
	JButton sumButton, subButton, multButton, divButton;
	JButton decButton, clButton, delButton, negButton, equalsButton;
	JPanel topPanel;
	JPanel botPanel;
	
	public Body() {
		
	frame = new JFrame("Calculator");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(420, 550);
	frame.setLayout(null);
	
	textfield = new JTextField();
	textfield.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 28));
	textfield.setBounds(50, 25, 300, 50);
	textfield.setEditable(false);
	
	sumButton = new JButton("+");
	subButton = new JButton("-");
	multButton = new JButton("*");
	divButton = new JButton("/");
	decButton = new JButton(".");
	clButton = new JButton("CE");
	delButton = new JButton("DEL");
	negButton = new JButton("±");
	equalsButton = new JButton("=");
	
	operationButtons[0] = sumButton;
	operationButtons[1] = subButton;
	operationButtons[2] = multButton;
	operationButtons[3] = divButton;
	operationButtons[4] = decButton;
	operationButtons[5] = clButton;
	operationButtons[6] = delButton;
	operationButtons[7] = negButton;
	operationButtons[8] = equalsButton;
	
	for (int i = 0; i < 10; i++) {
		numberButtons[i] = new JButton(String.valueOf(i));
	}
	
	topPanel = new JPanel();

	topPanel.setBounds(50, 100, 300, 300);

	topPanel.setLayout(new GridLayout(4,4,10,10));

	topPanel.add(numberButtons[1]);
	topPanel.add(numberButtons[2]);
	topPanel.add(numberButtons[3]);
	topPanel.add(sumButton);
	topPanel.add(numberButtons[4]);
	topPanel.add(numberButtons[5]);
	topPanel.add(numberButtons[6]);
	topPanel.add(subButton);
	topPanel.add(numberButtons[7]);
	topPanel.add(numberButtons[8]);
	topPanel.add(numberButtons[9]);
	topPanel.add(multButton);
	topPanel.add(decButton);
	topPanel.add(numberButtons[0]);
	topPanel.add(negButton);
	topPanel.add(divButton);
	
	botPanel = new JPanel();

	botPanel.setBounds(50, 410, 300, 50);

	botPanel.setLayout(new GridLayout(1,3,10,10));
	
	botPanel.add(delButton);
	botPanel.add(clButton);
	botPanel.add(equalsButton);
	
	frame.setVisible(true);
	frame.add(topPanel);
	frame.add(botPanel);
	frame.add(textfield);
	
	Logic logic = new Logic(this);
	
	}
	
}
