package teste_diana;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase_diana.Ghiseu;
import clase_diana.Ghiseu1;
import clase_diana.Ghiseu2;
import clase_diana.Handler;

public class TestHandler {

	Handler h1;
	
	@Before
	public void setUp() throws Exception {
		h1=new Ghiseu1();
	}

	@Test
	public void testSetActiuneUrmatoare() {		
		h1.setActiuneUrmatoare(new Ghiseu2());
		assertNotNull(h1);	
	}
	
	
	@After
	public void tearDown() throws Exception {
		h1=null;
	}

	
}
