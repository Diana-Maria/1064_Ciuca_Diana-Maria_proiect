package clase_diana;

public abstract class Handler {

	protected Handler succesor;
	Ghiseu_banca ghiseu_banca;

	public void setActiuneUrmatoare(Handler actiune) {
		this.succesor = actiune;
	}
	public void servire_ghiseu(Ghiseu ghiseu) {		
	}
}



