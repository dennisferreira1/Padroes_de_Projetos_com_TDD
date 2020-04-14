
public class ProxySegurancaINegocio implements InterfaceNegocio {
	
	private InterfaceNegocio negocioEncapsulado;
	private Usuario usuario;

	public ProxySegurancaINegocio(NegocioMock mock, Usuario u) {
		this.negocioEncapsulado = mock;
		this.usuario = u;
	}

	@Override
	public void executaTransacao() {
		if(usuario.isAutorizadoPara("InterfaceNegocio", "executaTransacao")) {
			negocioEncapsulado.executaTransacao();
		}else {
			throw new RuntimeException();
		}
			
		
	}

	@Override
	public void cancelaTransacao() {
		if(usuario.isAutorizadoPara("InterfaceNegocio", "cancelaTransacao")) {
			negocioEncapsulado.cancelaTransacao();
		}else {
			throw new RuntimeException();
		}
			
		
	}

	
}
