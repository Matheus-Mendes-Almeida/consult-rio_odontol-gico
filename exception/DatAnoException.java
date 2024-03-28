package exception;

// Matheus Mendes Almeida, 2411431
// Engenharia de Software

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class DatAnoException extends Exception{

	public void printError() {
            JOptionPane.showMessageDialog(null, "O ano deve ser válido.");
	}
}
