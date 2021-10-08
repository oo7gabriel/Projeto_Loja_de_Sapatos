package model;

public class Cliente {

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", telefoneCliente="
				+ telefoneCliente + ", cpfCliente=" + cpfCliente + ", endCliente=" + endCliente + "]";
	}

	private int idCliente;
	private String nomeCliente;
	private String telefoneCliente;
	private String cpfCliente;
	
	private Endereco endCliente; // referente ao endereço
	
	public Cliente() {
	}

	public Cliente(int idCliente, String nomeCliente, String telefoneCliente, String cpfCliente, Endereco endCliente) {
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.telefoneCliente = telefoneCliente;
		this.cpfCliente = cpfCliente;
		this.endCliente = endCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public Endereco getEndCliente() {
		return endCliente;
	}

	public void setEndCliente(Endereco endCliente) {
		this.endCliente = endCliente;
	}
	
}
