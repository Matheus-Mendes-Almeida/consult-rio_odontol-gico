package model;

// Matheus Mendes Almeida, 2411431

import exception.FunciSalaInvalidException;

// Engenharia de Software

public abstract class Funcionario extends Pessoa {
	// Atributos
	protected int codigo;
	protected double salario;
	protected Data dataDeAssoc;
	
	// Construtores
	public Funcionario() {
		super();
	}

	public Funcionario(long cpf, String nome, int dia, int mes, int ano, int ddd, int numTel, String estado,
					   String cidade, String bairro, String rua, int numEnd, String complemento, int codigo, int diaAss, int mesAss, int anoAss, double salario) {
		super(cpf, nome, dia, mes, ano, ddd, numTel, estado, cidade, bairro, rua, numEnd, complemento);
		setCodigo(codigo);
		try {
			setSalario(salario);
		} catch (FunciSalaInvalidException e) {
			e.printError(this);
		}
		setDataDeAssoc(diaAss, mesAss, anoAss);
	}
	
	// Getters and Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if(codigo > 0)
			this.codigo = codigo;
		else
			this.codigo = 0;
	}

	public Data getDataDeAssoc() {
		return dataDeAssoc;
	}

	public void setDataDeAssoc() {
		this.dataDeAssoc = new Data();
	}
	
	public void setDataDeAssoc(int dia, int mes, int ano) {
		this.dataDeAssoc = new Data(dia, mes, ano);
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) throws FunciSalaInvalidException{
		if(salario >= 500.00)
			this.salario = salario;
		else
			throw new FunciSalaInvalidException();
	}

	// Methods
	public abstract String gerarCredencial();
}
