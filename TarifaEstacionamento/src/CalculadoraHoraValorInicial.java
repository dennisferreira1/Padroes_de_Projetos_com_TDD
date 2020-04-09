
public class CalculadoraHoraValorInicial implements Calculadora {
	
	private int valorInicial;
	private int valorHoraExcedente;
	private int limiteHorasInicial;
	
	

	public CalculadoraHoraValorInicial(int valorInicial, int valorHoraExcedente, int limiteHorasInicial) {
		this.valorInicial = valorInicial;
		this.valorHoraExcedente = valorHoraExcedente;
		this.limiteHorasInicial = limiteHorasInicial;
	}



	@Override
	public int calcularTarifa(int qntHoras) {
		
		int valorTotal = valorInicial;
		if(qntHoras > limiteHorasInicial)
			valorTotal += (qntHoras - limiteHorasInicial) * valorHoraExcedente; 
		
		return valorTotal;
	}

}
