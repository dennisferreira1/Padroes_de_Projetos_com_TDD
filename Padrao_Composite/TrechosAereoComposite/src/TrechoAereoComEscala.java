
public class TrechoAereoComEscala implements TrechoAereo {
	
	TrechoAereo trechoAereo1;
	TrechoAereo trechoAereo2;

	public TrechoAereoComEscala(TrechoAereo t1, TrechoAereo t2) {
		if(aeroportosDiferentes(t1, t2))
			throw new RuntimeException();
		
		trechoAereo1 = t1;
		trechoAereo2 = t2;
	}

	private boolean aeroportosDiferentes(TrechoAereo t1, TrechoAereo t2) {
		return (!t1.getDestino().equals(t2.getOrigem()));
	}

	@Override
	public String getOrigem() {
		return trechoAereo1.getOrigem();
	}


	@Override
	public String getDestino() {
		return trechoAereo2.getDestino();
	}


	@Override
	public int getCusto() {
		return trechoAereo1.getCusto() + trechoAereo2.getCusto();
	}


	@Override
	public int getDistancia() {
		return trechoAereo1.getDistancia() + trechoAereo2.getDistancia();
	}


}
