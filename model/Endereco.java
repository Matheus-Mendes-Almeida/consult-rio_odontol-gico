package model;

// Matheus Mendes Almeida, 2411431

import exception.EndeNumNegException;

// Engenharia de Software

public class Endereco {
	// Atributos
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private int numero;
	private String complemento = null;
	
	
	// Construtores
	public Endereco() {}
	
	public Endereco(String estado, String cidade, String bairro, String rua, int numero, String complemento) {
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		try {
			setNumero(numero);
		} catch (EndeNumNegException e) {
			e.printError();
		}
		this.complemento = complemento;
	}
	
	// Getters and Setters
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) throws EndeNumNegException{
		if(numero > 0)
			this.numero = numero;
		else
			throw new EndeNumNegException();
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	// Methods
	public void imprimirEnde() {
		if(complemento == null)
			System.out.printf("%s(%s): %s, s%, %d", cidade, estado, bairro, rua, numero);
		else
			System.out.printf("%s(%s): %s, s%, %d, %s", cidade, estado, bairro, rua, numero, complemento);
	}
}
