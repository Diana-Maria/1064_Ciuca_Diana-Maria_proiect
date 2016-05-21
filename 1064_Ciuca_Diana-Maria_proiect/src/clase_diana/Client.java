/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_diana;

import java.util.Date;
import java.util.logging.Logger;

import javax.swing.plaf.synth.SynthSpinnerUI;

/**
 *
 * @author Diana
 */
public class Client implements Persoana {
    private int id;
    private Date sosire;
    private Date plecare; 
    private Modalitate_Plata modalitatePlata;
    private String nume; 
    float pret_platit;
    float comision;
    private String adresa;
    private String varsta;
    
	public Client setPret_platit(float pret_platit) {
		this.pret_platit = pret_platit;
		return this;
	}
	
	public void setComision(float comision) {
		this.comision = comision;
	}

	public Client(String adresa) {
		super();
		this.adresa = adresa;		
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}


	public Client() {
		super();
	}

	public Client(int id, Date sosire, Date plecare, Modalitate_Plata modalitatePlata, String nume) {
		super();
		this.id = id;
		this.sosire = sosire;
		this.plecare = plecare;
		this.modalitatePlata = modalitatePlata;
		this.nume = nume;
	}
	
	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getSosire() {
        return sosire;
    }

    public void setSosire(Date sosire) {
        this.sosire = sosire;
    }

    public Date getPlecare() {
        return plecare;
    }

    public void setPlecare(Date plecare) {
        this.plecare = plecare;
    }
    
    public Modalitate_Plata getModalitatePlata() {
  		return modalitatePlata;
  	}

  	public void setModalitatePlata(Modalitate_Plata modalitatePlata) {
  		this.modalitatePlata = modalitatePlata;
  	}
    
    public String getVarsta() {
		return varsta;
	}

	public void setVarsta(String varsta) {
		this.varsta = varsta;
	}

	public Boolean verifica_Ora(int oraPlecare, int oraSosire){
    	if(oraPlecare==oraSosire){
    		return true;
    	}
    	else{
    		return false;
    	}
    		
    }
    
    public Boolean verifica_Luna(int plecare,int sosire){
    	if(plecare==sosire){
    		return true;
    	}
    	else{
    		return false;
    	}  		
    }
    
    public Boolean verifica_Zi(int plecare, int sosire){
    	if(plecare==sosire){
    		return true;
    	}
    	else{
    		return false;
    	}  		
    }
    
    public Boolean verifica_An(int yearPlecare, int yearSosire){
    	if(yearPlecare==yearSosire){
    		return true;
    	}
    	else{
    		return false;
    	}  		
    }
    
    public float verificaPret(float pretPlatit){
		if(pretPlatit>=0)
			return pretPlatit;
		else
			throw new IllegalArgumentException("Pretul este negativ");			
	}
    
    public float calculeazaPlataTotala(float pret, float comision){
    	return pret+comision;
    }
    
   public Boolean estePersoanaJuridica(Clienti tip){
	if(tip==Clienti.Persoana_juridica)   
		return true;
	else
		return false;
   }
	

	public void plateste(){
		if(modalitatePlata!=null)
			modalitatePlata.efectueaza();
		else
			System.out.println("Clientul cu id-ul" + id +  "nu a selectat niciun mijloc de plata");
		}

	public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}

	public void sosire(){
		System.out.println("Clientul " + nume + " soseste la banca la ora " + sosire );
	}
	
	public void plecare(){
		System.out.println("Clientul " + nume + " pleaca de la banca la ora " + plecare);
	}
	
	public int varstaClient(int varsta){
		if(varsta>18)
			return varsta;
		else
			throw new IllegalArgumentException("Clientul nu are varsta minima legala pentru plata");			
	}	
	

	@Override
	public void add(Persoana persoana) {
    throw new UnsupportedOperationException();		
	}

	@Override
	public void remove(Persoana persoana) {
	    throw new UnsupportedOperationException();		
		
	}

	@Override
	public Persoana getCopil(int i) {
	    throw new UnsupportedOperationException();		
	    }


	@Override
	public String toString() {
		return "Client [id=" + id + ", sosire=" + sosire + ", plecare=" + plecare + ", modalitatePlata="
				+ modalitatePlata + ", nume=" + nume + "]";
	}

	@Override
	public void detalii() {
		System.out.println(id);
		System.out.println(sosire);
		System.out.println(plecare);
		System.out.println(modalitatePlata);
		System.out.println(nume);
	}	
}