package cadastro;


public class Pessoa {

	private String nome;
	private int idade;
	private String email;
	private double telefone;
	private String cpf;

	
	
	public Pessoa(String nome, int idade, String email, String cpf, double telefone) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		
	}
	
	
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void exibirDados() {
		System.out.println("\n\n");
		System.out.println("----- Dados da Pessoa -----");
		System.out.println("Nome:     " + nome);
		System.out.println("Idade:    " + idade);
		System.out.println("Email:    " + email);
		System.out.println("Telefone: " + telefone);
		System.out.println("CPF:      " + cpf);
		System.out.println("\n\n");

	}
	
}
