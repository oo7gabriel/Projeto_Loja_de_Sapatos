package controller;

import model.Administrador;

public class ControleAdministrador {
	
	private Administrador a;

	public ControleAdministrador(Controle_Dados dado) {
		a = dado.getAdminis();
	}
	
	public String getUsuario() {
		return a.getUsuario();
	}
	
	public String getSenha() {
		return a.getSenha();
	}
	
	public String getNomeAdmin() {
		return a.getNomeAdmin();
	}
	
	public String getTelefone() {
		return a.getTelefone();
	}
	
	public String getEmail() {
		return a.getEmail();
	}

}
