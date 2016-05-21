package teste_diana;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import clase_diana.Client;
import clase_diana.Ghiseu;
import clase_diana.Ghiseu_banca;
import clase_diana.Numerar;
import clase_diana.Persoana;

public class TestGhiseu_banca {
	
	Ghiseu_banca ghiseu;
	Client c;
		
	@Before
	public  void setUp() throws Exception {
		ghiseu=new Ghiseu_banca("Ghiseu 1");
		c=new Client(1, new Date(), new Date(), new Numerar(), "Popescu");		
	}
	
	@Test
	public void testAdauga_client() {
	ghiseu.adauga_client(c);			
		Assert.assertNotNull(ghiseu);		
	}	
	
	/*@Test
	public void testNr_clienti(){
		Ghiseu_banca ghiseu=new Ghiseu_banca("Ghiseu 1");
		ArrayList<Persoana> lista=new ArrayList<Persoana>();
		int nr=0;
		try{
		    nr=ghiseu.nr_clienti();
			System.out.println(nr);
			fail("Trebuia o exceptie aruncata");			
		}
		catch(Exception ex){
			System.out.println(nr);
		}
	} */
	
	@Test
	public void testAdd_NULL(){
		Ghiseu_banca ghiseu=new Ghiseu_banca("ghiseu 2");
		Persoana persoana=null;
		ArrayList<Persoana> lista=new ArrayList<Persoana>();
		lista.add(persoana);
		Assert.assertNull(persoana);
			}
	
	@Test
	public void testAdd_NOTNULL(){
		Ghiseu_banca ghiseu=new Ghiseu_banca("ghiseu 2");
		Persoana persoana=new Client();
		ArrayList<Persoana> lista=new ArrayList<Persoana>();
		lista.add(persoana);
		Assert.assertNotNull(persoana);
			}
	
	@Test
	public void testRemoveElementNotCreated(){
		
		Ghiseu_banca ghiseu=null;
		try{
			
		 ghiseu=new Ghiseu_banca("ghiseu 3");
	  
		ghiseu.remove(new Client("Valcea"));
		
		fail("Trebuia o exceptie aruncata");
		}catch(Exception ex){
		System.out.println(ghiseu);
	}		
	}
		
		@Test
		public void testGetCopil(){
			Ghiseu_banca ghiseu1=null;
			try{
				ArrayList<Persoana> lista=new ArrayList<Persoana>(4);
				
			 ghiseu1=new Ghiseu_banca("ghiseu 3");
			 ghiseu1.getCopil(5);
			
			
			fail("Trebuia o exceptie aruncata");
			}catch(Exception ex){
			System.out.println(ghiseu1);
		}				
		}
		
		@Test
		public void testRemoveElementNotExisting(){	
			ArrayList<Persoana> lista=null;
			try{				
		        lista=new ArrayList<Persoana>();				
			    lista.remove(lista.size()+1);
			    		fail("Trebuia o exceptie aruncata");
			}catch(Exception ex){
				System.out.println(lista);
					}				
		}
		
		@After
		public void tearDown() throws Exception {
			ghiseu=null;
			c=null;
		}
		}












	