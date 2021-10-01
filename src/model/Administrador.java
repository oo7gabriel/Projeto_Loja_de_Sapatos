package model;

public class Administrador extends Conta{

	private int idAdmin;
	private String nomeAdmin;
	private String telefone;
	private String email;
	
	
	public Administrador(){
		super();
	}


	public Administrador(int idConta, String usuario, String senha, int nivel, int idAdmin, String nomeAdmin,
			String telefone, String email) {
		super(idConta, usuario, senha, nivel);
		this.idAdmin = idAdmin;
		this.nomeAdmin = nomeAdmin;
		this.telefone = telefone;
		this.email = email;
	}


	public int getIdAdmin() {
		return idAdmin;
	}


	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}


	public String getNomeAdmin() {
		return nomeAdmin;
	}


	public void setNomeAdmin(String nomeAdmin) {
		this.nomeAdmin = nomeAdmin;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}	
	
	
	
	
}
	
	
