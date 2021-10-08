package model;

import java.util.Calendar;
import java.util.Date;

import view.Login_Menu;

public class Dados {
	private Administrador adm = new Administrador(0,"sergio21","123456",0,"Sergio Ramos", "9333781","ser@gmail.com");
	
	private Funcionario[] funci = new Funcionario[100];
	private int qtdFunci = 0;
	private static Cliente[] cliente = new Cliente[400];
	private int qtdClien = 0;
	private Sapato[] sap = new Sapato[200];
	private int qtdSap = 0;
	private Acessorio[] acesso = new Acessorio[200];
	private int qtdAcs = 0;
	private Estoque[] estoque = new Estoque[200];
	private int qtdEstque = 0;
	private Venda[] venda = new Venda[1000];
	private int qtdVen = 0;
	
	public void preencherDados() {
		
		double sal = 1000.0;
		  
		Endereco end0 = new Endereco("7200320","Brasilia","Lote 20 Quadra", 11, "DF", "Gama","nenhuma");
		Endereco end1 = new Endereco("7250300","Brasilia","Lote 45 Quadra", 11, "DF", "Santa Maria","nenhuma");
		Endereco end2 = new Endereco("7250300","Brasilia","Lote 4 Prédio Gardenal Andar", 55, "DF", "Santa Maria","nenhuma");
		Endereco end3 = new Endereco("7250300","Brasilia","Lote 25 Prédio Gardenal Andar", 32, "DF", "Santa Maria","nenhuma");
		Endereco end4 = new Endereco("7250300","Brasilia","Lote 435 Prédio Gardenal Andar", 47, "DF", "Santa Maria","nenhuma");
		Endereco end5 = new Endereco("7250300","Brasilia","Lote 35 Prédio Gardenal Andar", 23, "DF", "Santa Maria","nenhuma");
		Endereco end6 = new Endereco("7250300","Brasilia","Lote 65 Prédio Gardenal Andar", 121, "DF", "Santa Maria","nenhuma");
		Endereco end7 = new Endereco("7250300","Brasilia","Lote 645 Prédio Gardenal Andar", 41, "DF", "Santa Maria","nenhuma");
		Endereco end8 = new Endereco("7250300","Brasilia","Lote 75 Prédio Gardenal Andar", 11, "DF", "Santa Maria","nenhuma");
		Endereco end9 = new Endereco("7250300","Brasilia","Lote 98 Prédio Gardenal Andar", 21, "DF", "Santa Maria","nenhuma");
		
		Date data = Calendar.getInstance().getTime();
		
		Salario sal0 = new Salario(data,sal);
		
		
		funci[0] = new Funcionario(1,"gab1","6789",1,"Gabriel","93389",2,"gabriel@gmail.com",end0 ,sal0);
		funci[1] = new Funcionario(2,"gab1","6789",1,"Gabriel","93389",23,"gabriel@gmail.com",end3 ,sal0);
		funci[2] = new Funcionario(3,"gab1","6789",1,"Gabriel","93389",4,"gabriel@gmail.com",end4 ,sal0);
		funci[3] = new Funcionario(4,"gab1","6789",1,"Gabriel","93389",53,"gabriel@gmail.com",end5 ,sal0);
		funci[4] = new Funcionario(5,"gab1","6789",1,"Gabriel","93389",42,"gabriel@gmail.com",end6 ,sal0);
		
		cliente[0] = new Cliente(0,"Armando","966555","444455533",end1);
		cliente[1] = new Cliente(1,"Arnaldo","96633","4444555212",end7);
		cliente[2] = new Cliente(2,"Serginho","962225","42253322",end8);
		cliente[3] = new Cliente(3,"Sarah","933222","4444522",end9);
		cliente[4] = new Cliente(4,"Leticia","9333355","4444522",end2);
		
		
		sap[0] = new Sapato("Sapato Polo",90.0,72.0,"Polo",40,"Azul","Couro","Masculino",0.2,"calçado","Juvenil");
		sap[1] = new Sapato("Sapato Polo",90.0,72.0,"Polo",40,"Azul","Couro","Masculino",0.2,"calçado","Juvenil");
		sap[2] = new Sapato("Sapato Polo",90.0,72.0,"Polo",40,"Azul","Couro","Masculino",0.2,"calçado","Juvenil");
		sap[3] = new Sapato("Sapato Polo",90.0,72.0,"Polo",40,"Azul","Couro","Masculino",0.2,"calçado","Juvenil");
		sap[4] = new Sapato("Sapato Polo",90.0,72.0,"Polo",40,"Azul","Couro","Masculino",0.2,"calçado","Juvenil");
		
		acesso[0] = new Acessorio("Relógio",40.0,20.0,"Rolex",14,"preto","Aço Inoxidavel","masculino",0.5,"punho");
		acesso[1] = new Acessorio("Relógio",40.0,20.0,"Rolex",14,"preto","Aço Inoxidavel","masculino",0.5,"punho");
		acesso[2] = new Acessorio("Relógio",40.0,20.0,"Rolex",14,"preto","Aço Inoxidavel","masculino",0.5,"punho");
		acesso[3] = new Acessorio("Relógio",40.0,20.0,"Rolex",14,"preto","Aço Inoxidavel","masculino",0.5,"punho");
		acesso[4] = new Acessorio("Relógio",40.0,20.0,"Rolex",14,"preto","Aço Inoxidavel","masculino",0.5,"punho");
	
		estoque[0] = new Estoque(0,12);
		estoque[1] = new Estoque(1,4);
		estoque[2] = new Estoque(2,7);
		estoque[3] = new Estoque(3,9);
		estoque[4] = new Estoque(4,12);
		
		venda[0] = new Venda(0,sap[0],acesso[3],data,data,1600.00, cliente[0],funci[0]);
		venda[1] = new Venda(1,sap[1],acesso[2],data,data,1200.00, cliente[1],funci[1]);
		venda[2] = new Venda(2,sap[3],acesso[0],data,data,1500.00, cliente[2],funci[2]);
		venda[3] = new Venda(3,sap[2],acesso[3],data,data,1700.00, cliente[3],funci[3]);
		venda[4] = new Venda(4,sap[4],acesso[2],data,data,2000.00, cliente[4],funci[4]);
		
		qtdFunci = 5;
		qtdClien = 5;
		qtdSap = 5;
		qtdAcs = 5;
		qtdEstque = 5;
		qtdVen = 5;
	
	}

	public static void main(String[] args) {
		System.out.println(cliente);	
	}
	
	
	public Administrador getAdm() {
		return adm;
	}

	public void setAdm(Administrador adm) {
		this.adm = adm;
	}

	public Funcionario[] getFunci() {
		return funci;
	}

	public void setFunci(Funcionario[] funci) {
		this.funci = funci;
	}
	
	public void inserirEditarFunc(Funcionario f, int pos) {
		this.funci[pos] = f;
		if(pos == qtdFunci) qtdFunci++;
	}

	public int getQtdFunci() {
		return qtdFunci;
	}

	public void setQtdFunci(int qtdFunci) {
		this.qtdFunci = qtdFunci;
	}

	public Cliente[] getCliente() {
		return cliente;
	}

	public void setCliente(Cliente[] cliente) {
		this.cliente = cliente;
	}
	
	public void inserirEditarCliente(Cliente c, int pos) {
		this.cliente[pos] = c;
		if(pos == qtdClien) qtdClien++;
	}

	public int getQtdClien() {
		return qtdClien;
	}

	public void setQtdClien(int qtdClien) {
		this.qtdClien = qtdClien;
	}

	public Sapato[] getSap() {
		return sap;
	}

	public void setSap(Sapato[] sap) {
		this.sap = sap;
	}
	
	public void inserirEditarSapato(Sapato sao, int pos) {
		this.sap[pos] = sao;
		if(pos == qtdSap) qtdSap++;
	}

	public int getQtdSap() {
		return qtdSap;
	}

	public void setQtdSap(int qtdSap) {
		this.qtdSap = qtdSap;
	}

	public Acessorio[] getAcesso() {
		return acesso;
	}

	public void setAcesso(Acessorio[] acesso) {
		this.acesso = acesso;
	}
	
	public void inserirEditarAcessorio(Acessorio acse, int pos) {
		this.acesso[pos] = acse;
		if(pos == qtdAcs) qtdAcs++;
	}

	public int getQtdAcs() {
		return qtdAcs;
	}

	public void setQtdAcs(int qtdAcs) {
		this.qtdAcs = qtdAcs;
	}

	public Estoque[] getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque[] estoque) {
		this.estoque = estoque;
	}
	
	public void inserirEditarEstoque(Estoque est, int pos) {
		this.estoque[pos] = est;
		if(pos == qtdEstque) qtdEstque++;
	}

	public int getQtdEstque() {
		return qtdEstque;
	}

	public void setQtdEstque(int qtdEstque) {
		this.qtdEstque = qtdEstque;
	}

	public Venda[] getVenda() {
		return venda;
	}

	public void setVenda(Venda[] venda) {
		this.venda = venda;
	}
	
	public void inserirEditarVenda(Venda ves, int pos) {
		this.venda[pos] = ves;
		if(pos == qtdVen) qtdVen++;
	}

	public int getQtdVen() {
		return qtdVen;
	}

	public void setQtdVen(int qtdVen) {
		this.qtdVen = qtdVen;
	}
	
	
	
}
