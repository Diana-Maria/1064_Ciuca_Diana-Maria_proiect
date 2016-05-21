package teste_diana;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase_diana.Client;
import clase_diana.Ghiseu;
import junit.framework.Assert;

public class Test_Ghiseu {
	
	String tip;
	Ghiseu ghiseu;

	@Before
	public  void setUp() throws Exception {
		 tip="ghiseu 1";
		 ghiseu=new Ghiseu(tip);
	}
	
	@Test
	public void testGetAlege_Ghiseu() {	
		Assert.assertTrue(ghiseu.getAlege_Ghiseu().equals(tip));		
	}

	@After
	public void tearDown() throws Exception {
		ghiseu=null;
		tip=null;
	}


}
