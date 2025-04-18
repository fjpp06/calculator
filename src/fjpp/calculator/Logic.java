package fjpp.calculator;

import java.awt.event.*;

public class Logic implements ActionListener{
	
	Body body;
	double num1;
	double num2;
	char operator;
	double result;
	
	
	public Logic(Body b) {
		this.body = b;
	
		for (int i = 0; i < 9; i++) {
			body.operationButtons[i].addActionListener(this);
		}
		
		for (int i = 0; i < 10; i++) {
			body.numberButtons[i].addActionListener(this);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		
		for (int i = 0; i < 10; i++) {
			if (e.getSource()==body.numberButtons[i]) {
				body.textfield.setText(body.textfield.getText() + i);
			}
		}
		
		if (e.getSource()==body.sumButton) {
			num1 = Double.parseDouble(body.textfield.getText());
			operator = '+';
			body.textfield.setText("");
		}
		
		if (e.getSource()==body.subButton) {
			num1 = Double.parseDouble(body.textfield.getText());
			operator = '-';
			body.textfield.setText("");
		}
		
		if (e.getSource()==body.multButton) {
			num1 = Double.parseDouble(body.textfield.getText());
			operator = '*';
			body.textfield.setText("");
		}
		
		if (e.getSource()==body.divButton) {
			num1 = Double.parseDouble(body.textfield.getText());
			operator = '/';
			body.textfield.setText("");
		}
		
		if (e.getSource()==body.decButton) {
			if (!body.textfield.getText().contains(".")) {
				body.textfield.setText(body.textfield.getText() + ".");
			}
		}
		
		if (e.getSource()==body.clButton) {
			body.textfield.setText("");
		}
		
		if (e.getSource()==body.delButton) {
			String currentText = body.textfield.getText();
			body.textfield.setText("");
			for (int i = 0; i < currentText.length() - 1; i++) {
				body.textfield.setText(body.textfield.getText() + currentText.charAt(i));
			}
		}
		
		if (e.getSource()==body.negButton) {
			body.textfield.setText(String.valueOf(Double.parseDouble(body.textfield.getText()) * -1));
		}
		
		if (e.getSource()==body.equalsButton) {
			num2 = Double.parseDouble(body.textfield.getText());
			
			switch(operator) {
				case '+': result = num1 + num2;
				break;
				case '-': result = num1 - num2;
				break;
				case '*': result = num1 * num2;
				break;
				case '/': result = num1 / num2;
				break;
			}
			body.textfield.setText(String.valueOf(result));
		}
	}
}
