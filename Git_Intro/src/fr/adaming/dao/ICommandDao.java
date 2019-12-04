package fr.adaming.dao;

import fr.adaming.entities.Command;

public interface ICommandDao {
	
	public int addCommand(Command com);
	public int deleteCommand(Command com);
	public int updateCommand(Command com);
	public Command getById(int id);
	
	
}
