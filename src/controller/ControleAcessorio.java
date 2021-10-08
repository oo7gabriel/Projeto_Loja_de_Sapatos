package controller;

import model.Acessorio;

public class ControleAcessorio{
	private Acessorio[] ac;
	private int qtdAcessorio;
	
	public ControleAcessorio(Controle_Dados dado) {
		ac = dado.getAcesso();
		qtdAcessorio = dado.getQtdAcs();
	}
	
	public String[] getNomeSapL() {
		String[] s = new String[qtdAcessorio];
		for(int i = 0; i < qtdAcessorio; i++) {
			s[i] =ac[i].getNomeProduto();
		}
		
		return s;
	}

	public int getQtdAcessorio() {
		return qtdAcessorio;
	}

	public void setQtdSapato(int qtdAcessorio) {
		this.qtdAcessorio = qtdAcessorio;
	}
	
	public String getNomeProduto(int i) {
		return ac[i].getNomeProduto();
	}
	
	public double getPrecoVenda(int i) {
		return ac[i].getPrecoVenda();
	}
	
	public double getPrecoAtacado(int i) {
		return ac[i].getPrecoAtacado();
	}
	
	public String getMarca(int i) {
		return ac[i].getMarca();
	}
	
	public int getTamanho(int i) {
		return ac[i].getTamanho();
	}
	
	public String getCor(int i) {
		return ac[i].getCor();
	}
	
	public String getMaterial(int i) {
		return ac[i].getMaterial();
	}
	
	public String getGenero(int i) {
		return ac[i].getGenero();
	}

	public double getTaxaLucro(int i) {
		return ac[i].getTaxaLucro();
	}
	

	public String getUso(int i) {
		return ac[i].getUso();
	}
}
