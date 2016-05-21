package clase_diana;

public class Ghiseu3 extends Handler{

	@Override
	public void servire_ghiseu(Ghiseu ghiseu) {
	if(ghiseu.getAlege_Ghiseu()=="ghiseu nr. 3")
		    System.out.println("Clientul este primit la ghiseul nr. 3");		
				else{
					System.out.println("Daca niciunul din cele 3 ghisee nu este dispobibil, va rugam reveniti mai tarziu.");					
				}
			}		
	}


