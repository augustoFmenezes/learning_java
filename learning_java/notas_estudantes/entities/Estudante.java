package entities;

public class Estudante {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	public boolean aprovacao() {
		if (notaFinal() >= 60.0) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		if (aprovacao()) {
			return String.format("NOTA FINAL = %.2f%nAPROVADO%n", notaFinal());
		}
		else {
			return String.format("NOTA FINAL = %.2f%nREPROVADO%nFALTARAM %.2f PONTOS%n", notaFinal(), 60.0 - notaFinal());
		}
	}
}
