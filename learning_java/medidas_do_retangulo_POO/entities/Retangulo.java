package entities;

public class Retangulo {
	public double largura;
	public double altura;
	
	public double areaRetangulo(double altura, double largura) {
		return this.altura * this.largura;
	}
	
	public double perimetroRetangulo(double altura, double largura) {
		return (this.largura * 2) + (this.altura * 2);
	}
	
	public double diagonalRetangulo(double altura, double largura) {
		return Math.sqrt((Math.pow(this.altura, 2)) + Math.pow(this.largura, 2));
	}
}
