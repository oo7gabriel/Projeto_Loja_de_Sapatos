package controller;

import java.util.Date;

import model.Cliente;
import model.Funcionario;
import model.Venda;


public class ControleVenda {

	private Venda[] v;
	private int qtdVendas;
	
	public ControleVenda(Controle_Dados dado) {
		v = dado.getVenda();
		qtdVendas = dado.getQtdVen();
	}
	
	public Integer[] getNomeVendaL() {
		Integer[] s = new Integer[qtdVendas];
		for(int i = 0; i < qtdVendas; i++) {
			s[i] = v[i].getIdVenda();
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
		return v[i].getIdVenda();
	}
	
	public Date getDataVenda(int i) {
		return v[i].getDataVenda();
	}

	public Date getHoraVenda(int i) {
		return v[i].getHoraVenda();
	}

	public double getCommissaoVenda(int i) {
		return v[i].getCommissaoVenda();
	}

	public Cliente getClie(int i) {
		return v[i].getClie();
	}
	
	public Funcionario getFunc(int i) {
		return v[i].getFunc();
	}

}
