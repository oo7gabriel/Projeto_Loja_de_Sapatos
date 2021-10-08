package model;

import java.util.Date;

public class Venda {
	
	private int idVenda;
	private Date dataVenda;
	private Date horaVenda;
	private double commissaoVenda;
	
	Cliente clie;
	Funcionario func;
	Sapato sapato;
	Acessorio acessorios;
	
	public Venda() {
	}

	public Venda(int idVenda,Sapato sapato, Acessorio acessorios, Date dataVenda, Date horaVenda, double commissaoVenda, Cliente clie, Funcionario func) {
		super();
		this.idVenda = idVenda;
		this.sapato = sapato;
		this.acessorios = acessorios;
		this.dataVenda = dataVenda;
		this.horaVenda = horaVenda;
		this.commissaoVenda = commissaoVenda;
		this.clie = clie;
		this.func = func;
	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Date getHoraVenda() {
		return horaVenda;
	}

	public void setHoraVenda(Date horaVenda) {
		this.horaVenda = horaVenda;
	}

	public double getCommissaoVenda() {
		return commissaoVenda;
	}

	public void setCommissaoVenda(double commissaoVenda) {
		this.commissaoVenda = commissaoVenda;
	}

	public Cliente getClie() {
		return clie;
	}

	public void setClie(Cliente clie) {
		this.clie = clie;
	}

	public Funcionario getFunc() {
		return func;
	}

	public void setFunc(Funcionario func) {
		this.func = func;
	}
	
	
	
}
