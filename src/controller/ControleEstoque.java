package controller;

import model.Estoque;

public class ControleEstoque {
	private Estoque[] est;
	private int qtdEstoq;
	
	public ControleEstoque(Controle_Dados dado) {
		est = dado.getEstoque();
		qtdEstoq = dado.getQtdEstque();
	}
	
	public Integer[] getNomeEstoqueL() {
		Integer s[] = new Integer[qtdEstoq];
		for(int i = 0; i < qtdEstoq; i++) {
			s[i] = est[i].getIdEstoque();
		}
		
		return s;
	}

	public int getQtdEstoq() {
		return qtdEstoq;
	}

	public void setQtdEstoq(int qtdEstoq) {
		this.qtdEstoq = qtdEstoq;
	}
	
	public int getIdEstoque(int i) {
		return est[i].getIdEstoque();
	}
	
	public int getQuantidade(int i) {
		return est[i].getQuantidade();
	}
}
