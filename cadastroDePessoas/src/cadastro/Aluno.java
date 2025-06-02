package cadastro;

public class Aluno extends Pessoa {
	private String curso;
	private String sala;
	private int periodo;
	
	public Aluno(String nome, int idade, String email, String curso, double telefone, String cpf) {
		super(nome, idade, email, cpf, telefone);
		this.curso = curso;
		this.sala = sala;
		this.periodo = periodo;
	}
	
	public String getCurso() {
		return curso;
	}
	
	
	public void setCurso() {
		this.curso = curso;
	}
	
	
	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public void estudar() {
		System.out.println(getNome() + " esta estudando " + curso + ".");
	}
	
	@Override
	public void exibirDados() {
		System.out.println("Aluno: ");
		System.out.println(" | Nome: " + getNome() + " | Idade: " + getIdade() + " | Email: " + getEmail() + " | CPF: " + getCpf() + " | Telefone: " + getTelefone() + " | Curso: " + getCurso() + " | Sala: " + getSala() + " | Periodo: " + getPeriodo());
		
	}
}
