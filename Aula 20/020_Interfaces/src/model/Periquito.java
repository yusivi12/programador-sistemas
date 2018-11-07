package model;

public class Periquito implements Animal {
	private String nome;
	
	public Periquito(String nome) {
		this.nome = nome;
	}

	@Override
	public String seuNome() {
		return nome;
	}

	@Override
	public String seuBarulho() {
		return "Lor�!";
	}

}
