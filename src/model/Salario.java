package model;

import java.util.Date;

public class Salario {

	private Date mes;
	private double salarioFixo ;
	
	public Salario() {
	}

	public Salario(Date mes, double salarioFixo) {
		this.mes = mes;
		this.salarioFixo = salarioFixo;
	}

	public Date getMes() {
		return mes;
	}

	public void setMes(Date mes) {
		this.mes = mes;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	
	public double consultaComissao() {
		//Fun��o para realizar c�lculo de comiss�o do sal�rio
		return 0.0;
	}
	
}
