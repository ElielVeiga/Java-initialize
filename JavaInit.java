package Main;

import java.util.Scanner;

public class JavaInit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("seu nome é \n");
		String user  = sc.next();
		int opt = 0;
		System.out.printf("CADASTRAR PRODUTOS: 1 \n ESTOQUE DE PRODUTOS: 2 \n SAIR DE OPERAÇÕES: 3 \n");
		opt = sc.nextInt();
		String Item = "";
		while(opt != 4) {
			switch (opt) {
			case 1: {
				while (opt == 1) {
					System.out.printf("Adicione produtos ao seu estoque \n");
					System.out.printf("Nome do produto \n");
					String product = sc.next();
						if(product == null) {
							System.out.printf("Deseja adicionar mais produtos ao estoque %s  ? DIGITE 1 PARA SIM E 3 PARA NÃO e 2 PARA VER ESTOQUE \n", user);
							opt = sc.nextInt();
						}
					System.out.printf("Código do produto \n");
					int codeProduct = sc.nextInt();
					System.out.printf("Quantidade do produto \n");
					int quatProduct = sc.nextInt();
					Item +=  product + " | " + codeProduct + " | " + quatProduct + "\n";
					System.out.printf("Você adicionou %s ao seu estoque com o código %d com %d unidades. \n", product, codeProduct, quatProduct);
					System.out.printf("Deseja adicionar mais produtos ao estoque %s  ? DIGITE 1 PARA SIM E 3 PARA NÃO e 2 PARA VER ESTOQUE \n", user);
					 opt = sc.nextInt();
				}
			}
			case 2: {
				System.out.println("Nome |  Código | Quantidade");
				System.out.printf(Item);
				System.out.println("PESQUISAR PRODUTOS: 2 \n SAIR DO ESTOQUE: 3");
				 opt = sc.nextInt();
				 if(opt == 2) {
						System.out.println("Digite o nome ou código do produto");
						 opt = sc.nextInt();
				 }
			}
			case 3:{
				System.out.println("voltando para tela inicial...");

			}
			default:
				System.out.printf("aguarde");
			}
			System.out.printf("CADASTRAR PRODUTOS: 1 \n ESTOQUE DE PRODUTOS: 2 \n SAIR DE OPERAÇÕES: 3 \n");
			 opt = sc.nextInt();
			
		
		}
		
					
		sc.close();
	}

}
