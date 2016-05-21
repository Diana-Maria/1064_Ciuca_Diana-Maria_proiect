package teste_diana;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Test_Client.class, TestBanca.class, TestGhiseu_banca.class, TestHandler.class, Test_Ghiseu.class })
public class AllTests {
	
	

}
