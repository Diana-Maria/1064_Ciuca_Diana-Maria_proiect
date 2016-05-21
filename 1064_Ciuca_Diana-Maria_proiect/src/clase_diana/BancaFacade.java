package clase_diana;

import java.util.Date;

public class BancaFacade {

	public static void executa_activitati(int id, Date sosire, Date plecare, Modalitate_Plata modalitatePlata,String numeGhiseu, String numeClient, String locatie){
		
		Client client=new Client(id, sosire, plecare, modalitatePlata, numeClient);
		Banca banca=new Banca();
		Ghiseu_banca ghiseu=new Ghiseu_banca(numeGhiseu);
		ghiseu.adaugaClient(client);
		banca.deschide_banca();
		ghiseu.sosire_clienti();	
		
		// strategy
		client.plateste();
		
		ghiseu.plecare_clienti();
		banca.inchide_banca();					
		
		
		/*Client client=new Client(id, sosire, plecare, modalitatePlata, numeClient);
	    Modalitate_Plata mod=new InternetBanking();
		Banca banca=new Banca();
		banca.deschide_banca();
		 int nr_ghisee=3;
	        Ghiseu_banca g[]=new Ghiseu_banca[nr_ghisee];
	        Coada coada=new Coada("Coada",g, nr_ghisee, 4);
	      int i=0;
	       while(i<nr_ghisee)
	        {
	            g[i]=new Ghiseu_banca(" Ghiseu banca " + i);   
	        try {
				g[i].adauga_client(client);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        g[i].sosire_clienti();
	        g[i].start();	  
	        coada.start();     
	        client.plateste();
            g[i].plecare_clienti();
            banca.inchide_banca();
	      i++;    */
	    }	        	
	}	




