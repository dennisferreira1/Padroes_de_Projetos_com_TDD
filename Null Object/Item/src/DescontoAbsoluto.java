
public class DescontoAbsoluto implements Desconto {

	private int valorDesconto;
	
	
	public DescontoAbsoluto(int valorDesconto) {
		this.valorDesconto = valorDesconto;
	}


	@Override
	public double darDesconto(double valorItem) {
		return valorItem - valorDesconto;
	}

}
