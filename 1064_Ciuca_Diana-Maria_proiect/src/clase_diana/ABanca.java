package clase_diana;

public abstract class ABanca {
	IBanca banca;

	public ABanca(IBanca banca){
		this.banca=banca;
	}
	
	public abstract void refacere_sistem_incalzire();
	public abstract void zugravire_incaperi();
	
	public void deschidere_banca(){
		banca.deschide_banca();
	}
	
	public void inchidere_banca(){
		banca.inchide_banca();
	}
	
}
