package exercicio_estoque;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Produto produto = new Produto();
		System.out.println("Insira os dados do produto:");
		
		System.out.println("Nome: ");
		produto.nome = sc.nextLine();
		
		System.out.println("Preço: ");
		produto.preco = sc.nextDouble();
		
		System.out.println("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println("Dados do produto: " + produto);
		
		System.out.println("Insira a quantidade de produtos que deseja adicionar no estoque:");
		int quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);
		
		System.out.println("Dados atualizados: " + produto);

		System.out.println("Insira a quantidade de produtos que deseja remover do estoque:");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println("Dados atualizados: " + produto);
		
		sc.close();
	}
}
