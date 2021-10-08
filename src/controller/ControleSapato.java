package controller;

import model.Sapato;

public class ControleSapato {
	private Sapato[] s;
	private int qtdSapato;
	
	public ControleSapato(Controle_Dados dado) {
		s = dado.getSap();
		qtdSapato = dado.getQtdSap();
	}
	
	public String[] getNomeSapL() {
		String[] sc = new String[qtdSapato];
		for(int i = 0; i < qtdSapato; i++) {
			sc[i] = s[i].getNomeProduto();
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
		return s[i].getNomeProduto();
	}
	
	public double getPrecoVenda(int i) {
		return s[i].getPrecoVenda();
	}
	
	public double getPrecoAtacado(int i) {
		return s[i].getPrecoAtacado();
	}
	
	public String getMarca(int i) {
		return s[i].getMarca();
	}
	
	public int getTamanho(int i) {
		return s[i].getTamanho();
	}
	
	public String getCor(int i) {
		return s[i].getCor();
	}
	
	public String getMaterial(int i) {
		return s[i].getMaterial();
	}
	
	public String getGenero(int i) {
		return s[i].getGenero();
	}

	public double getTaxaLucro(int i) {
		return s[i].getTaxaLucro();
	}
	
	public String getTipo(int i) {
		return s[i].getTipo();
	}
	
	public String getFaixaEtaria(int i) {
		return s[i].getFaixaEtaria();
	}
}
