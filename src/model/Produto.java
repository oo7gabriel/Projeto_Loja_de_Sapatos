package model;

public abstract class Produto {

	private String nomeProduto;
	private double precoVenda;
	private double precoAtacado;
	private String marca;
	private int Tamanho;
	private String cor;
	private String material;
	private String genero;
	private double taxaLucro; 
	
	public Produto() {
	}

	public Produto(String nomeProduto, double precoVenda, double precoAtacado, String marca, int tamanho, String cor,
			String material, String genero, double taxaLucro) {
		this.nomeProduto = nomeProduto;
		this.precoVenda = precoVenda;
		this.precoAtacado = precoAtacado;
		this.marca = marca;
		Tamanho = tamanho;
		this.cor = cor;
		this.material = material;
		this.genero = genero;
		this.taxaLucro = taxaLucro;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getPrecoAtacado() {
		return precoAtacado;
	}

	public void setPrecoAtacado(double precoAtacado) {
		this.precoAtacado = precoAtacado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTamanho() {
		return Tamanho;
	}

	public void setTamanho(int tamanho) {
		Tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getTaxaLucro() {
		return taxaLucro;
	}

	public void setTaxaLucro(double taxaLucro) {
		this.taxaLucro = taxaLucro;
	}
	
}
