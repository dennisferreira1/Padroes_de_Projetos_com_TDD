
public class PizzaItalianaBuilder extends PizzaBuilder {

	@Override
	public void defineTipoPizza() {
		pizza.defineTipoPizza("Italiana");

	}

	@Override
	public void defineTamanho(String tamanho) {
		pizza.defineTamPizza(tamanho);

	}

	@Override
	public void defineMassa() {
		pizza.defineMassa("Grossa");

	}

	@Override
	public void defineMolho() {
		pizza.defineMolho("Apimentado");

	}

	@Override
	public void defineCobertura() {
		pizza.defineCobertura("Pepperoni+Salame");

	}

}
