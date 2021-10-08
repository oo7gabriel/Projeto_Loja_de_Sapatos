package controller;

import model.Cliente;
import model.Endereco;

public class ControleCliente {
	private Cliente[] c  = new Cliente[100];
	private int qtdCliente;
	
	
	public ControleCliente(Controle_Dados dado) {
		c = dado.getCliente();
		qtdCliente = dado.getQtdClien();
	}
	
	public String[] getNomeClienL() {
		String[] s = new String[qtdCliente];
		for(int i = 0; i < qtdCliente; i++) {
			s[i] = c[i].getNomeCliente();
		}
		
		return s;
	}

	public int getQtdCliente() {
		return qtdCliente;
	}

	public void setQtdCliente(int qtdCliente) {
		this.qtdCliente = qtdCliente;
	}
	
	public int getIdCliente(int i) {
		return c[i].getIdCliente();
	}
	
	public String getNomeCliente(int i) {
		return c[i].getNomeCliente();
	}
	
	public String getTelefoneCliente(int i) {
		return c[i].getTelefoneCliente();
	}
	
	public String getCpfCliente(int i) {
		return c[i].getCpfCliente();
	}
	
	public Endereco getEndCliente(int i) {
		return c[i].getEndCliente();
	}
	
}
