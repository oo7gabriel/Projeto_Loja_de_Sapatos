package model;

import java.text.SimpleDateFormat;

public class Salario {

	private SimpleDateFormat mes;
	private double salarioFixo ;
	
	public Salario() {
	}

	public Salario(SimpleDateFormat mes, double salarioFixo) {
		this.mes = mes;
		this.salarioFixo = salarioFixo;
	}

	public SimpleDateFormat getMes() {
		return mes;
	}

	public void setMes(SimpleDateFormat mes) {
		this.mes = mes;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	
	
}
