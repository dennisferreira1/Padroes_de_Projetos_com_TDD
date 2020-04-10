
public class Item {
	
	private String nome;
	private double valor;
	private Desconto desconto;
	
	public Item(String nome, double valor, Desconto desconto) {
		this.nome = nome;
		this.valor = valor;
		this.desconto = desconto;
	}

	public Item(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
		this.desconto = new SemDesconto();
	}
	
	public double precoQuantidade(int qnt) {
		
		return desconto.darDesconto(valor) * qnt;
	}

	@Override
	public String toString() {
		
		return nome + " R$" + desconto.darDesconto(valor);
	}
	
	
	
	

}
