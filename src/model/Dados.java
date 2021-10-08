package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Dados {
	private List<Administrador> adminis = new ArrayList<>();
	
	private List<Funcionario> funci = new ArrayList<>();
	private List<Cliente> cliente = new ArrayList<>();
	private List<Sapato> sap = new ArrayList<>();
	private List<Acessorio> acesso = new ArrayList<>();
	private List<Estoque> estoque = new ArrayList<>();
	private List<Venda> venda = new ArrayList<>();
	
	public void preencherDados() {
		Administrador adm = new Administrador(0,"sergio21","123456",0,"Sergio Ramos", "9333781","ser@gmail.com");
		adminis.add(adm);
		
		SimpleDateFormat dateSal = new SimpleDateFormat("dd/MM/yyyy"); 
		SimpleDateFormat hourVenda = new SimpleDateFormat("HH:mm:ss");
		
		
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
		
		
		Salario sal0 = new Salario(dateSal,sal);
		
		
		Funcionario func0 = new Funcionario(1,"gab1","6789",1,"Gabriel","93389",2,"gabriel@gmail.com",end0 ,sal0);
		Funcionario func1 = new Funcionario(2,"gab1","6789",1,"Gabriel","93389",23,"gabriel@gmail.com",end3 ,sal0);
		Funcionario func2 = new Funcionario(3,"gab1","6789",1,"Gabriel","93389",4,"gabriel@gmail.com",end4 ,sal0);
		Funcionario func3 = new Funcionario(4,"gab1","6789",1,"Gabriel","93389",53,"gabriel@gmail.com",end5 ,sal0);
		Funcionario func4 = new Funcionario(5,"gab1","6789",1,"Gabriel","93389",42,"gabriel@gmail.com",end6 ,sal0);
		
		funci.add(func0);
		funci.add(func1);
		funci.add(func2);
		funci.add(func3);
		funci.add(func4);
		
		Cliente cli0 = new Cliente(0,"Armando","966555","444455533",end1);
		Cliente cli1 = new Cliente(1,"Arnaldo","96633","4444555212",end7);
		Cliente cli2 = new Cliente(2,"Serginho","962225","42253322",end8);
		Cliente cli3 = new Cliente(3,"Sarah","933222","4444522",end9);
		Cliente cli4 = new Cliente(4,"Leticia","9333355","4444522",end2);
		
		cliente.add(cli0);
		cliente.add(cli1);
		cliente.add(cli2);
		cliente.add(cli3);
		cliente.add(cli4);
		
		Sapato sapa0 = new Sapato("Sapato Polo",90.0,72.0,"Polo",40,"Azul","Couro","Masculino",0.2,"calçado","Juvenil");
		Sapato sapa1 = new Sapato("Sapato Polo",90.0,72.0,"Polo",40,"Azul","Couro","Masculino",0.2,"calçado","Juvenil");
		Sapato sapa2 = new Sapato("Sapato Polo",90.0,72.0,"Polo",40,"Azul","Couro","Masculino",0.2,"calçado","Juvenil");
		Sapato sapa3 = new Sapato("Sapato Polo",90.0,72.0,"Polo",40,"Azul","Couro","Masculino",0.2,"calçado","Juvenil");
		Sapato sapa4 = new Sapato("Sapato Polo",90.0,72.0,"Polo",40,"Azul","Couro","Masculino",0.2,"calçado","Juvenil");
		
		sap.add(sapa0);
		sap.add(sapa1);
		sap.add(sapa2);
		sap.add(sapa3);
		sap.add(sapa4);
		
		Acessorio acess0 = new Acessorio("Relógio",40.0,20.0,"Rolex",14,"preto","Aço Inoxidavel","masculino",0.5,"punho");
		Acessorio acess1 = new Acessorio("Relógio",40.0,20.0,"Rolex",14,"preto","Aço Inoxidavel","masculino",0.5,"punho");
		Acessorio acess2 = new Acessorio("Relógio",40.0,20.0,"Rolex",14,"preto","Aço Inoxidavel","masculino",0.5,"punho");
		Acessorio acess3 = new Acessorio("Relógio",40.0,20.0,"Rolex",14,"preto","Aço Inoxidavel","masculino",0.5,"punho");
		Acessorio acess4 = new Acessorio("Relógio",40.0,20.0,"Rolex",14,"preto","Aço Inoxidavel","masculino",0.5,"punho");
		
		acesso.add(acess0);
		acesso.add(acess1);
		acesso.add(acess2);
		acesso.add(acess3);
		acesso.add(acess4);
		
		Estoque est0 = new Estoque(0,12);
		Estoque est1 = new Estoque(1,4);
		Estoque est2 = new Estoque(2,7);
		Estoque est3 = new Estoque(3,9);
		Estoque est4 = new Estoque(4,12);
		
		estoque.add(est0);
		estoque.add(est1);
		estoque.add(est2);
		estoque.add(est3);
		estoque.add(est4);
		
		Venda vend0 = new Venda(0,sapa0,null,dateSal,hourVenda,1600.00, cli0,func0);
		Venda vend1 = new Venda(1,sapa1,acess2,dateSal,hourVenda,1200.00, cli1,func1);
		Venda vend2 = new Venda(2,sapa3,acess0,dateSal,hourVenda,1500.00, cli2,func2);
		Venda vend3 = new Venda(3,sapa2,acess3,dateSal,hourVenda,1700.00, cli3,func3);
		Venda vend4 = new Venda(4,sapa4,acess2,dateSal,hourVenda,2000.00, cli4,func4);
		
		venda.add(vend0);
		venda.add(vend1);
		venda.add(vend2);
		venda.add(vend3);
		venda.add(vend4);
		
		
	}

	public List<Administrador> getAdminis() {
		return adminis;
	}

	public void setAdminis(List<Administrador> adminis) {
		this.adminis = adminis;
	}

	public List<Funcionario> getFunci() {
		return funci;
	}

	public void setFunci(List<Funcionario> funci) {
		this.funci = funci;
	}
	
	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}
	
	public List<Sapato> getSap() {
		return sap;
	}

	public void setSap(List<Sapato> sap) {
		this.sap = sap;
	}

	public List<Acessorio> getAcesso() {
		return acesso;
	}

	public void setAcesso(List<Acessorio> acesso) {
		this.acesso = acesso;
	}
	
	public List<Estoque> getEstoque() {
		return estoque;
	}

	public void setEstoque(List<Estoque> estoque) {
		this.estoque = estoque;
	}

	public List<Venda> getVenda() {
		return venda;
	}

	public void setVenda(List<Venda> venda) {
		this.venda = venda;
	}
	
}
