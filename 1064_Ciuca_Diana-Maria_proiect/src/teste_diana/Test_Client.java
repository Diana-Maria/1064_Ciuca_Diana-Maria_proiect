package teste_diana;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase_diana.ABanca;
import clase_diana.Banca;
import clase_diana.Client;
import clase_diana.Clienti;
import clase_diana.Ghiseu;
import clase_diana.IBanca;
import clase_diana.InternetBanking;
import clase_diana.Numerar;
import clase_diana.Persoana;
import junit.framework.Assert;

public class Test_Client {

	String adresa;
	Client client;
	
	@Before
	public  void setUp() throws Exception {
		adresa="Bucuresti";
		client=new Client(adresa);		
	}
	
	@Test
	public void testGetAdresa() {	
	Assert.assertTrue(client.getAdresa().equals(adresa));		
	}
	
	@After
	public void tearDown() throws Exception {
		adresa=null;
		client=null;
	}
	

	@Test
	public void testVerifica_An(){
		Client client=new Client();
		client.setPlecare(new Date());
		Date datePlecare= client.getPlecare();		
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(datePlecare);
	    int yearPlecare = cal.get(Calendar.YEAR);
	    
	    client.setSosire(new Date());
	    Date dateSosire=client.getSosire();
	    Calendar cal1 = Calendar.getInstance();
	    cal1.setTime(dateSosire);
	    int yearSosire=cal1.get(Calendar.YEAR);
	    	    
		assertTrue(client.verifica_An(yearPlecare, yearSosire));
		   	
	}
	
	
	
	@Test
	public void testVerifica_Luna(){
		Client client=new Client();
		client.setPlecare(new Date());
		Date datePlecare= client.getPlecare();		
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(datePlecare);
	    int lunaPlecare = cal.get(Calendar.MONTH);
	    
	    client.setSosire(new Date());
	    Date dateSosire=client.getSosire();
	    Calendar cal1 = Calendar.getInstance();
	    cal1.setTime(dateSosire);
	    int lunaSosire=cal1.get(Calendar.MONTH);
	    
		assertTrue(client.verifica_Luna(lunaPlecare, lunaSosire));
   
	}
	
	@Test
	public void testVerifica_Zi(){
		Client client=new Client();
		client.setPlecare(new Date());
		Date datePlecare= client.getPlecare();		
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(datePlecare);
	    int ziPlecare = cal.get(Calendar.DAY_OF_MONTH);
	    
	    client.setSosire(new Date());
	    Date dateSosire=client.getSosire();
	    Calendar cal1 = Calendar.getInstance();
	    cal1.setTime(dateSosire);
	    int ziSosire=cal1.get(Calendar.DAY_OF_MONTH);  
	    
		assertTrue(client.verifica_Zi(ziPlecare, ziSosire));
	}
	
	
	@Test
	public void testVerifica_Ora(){
					
		try {
			    Client client=new Client();
			    Date dateSosire;
			    			   
				dateSosire = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2011-01-01 12:00:00");				
				Calendar calendar = GregorianCalendar.getInstance(); 
				calendar.setTime(dateSosire);   
				client.setSosire(dateSosire);
				int oraSosire=calendar.get(Calendar.HOUR);  
							
				Date datePlecare;
				datePlecare = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2011-01-01 13:00:00");
				Calendar calendar1 = GregorianCalendar.getInstance(); 
				calendar.setTime(datePlecare);   
				client.setPlecare(datePlecare);
				int oraPlecare=calendar.get(Calendar.HOUR);  
								
				assertFalse(client.verifica_Ora(oraSosire, oraPlecare));
				
			} catch (ParseException e) {			
				e.printStackTrace();
			}			
	}
	
        @Test
	        public void testSetAdresaNotNull(){
		    Client client;			
			Client c=new Client();
			c.setAdresa("Bucuresti");
			Assert.assertNotNull(c);
	        }
	        
	        
	        @Test
	        public void testPretCorect(){
	        	Client client=new Client();
	        	float pret=client.verificaPret(2300);
	        	assertEquals(2300, pret, 0.5);	        	
	        }     
	         
	        
	        @Test
	        public void testPretGresit(){
	        	Client client=new Client();
	        	float pret=0;
	        	try{
	            pret=client.verificaPret(-1000);
	        	System.out.println(pret);
	        	fail("Ar fi trebuit sa fie aruncata o exceptie");	        	
	        }
	        	catch(Exception ex){
	        		System.out.println(pret);
	        	}	        
	        }        
	        
			@Test
	        public void testCalculeazaPlataTotala(){
	        	Client c=new Client();
	        	float plata=c.calculeazaPlataTotala(2000, 100);
	        	assertEquals(2100, plata,0.5);
	        }
			
			
	        @Test
	        public void testEstePersoanaJuridica(){
	        	Client client=new Client();
	        	boolean output=client.estePersoanaJuridica(Clienti.Persoana_juridica);
	        	assertTrue(output);
	        }
	        
	        @Test
	        public void testVarstaClient(){
	        	Client client=new Client();
	        	int varsta=0;
	        	try{
	        	 varsta=client.varstaClient(16);
	        	System.out.println(varsta);
	        	fail("Ar fi trebuit sa fie aruncata o exceptie");
	        	}
	        	catch(Exception ex){
	        		System.out.println(varsta);
	        	}   	
	        }        
}
