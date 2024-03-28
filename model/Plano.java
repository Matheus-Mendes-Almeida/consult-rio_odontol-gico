package model;

// Matheus Mendes Almeida, 2411431
// Engenharia de Software

public class Plano {
	// Atributos
	private String nome;
	private int registro;
	
	// Construtores
	public Plano(String nome, int registro) {
		this.nome = nome;
		setRegistro(registro);
	}
        
        public Plano(){}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		if(registro > 0)
			this.registro = registro;
		else
			this.registro = 0;
	}
}
