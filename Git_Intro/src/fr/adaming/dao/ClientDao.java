package fr.adaming.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.adaming.entities.Client;
import fr.adaming.utils.DBUtil;

public class ClientDao implements IClientDao {

	Connection cx = null;
	private PreparedStatement ps = null;

	@Override
	public int addClient(Client client) {

		try {
			this.cx = DBUtil.getCx();

			// Definir la requete
			String requete = "INSERT INTO clients ( name_cl, addr_cl, mail_cl, tel_cl) VALUES (?,?,?,?)";

			// Prepare Statement
			ps = cx.prepareStatement(requete);

			ps.setString(1, client.getNameClient());
			ps.setString(2, client.getAddress());
			ps.setString(3, client.getEmail());
			ps.setString(4, client.getTel());

			int verif = ps.executeUpdate();
			return verif;

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return 0;
	}

	@Override
	public int updateClient(Client client) {
		try {
			this.cx = DBUtil.getCx();

			// Definition de la requete
			String requete = "UPDATE clients SET name_cl=?, addr_cl=?, mail_cl=?, tel_cl=? WHERE id_cl = ? ";

			// Definition du messager
			ps = cx.prepareStatement(requete);

			ps.setString(1, client.getNameClient());
			ps.setString(2, client.getAddress());
			ps.setString(3, client.getEmail());
			ps.setString(4, client.getTel());
			ps.setInt(5, client.getIdClient());

			int verif = ps.executeUpdate();
			return verif;

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		// Definition de la requete
		return 0;
	}

	@Override
	public int deleteClient(Client client) {
		try {
			this.cx = DBUtil.getCx();

			String requete = " DELETE FROM clients WHERE id_cl=?";

			// Envoie de la requete et reception de la réponse
			// Preparation du messager
			ps = cx.prepareStatement(requete);

			ps.setInt(1, client.getIdClient());

			int verif = ps.executeUpdate();

			return verif;

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public Client getById(int id) {
		try {
			this.cx = DBUtil.getCx();

			// Definition de la requete
			String requete = "SELECT * FROM clients WHERE id_cl=?";

			ps = cx.prepareStatement(requete);

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			// Lire la ligne du tableau recupéré
			rs.next();

			// Recuperer l'info de chaque colonne
			int idCl = rs.getInt("id_cl");
			String nameClient = rs.getString("name_cl");
			String address = rs.getString("addr_cl");
			String mail = rs.getString("mail_cl");
			String tel = rs.getString("tel_cl");

			// Instancier un nouveau client
			Client client = new Client(idCl, nameClient, address, mail, tel);
			return client;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
