package controller;

import model.Acessorio;
import model.Administrador;
import model.Cliente;
import model.Dados;
import model.Endereco;
import model.Estoque;
import model.Funcionario;
import model.Sapato;
import model.Venda;

public class Controle_Dados {

	private Dados dado = new Dados() ;
	
	public Controle_Dados() {
		dado.preencherDados();
	}
	
	public Dados getDados() {
		return dado;
	}
	public void setDados(Dados dado) {
		this.dado = dado;
	}
	
	public Administrador getAdminis() {
		return this.dado.getAdm();
	}
	
	public Funcionario[] getFunci() {
		return this.dado.getFunci();
	}
	
	
	public int getQtdFunci() {
		return this.dado.getQtdFunci();
	}

	
	public Cliente[] getCliente() {
		return this.dado.getCliente();
	}
	
	
	public int getQtdClien() {
		return this.dado.getQtdClien();
	}
	
	public Sapato[] getSap() {
		return this.dado.getSap();
	}
	
	public int getQtdSap() {
		return this.dado.getQtdSap();
	}
	
	public Acessorio[] getAcesso() {
		return this.dado.getAcesso();
	}
	
	
	public int getQtdAcs() {
		return this.dado.getQtdAcs();
	}
	
	public Estoque[] getEstoque() {
		return this.dado.getEstoque();
	}
	
	public int getQtdEstque() {
		return this.dado.getQtdEstque();
	}
	
	
	public Venda[] getVenda() {
		return this.dado.getVenda();
	}
	
	public int getQtdVen() {
		return this.dado.getQtdVen();
	}
	
	
	//Método de Criação, Edição e Remoção
	
	public boolean inserirEditarFunci(String[] dadosFuncionarios) {
		return false;
	}
	
	public boolean removerFunci(int i) {
		return false;
	}
	
	public boolean inserirEditarCliente(String[] dadosCliente) {
		Cliente c = new Cliente(Integer.parseInt(dadosCliente[1]), dadosCliente[2], dadosCliente[3], 
				dadosCliente[4], new Endereco(dadosCliente[5],dadosCliente[6],dadosCliente[7],Integer.parseInt(dadosCliente[8]),dadosCliente[9],dadosCliente[10],dadosCliente[11]));
		dado.inserirEditarCliente(c, Integer.parseInt(dadosCliente[0]));
		return true;
	}
	
	public boolean removerCliente(int i) {
		String clienteRemovido = dado.getCliente()[i].getNomeCliente();
		
		if(i == (dado.getQtdClien() -1)) {
			dado.setQtdClien(dado.getQtdClien() - 1);
			dado.getCliente()[dado.getQtdClien()] = null;
			
			return true;
		}else {
			int cont = 0;
			
				while(dado.getCliente()[cont].getNomeCliente().compareTo(clienteRemovido) != 0){
					cont++;
				}
				
				for(int j = cont; j < dado.getQtdClien() - 1; j++) {
					dado.getCliente()[j] = null ;
					dado.getCliente()[j] = dado.getCliente()[j+1];
				}
				
				dado.getCliente()[dado.getQtdClien()] = null;
				dado.setQtdClien(dado.getQtdClien() - 1);
				return true;
				
		}
		
		
	}
	
	public boolean inserirEditarSap(String[] dadosSap) {
		return false;
	}
	
	public boolean removerSap(int i) {
		return false;
	}
	
	public boolean inserirEditarAcess(String[] dadosAcess) {
		return false;
	}
	
	public boolean removerAcess(int i) {
		return false;
	}
	
	
	public boolean inserirEditarEstoque(String[] dadosEstoque) {
		return false;
	}
	
	public boolean removerEstoque(int i) {
		return false;
	}
	
	public boolean inserirEditarVenda(String[] dadosVenda) {
		return false;
	}
	
	public boolean removerVenda(int i) {
		return false;
	}
	
}
