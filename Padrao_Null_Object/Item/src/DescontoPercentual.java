
public class DescontoPercentual implements Desconto {

	private int percentualDesconto;
	
	
	
	public DescontoPercentual(int percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}


	@Override
	public double darDesconto(double valorItem) {
		return valorItem * (100 - percentualDesconto)/100;
	}

}
