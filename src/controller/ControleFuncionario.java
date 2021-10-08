package controller;

import model.Endereco;
import model.Funcionario;
import model.Salario;


public class ControleFuncionario {

	private Funcionario[] f;
	private int qtdFuncionarios;
	
	public ControleFuncionario(Controle_Dados dado) {
		f = dado.getFunci();
		qtdFuncionarios = dado.getQtdFunci();
	}
	
	public String[] getNomeFuncL() {
		String[] s = new String[qtdFuncionarios];
		for(int i = 0; i < qtdFuncionarios; i++) {
			s[i] = f[i].getNomeFunc();
		}
		
		return s;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}
	
	public String getUsuario(int i) {
		return f[i].getUsuario();
	}
	
	public String getSenha(int i) {
		return f[i].getSenha();
	}
	
	public String getNomeFunc(int i) {
		return f[i].getNomeFunc();
	}
	
	public String getTelefone(int i) {
		return f[i].getTelefone();
	}
	
	public int getVendas_realizadas(int i) {
		return f[i].getVendas_realizadas();
	}
	
	public String getEmail(int i) {
		return f[i].getEmail();
	}
	
	public Endereco getEndFunc(int i) {
		return f[i].getEndFunc();
	}
	
	public Salario getSalFunc(int i) {
		return f[i].getSalFunc();
	}
	
}
