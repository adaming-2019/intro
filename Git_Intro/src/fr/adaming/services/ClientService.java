package fr.adaming.services;

import fr.adaming.dao.ClientDao;
import fr.adaming.dao.IClientDao;
import fr.adaming.entities.Client;

public class ClientService implements IClientService {
	IClientDao clDao = new ClientDao();

	@Override
	public int addClient(Client client) {
		return clDao.addClient(client);
	}

	@Override
	public int deleteClient(Client client) {
		return clDao.deleteClient(client);
	}

	@Override
	public Client getById(int id) {
		return clDao.getById(id);
	}

	@Override
	public int updateClient(Client client) {
		return clDao.updateClient(client);
	}
	
	
}
