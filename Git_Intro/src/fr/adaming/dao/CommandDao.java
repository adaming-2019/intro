package fr.adaming.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fr.adaming.entities.Command;
import fr.adaming.utils.DBUtil;
import fr.adaming.utils.DateConversion;

public class CommandDao implements ICommandDao {
	Command cmd = new Command();
	Connection cx = null;
	private PreparedStatement ps = null;

	@Override
	public int addCommand(Command com) {
		try {
			this.cx = DBUtil.getCx();

			// Definir la requete
			String requete = "INSERT INTO commands (date_cmd, cl_id) VALUES (?,?)";
			Date d = DateConversion.convertUtilToSql(com.getDateCommand());
			// Prepare Statement
			ps = cx.prepareStatement(requete);

			ps.setDate(1, d);
			ps.setInt(2, com.getClient().getIdClient());

			int verif = ps.executeUpdate();
			return verif;

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateCommand(Command com) {
		try {
			this.cx = DBUtil.getCx();

			// Definition de la requete
			String requete = "UPDATE commands SET date_cmd=?, cl_id=?,  WHERE id_cmd =?";

			// Definition du messager
			ps = cx.prepareStatement(requete);

			Date d = DateConversion.convertUtilToSql(com.getDateCommand());
			ps.setDate(1, d);
	
			ps.setInt(2, com.getClient().getIdClient());
			ps.setInt(3, com.getIdCommand());


			int verif = ps.executeUpdate();
			return verif;

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		// Definition de la requete
		return 0;
	}

	@Override
	public int deleteCommand(Command com) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Command getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}