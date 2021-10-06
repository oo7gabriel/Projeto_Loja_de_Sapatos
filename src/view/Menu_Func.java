package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu_Func implements ActionListener{
	
	private static JFrame janelaFunc = new JFrame("Heaven's Shoes");
	private static JLabel tituloFunc = new JLabel();
	
	//private List<Funcionario>  funcionario = new ArrayList<>();
	
	public Menu_Func() {
		tituloFunc.setFont(new Font("Arial", Font.BOLD, 14));
		tituloFunc.setText("Funcionário");
		tituloFunc.setBounds(640, 0, 150, 30);
		
		JMenuBar barra_menu  = new JMenuBar();
		
		JMenu menu_opcao1 = new JMenu("Inicio");
		JMenu menu_opcao2 = new JMenu("Ações");
		JMenu menu_opcao3 = new JMenu("Perfil");
		JMenu menu_opcao4 = new JMenu("Sair");
		
		JMenu cliente_opcao_func = new JMenu("Cliente");
		JMenu venda_opcao_func = new JMenu("Venda");
		JMenu sapato_opcao_func = new JMenu("Sapato");
		JMenu acessorio_opcao_func = new JMenu("Acessorio");
		JMenu estoque_opcao_func = new JMenu("Estoque");
		
		
		
		JMenuItem cadastrar_cliente_opcao = new JMenuItem("Cadastrar Cliente");
		JMenuItem alterar_cliente_opcao = new JMenuItem("Alterar Informação Cliente");
		JMenuItem deletar_cliente_opcao = new JMenuItem("Deletar Cliente");
		
		JMenuItem venda_cadastrar_opcao = new JMenuItem("Cadastrar Venda");
		
		JMenuItem acessorio_cadastrar_opcao = new JMenuItem("Cadastrar Acessório");
		JMenuItem acessorio_alterar_opcao = new JMenuItem("Alterar Informação Acessório");
		JMenuItem acessorio_apagar_opcao = new JMenuItem("Apagar Acessório");
		
		JMenuItem sapato_cadastrar_opcao = new JMenuItem("Cadastrar Sapato");
		JMenuItem sapato_alterar_opcao = new JMenuItem("Alterar Informação Sapato");
		JMenuItem sapato_apagar_opcao = new JMenuItem("Apagar Sapato");
		
		JMenuItem estoque_cadastrar_opcao = new JMenuItem("Cadastrar Estoque");
		JMenuItem estoque_alterar_opcao = new JMenuItem("Alterar Informação Estoque");
		
		//JLabel imagem = new JLabel();  
		
		janelaFunc.setLayout(null);
		janelaFunc.setJMenuBar(barra_menu);
		
		
		barra_menu.add(menu_opcao1);
		barra_menu.add(menu_opcao2);
		barra_menu.add(menu_opcao3);
		barra_menu.add(menu_opcao4);
		
		menu_opcao2.add(cliente_opcao_func);
		menu_opcao2.add(acessorio_opcao_func);
		menu_opcao2.add(sapato_opcao_func);
		menu_opcao2.add(venda_opcao_func);
		menu_opcao2.add(estoque_opcao_func);
		
		cliente_opcao_func.add(cadastrar_cliente_opcao);
		cliente_opcao_func.add(alterar_cliente_opcao);
		cliente_opcao_func.add(deletar_cliente_opcao);

		acessorio_opcao_func.add(acessorio_cadastrar_opcao);
		acessorio_opcao_func.add(acessorio_alterar_opcao);
		acessorio_opcao_func.add(acessorio_apagar_opcao);
		
		sapato_opcao_func.add(sapato_cadastrar_opcao);
		sapato_opcao_func.add(sapato_alterar_opcao);
		sapato_opcao_func.add(sapato_apagar_opcao);
		
		venda_opcao_func.add(venda_cadastrar_opcao);
		
		estoque_opcao_func.add(estoque_cadastrar_opcao);
		estoque_opcao_func.add(estoque_alterar_opcao);
		
		menu_opcao1.addActionListener(null);
		menu_opcao3.addActionListener(null);
		menu_opcao4.addActionListener(null);
		
		
		cliente_opcao_func.addActionListener(null);
		acessorio_opcao_func.addActionListener(null);
		sapato_opcao_func.addActionListener(null);
		venda_opcao_func.addActionListener(null);
		estoque_opcao_func.addActionListener(null);
		
		cadastrar_cliente_opcao.addActionListener(null);
		alterar_cliente_opcao.addActionListener(null);
		deletar_cliente_opcao.addActionListener(null);
		
		venda_cadastrar_opcao.addActionListener(null);
		
		acessorio_cadastrar_opcao.addActionListener(null);
		acessorio_alterar_opcao.addActionListener(null);
	    acessorio_apagar_opcao.addActionListener(null);
		
		sapato_cadastrar_opcao.addActionListener(null);
		sapato_alterar_opcao.addActionListener(null);
		sapato_apagar_opcao.addActionListener(null);
		
		estoque_cadastrar_opcao.addActionListener(null);
		estoque_alterar_opcao.addActionListener(null);
		
		janelaFunc.add(tituloFunc);
		
		janelaFunc.setSize(1280, 720);
		janelaFunc.setResizable(false);
		janelaFunc.setLocationRelativeTo(null);
		janelaFunc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		janelaFunc.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		//Object evento = e.getSource();

		
	}
}
