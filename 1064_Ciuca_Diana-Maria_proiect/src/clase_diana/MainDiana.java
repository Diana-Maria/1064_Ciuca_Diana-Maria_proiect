/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_diana;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import clase_diana.Banca;

/**
 *
 * @author Diana
 */
class MainDiana {
    public static void main(String[] args){
         
        // testare Singleton
        
        Banca banca=Banca.getInstance("BCR", "Bucuresti");
        System.out.println(banca.toString());
        Banca banca1=Banca.getInstance("ING", "Bucuresti");
        System.out.println(banca1.toString());    
        
        // testare Strategy
        
     /*   Modalitate_Plata mod=new InternetBanking();
        Client c=new Client(1, new Date(), new Date(), mod, "Popescu");s
        c.plateste();
        mod=new Numerar();
        c.setModalitatePlata(mod);
        c.plateste();
        mod=new Card_Bancar();
        c.setModalitatePlata(mod);
        c.plateste();   */
        
        // testare Facade
        
        BancaFacade.executa_activitati(1, new Date(), new Date(), new Numerar(), "Ghiseu1", "Ionescu", "Bucuresti");
       
    	
    	// testare functionalitate thread-uri si testare Observer
    	
   	 int nr_ghisee=3;
	        Ghiseu_banca g[]=new Ghiseu_banca[nr_ghisee];
	      int i=0;
	       while(i<nr_ghisee)
	        {
	            g[i]=new Ghiseu_banca(" Ghiseu banca " + i);   	           
	        g[i].start();
	        
	      i++;  
	    }      
		Coada coada=new Coada("Coada",g, nr_ghisee, 4);
	       coada.start();          
	       
	       
	       // testare Chain of Responsability
	       Handler ghiseu1=new Ghiseu1();
	       Handler ghiseu2=new Ghiseu2();
	       Handler ghiseu3=new Ghiseu3();
	       
			ghiseu1.setActiuneUrmatoare(ghiseu2);
			ghiseu2.setActiuneUrmatoare(ghiseu3);
						
			Ghiseu ghiseu=new Ghiseu("ghiseu nr. 1");
		//	Ghiseu ghiseu=new Ghiseu("ghiseu nr. 2");
		//	Ghiseu ghiseu=new Ghiseu("ghiseu nr. 3");
		//	Ghiseu ghiseu=new Ghiseu("ghiseu nr. 4");
			
			ghiseu1.servire_ghiseu(ghiseu);	  
						
			// testare Factory
			ClientFactory factory=new ClientFactory();
			IClient client;
			
			client=factory.creareObiect(Clienti.Client_persoana_fizica);
			client.stabilire_tip();		
			
			client=factory.creareObiect(Clienti.Comerciant_persoana_fizica);
			client.stabilire_tip();
			
			client=factory.creareObiect(Clienti.Persoana_juridica);
			client.stabilire_tip();
			
			
			// testare Composite
		
			    Client c1;			
			    Client c2;
			    Client c3;
			    Coada coada1=new Coada();
				Coada coada2=new Coada();
							
			try {		
				
					c1 = new Client(1, new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2011-01-01 00:00:00"),new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2011-02-01 00:00:00"), new InternetBanking(), "Popescu");
					c1.plateste();
					coada1.add(c1);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            
				try {
					c2 = new Client(2, new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2011-01-03 00:00:00"),new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2011-01-04 00:00:00") , new Numerar(), "Georgescu");
					coada1.add(c2);
		            
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
	            
				try {
					c3 = new Client(3, new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2011-01-05 00:00:00"),new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2011-01-06 00:00:00") , new InternetBanking(), "Badea");
					coada2.add(c3);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	            coada1.add(coada2);
	            coada1.detalii();		
	            
	            // testare Decorator
	            
	            ABanca banca_renovata=new BancaRenovata(banca);
	            banca_renovata.deschidere_banca();
	            banca_renovata.inchidere_banca();
	            banca_renovata.refacere_sistem_incalzire();
	            banca_renovata.zugravire_incaperi();
	            
	            // testare Builder
	            
	            Client client1=new Client();
	            Client client2=new ClientBuilder().setId(1).setNume("Antonescu").build();
	            System.out.println(client2.toString());
	            
	            Client client3=new ClientBuilder().setId(2).setNume("Irimescu").build();
	            System.out.println(client3.toString());				
			}  	
    }




