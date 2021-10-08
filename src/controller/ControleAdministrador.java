package controller;

import java.util.List;

import model.Administrador;

public class ControleAdministrador {
	
	private List<Administrador> a;

	public ControleAdministrador(Controle_Dados dado) {
		a = dado.getAdminis();
	}
	
	public String getUsuario(int i) {
		return a.get(i).getUsuario();
	}
	
	public String getSenha(int i) {
		return a.get(i).getSenha();
	}
	
	public String getNomeAdmin(int i) {
		return a.get(i).getNomeAdmin();
	}
	
	public String getTelefone(int i) {
		return a.get(i).getTelefone();
	}
	
	public String getEmail(int i) {
		return a.get(i).getEmail();
	}

	
	
}
