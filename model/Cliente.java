package model;

// Matheus Mendes Almeida, 2411431
// Engenharia de Software

public class Cliente extends Pessoa{
	// Atributos
	int codigo;
	Plano plano;
	
	// Construtores
	public Cliente(long cpf, String nome, int dia, int mes, int ano, int ddd, int numTel, String estado, String cidade, String bairro, String rua, int numEnd, String complemento, int codigo, Plano plano) {
		super(cpf, nome, dia, mes, ano, ddd, numTel, estado, cidade, bairro, rua, numEnd, complemento);
		setCodigo(codigo);
		this.plano = plano;
	}

	public Cliente() {
		super();
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

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}
	
}
