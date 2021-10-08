package controller;

import java.util.ArrayList;
import java.util.List;

import model.Endereco;
import model.Funcionario;
import model.Salario;


public class ControleFuncionario {

	private List<Funcionario> f;
	private int qtdFuncionarios;
	
	public ControleFuncionario(Controle_Dados dado) {
		f = dado.getFunci();
		qtdFuncionarios = f.size();
	}
	
	public List<String> getNomeFuncL() {
		List<String> s = new ArrayList<String>(qtdFuncionarios);
		for(int i = 0; i < qtdFuncionarios; i++) {
			s.add(f.get(i).getNomeFunc());
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
		return f.get(i).getUsuario();
	}
	
	public String getSenha(int i) {
		return f.get(i).getSenha();
	}
	
	public String getNomeFunc(int i) {
		return f.get(i).getNomeFunc();
	}
	
	public String getTelefone(int i) {
		return f.get(i).getTelefone();
	}
	
	public int getVendas_realizadas(int i) {
		return f.get(i).getVendas_realizadas();
	}
	
	public String getEmail(int i) {
		return f.get(i).getEmail();
	}
	
	public Endereco getEndFunc(int i) {
		return f.get(i).getEndFunc();
	}
	
	public Salario getSalFunc(int i) {
		return f.get(i).getSalFunc();
	}
	
}
