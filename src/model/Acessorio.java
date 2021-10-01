package model;

public class Acessorio extends Produto{

	private String uso;
	
	public Acessorio() {
		super();
	}

	public Acessorio(String nomeProduto, double precoVenda, double precoAtacado, String marca, int tamanho, String cor,
			String material, String genero, double taxaLucro, String uso) {
		super(nomeProduto, precoVenda, precoAtacado, marca, tamanho, cor, material, genero, taxaLucro);
		this.uso = uso;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}
	
	public void filtrarNomeAcessorio() {
		//Função de filtro de nome de acessórios cadastrados
	}
	
}
