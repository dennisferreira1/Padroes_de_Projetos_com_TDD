import static org.junit.Assert.*;

import org.junit.Test;

public class TesteProxySeguranca {

	@Test
	public void testeAutorizaAcesso() {
		Usuario u = new Usuario("Dennis");
		u.autorizaAcesso("InterfaceNegocio", "executaTransacao");
		NegocioMock mock = new NegocioMock();
		InterfaceNegocio n = new ProxySegurancaINegocio(mock, u);
		n.executaTransacao();
		assertTrue(mock.foiAcessado());
	}
	
	@Test
	public void testeNaoAutorizaAcesso() {
		Usuario u = new Usuario("Dennis");
		u.autorizaAcesso("InterfaceNegocio", "executaTransacao");
		NegocioMock mock = new NegocioMock();
		InterfaceNegocio n = new ProxySegurancaINegocio(mock, u);
		try {
			n.cancelaTransacao();
			fail();
		} catch (Exception e) {
			assertFalse(mock.foiAcessado());
		}
	}

}
