package fr.adaming.services;

import fr.adaming.dao.ClientDao;
import fr.adaming.dao.IClientDao;
import fr.adaming.entities.Client;

public interface IClientService {
	
	public int addClient(Client client);
	
	public int deleteClient(Client client);
	
	public Client getById(int id);
	
	public int updateClient(Client client);
}
