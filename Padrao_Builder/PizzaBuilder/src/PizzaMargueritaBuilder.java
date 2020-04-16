
public class PizzaMargueritaBuilder extends PizzaBuilder {

	@Override
	public void defineTipoPizza() {
		pizza.defineTipoPizza("Marguerita");

	}

	@Override
	public void defineTamanho(String tamanho) {
		pizza.defineTamPizza(tamanho);

	}

	@Override
	public void defineMassa() {
		pizza.defineMassa("Fina");

	}

	@Override
	public void defineMolho() {
		pizza.defineMolho("Tomate");
	}

	@Override
	public void defineCobertura() {
		pizza.defineCobertura("Tomate+Oregano");

	}

}
