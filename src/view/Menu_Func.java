package view;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Funcionario;

public class Menu_Func extends JFrame{
	
	private static JFrame janelaFunc = new JFrame("Heaven's Shoes");
	//private static JPanel painelAdmin;
	//private static JLabel mensagem;
	private static JLabel tituloFunc = new JLabel();
	
	private List<Funcionario>  funcionario= new ArrayList<>();
	
	public Menu_Func() {
		tituloFunc.setFont(new Font("Arial", Font.BOLD, 14));
		tituloFunc.setText("Funcionário");
		tituloFunc.setBounds(640, 0, 150, 30);
		
		janelaFunc.setLayout(null);
		
		janelaFunc.add(tituloFunc);
		
		janelaFunc.setLocation(0, 0);
		janelaFunc.setSize(1280, 720);
		janelaFunc.setResizable(false);
		janelaFunc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janelaFunc.setVisible(true);
		
	}
}
