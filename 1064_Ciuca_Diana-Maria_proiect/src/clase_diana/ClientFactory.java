package clase_diana;

public class ClientFactory {

	public IClient creareObiect(Clienti tip){
		switch (tip) {
		case Client_persoana_fizica:
			return new Client_persoana_fizica();
		case Comerciant_persoana_fizica:
			return new Comerciant_persoana_fizica();
		case Persoana_juridica:
			return new Persoana_juridica();
		}
		return null;
	}	
}
