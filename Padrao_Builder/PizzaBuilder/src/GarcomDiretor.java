
public class GarcomDiretor {
	
	PizzaBuilder pizzaBuilder;

	public GarcomDiretor definePizzaBuilder(PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder; 
		return this;
	}

	public ProdutoPizza montaPizza(String tamanho) {
		pizzaBuilder.criarNovoProdutoPizza();
		pizzaBuilder.defineTipoPizza();
		pizzaBuilder.defineTamanho(tamanho);
		pizzaBuilder.defineMassa();
		pizzaBuilder.defineMolho();
		pizzaBuilder.defineCobertura();
		
		return pizzaBuilder.getPizza();
	}

}
