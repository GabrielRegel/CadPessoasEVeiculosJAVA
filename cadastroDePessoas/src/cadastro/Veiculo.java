package cadastro;

public class Veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private String chassi;
	private int ano;
	private double quilometragem;
	private String cor;

	public Veiculo(String marca, String modelo, String placa, String chassi, int ano, double quilometragem, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.chassi =chassi;
		this.ano = ano;
		this.quilometragem = quilometragem;
		this.cor = cor;
	}
	
	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void exibirDados() {
		
		System.out.println("\n\n");
		System.out.println("----- Dados da Veiculos -----");
		System.out.println("Marca:         " + marca);
		System.out.println("Modelo:        " + modelo);
		System.out.println("Placa:         " + placa);
		System.out.println("Chassi:        " + chassi);
		System.out.println("Ano:           " + ano);
		System.out.println("Quilometragem: " + quilometragem);
		System.out.println("Cor:           " + cor);
		System.out.println("\n\n");
	}

	
}
