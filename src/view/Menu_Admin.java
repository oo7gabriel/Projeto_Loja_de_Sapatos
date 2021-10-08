package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Menu_Admin implements ActionListener, MenuListener{
	
	private static JFrame janelaAdmin = new JFrame("Heaven's Shoes");
	private JLabel tituloAdmin = new JLabel();
	
	private JMenuBar barra_menu_admin  = new JMenuBar();
	
	private JMenu menu_opcao1_admin = new JMenu("Inicio");
	private JMenu menu_opcao2_admin = new JMenu("Ações");
	private JMenu menu_opcao3_admin = new JMenu("Perfil");
	private JMenu menu_opcao4_admin = new JMenu("Sair");
	
	private JMenu cliente_opcao_admin = new JMenu("Cliente");
	private JMenu func_opcao_admin = new JMenu("Funcionário");
	private JMenu sapato_opcao_admin = new JMenu("Sapato");
	private JMenu acessorio_opcao_admin = new JMenu("Acessorio");
	private JMenu estoque_opcao_admin = new JMenu("Estoque");
	
	
	
	private JMenuItem cadastrar_cliente_opcao = new JMenuItem("Cadastrar Cliente");
	private JMenuItem alterar_cliente_opcao = new JMenuItem("Alterar Informação Cliente");
	private JMenuItem deletar_cliente_opcao = new JMenuItem("Deletar Cliente");
	
	private JMenuItem cadastrar_func_opcao = new JMenuItem("Cadastrar Funcionário");
	private JMenuItem alterar_func_opcao = new JMenuItem("Alterar Informação Funcionário");
	private JMenuItem deletar_func_opcao = new JMenuItem("Deletar Funcionário");
	
	
	private JMenuItem acessorio_cadastrar_opcao = new JMenuItem("Cadastrar Acessório");
	private JMenuItem acessorio_alterar_opcao = new JMenuItem("Alterar Informação Acessório");
	private JMenuItem acessorio_apagar_opcao = new JMenuItem("Apagar Acessório");
	
	private JMenuItem sapato_cadastrar_opcao = new JMenuItem("Cadastrar Sapato");
	private JMenuItem sapato_alterar_opcao = new JMenuItem("Alterar Informação Sapato");
	private JMenuItem sapato_apagar_opcao = new JMenuItem("Apagar Sapato");
	
	private JMenuItem estoque_cadastrar_opcao = new JMenuItem("Cadastrar Estoque");
	private JMenuItem estoque_alterar_opcao = new JMenuItem("Alterar Informação Estoque");
	
	//JLabel imagem = new JLabel();
	
	public Menu_Admin() {
		tituloAdmin.setFont(new Font("Arial", Font.BOLD, 14));
		tituloAdmin.setText("ADMNINISTRADOR");
		tituloAdmin.setBounds(640, 0, 150, 30);
		
		
		janelaAdmin.setLayout(null);
		janelaAdmin.setJMenuBar(barra_menu_admin);
		
		
		barra_menu_admin.add(menu_opcao1_admin);
		barra_menu_admin.add(menu_opcao2_admin);
		barra_menu_admin.add(menu_opcao3_admin);
		barra_menu_admin.add(menu_opcao4_admin);
		
		menu_opcao2_admin.add(cliente_opcao_admin);
		menu_opcao2_admin.add(func_opcao_admin);
		menu_opcao2_admin.add(acessorio_opcao_admin);
		menu_opcao2_admin.add(sapato_opcao_admin);
		menu_opcao2_admin.add(estoque_opcao_admin);
		
		cliente_opcao_admin.add(cadastrar_cliente_opcao);
		cliente_opcao_admin.add(alterar_cliente_opcao);
		cliente_opcao_admin.add(deletar_cliente_opcao);
		
		func_opcao_admin.add(cadastrar_func_opcao);
		func_opcao_admin.add(alterar_func_opcao);
		func_opcao_admin.add(deletar_func_opcao);

		acessorio_opcao_admin.add(acessorio_cadastrar_opcao);
		acessorio_opcao_admin.add(acessorio_alterar_opcao);
		acessorio_opcao_admin.add(acessorio_apagar_opcao);
		
		sapato_opcao_admin.add(sapato_cadastrar_opcao);
		sapato_opcao_admin.add(sapato_alterar_opcao);
		sapato_opcao_admin.add(sapato_apagar_opcao);
		
		estoque_opcao_admin.add(estoque_cadastrar_opcao);
		estoque_opcao_admin.add(estoque_alterar_opcao);
		
		menu_opcao1_admin.addMenuListener(this);
		menu_opcao3_admin.addMenuListener(this);
		menu_opcao4_admin.addMenuListener(this);
		
		
		cliente_opcao_admin.addActionListener(null);
		func_opcao_admin.addActionListener(null);
		acessorio_opcao_admin.addActionListener(null);
		sapato_opcao_admin.addActionListener(null);
		estoque_opcao_admin.addActionListener(null);
		
		cadastrar_cliente_opcao.addActionListener(null);
		alterar_cliente_opcao.addActionListener(null);
		deletar_cliente_opcao.addActionListener(null);
		
		cadastrar_func_opcao.addActionListener(null);
		alterar_func_opcao.addActionListener(null);
		deletar_func_opcao.addActionListener(null);

		acessorio_cadastrar_opcao.addActionListener(null);
		acessorio_alterar_opcao.addActionListener(null);
	    acessorio_apagar_opcao.addActionListener(null);
		
		sapato_cadastrar_opcao.addActionListener(null);
		sapato_alterar_opcao.addActionListener(null);
		sapato_apagar_opcao.addActionListener(null);
		
		estoque_cadastrar_opcao.addActionListener(null);
		estoque_alterar_opcao.addActionListener(null);

		
		janelaAdmin.setLayout(null);
		
		janelaAdmin.add(tituloAdmin);
		
		janelaAdmin.setSize(1280, 720);
		janelaAdmin.setResizable(false);
		janelaAdmin.setLocationRelativeTo(null);
		janelaAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janelaAdmin.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		//Object evento = e.getSource();

		
	}
	

	@Override
	public void menuSelected(MenuEvent e) {
		Object eventoMenu = e.getSource();
		
		if(eventoMenu == menu_opcao1_admin) {
			janelaAdmin.dispose();
			new Menu_Func();
		}
		
		if(eventoMenu == menu_opcao3_admin) {
			janelaAdmin.dispose();
			new Menu_Func();
		}
		
		if(eventoMenu == menu_opcao4_admin) {
			janelaAdmin.dispose();
		}
		
		
		
	}

	@Override
	public void menuDeselected(MenuEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuCanceled(MenuEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
