package model;

public class Sapato extends Produto {
	
	private String tipo;
	private String faixaEtaria;
	
	public Sapato() {
		super();
	}

	public Sapato(String nomeProduto, double precoVenda, double precoAtacado, String marca, int tamanho, String cor,
			String material, String genero, double taxaLucro, String tipo, String faixaEtaria) {
		super(nomeProduto, precoVenda, precoAtacado, marca, tamanho, cor, material, genero, taxaLucro);
		this.tipo = tipo;
		this.faixaEtaria = faixaEtaria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	
	public void filtrarNomeSapato() {
		//Função de filtro de nome de sapatos cadastrados
	}
	
}
