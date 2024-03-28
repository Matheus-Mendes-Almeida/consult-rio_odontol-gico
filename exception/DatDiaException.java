package exception;

// Matheus Mendes Almeida, 2411431
// Engenharia de Software

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class DatDiaException extends Exception{
	
	public void printError() {
            JOptionPane.showMessageDialog(null, "O dia deve ser válido.");
	}
}
