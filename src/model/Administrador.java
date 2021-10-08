package model;

public class Administrador extends Conta{

	private String nomeAdmin;
	private String telefone;
	private String email;
	
	
	public Administrador(){
		super();
	}


	public Administrador(int idConta, String usuario, String senha, int nivel, String nomeAdmin,
			String telefone, String email) {
		super(idConta, usuario, senha, nivel);
		this.nomeAdmin = nomeAdmin;
		this.telefone = telefone;
		this.email = email;
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
	
	
