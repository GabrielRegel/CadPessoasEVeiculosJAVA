package cadastro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pessoa[] pessoas = new Pessoa[100];
		Veiculo[] veiculos = new Veiculo[100];
		int contador = 0;
		int opcao;

		do {
			System.out.println("\n===== MENU =====");
			System.out.println("1 - Cadastrar pessoa");
			System.out.println("2 - Listar pessoas");
			System.out.println("3 - Cadastrar Veiculo");
			System.out.println("4 - Listar Veiculo");
			System.out.println("0 - Sair");
			System.out.println("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine(); //Limpa a linha
			
			switch (opcao) {
			case 1:
				System.out.println("Nome:  ");
				String nome = scanner.nextLine();
				scanner.nextLine();
				
				System.out.println("Idade: ");
				int idade = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Email: ");
				String email = scanner.nextLine();
				scanner.nextLine();
				
				System.out.println("Telefone: ");
				double telefone = scanner.nextDouble();
				scanner.nextLine();
				
				System.out.println("CPF: ");
				String cpf = scanner.nextLine();
				scanner.nextLine();
				
				pessoas[contador] = new Pessoa(nome, idade, email, cpf, telefone);
				contador++;
				System.out.println("Pessoa cadastrada com sucesso!");
				break;
				
			case 2:
				if (contador == 0) {
					System.out.println("Nenhuma pessoa cadstrada.");
				}else {
					for(int i=0; i<contador;i++) {
						pessoas[i].exibirDados();
					}
				}
				break;
			
				
			case 3:
				System.out.println("Marca:  ");
				String marca = scanner.nextLine();
				scanner.nextLine();
				
				System.out.println("Modelo:  ");
				String modelo = scanner.nextLine();
				scanner.nextLine();
				
				System.out.println("Placa:  ");
				String placa = scanner.nextLine();
				scanner.nextLine();
				
				System.out.println("Chassi:  ");
				String chassi = scanner.nextLine();
				scanner.nextLine();
				
				System.out.println("Ano:  ");
				int ano = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Quilometragem:  ");
				double quilometragem = scanner.nextDouble();
				scanner.nextLine();
				
				System.out.println("Cor:  ");
				String cor = scanner.nextLine();
				scanner.nextLine();
				
				veiculos[contador] = new Veiculo(marca, modelo, placa, chassi, ano, quilometragem, cor);
				contador++;
				System.out.println("Veiculo cadastrado com sucesso!");
				break;

			case 4:
				if (contador == 0) {
					System.out.println("Nenhuma Veiculo cadstrado.");
				}else {
					for(int i=0; i<contador;i++) {
						veiculos[i].exibirDados();
					}
				}
				break;
				
			case 0:
				System.out.println("Saindo...");
				break;
				
			default:
				System.out.println("Opção inválida.");
			}
		} while  (opcao != 0);
			scanner.close();
		
	
	}

}
