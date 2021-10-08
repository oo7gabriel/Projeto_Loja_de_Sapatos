package view;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import model.Administrador;
import model.Funcionario;

public class Login_Menu implements ActionListener {
	
	private static JFrame janelaLogin = new JFrame("Heaven's Shoes");
	private static JLabel tituloLogin = new JLabel("LOGIN");
	private ImageIcon imageLogo = new ImageIcon(getClass().getResource("/images/logo.png"));
	private JLabel campoImagem = new JLabel(imageLogo);
	private JLabel usuarioLab = new JLabel();
	private JLabel senhaLab = new JLabel();
	private JTextField usuarioCampo;
	private JPasswordField senhaCampo;
	private static JButton logar;
	
	
	public Login_Menu() {
		tituloLogin.setFont(new Font("Arial", Font.ITALIC, 14));
		tituloLogin.setBounds(120, 0,50, 20);
		
		campoImagem.setBounds(90, 20, 100, 75);
		
		//Campo do Usuário 
		usuarioLab.setText("Usuário :");
		usuarioLab.setBounds(20,120, 50 , 20);
		usuarioCampo = new JTextField();
		usuarioCampo.setBounds(80, 120, 180, 20);
		
		// Campo da Senha
		senhaLab.setText("Senha:");
		senhaLab.setBounds(20,150,50,20);
		senhaCampo = new JPasswordField();
		senhaCampo.setBounds(80, 150, 180, 20);
		
		logar = new JButton("LOGAR");
		logar.setBounds(100,200,100,30);
		
		janelaLogin.add(tituloLogin);
		janelaLogin.add(campoImagem);
		janelaLogin.add(usuarioLab);
		janelaLogin.add(usuarioCampo);
		janelaLogin.add(senhaLab);
		janelaLogin.add(senhaCampo);
		janelaLogin.add(logar);
		
		janelaLogin.setLayout(null);
		
		janelaLogin.setSize(300,300);
		janelaLogin.setResizable(false);
		janelaLogin.setLocationRelativeTo(null);
		janelaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaLogin.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		Login_Menu menuLogin = new Login_Menu();
		
		logar.addActionListener(menuLogin);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String validaUsuario = usuarioCampo.getText();
		String validaSenha = senhaCampo.getText();// O .getText() do valida senha está depreciado.
		
		if(validaUsuario.trim().equals("Admin") && validaSenha.trim().equals("1234")) {
			System.out.println("Login Admin OK!");
			new Menu_Admin();
			
			janelaLogin.dispose();
			
			
		}else if(validaUsuario.trim().equals("Func") && validaSenha.trim().equals("5678")) {
			System.out.println("Login Func OK!");
			
			new Menu_Func();
			
			janelaLogin.dispose();
			
		}else if(validaUsuario.trim().equals("") && validaSenha.trim().equals("")){
			JOptionPane.showMessageDialog(null, 
					"Erro Login Inválido", null, 
					JOptionPane.INFORMATION_MESSAGE);
			
		} else if(validaUsuario.trim().equals("")){
			JOptionPane.showMessageDialog(null, 
					"Erro Usuario Inválido", null, 
					JOptionPane.INFORMATION_MESSAGE);
			
		}else if(validaSenha.trim().equals("")){
			JOptionPane.showMessageDialog(null, 
					"Erro Senha Inválida", null, 
					JOptionPane.INFORMATION_MESSAGE);
		
		}
		
	}

}
