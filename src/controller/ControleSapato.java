package controller;

import java.util.ArrayList;
import java.util.List;

import model.Sapato;

public class ControleSapato {
	private List<Sapato> s;
	private int qtdSapato;
	
	public ControleSapato(Controle_Dados dado) {
		s = dado.getSap();
		qtdSapato = s.size();
	}
	
	public List<String> getNomeSapL() {
		List<String> sc = new ArrayList<String>(qtdSapato);
		for(int i = 0; i < qtdSapato; i++) {
			sc.add(s.get(i).getNomeProduto());
		}
		
		return sc;
	}

	public int getQtdSapato() {
		return qtdSapato;
	}

	public void setQtdSapato(int qtdSapato) {
		this.qtdSapato = qtdSapato;
	}
	
	public String getNomeProduto(int i) {
		return s.get(i).getNomeProduto();
	}
	
	public double getPrecoVenda(int i) {
		return s.get(i).getPrecoVenda();
	}
	
	public double getPrecoAtacado(int i) {
		return s.get(i).getPrecoAtacado();
	}
	
	public String getMarca(int i) {
		return s.get(i).getMarca();
	}
	
	public int getTamanho(int i) {
		return s.get(i).getTamanho();
	}
	
	public String getCor(int i) {
		return s.get(i).getCor();
	}
	
	public String getMaterial(int i) {
		return s.get(i).getMaterial();
	}
	
	public String getGenero(int i) {
		return s.get(i).getGenero();
	}

	public double getTaxaLucro(int i) {
		return s.get(i).getTaxaLucro();
	}
	
	public String getTipo(int i) {
		return s.get(i).getTipo();
	}
	
	public String getFaixaEtaria(int i) {
		return s.get(i).getFaixaEtaria();
	}
}
