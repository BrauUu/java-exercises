import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Tela extends JFrame implements ActionListener{
	
	JButton login = new JButton("LOGAR");
	JButton cadastro = new JButton("CADASTRAR");
	JButton sair = new JButton("SAIR");
	
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == login) {
			this.telaLogin();
		}
		else if(event.getSource() == cadastro) {
			this.telaCadastro();
		}
		else if(event.getSource() == sair) {
			System.exit(0);
		}
	}
	
	public Tela() {
		
		setSize(800, 500);        
	    setTitle("Banco Golden Experience");
	    setLocationRelativeTo(null); 
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setResizable(false);
	    setVisible(true);
	    
	    setLayout(null);
	    login.setBounds(340,250,120,30);
	    login.addActionListener(this);
	    login.setBackground(Color.DARK_GRAY);
		login.setForeground(Color.WHITE);
	    add(login);
	    
	    cadastro.setBounds(340, 300, 120, 30);
	    cadastro.addActionListener(this);
	    cadastro.setBackground(Color.DARK_GRAY);
	    cadastro.setForeground(Color.WHITE);
		add(cadastro);
		
		sair.setBounds(340, 350, 120, 30);
		sair.addActionListener(this);
		sair.setBackground(Color.DARK_GRAY);
	    sair.setForeground(Color.WHITE);
		add(sair);
		
		
		
	}
	
	public void telaLogin() {
		remove(login);
		remove(cadastro);
		remove(sair);
		repaint();
	}
	
	public void telaCadastro() {
		remove(login);
		remove(cadastro);
		remove(sair);
		repaint();
	}
	
	public static void main(String[] args) {
		
		new Tela();
	}
}
