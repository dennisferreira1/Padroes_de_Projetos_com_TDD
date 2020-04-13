
public class ContadorMaiuscula implements ContadorPalavras {

	private int qtde;
	
	@Override
	public void contar(String palavra) {
		if(Character.isUpperCase(palavra.charAt(0)))
			qtde++;

	}

	@Override
	public int getContagem() {
		return qtde;
	}

}
