package model;

public class Endereco {
	
	private String cep;
	private String logradouro;
	private String complemento;
	private int numero;
	private String estado;
	private String bairro;
	private String infoAdicio;
	
	public Endereco() {
	}

	public Endereco(String cep, String logradouro, String complemento, int numero, String estado, String bairro,
			String infoAdicio) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.numero = numero;
		this.estado = estado;
		this.bairro = bairro;
		this.infoAdicio = infoAdicio;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getInfoAdicio() {
		return infoAdicio;
	}

	public void setInfoAdicio(String infoAdicio) {
		this.infoAdicio = infoAdicio;
	}
	
	
	
	
}
