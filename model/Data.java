package model;

// Matheus Mendes Almeida, 2411431

import exception.DatMesException;
import exception.DatAnoException;
import exception.DatDiaException;

// Engenharia de Software

public class Data {
	// Atributos
	private int dia;
	private int mes;
	private int ano;
	
	// Construtores
	Data(){}
	
	Data(int dia, int mes, int ano){
		try {
			setDia(dia);
		} catch (DatDiaException e) {
			e.printError();
		}
		try {
			setMes(mes);
		} catch (DatMesException e) {
			e.printError();
		}
		try {
			setAno(ano);
		} catch (DatAnoException e) {
			e.printError();
		}
	}
	
	// Getters and Setters
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) throws DatDiaException{
		if(dia > 0 && dia <= 31)
			this.dia = dia;
		else
			throw new DatDiaException();
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) throws DatMesException{
		if(mes > 0 && mes <= 12)
			this.mes = mes;
		else
			throw new DatMesException();
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) throws DatAnoException{
		if(ano >= 1900 && ano <= 2100)
			this.ano = ano;
		else
			throw new DatAnoException();
	}
	
	// Methods
	public void imprimirData() {
		System.out.printf("Data: %d/%d/%d", dia, mes, ano);
	}
}
