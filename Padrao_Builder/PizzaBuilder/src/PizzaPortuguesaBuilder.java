
public class PizzaPortuguesaBuilder extends PizzaBuilder {

	@Override
	public void defineTipoPizza() {
		pizza.defineTipoPizza("Portuguesa");	
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
		pizza.defineMolho("Não apimentado");
		
	}

	@Override
	public void defineCobertura() {
		pizza.defineCobertura("Ovo+Azeitona");
		
	}

	
}
