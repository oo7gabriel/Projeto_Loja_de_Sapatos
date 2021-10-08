package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controller.ControleCliente;
import controller.Controle_Dados;

public class TelaCliente implements ActionListener, ListSelectionListener {
	
	private JFrame janelaConta;
	private JLabel tituloConta;
	private JButton cadastroCliente;
	private JButton refreshCliente;
	
	private static Controle_Dados d;
	
	private JList<String> listaClientesCadastrados;
	
	private String[] listaNomes = new String[50];
	
	public void mostrarDados(Controle_Dados dados, int op) {
		d = dados;
		
		switch(op) {
		
		case 1:
			listaNomes = new ControleCliente(d).getNomeClienL();
			listaClientesCadastrados = new JList<String>(listaNomes);
			
			janelaConta = new JFrame("Alunos");
			tituloConta = new JLabel("Alunos Cadastrados");
			cadastroCliente = new JButton("Cadastrar");
			refreshCliente = new JButton("Refresh");

			tituloConta.setFont(new Font("Arial", Font.BOLD, 20));
			tituloConta.setBounds(90, 10, 250, 30);
			listaClientesCadastrados.setBounds(20, 50, 350, 120);
			listaClientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaClientesCadastrados.setVisibleRowCount(10);

			cadastroCliente.setBounds(70, 177, 100, 30);
			refreshCliente.setBounds(200, 177, 100, 30);

			janelaConta.setLayout(null);

			janelaConta.add(tituloConta);
			janelaConta.add(listaClientesCadastrados);
			janelaConta.add(cadastroCliente);
			janelaConta.add(refreshCliente);

			janelaConta.setSize(400, 250);
			janelaConta.setVisible(true);

			cadastroCliente.addActionListener(this);
			refreshCliente.addActionListener(this);
			listaClientesCadastrados.addListSelectionListener(this);

			break;
			
		}
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object acao = e.getSource();
		
		if(acao == cadastroCliente) {
			new TelaDetalheCliente().inserirEditar(1, d, this, 0);
		}
		
		if(acao == refreshCliente) {
			listaClientesCadastrados.setListData(new ControleCliente(d).getNomeClienL());			
			listaClientesCadastrados.updateUI();
		}
		
	}
	
	@Override
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaClientesCadastrados) {
			new TelaDetalheCliente().inserirEditar(3, d, this, 
					listaClientesCadastrados.getSelectedIndex());
		}

		}
}
