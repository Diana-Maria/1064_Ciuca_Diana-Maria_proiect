package clase_diana;

public class BancaRenovata extends ABanca {

	public BancaRenovata(IBanca banca) {
		super(banca);
	}

	@Override
	public void refacere_sistem_incalzire() {
		System.out.println("Sistemul de incalzire a fost refacut");
	}

	@Override
	public void zugravire_incaperi() {
		System.out.println("Incaperile bancii au fost zugravite");
	}

	
	
}
