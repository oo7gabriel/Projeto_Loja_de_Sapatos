package controller;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Endereco;

public class ControleCliente {
	private List<Cliente> c;
	private int qtdCliente;
	
	public ControleCliente(Controle_Dados dado) {
		c = dado.getCliente();
		qtdCliente = c.size();
	}
	
	public List<String> getNomeClienL() {
		List<String> s = new ArrayList<String>(qtdCliente);
		for(int i = 0; i < qtdCliente; i++) {
			s.add(c.get(i).getNomeCliente());
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
		return c.get(i).getIdCliente();
	}
	
	public String getNomeCliente(int i) {
		return c.get(i).getNomeCliente();
	}
	
	public String getTelefoneCliente(int i) {
		return c.get(i).getTelefoneCliente();
	}
	
	public String getCpfCliente(int i) {
		return c.get(i).getCpfCliente();
	}
	
	public Endereco getEndCliente(int i) {
		return c.get(i).getEndCliente();
	}
	
}
