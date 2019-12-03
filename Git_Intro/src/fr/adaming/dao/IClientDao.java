package fr.adaming.dao;

import fr.adaming.entities.Client;

public interface IClientDao {

	public int addClient(Client client);
	
	public int updateClient(Client client);
	
	public int deleteClient(Client client);
	
	public Client getById(int id);
	
}
