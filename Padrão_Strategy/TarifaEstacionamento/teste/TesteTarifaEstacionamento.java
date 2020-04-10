import static org.junit.Assert.*;

import org.junit.Test;

public class TesteTarifaEstacionamento {

	@Test
	public void tarifaFixaPorHora() {
		TarifaEstacionamento t = new TarifaEstacionamento(3, new CalculadoraHora(4));
		int valor = t.valor();

		assertEquals(12, valor);
	}

	@Test
	public void tarifaComValorInicialDepoisFixaPorHora() {
		TarifaEstacionamento t = new TarifaEstacionamento(5, new CalculadoraHoraValorInicial(5, 2, 3));

		int valor = t.valor();

		assertEquals(9, valor);
	}

	@Test
	public void tarifaComValorInicialComHorasAbaixoOuIgualAoLimiteDeHoraInicial() {
		TarifaEstacionamento t = new TarifaEstacionamento(3, new CalculadoraHoraValorInicial(5, 2, 3));

		int valor = t.valor();

		assertEquals(5, valor);
	}
	
	@Test
	public void tarifaPorDiaria() {
		TarifaEstacionamento t = new TarifaEstacionamento(48, new CalculadoraDiaria(20,1));

		int valor = t.valor();

		assertEquals(40, valor);
		
	}
	
	@Test
	public void tarifaPorDiariaComHorasExcedentes() {
		TarifaEstacionamento t = new TarifaEstacionamento(20, new CalculadoraDiaria(20, 1));

		int valor = t.valor();

		assertEquals(20, valor);
		
	}
}
