package exercicio_estoque;

public class Produto {
	String nome;
	double preco;
	int quantidade;
	
	public double valorTotalEstoque() {
		return preco * quantidade;
	}
	
	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome 
			+ ", R$"
			+ String.format("%.2f", preco)
			+ ", "
			+ quantidade
			+ " unidades, Total: R$"
			+ String.format("%.2f", valorTotalEstoque());
	}
	
}
