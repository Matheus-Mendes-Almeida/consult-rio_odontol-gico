package exception;

// Matheus Mendes Almeida, 2411431
// Engenharia de Software

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class PesCpfInvalidException extends Exception{

	public void printError() {
            JOptionPane.showMessageDialog(null, "O CPF não deve der negativo e deve conter 11 digitos.");
	}
}
