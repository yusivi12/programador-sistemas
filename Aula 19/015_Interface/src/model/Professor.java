package model;

public class Professor extends Usuario implements IUsuario {
	private int matriculaProfessor;
	private String nome;
	private String seguimento;

	public int getMatricula() {
		return matriculaProfessor;
	}

	public void setMatricula(int matriculaProfessor) {
		this.matriculaProfessor = matriculaProfessor;
	}

	public String getSeguimento() {
		return seguimento;
	}

	public void setSeguimento(String seguimento) {
		this.seguimento = seguimento;
	}

	public Professor() {
		super();
	}

	public Professor(String login, String senha, int tipo, int matriculaProfessor, String nome, String seguimento) {
		super(login, senha, tipo);
		this.matriculaProfessor = matriculaProfessor;
		this.nome = nome;
		this.seguimento = seguimento;
	}

	@Override
	public void mostrar() {

		System.out.println("Informações do professor: ");
		System.out.println("Login: " + super.getLogin());
		System.out.println("Senha: *****");

		System.out.println("Matrícula: " + matriculaProfessor);
		System.out.println("Nome: " + nome);
	}

	// Professor prof = new Professor(); - Errado aqui!

	@Override
	public boolean validarLogin(String login, String senha) {
		if (getLogin().equals(login) && getSenha().equals(senha)) {
			return true;
		}
		return false;
	}
}