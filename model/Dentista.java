package model;

// Matheus Mendes Almeida, 2411431

import exception.FunciSalaInvalidException;

// Engenharia de Software

public final class Dentista extends Funcionario implements PadroesFunci{
	// Atributos
	private int crm;
	private String especializacao;
	
	// Construtores
	public Dentista() {
		super();
	}

	public Dentista(long cpf, String nome, int dia, int mes, int ano, int ddd, int numTel, String estado, String cidade,
			String bairro, String rua, int numEnd, String complemento, int codigo, int diaAss, int mesAss, int anoAss,
			double salario, int crm, String especializacao) {
		super(cpf, nome, dia, mes, ano, ddd, numTel, estado, cidade, bairro, rua, numEnd, complemento, codigo, diaAss, mesAss,
				anoAss, salario);
		setCrm(crm);
		setEspecializacao(especializacao);
	}

	// Getters and Setters
	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
	@Override
	public void setSalario(double salario) throws FunciSalaInvalidException{
		if(salario >= 1000.00)
			this.salario = salario;
		else
			throw new FunciSalaInvalidException();
	}
	
	//Methods
	@Override
	public void ajustarSalario(int modificador) {
		try {
			setSalario(salario + modificador);
		} catch (FunciSalaInvalidException e) {
			e.printError(this);
		}
	}
	
	@Override
	public String gerarCredencial() {
		
		return String.format("%s: %s\nCRM: %d\nCodigo: %d", nome, especializacao, crm, codigo);
	}

	
	
}
