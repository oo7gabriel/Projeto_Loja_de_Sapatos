package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import controller.Controle_Dados;

public class Menu_Func implements ActionListener , MenuListener{
	
	private static JFrame janelaFunc = new JFrame("Heaven's Shoes");
	private static JLabel tituloFunc = new JLabel();
	
	private JMenuBar barra_menu  = new JMenuBar();
	
	private JMenu menu_opcao1 = new JMenu("Inicio");
	private JMenu menu_opcao2 = new JMenu("Ações");
	private JMenu menu_opcao3 = new JMenu("Perfil");
	private JMenu menu_opcao4 = new JMenu("Sair");
	
	private JButton cliente_opcao_func = new JButton("Cliente");
	private JMenuItem venda_opcao_func = new JMenuItem("Venda");
	private JMenuItem sapato_opcao_func = new JMenuItem("Sapato");
	private JMenuItem acessorio_opcao_func = new JMenuItem("Acessorio");
	private JMenuItem estoque_opcao_func = new JMenuItem("Estoque");
	
	private Controle_Dados d;
	 

	public Menu_Func() {
		tituloFunc.setFont(new Font("Arial", Font.BOLD, 14));
		tituloFunc.setText("FUNCIONÁRIO");
		tituloFunc.setBounds(450, 0, 150, 30);
		
		 cliente_opcao_func.setBounds(0, 0, 180, 25);
		
		
		janelaFunc.setLayout(null);
		janelaFunc.setJMenuBar(barra_menu);
		
		janelaFunc.add(cliente_opcao_func);
		
		barra_menu.add(menu_opcao1);
		barra_menu.add(menu_opcao2);
		barra_menu.add(menu_opcao3);
		barra_menu.add(menu_opcao4);
		
		menu_opcao2.add(sapato_opcao_func);
		menu_opcao2.add(acessorio_opcao_func);
		menu_opcao2.add(venda_opcao_func);
		menu_opcao2.add(estoque_opcao_func);

		
		menu_opcao1.addMenuListener(this);
		menu_opcao3.addMenuListener(this);
		menu_opcao4.addMenuListener(this);
		
		
		cliente_opcao_func.addActionListener(this);
		acessorio_opcao_func.addActionListener(this);
		sapato_opcao_func.addActionListener(this);
		venda_opcao_func.addActionListener(this);
		estoque_opcao_func.addActionListener(this);
		
		janelaFunc.add(tituloFunc);
		
		janelaFunc.setSize(900, 900);
		janelaFunc.setResizable(false);
		janelaFunc.setLocationRelativeTo(null);
		janelaFunc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		janelaFunc.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		Object evento = e.getSource();
		
		if(evento == cliente_opcao_func) {
			new TelaCliente().mostrarDados(d,1);
		}
		
		if(evento == sapato_opcao_func ) {
			JOptionPane.showMessageDialog(null, 
					"Função a ser Desenvolvida", null, 
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(evento == acessorio_opcao_func ) {
			JOptionPane.showMessageDialog(null, 
					"Função a ser Desenvolvida", null, 
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(evento == venda_opcao_func) {
			JOptionPane.showMessageDialog(null, 
					"Função a ser Desenvolvida", null, 
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(evento == estoque_opcao_func) {
			JOptionPane.showMessageDialog(null, 
					"Função a ser Desenvolvida", null, 
					JOptionPane.INFORMATION_MESSAGE);
		}
	}	
	
	@Override
	public void menuSelected(MenuEvent e) {
		Object eventoMenu = e.getSource();
		
		if(eventoMenu == menu_opcao1) {
			janelaFunc.dispose();
			new Menu_Func();
		}
		
		if(eventoMenu == menu_opcao3) {
			janelaFunc.dispose();
			new Menu_Func();
		}
		
		if(eventoMenu == menu_opcao4) {
			janelaFunc.dispose();
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
