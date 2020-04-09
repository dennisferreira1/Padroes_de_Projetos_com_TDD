
public class CalculadoraDiaria implements Calculadora {
	
	private int valorDiaria;
	private int valorHoraExcedente;
	

	public CalculadoraDiaria(int valorDiaria, int valorHoraExcedente) {
		this.valorDiaria = valorDiaria;
		this.valorHoraExcedente = valorHoraExcedente;
	}

	@Override
	public int calcularTarifa(int qntHoras) {
		int valorTotal = valorDiaria;
		int qntDiaria = qntHoras/24;
		int qntHorasExcedentes = qntHoras % 24;
		
		valorTotal = qntDiaria * valorDiaria + qntHorasExcedentes * valorHoraExcedente; 
		
		return valorTotal;
	}

}
