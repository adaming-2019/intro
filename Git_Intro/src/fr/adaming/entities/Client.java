package fr.adaming.entities;

public class Client {
	//Declaration des attributs
	private int idClient;
	private String nameClient;
	private String address;
	private String email;
	private String tel;

	
	//Constructeurs
	public Client() {
		super();
	}

	public Client(int idClient) {
		super();
		this.idClient = idClient;
	}

	public Client(String nameClient, String address, String email, String tel) {
		super();
		this.nameClient = nameClient;
		this.address = address;
		this.email = email;
		this.tel = tel;
	}


	public Client(int idClient, String nameClient, String address, String email, String tel) {
		super();
		this.idClient = idClient;
		this.nameClient = nameClient;
		this.address = address;
		this.email = email;
		this.tel = tel;
	}
	
	//Getters et setters
	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getNameClient() {
		return nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}


	
		
	
}
