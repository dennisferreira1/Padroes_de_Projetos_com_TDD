
public class ContadorSimples implements ContadorPalavras {
	
	private int qtde;

	@Override
	public void contar(String palavra) {
		qtde++;
		
	}
	
	@Override
	public int getContagem() {
		return qtde;
	}

}
