
public class ContadorPar implements ContadorPalavras {

	private int qtde;
	
	@Override
	public void contar(String palavra) {
		if(isPar(palavra))
			qtde++;

	}

	private boolean isPar(String palavra) {
		return palavra.length() % 2 == 0;
	}

	@Override
	public int getContagem() {
		return qtde;
	}

}
