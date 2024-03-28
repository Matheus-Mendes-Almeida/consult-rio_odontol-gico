package model;

// Matheus Mendes Almeida, 2411431

import exception.TelDddLimitException;
import exception.TelDddNegException;
import exception.TelNumNegException;

// Engenharia de Software

public class Telefone {
	// Atributos
	private int ddd;
	private int numero;
	
	// Construtores
	public Telefone(){}
	
	public Telefone(int ddd, int numero){
		try {
			setDdd(ddd);
		} catch (TelDddNegException e) {
			e.printError();
		} catch (TelDddLimitException e) {
			e.printError();
		}
		
		try {
			setNumero(numero);
		} catch (TelNumNegException e) {
			e.printError();
		}
	}
	
	// Getters and Setters
	public int getDdd() {
		return ddd;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setDdd(int ddd) throws TelDddLimitException, TelDddNegException {
		if(ddd < 0)
			throw new TelDddNegException();
		else if (!(Integer.toString(ddd).length() >= 2 && Integer.toString(ddd).length() <= 3))
			throw new TelDddLimitException();
		else 
			this.ddd = ddd;	
	}
	
	public void setNumero(int numero) throws TelNumNegException {
		if(numero < 0)
			throw new TelNumNegException();
		else
			this.numero = numero;
	}
	
	// Methods
	public String imprimirTel() {
		return String.format("Telefone: (%d) %d", ddd, numero);
	}
}
