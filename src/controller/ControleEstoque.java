package controller;

import java.util.ArrayList;
import java.util.List;

import model.Estoque;

public class ControleEstoque {
	private List<Estoque> est;
	private int qtdEstoq;
	
	public ControleEstoque(Controle_Dados dado) {
		est = dado.getEstoque();
		qtdEstoq = est.size();
	}
	
	public List<Integer> getNomeEstoqueL() {
		List<Integer> s = new ArrayList<Integer>(qtdEstoq);
		for(int i = 0; i < qtdEstoq; i++) {
			s.add(est.get(i).getIdEstoque());
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
		return est.get(i).getIdEstoque();
	}
	
	public int getQuantidade(int i) {
		return est.get(i).getQuantidade();
	}
}
