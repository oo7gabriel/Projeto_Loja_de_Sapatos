package model;

public class Estoque {
	private int idEstoque;
	private int quantidade;
	
	
	public Estoque() {
	}

	public Estoque(int idEstoque, int quantidade) {
		this.idEstoque = idEstoque;
		this.quantidade = quantidade;
	}

	public int getIdEstoque() {
		return idEstoque;
	}

	public void setIdEstoque(int idEstoque) {
		this.idEstoque = idEstoque;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
