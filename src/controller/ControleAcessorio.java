package controller;

import java.util.ArrayList;
import java.util.List;

import model.Acessorio;

public class ControleAcessorio{
	private List<Acessorio> ac;
	private int qtdAcessorio;
	
	public ControleAcessorio(Controle_Dados dado) {
		ac = dado.getAcesso();
		qtdAcessorio = ac.size();
	}
	
	public List<String> getNomeSapL() {
		List<String> s = new ArrayList<String>(qtdAcessorio);
		for(int i = 0; i < qtdAcessorio; i++) {
			s.add(ac.get(i).getNomeProduto());
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
		return ac.get(i).getNomeProduto();
	}
	
	public double getPrecoVenda(int i) {
		return ac.get(i).getPrecoVenda();
	}
	
	public double getPrecoAtacado(int i) {
		return ac.get(i).getPrecoAtacado();
	}
	
	public String getMarca(int i) {
		return ac.get(i).getMarca();
	}
	
	public int getTamanho(int i) {
		return ac.get(i).getTamanho();
	}
	
	public String getCor(int i) {
		return ac.get(i).getCor();
	}
	
	public String getMaterial(int i) {
		return ac.get(i).getMaterial();
	}
	
	public String getGenero(int i) {
		return ac.get(i).getGenero();
	}

	public double getTaxaLucro(int i) {
		return ac.get(i).getTaxaLucro();
	}
	

	public String getUso(int i) {
		return ac.get(i).getUso();
	}
}
