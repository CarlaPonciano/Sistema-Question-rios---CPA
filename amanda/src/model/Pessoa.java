package model;

public class Pessoa {

	private String nome="Nome padrão: Amanda";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public Pessoa() {
		super();
		this.nome = "Nome padrão: Amanda";
	}

}
