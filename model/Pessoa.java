package model;

// Matheus Mendes Almeida, 2411431

import exception.PesCpfInvalidException;

// Engenharia de Software

public abstract class Pessoa {
	// Atributos
	protected long cpf;
	protected String nome;
	protected Data dataNasc;
	protected Telefone telefone;
	protected Endereco endereco;
	
	// Construtores
	public Pessoa(long cpf, String nome, int dia, int mes, int ano, int ddd, int numTel, String estado, String cidade, String bairro, String rua, int numEnd, String complemento) {
		try {
			setCpf(cpf);
		} catch (PesCpfInvalidException e) {
			e.printError();
			//e.fixCpfInvalid(this);
		}
		setNome(nome);
		setDataNasc(dia, mes, ano);
		setTelefone(ddd, numTel);
		setEndereco(estado, cidade, bairro, rua, numEnd, complemento);	
	}
	
	public Pessoa() {}

	// Getters and Setters
	public long getCpf() {
		return cpf;
	}
	
	public void setCpf(long cpf) throws PesCpfInvalidException{
		if(cpf > 0 && Long.toString(cpf).length() == 11)
			this.cpf = cpf;
		else
			throw new PesCpfInvalidException();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Data getdataNasc() {
		return dataNasc;
	}
	
	public void setDataNasc(int dia, int mes, int ano) {
		this.dataNasc = new Data(dia, mes, ano);
	}
	
	public void setDataNasc() {
		this.dataNasc = new Data();
	}
	
	public Telefone getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int ddd, int numero){
		this.telefone = new Telefone(ddd, numero);
	}
	
	public void setTelefone() {
		this.telefone = new Telefone();
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String estado, String cidade, String bairro, String rua, int numero, String complemento) {
		if(!"".equals(complemento))
			this.endereco = new Endereco(estado, cidade, bairro, rua, numero, null);
		else
			this.endereco = new Endereco(estado, cidade, bairro, rua, numero, complemento);
	}
	
	public void setEndereco() {
		this.endereco = new Endereco();
	}
	
}
