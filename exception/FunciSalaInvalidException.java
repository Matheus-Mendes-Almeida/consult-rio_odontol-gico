package exception;

// Matheus Mendes Almeida, 2411431
// Engenharia de Software

import javax.swing.JOptionPane;
import model.Dentista;
import model.Funcionario;

@SuppressWarnings("serial")
public class FunciSalaInvalidException extends Exception{
	
    public void printError(Funcionario funcionario) {
	if(funcionario instanceof Dentista) {
            JOptionPane.showMessageDialog(null, "O salário mínimo possível é R$1000,00.");
	} else
             JOptionPane.showMessageDialog(null, "O salário mínimo possível é R$500,00.");
    }
}
