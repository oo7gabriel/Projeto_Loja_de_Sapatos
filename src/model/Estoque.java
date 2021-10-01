package model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	private int idEstoque;
	private int quantidade;
	
	private List<Produto> prod = new ArrayList<>();
	
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
	
	public void filtrarNomeEstoque() {
		//Filtrar estoque pelo nome ID ou nome do produto
	}
	
	public void cadastrarSapato(Produto produtos) {
		prod.add(new Sapato("ZZebu", 150.00, 100.00, "Remu", 36, "azul", "carmusa", "masculino", 20.00, "calçado", "Adulto"));
	}
	
	public void removerSapato(Produto produtos) {
		//Remover Sapato 
	}
	
	public void cadastrarAcessorio(Produto produtos) {
		prod.add(new Acessorio("ZZara", 50.00, 10.00, "RZemu", 10, "azul", "couro", "feminino", 20.00, "pulseira"));
	}
	
	public void removerAcessorio(Produto produtos){
		//Função Remover Acessorio
	}
	
	
	
}
