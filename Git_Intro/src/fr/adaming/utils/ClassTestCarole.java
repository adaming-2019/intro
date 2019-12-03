package fr.adaming.utils;

import fr.adaming.entities.Client;
import fr.adaming.services.ClientService;
import fr.adaming.services.IClientService;

public class ClassTestCarole {

	public static void main(String[] args) {
		IClientService clService = new ClientService();

		Client cl2 = new Client(2, "fifi", "Paris", "b@a.a", "0645789865");
		//clService.addClient(cl1);
		//System.out.println(clService.getById(2));
		clService.updateClient(cl2);
	}

}
