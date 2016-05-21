package clase_diana;

public class Banca implements IBanca{

	 private static Banca instance = null;
	 private String denumire;
	 private String locatie;
	 
	 
	private Banca(String denumire, String locatie) {
		super();
		this.denumire = denumire;
		this.locatie = locatie;
	}
	
	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}


	public String getLocatie() {
		return locatie;
	}


	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}

	public Banca() {
		this.denumire="Transilvania";
		this.locatie="Bucuresti";
	}

	@Override
	public String toString() {
		return "Banca [denumire=" + denumire + ", locatie=" + locatie + "]";
	}
	 
	 public static Banca getInstance(String denumire, String locatie)	 {
		 if(instance==null){
			 instance=new Banca(denumire, locatie);
		 }
		 return instance;
	 }
	 
	 @Override
	 public void deschide_banca(){
		 System.out.println("Banca " + denumire + " se deschide");
	 }
	 
	 @Override
	 public void inchide_banca(){
		 System.out.println("Banca " + denumire + " se inchide");
	 }
	 
	 public Boolean stare_Banca(boolean ok){
		 if(ok){
			 deschide_banca();
		 return true;
		 }
		 else{
			 inchide_banca();
		 return false;
		 }
	 }	
}
