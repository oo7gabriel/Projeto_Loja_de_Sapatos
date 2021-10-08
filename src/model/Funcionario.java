package model;

public class Funcionario extends Conta {
	
	private String nomeFunc;
	private String telefone;
	private int vendas_realizadas;
	private String email;
	
	Endereco endFunc;
	Salario salFunc;
	
	public Funcionario() {
		super();
	}

	public Funcionario(int idConta, String usuario, String senha, int nivel, int idFunc, String nomeFunc,
			String telefone, int vendas_realizadas, String email, Endereco endFunc, Salario salFunc) {
		super(idConta, usuario, senha, nivel);
		this.nomeFunc = nomeFunc;
		this.telefone = telefone;
		this.vendas_realizadas = vendas_realizadas;
		this.email = email;
		this.endFunc = endFunc;
		this.salFunc = salFunc;
	}

	public String getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getVendas_realizadas() {
		return vendas_realizadas;
	}

	public void setVendas_realizadas(int vendas_realizadas) {
		this.vendas_realizadas = vendas_realizadas;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndFunc() {
		return endFunc;
	}

	public void setEndFunc(Endereco endFunc) {
		this.endFunc = endFunc;
	}

	public Salario getSalFunc() {
		return salFunc;
	}

	public void setSalFunc(Salario salFunc) {
		this.salFunc = salFunc;
	}
	
	

}
