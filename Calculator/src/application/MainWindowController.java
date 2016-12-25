package application;

import java.math.BigDecimal;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainWindowController {
	private static final int ADDITION = 1;
	private static final int SUBTRACTION = 2;
	private static final int MULTYPLYCATION = 3;
	private static final int DIVISION = 4;
	private Boolean check = false;
	private BigDecimal result = new BigDecimal(0);
	private int operator = 0;
	@FXML
	private Label labelText;

	public void buttonDivisionPressed() {
		if (result.equals(new BigDecimal(0))) {
			result = new BigDecimal(labelText.getText());
			labelText.setText("");
			operator = DIVISION;
			return;
		}
		change();
		operator = DIVISION;
	}

	public void buttonMultyplyPressed() {
		if (result.equals(new BigDecimal(0))) {
			result = new BigDecimal(labelText.getText());
			labelText.setText("");
			operator = MULTYPLYCATION;
			return;
		}
		change();
		operator = MULTYPLYCATION;

	}

	public void buttonSubtractionPressed() {
		if (result.equals(new BigDecimal(0))) {
			result = new BigDecimal(labelText.getText());
			labelText.setText("");
			operator = SUBTRACTION;
			return;
		}
		change();
		operator = SUBTRACTION;

	}

	public void buttonAdditionPressed() {
		if (result.equals(new BigDecimal(0))) {
			result = new BigDecimal(labelText.getText());
			labelText.setText("");
			operator = ADDITION;
			return;
		}
		change();
		operator = ADDITION;

	}

	public void buttonEqualsPressed() throws InterruptedException {
		if (check == true) {
			return;
		}
		switch (operator) {
		case ADDITION:
			try {
				result = result.add(new BigDecimal(labelText.getText()));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case SUBTRACTION:
			try {
				result = result.subtract(new BigDecimal(labelText.getText()));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case MULTYPLYCATION:
			try {
				result = result.multiply(new BigDecimal(labelText.getText()));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case DIVISION:
			try {
				result = result.divide(new BigDecimal(labelText.getText()), 5, BigDecimal.ROUND_HALF_UP)
						.stripTrailingZeros();
			} catch (NumberFormatException f) {
				f.printStackTrace();
				
			}
			
			catch (ArithmeticException e) {
				System.out.println("Here");
				labelText.setText("No division by 0 ");
				return;
			}
			break;
		default: result = new BigDecimal(labelText.getText());
		break;
		}

		labelText.setText(result.toString());
		check = true;
	}

	public void buttonComaPressed() {
		if (check == true) {
			clear();
			check = false;
		}

		for (Character c : labelText.getText().toCharArray()) {
			if (c.equals('.')) {
				return;
			}
		}
		labelText.setText(labelText.getText() + ".");
	}

	public void buttonAcPressed() {
		clear();
	}

	public void buttonOnePressed() {
		if (check == true) {
			clear();
			check = false;
		}

		if (labelText.getText().equals("0")) {
			labelText.setText("1");
			return;
		}
		labelText.setText(labelText.getText() + "1");
	}

	public void buttonTwoPressed() {
		if (check == true) {
			clear();
			check = false;
		}

		if (labelText.getText().equals("0")) {
			labelText.setText("2");
			return;
		}
		labelText.setText(labelText.getText() + "2");
	}

	public void buttonThreePressed() {
		if (check == true) {
			clear();
			check = false;
		}

		if (labelText.getText().equals("0")) {
			labelText.setText("3");
			return;
		}
		labelText.setText(labelText.getText() + "3");
	}

	public void buttonFourPressed() {
		if (check == true) {
			clear();
			check = false;
		}

		if (labelText.getText().equals("0")) {
			labelText.setText("4");
			return;
		}
		labelText.setText(labelText.getText() + "4");
	}

	public void buttonFivePressed() {
		if (check == true) {
			clear();
			check = false;
		}

		if (labelText.getText().equals("0")) {
			labelText.setText("5");
			return;
		}
		labelText.setText(labelText.getText() + "5");
	}

	public void buttonSixPressed() {
		if (check == true) {
			clear();
			check = false;
		}

		if (labelText.getText().equals("0")) {
			labelText.setText("6");
			return;
		}
		labelText.setText(labelText.getText() + "6");
	}

	public void buttonSevenPressed() {
		if (check == true) {
			clear();
			check = false;
		}

		if (labelText.getText().equals("0")) {
			labelText.setText("7");
			return;
		}
		labelText.setText(labelText.getText() + "7");
	}

	public void buttonEightPressed() {
		if (check == true) {
			clear();
			check = false;
		}

		if (labelText.getText().equals("0")) {
			labelText.setText("8");
			return;
		}
		labelText.setText(labelText.getText() + "8");
	}

	public void buttonNinePressed() {
		if (check == true) {
			clear();
			check = false;
		}

		if (labelText.getText().equals("0")) {
			labelText.setText("9");
			return;
		}
		labelText.setText(labelText.getText() + "9");
	}

	public void buttonZeroPressed() {
		if (check == true) {
			clear();
			check = false;
		}

		if (labelText.getText().equals("0")) {
			return;
		}
		labelText.setText(labelText.getText() + "0");
	}

	public void clear() {
		labelText.setText("0");
		result = new BigDecimal(0);
		operator = 0;
	}

	public void change() {
		switch (operator) {
		case ADDITION:
			result = result.add(new BigDecimal(labelText.getText()));
			break;
		case SUBTRACTION:
			result = result.subtract(new BigDecimal(labelText.getText()));
			break;
		case MULTYPLYCATION:
			result = result.multiply(new BigDecimal(labelText.getText()));
			break;
		case DIVISION:
			try {
				result = result.divide(new BigDecimal(labelText.getText()));
			} catch (ArithmeticException e) {
				System.out.println("Here2");
				labelText.setText("Can't divide by 0!");
			}
			break;
		default:
			break;
		}
		labelText.setText("0");
	}

}
