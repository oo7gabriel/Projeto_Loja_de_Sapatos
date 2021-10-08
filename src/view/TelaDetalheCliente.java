package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Controle_Dados;

public class TelaDetalheCliente {

	
	private JFrame janelaDetConta;
	private JLabel labelId = new JLabel("Id: ");
	private JTextField valorId;
	private JLabel labelNomCliente = new JLabel("Nome: ");
	private JTextField valorNomCliente;
	private JLabel labelTel = new JLabel("Telefone: ");
	private JTextField valorTel;
	private JLabel labelCpf = new JLabel("CPF: ");
	private JTextField valorCpf;
	private JLabel labelEndereco = new JLabel("Endereco: ");
	private JTextField enderecoCep;
	private JLabel labelEnderecoLogra = new JLabel("Endereco Logradouro: ");
	private JTextField enderecoLogra;
	private JLabel labelEnderecoComplemento = new JLabel("Complemento: ");
	private JTextField enderecoComple;
	private JLabel labelEnderecoNum = new JLabel("Numero: ");
	private JTextField enderecoNum;
	private JLabel labelEnderecoEstado = new JLabel("Estado: ");
	private JTextField enderecoEstado;
	private JLabel labelEnderecoBairro = new JLabel("Bairro: ");
	private JTextField enderecoBairro;
	private JLabel labelEnderecoInfoAdi = new JLabel("Info. Adicional: ");
	private JTextField enderecoInfoAdi;
	
	
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	
	private String[] novoDado = new String[30];
	
	private static Controle_Dados d;
	private int posicao;
	private int opcao;
	private String s;
	
	public void inserirEditar(int op, Controle_Dados dados, TelaCliente coa, int pos) {
		
		opcao = op;
		posicao = pos;
		d = dados;
		
		if (op == 1) s = "Cadastro de Cliente";
		if (op == 3) s = "Detalhe de Cliente";
		
		janelaDetConta = new JFrame(s);
		
		if (op == 3) {
			valorId = new JTextField(String.valueOf(d.getCliente()[pos].getIdCliente()), 200);
			valorNomCliente = new JTextField(d.getCliente()[pos].getNomeCliente(),200);
			valorTel = new JTextField(d.getCliente()[pos].getTelefoneCliente(),200);
			valorCpf = new JTextField(d.getCliente()[pos].getCpfCliente(),200);
			enderecoCep = new JTextField(String.valueOf(d.getCliente()[pos].getEndCliente().getCep()),200);
			enderecoLogra = new JTextField(String.valueOf(d.getCliente()[pos].getEndCliente().getLogradouro()),200);
			enderecoComple = new JTextField(String.valueOf(d.getCliente()[pos].getEndCliente().getComplemento()),200);
			enderecoNum = new JTextField(String.valueOf(d.getCliente()[pos].getEndCliente().getNumero()),200);
			enderecoEstado = new JTextField(String.valueOf(d.getCliente()[pos].getEndCliente().getEstado()),200);
			enderecoBairro = new JTextField(String.valueOf(d.getCliente()[pos].getEndCliente().getBairro()),200);
			enderecoInfoAdi = new JTextField(String.valueOf(d.getCliente()[pos].getEndCliente().getInfoAdicio()),200);
			
		}else {
			valorId = new JTextField(200);
			valorNomCliente = new JTextField(200);
			valorTel = new JTextField(200);
			valorCpf = new JTextField(200);
			enderecoCep = new JTextField(200);
			enderecoLogra = new JTextField(200);
			enderecoComple = new JTextField(200);
			enderecoNum = new JTextField(200);
			enderecoEstado = new JTextField(200);
			enderecoBairro = new JTextField(200);
			enderecoInfoAdi= new JTextField(200);
			
			botaoSalvar.setBounds(245, 175, 115, 30);
		}
		
		labelId.setBounds(30, 20, 150, 25);
		valorId.setBounds(180, 20, 180, 25);
		labelNomCliente.setBounds(30, 50, 150, 25);
		valorNomCliente.setBounds(180, 50, 180, 25);
		labelTel.setBounds(30, 50, 180, 25);
		valorTel.setBounds(180, 50, 180, 25);
		labelCpf.setBounds(30, 80, 150, 25);
		valorCpf.setBounds(180, 80, 180, 25);
		
		labelEndereco.setBounds(30, 110, 150, 25);
		enderecoCep.setBounds(180, 110, 180, 25);
		labelEnderecoLogra.setBounds(30,140,150,25);
		enderecoLogra.setBounds(180,140,180,25);
		labelEnderecoComplemento.setBounds(30,170,150,25);
		enderecoComple.setBounds(180,170,180,25);
		labelEnderecoNum.setBounds(30,200,150,25);
		enderecoNum.setBounds(180,200,180,25);
		labelEnderecoEstado.setBounds(30,230,150,25);
		enderecoEstado.setBounds(180,230,180,25);
		labelEnderecoBairro.setBounds(30,260,150,25);
		enderecoBairro.setBounds(180,260,180,25);
		labelEnderecoInfoAdi.setBounds(30,290,150,25);
		enderecoInfoAdi.setBounds(180,290,180,25);
		
		janelaDetConta.add(labelId);
		janelaDetConta.add(valorId);
		janelaDetConta.add(labelNomCliente);
		janelaDetConta.add(valorNomCliente);
		janelaDetConta.add(labelTel);
		janelaDetConta.add(valorTel);
		janelaDetConta.add(labelCpf);
		janelaDetConta.add(valorCpf);
		janelaDetConta.add(labelEndereco);
		janelaDetConta.add(enderecoCep);
		janelaDetConta.add(labelEnderecoLogra);
		janelaDetConta.add(enderecoLogra);
		janelaDetConta.add(labelEnderecoComplemento);
		janelaDetConta.add(enderecoComple);
		janelaDetConta.add(labelEnderecoNum);
		janelaDetConta.add(enderecoNum);
		janelaDetConta.add(labelEnderecoEstado);
		janelaDetConta.add(enderecoEstado);
		janelaDetConta.add(labelEnderecoBairro);
		janelaDetConta.add(enderecoBairro);
		janelaDetConta.add(labelEnderecoInfoAdi);
		janelaDetConta.add(enderecoInfoAdi);
		
		this.janelaDetConta.setLayout(null);

		this.janelaDetConta.setSize(400, 450);
		this.janelaDetConta.setVisible(true);

		botaoSalvar.addActionListener((ActionListener) this);
		botaoExcluir.addActionListener((ActionListener) this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object acao = e.getSource();
		if(acao == botaoSalvar) {
			try {
				boolean res;
				if(opcao == 1) {
					novoDado[0] = Integer.toString(d.getQtdClien());
				}else
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] =  valorId.getText();
				novoDado[2] =  valorNomCliente.getText();
				novoDado[3] =  valorTel.getText();
				novoDado[4] =  valorCpf.getText();
				novoDado[5] =  enderecoCep.getText();
				novoDado[6] =  enderecoLogra.getText();
				novoDado[7] =  enderecoComple.getText();
				novoDado[8] =  enderecoNum.getText();
				novoDado[9] =  enderecoEstado.getText();
				novoDado[10] = enderecoBairro.getText();
				novoDado[11] = enderecoInfoAdi.getText();
				
				res = d.inserirEditarCliente(novoDado);
			
				if(res) {
					mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if(acao == botaoExcluir) {
			boolean res = false;

			if (opcao == 3) {
				res = d.removerCliente(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoCliente(); 
			}
			
		}
	}
	
	
	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janelaDetConta.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janelaDetConta.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n ", null, 
				JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoCliente() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n ", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
}
