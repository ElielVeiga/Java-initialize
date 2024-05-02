package Main;

import java.util.Scanner;

public class JavaInit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("seu nome é \n");
		String user  = sc.next();
		System.out.printf("Deseja adicionar produtos ao estoque %s  ? DIGITE 1 PARA SIM E 2 PARA NÃO \n", user);
		int opt = sc.nextInt();
		String Item = "";

		while (opt == 1) {
			System.out.printf("Adicione produtos ao seu estoque \n");
			System.out.printf("Nome do produto \n");
			String product = sc.next();
			System.out.printf("Código do produto \n");
			int codeProduct = sc.nextInt();
			System.out.printf("Quantidade do produto \n");
			int quatProduct = sc.nextInt();
			Item +=  product + " " + codeProduct + " " + quatProduct + "\n";
			System.out.printf("Você adicionou %s ou seu estoque com o código %d com %d unidades. \n", product, codeProduct, quatProduct);
			System.out.printf("Deseja adicionar mais produtos ao estoque %s  ? DIGITE 1 PARA SIM E 2 PARA NÃO \n", user);
			 opt = sc.nextInt();
		}
		
		System.out.printf("Para ver os produtos em estoque digite 3 \n", user);
		opt = sc.nextInt();
		
		if(opt == 3) {
			System.out.printf(Item);

		}else {
			System.out.printf("saindo...");

		}

				
		sc.close();
	}

}
