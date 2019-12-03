package fr.adaming.entities;

import java.util.Date;
import java.util.List;

public class Command {
	// Declaration des attributs
	private int idCommand;
	private Date dateCommand;

	// Transformation de la relation d'association UML en Java
	private Client client;
	private List<CommandLine> listcmdline;

	// Constructeurs
	public Command() {
		super();
	}

	public Command(int idCommand) {
		super();
		this.idCommand = idCommand;
	}

	public Command(Date dateCommand, Client client, List<CommandLine> listcmdline) {
		super();
		this.dateCommand = dateCommand;
		this.client = client;
		this.listcmdline = listcmdline;
	}

	public Command(int idCommand, Date dateCommand, Client client, List<CommandLine> listcmdline) {
		super();
		this.idCommand = idCommand;
		this.dateCommand = dateCommand;
		this.client = client;
		this.listcmdline = listcmdline;
	}

	// Getters et setters
	public int getIdCommand() {
		return idCommand;
	}

	public void setIdCommand(int idCommand) {
		this.idCommand = idCommand;
	}

	public Date getDateCommand() {
		return dateCommand;
	}

	public void setDateCommand(Date dateCommand) {
		this.dateCommand = dateCommand;

	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<CommandLine> getListcmdline() {
		return listcmdline;
	}

	public void setListcmdline(List<CommandLine> listcmdline) {
		this.listcmdline = listcmdline;
	}



}
