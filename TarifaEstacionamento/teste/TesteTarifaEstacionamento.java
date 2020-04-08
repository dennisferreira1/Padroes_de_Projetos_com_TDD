import static org.junit.Assert.*;

import org.junit.Test;

public class TesteTarifaEstacionamento {

	@Test
	public void tarifaFixaPorHora() {
		TarifaEstacionamento t = new TarifaEstacionamento(3, new CalculadoraHora(4));
		int valor = t.valor();
		
		assertEquals(12, valor);
	}

}
