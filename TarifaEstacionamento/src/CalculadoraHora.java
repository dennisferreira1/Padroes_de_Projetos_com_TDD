
public class CalculadoraHora implements Calculadora {

	private int valorHora;
	
	
	public CalculadoraHora(int valorHora) {
		this.valorHora = valorHora;
	}
	
	@Override
	public int calcularTarifa(int qntHoras) {
		return qntHoras * valorHora;
	}

}
