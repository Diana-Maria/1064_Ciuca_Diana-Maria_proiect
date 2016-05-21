package teste_diana;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase_diana.Banca;
import clase_diana.Client;
import junit.framework.Assert;

public class TestBanca {

	@Test
	public void testGetInstance() {
		Banca banca1=Banca.getInstance("BCR", "Buucuresti");
		Banca banca2=Banca.getInstance("BRD", "Pitesti");
		assertSame(banca1, banca2);
	}
			
	@Test
	public void testStare_Banca() {
		Banca banca1=Banca.getInstance("ING", "Pitesti");
		boolean bool=banca1.stare_Banca(true);
		assertTrue(bool);		
	}
			
}



