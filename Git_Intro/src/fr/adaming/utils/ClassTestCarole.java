package fr.adaming.utils;

import java.sql.Date;

import fr.adaming.dao.CommandDao;
import fr.adaming.entities.Client;
import fr.adaming.entities.Command;
import fr.adaming.services.ClientService;
import fr.adaming.services.IClientService;

public class ClassTestCarole {

	public static void main(String[] args) {
//		IClientService clService = new ClientService();
//
		Client cl2 = new Client(3, "fifi", "Paris", "b@a.a", "0645789865");
		System.out.println(cl2.getIdClient());
//		//clService.addClient(cl1);
//		//System.out.println(clService.getById(2));
//		clService.updateClient(cl2);
//	}
		//Tester methode ajouter commande
		CommandDao cmdDao = new CommandDao();
		java.util.Date uDate = new java.util.Date();
		Command cmd1 = new Command(1, uDate, cl2, null );
		System.out.println(cmd1.getClient());
		System.out.println(cmdDao.updateCommand(cmd1));
		
}
}