/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_diana;

import java.awt.List;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Diana
 */
public class Ghiseu_banca extends Thread implements Persoana{
  
    ArrayList<Persoana> lista=new ArrayList<Persoana>();
    private Object clienti;

    public Ghiseu_banca( String  name) {
        super(name);
    }
    public void run()
    {
        try {
            while(true) {
                sterge_client();
             sleep( (int) (Math.random()*5000) ); 
            }
        } catch (InterruptedException e) {   
          e.printStackTrace();
        }
}
    
   
    public synchronized void adauga_client(Client c) 
    {      
        lista.add(c);
        notifyAll();
    }
    
    public synchronized void sterge_client() 
    {
        while(lista.size()==0)
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
        Client c=(Client) lista.get(0);
        lista.remove(0);
        System.out.println(" Clientul cu id-ul " +  c.getId() + " a fost servit de catre " + getName());
        notifyAll();
    }
       
    public  synchronized int nr_clienti() 
    {
        notifyAll();
        int nr=lista.size();
        if(nr>=0){
        return nr;
        }
        else
        	throw new IllegalArgumentException("Numarul elementelor din lista este negativ");	
    }
    
    
    public void adaugaClient(Client c){
    	lista.add(c);
    }
    
    public void sosire_clienti(){
    	System.out.println("Sosire clienti la banca");
				
						for(int i=0;i<nr_clienti();i++){
						 ((Client) lista.get(i)).sosire();
						}			
    }
    
    public void plecare_clienti(){
    	System.out.println("Plecare clienti de la banca");
    	
			for(int i=0;i<nr_clienti();i++){
				((Client) lista.get(i)).plecare();
			}			
    }

		
	@Override
	public Persoana getCopil(int i) {
		if(i<lista.size()){
		return (Persoana) lista.get(i);
		}
		else
			 throw new IllegalArgumentException("Elementul nu se afla in lista");	 
	}
	
	@Override
	public void detalii() {
	System.out.println("Afisare Coada: ");
    for(int i=0;i<lista.size();i++){
	 lista.get(i).detalii();
}
	}
	@Override
	public void add(Persoana persoana) {
    lista.add(persoana)	;	
	}
	@Override
	public void remove(Persoana persoana) {
		 if (!(lista.isEmpty()))
         lista.remove(persoana);		
		 else
			 throw new IllegalArgumentException("Lista este vida");	 
	}	
}
