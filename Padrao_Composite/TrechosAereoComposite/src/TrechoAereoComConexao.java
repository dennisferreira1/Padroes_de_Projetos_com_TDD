
public class TrechoAereoComConexao extends TrechoAereoComEscala {
	
	private int taxa;

	public TrechoAereoComConexao(TrechoAereo t1, TrechoAereo t2, int taxa) {
		super(t1, t2);
		this.taxa = taxa;
	}

	@Override
	public int getCusto() {
		return super.getCusto() + taxa;
	}
	
	

}
