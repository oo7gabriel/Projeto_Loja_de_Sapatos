package view;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login_Menu implements ActionListener {
	
	private static JFrame janelaLogin = new JFrame("Heaven's Shoes");
	private static JPanel painelJanela;
	private static JLabel tituloLogin = new JLabel("Login");
	private static JLabel tituloLogin2 = new JLabel(" ");
	private static JLabel usuarioLab = new JLabel();
	private static JLabel senhaLab = new JLabel();
	private static JTextField usuarioCampo;
	private static JPasswordField senhaCampo;
	private static JButton logar = new JButton("Logar");
	
	
	public Login_Menu() {
		tituloLogin.setFont(new Font("Arial", Font.ITALIC, 14));
		tituloLogin2.setFont(new Font("Arial", Font.ITALIC, 14));
		
		//Campo do Usuário 
		usuarioLab.setText("Usuario: ");
		usuarioCampo = new JTextField(); 
		
		// Campo da Senha
		senhaLab.setText("Senha: ");
		senhaCampo = new JPasswordField();
	
		painelJanela =  new JPanel(new GridLayout(4,1));
		
		painelJanela.add(tituloLogin2);
		painelJanela.add(tituloLogin);
		painelJanela.add(usuarioLab);
		painelJanela.add(usuarioCampo);
		painelJanela.add(senhaLab);
		painelJanela.add(senhaCampo);
		painelJanela.add(logar);
		
		janelaLogin.add(painelJanela, BorderLayout.CENTER);
		
		janelaLogin.setLocation(500, 200);
		janelaLogin.setSize(400, 100);
		janelaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaLogin.setResizable(false);
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
