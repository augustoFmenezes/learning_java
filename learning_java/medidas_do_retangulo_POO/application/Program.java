package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Insira a altura do retângulo: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.println("Insira a largura do retângulo:");
		retangulo.largura = sc.nextDouble();
		
		double areaR = retangulo.areaRetangulo(retangulo.altura, retangulo.largura);
		double perimetroR = retangulo.perimetroRetangulo(retangulo.altura, retangulo.largura);
		double diagonalR = retangulo.diagonalRetangulo(retangulo.altura, retangulo.largura);
		
		System.out.printf("Área: %.2f%n", areaR);
		System.out.printf("Perímetro: %.2f%n", perimetroR);
		System.out.printf("Diagonal: %.2f%n", diagonalR);
		
		sc.close();
	}
}
