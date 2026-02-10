package util;

public class Conversor {

	public static final double IOF = 0.06;
	
	public static double conversorDolar(double cotacao, double valor_comprado) {
		return valor_comprado * cotacao * (1.0 + IOF);
		
	}
	
}
