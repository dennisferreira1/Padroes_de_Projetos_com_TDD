import static org.junit.Assert.*;

import org.junit.Test;

public class TesteQuebradorPalavras {

	@Test
	public void quebradorPalavras() {
		String frase = "O rato roeu a roupa do rei";
		QuebradorPalavras quebrador = new QuebradorPalavras();
		String[] palavras = quebrador.quebrar(frase);
		assertEquals(7, palavras.length);
	}
	
	@Test
	public void contadorSimples() {
		String frase = "O rato roeu a roupa do rei";
		QuebradorPalavras quebrador = new QuebradorPalavras();
		quebrador.adicionaContador("SIMPLES", new ContadorSimples());
		quebrador.quebrar(frase);
		assertEquals(7, quebrador.getContagem("SIMPLES"));
	}
	
	@Test
	public void contadorMaiuscula() {
		String frase = "O Rato roeu a roupa do Rei";
		QuebradorPalavras quebrador = new QuebradorPalavras();
		quebrador.adicionaContador("MAIUSCULA", new ContadorMaiuscula());
		quebrador.quebrar(frase);
		assertEquals(3, quebrador.getContagem("MAIUSCULA"));
	}

	@Test
	public void contadorQuantLetrasPar() {
		String frase = "O Rato roeu a roupa do Rei";
		QuebradorPalavras quebrador = new QuebradorPalavras();
		quebrador.adicionaContador("PAR", new ContadorPar());
		quebrador.quebrar(frase);
		assertEquals(3, quebrador.getContagem("PAR"));
	}
	
	@Test
	public void contadorIntegrado() {
		String frase = "O Rato roeu a roupa do Rei";
		QuebradorPalavras quebrador = new QuebradorPalavras();
		quebrador.adicionaContador("SIMPLES", new ContadorSimples());
		quebrador.adicionaContador("MAIUSCULA", new ContadorMaiuscula());
		quebrador.adicionaContador("PAR", new ContadorPar());
		quebrador.quebrar(frase);
		assertEquals(7, quebrador.getContagem("SIMPLES"));
		assertEquals(3, quebrador.getContagem("MAIUSCULA"));
		assertEquals(3, quebrador.getContagem("PAR"));
	}


}
