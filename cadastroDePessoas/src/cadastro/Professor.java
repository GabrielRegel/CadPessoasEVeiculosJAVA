package cadastro;

public class Professor extends Pessoa {
	private String diciplina;
	
	public Professor(String nome, int idade, String email, String diciplina) {
		super(nome, idade, email);
		this.diciplina = diciplina;
	}
	
	@Override
	public void exibirDados() {
		System.out.println("Professor: ");
		System.out.println(" | Nome: " + nome + " | Idade: " + idade + " | Email: " + email + " | Diciplina: " + diciplina);
		
	}
}
