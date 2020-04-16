import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestePizzaBuilder {
	
	ProdutoPizza produtoPizza = null;
	GarcomDiretor garcom = null;
	@Before
	public void inicializa() {
		garcom = new GarcomDiretor();
	}

	@Test
	public void testePizzaPortuguesaBuilder() {
		PizzaBuilder pizzaPortuguesaBuilder = new PizzaPortuguesaBuilder();
		produtoPizza = garcom.definePizzaBuilder(pizzaPortuguesaBuilder).montaPizza("Pequena");
		
		assertEquals("Portuguesa, Pequena, Fina, Não apimentado, Ovo+Azeitona", produtoPizza.exibePizza());
	}
	
	@Test
	public void testePizzaItalianaBuilder() {
		PizzaBuilder pizzaItalianaBuilder = new PizzaItalianaBuilder();
		produtoPizza = garcom.definePizzaBuilder(pizzaItalianaBuilder).montaPizza("Media");
		
		assertEquals("Italiana, Media, Grossa, Apimentado, Pepperoni+Salame", produtoPizza.exibePizza());
	}
	
	@Test
	public void testePizzaMargueritaBuilder() {
		PizzaBuilder pizzaMargueritaBuilder = new PizzaMargueritaBuilder();
		String detalhesPizza = garcom.definePizzaBuilder(pizzaMargueritaBuilder).montaPizza("Grande").exibePizza();
		
		assertEquals("Marguerita, Grande, Fina, Tomate, Tomate+Oregano", detalhesPizza);
	}

}
