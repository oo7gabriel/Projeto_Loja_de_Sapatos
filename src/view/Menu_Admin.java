package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Administrador;

public class Menu_Admin extends JFrame{
	
	private static JFrame janelaAdmin = new JFrame("Heaven's Shoes");
	private static JPanel painelAdmin;
	//private static JLabel mensagem;
	private static JLabel tituloAdmin = new JLabel();
	
	private Administrador adm;
	
	public Menu_Admin() {
		tituloAdmin.setFont(new Font("Arial", Font.BOLD, 14));
		tituloAdmin.setText("Administrador");
		tituloAdmin.setBounds(640, 0, 150, 30);
		
		janelaAdmin.setLayout(null);
		
		janelaAdmin.add(tituloAdmin);
		
		janelaAdmin.setLocation(0, 0);
		janelaAdmin.setSize(1280, 720);
		janelaAdmin.setResizable(false);
		janelaAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janelaAdmin.setVisible(true);
		
	}
	
	
}
