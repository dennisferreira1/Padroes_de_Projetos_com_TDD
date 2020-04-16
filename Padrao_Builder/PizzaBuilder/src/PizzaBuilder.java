
public abstract class PizzaBuilder {

	protected ProdutoPizza pizza;
	
	public ProdutoPizza getPizza() {
		return pizza;
	}

	public void criarNovoProdutoPizza() {
		pizza = new ProdutoPizza();
	}

	public abstract void defineTipoPizza();
	public abstract void defineTamanho(String tamanho);
	public abstract void defineMassa();
	public abstract void defineMolho();
	public abstract void defineCobertura();

}
