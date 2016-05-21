/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_diana;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 *
 * @author Diana
 */
public class Coada extends Thread implements Persoana  {
     private Ghiseu_banca ghiseu[]; 
    private int nr_ghisee;
    private int nr_clienti;
    static int id =0;
    public List<Persoana> persoane=new ArrayList<>();
   
    public Coada() {
		super();
	}
    
	public Ghiseu_banca[] getGhiseu() {
		return ghiseu;
	}

	public void setGhiseu(Ghiseu_banca[] ghiseu) {
		this.ghiseu = ghiseu;
	}

	public int getNr_ghisee() {
		return nr_ghisee;
	}


	public void setNr_ghisee(int nr_ghisee) {
		this.nr_ghisee = nr_ghisee;
	}



	public int getNr_clienti() {
		return nr_clienti;
	}



	public void setNr_clienti(int nr_clienti) {
		this.nr_clienti = nr_clienti;
	}



	public List<Persoana> getPersoane() {
		return persoane;
	}



	public void setPersoane(List<Persoana> persoane) {
		this.persoane = persoane;
	}



	public Coada(String name, Ghiseu_banca  ghiseu[],int nr_ghisee,int nr_clienti ){ 
        super( name ); 
         this.nr_ghisee=nr_ghisee;
          this.nr_clienti = nr_clienti; 
         this.ghiseu = new Ghiseu_banca[nr_ghisee ]; 
        int i=0;
        while(i<nr_ghisee)
        {
            this.ghiseu[i]=ghiseu[i];
        i++;
         } 
    }

    private int coada_min (){ 
      int poz = 0; 
      int min  = ghiseu[0].nr_clienti(); 
	 int i=1;
	 while(i<nr_ghisee)
	 {
	     int dim = ghiseu[i].nr_clienti(); 
	     if ( dim < min  ){ 
	              min = dim; 
	              poz = i; 
	     } 
	     i++;
	 } 
      return poz;
    } 
 

    public void run(){ 
      try 
      { 
         int i=0; 
         while( i<nr_clienti ){ 
             i++; 
             Client c; 
             c = new Client(++id, new Date(), new Date(),new Numerar(), "Popescu");

		
             int l = coada_min(); 
             System.out.println("Clientul cu id :" + Integer.toString( id )+" a fost adaugat la ghiseul  "+ Integer.toString(l));

             ghiseu[l].adauga_client(c ); 
             sleep( (int) (Math.random()*2000) ); 
         } 
      } 
      catch( InterruptedException e ){ 
          e.printStackTrace();
      } 
    }

	@Override
	public void add(Persoana persoana) {
     persoane.add(persoana);
	}

	@Override
	public void remove(Persoana persoana) {
		 persoane.remove(persoana);		
	}

	@Override
	public Persoana getCopil(int i) {
		return persoane.get(i);
	}

	@Override
	public void detalii() {
		System.out.println("Afiseaza coada");
		for(int i=0;i<persoane.size();i++){
			persoane.get(i).detalii();
		}
	} 
	
	
}
