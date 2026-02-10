package application;

import java.util.Locale;
import java.util.Scanner;

import util.Conversor;

public class Program4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a cotação do dólar: ");
		double cotacao = sc.nextDouble();
		
		System.out.println("Quantos dólares serão comprados?: ");
		double valor_comprado = sc.nextDouble();
		
		double reais = Conversor.conversorDolar(cotacao, valor_comprado);
		
		System.out.println("Valor a ser pago em reais: " + String.format("R$%.2f", reais));
		
		sc.close();
	}
}
