package controller;

import java.util.List;

import model.*;

public class Controle_Dados {

	private Dados dado = new Dados() ;
	
	public Controle_Dados() {
		dado.preencherDados();
	}
	
	public Dados getDados() {
		return dado;
	}
	public void setDados(Dados dado) {
		this.dado = dado;
	}
	
	public List<Administrador> getAdminis() {
		return this.dado.getAdminis();
	}
	
	public List<Funcionario> getFunci() {
		return this.dado.getFunci();
	}
	
	public List<Cliente> getCliente() {
		return this.dado.getCliente();
	}
	
	public List<Sapato> getSap() {
		return this.dado.getSap();
	}
	
	public List<Acessorio> getAcesso() {
		return this.dado.getAcesso();
	}
	
	public List<Estoque> getEstoque() {
		return this.dado.getEstoque();
	}
	
	public List<Venda> getVenda() {
		return this.dado.getVenda();
	}
	
	
	
}
