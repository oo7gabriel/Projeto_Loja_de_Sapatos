package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Funcionario;
import model.Venda;


public class ControleVenda {

	private List<Venda> v;
	private int qtdVendas;
	
	public ControleVenda(Controle_Dados dado) {
		v = dado.getVenda();
		qtdVendas = v.size();
	}
	
	public List<Integer> getNomeVendaL() {
		List<Integer> s = new ArrayList<Integer>(qtdVendas);
		for(int i = 0; i < qtdVendas; i++) {
			s.add(v.get(i).getIdVenda());
		}
		
		return s;
	}

	public int getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdFuncionarios(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}
	
	public int getIdVenda(int i) {
		return v.get(i).getIdVenda();
	}
	
	public SimpleDateFormat getDataVenda(int i) {
		return v.get(i).getDataVenda();
	}

	public SimpleDateFormat getHoraVenda(int i) {
		return v.get(i).getHoraVenda();
	}

	public double getCommissaoVenda(int i) {
		return v.get(i).getCommissaoVenda();
	}

	public Cliente getClie(int i) {
		return v.get(i).getClie();
	}
	
	public Funcionario getFunc(int i) {
		return v.get(i).getFunc();
	}

}
