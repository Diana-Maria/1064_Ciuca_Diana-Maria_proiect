package clase_diana;

public class Ghiseu2 extends Handler {

	@Override
	public void servire_ghiseu(Ghiseu ghiseu) {
	if(ghiseu.getAlege_Ghiseu()=="ghiseu nr. 2")		
	System.out.println("Clientul este primit la ghiseul nr. 2");
else{
	succesor.servire_ghiseu(ghiseu);
}
	}
}
