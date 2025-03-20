package ContasBancarias;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta c = new Conta();
		CadastroDeContas cdc = new CadastroDeContas();

		System.out.println("BANCO MULA");
		System.out.println("CADASTRE AS SUAS CONTAS AQUI");
		System.out.print("Digite a capacidade maxima de contas: ");
        	int capacidade = scanner.nextInt();
        	scanner.nextLine(); 

		CadastroDeContas cadastro = new CadastroDeContas(capacidade);

		 while (true) {
            	    System.out.println("\nMenu:");
	            System.out.println("1 - Cadastrar conta");
	            System.out.println("2 - Verificar quantidade de contas cadastradas");
	            System.out.println("3 - Listar contas cadastradas");
	            System.out.println("4 - Sair");
	            System.out.print("Escolha uma opção: ");
	            int opcao = scanner.nextInt();
	            scanner.nextLine();

			 switch (opcao) {
                case 1:
                    System.out.print("Digite o número da conta: ");
                    String numeroConta = scanner.nextLine();

                    System.out.print("Digite o saldo inicial: ");
                    double saldo = scanner.nextDouble();
                    scanner.nextLine(); // Consumir quebra de linha

                    Conta novaConta = new Conta(saldo, numeroConta);
                    if (cadastro.cadastrarConta(novaConta)) {
                        System.out.println("Conta cadastrada com sucesso!");
                    }
                    break;

                case 2:
                    cadastro.verificarQtdContas();
                    break;

                case 3:
                    cadastro.verificarContas();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            	}
		}
		
		
		// do {
		// 	System.out.println("QUANTAS CONTAS DESEJA CADASTAR?(O MINIMO É 5) ");
		
		// }

	}

}
