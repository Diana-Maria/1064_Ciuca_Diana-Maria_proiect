package clase_diana;

public class Ghiseu1 extends Handler {

	@Override
	public void servire_ghiseu(Ghiseu ghiseu) {
		if(ghiseu.getAlege_Ghiseu()=="ghiseu nr. 1")
    System.out.println("Clientul este primit la ghiseul nr. 1");		
		else{
			succesor.servire_ghiseu(ghiseu);
		}
	}
}
