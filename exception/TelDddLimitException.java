package exception;

// Matheus Mendes Almeida, 2411431
// Engenharia de Software

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class TelDddLimitException extends Exception{
	
	public void printError() {
                JOptionPane.showMessageDialog(null, "O DDD deve ter entre dois e três dígitos.");
	}
}
