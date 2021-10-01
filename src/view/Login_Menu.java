package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.AncestorListener;

public class Login_Menu extends JFrame implements ActionListener {
	
	private static JFrame janelaLogin = new JFrame("Heaven's Shoes");
	private static JPanel painelJanela;
	private static JLabel tituloLogin = new JLabel("LOGIN");
	private static JLabel usuarioLab = new JLabel();
	private static JLabel senhaLab = new JLabel();
	private static JTextField usuarioCampo;
	private static JPasswordField senhaCampo;
	private static JButton logar = new JButton("Logar");
	
	
	public Login_Menu() {
		tituloLogin.setFont(new Font("Arial", Font.ITALIC, 14));
		
		//Campo do Usuário 
		usuarioLab.setText("Usuario: ");
		usuarioCampo = new JTextField(); 
		
		// Campo da Senha
		senhaLab.setText("Senha: ");
		senhaCampo = new JPasswordField();
	
		painelJanela =  new JPanel(new GridLayout(3,1));
		
		janelaLogin.add(tituloLogin);
		painelJanela.add(usuarioLab);
		painelJanela.add(usuarioCampo);
		painelJanela.add(senhaLab);
		painelJanela.add(senhaCampo);
		painelJanela.add(logar);
		
		janelaLogin.add(painelJanela, BorderLayout.CENTER);
		
		janelaLogin.setSize(300, 100);
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
		String validaSenha = senhaCampo.getText();
		
		if(validaUsuario.trim().equals("Admin") && validaSenha.trim().equals("1234")) {
			System.out.println("Login Admin OK!");
		}else if(validaUsuario.trim().equals("Func") && validaSenha.trim().equals("5678")) {
			System.out.println("Login Func OK!");
		}else {
			System.out.println("Error Login!");
		}
		
	}

}
