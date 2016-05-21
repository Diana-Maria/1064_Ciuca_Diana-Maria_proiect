package clase_diana;

import java.util.Date;
import java.util.concurrent.CancellationException;

public class ClientBuilder implements IClientBuilder {

	private Client client;
	
	
    public ClientBuilder() {
		client=new Client();
	}

	public ClientBuilder setId(int id) {
        this.client.setId(id);
        return this;
    }

    public ClientBuilder setSosire(Date sosire) {
        this.client.setSosire(sosire);
        return this;
    }

    public ClientBuilder setPlecare(Date plecare) {
        this.client.setPlecare(plecare);
        return this;
    }
    
    
	public ClientBuilder setModalitatePlata(Modalitate_Plata modalitatePlata) {
		this.client.setModalitatePlata(modalitatePlata);
		return this;
	}
	
	public ClientBuilder setNume(String nume) {
		this.client.setNume(nume);
		return this;
	}

	
	@Override
	public Client build() {
		return client;
	}
}
