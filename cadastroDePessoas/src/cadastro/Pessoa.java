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
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome() {
		this.nome = nome;

	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
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
