
public class TarifaEstacionamento {
	
	private int qntHoras;
	private Calculadora calculadora;
	
	public TarifaEstacionamento(int qntHoras, Calculadora calculadora) {
		this.qntHoras = qntHoras;
		this.calculadora = calculadora;
	}
	
	public int valor() {
		return calculadora.calcularTarifa(qntHoras);
	}

}
