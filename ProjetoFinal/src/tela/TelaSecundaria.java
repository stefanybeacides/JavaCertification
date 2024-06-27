package tela;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ControllerTelaSecundaria;

public class TelaSecundaria {
	
public static void chamarTelaMenuSecundario() {
		
		JFrame frameTelaSecundaria = new JFrame(); 
		
		GridLayout grid = new GridLayout(0, 1);
		
		frameTelaSecundaria.setSize(300,300); 
		JPanel panelTelaSecundaria = new JPanel();
		
		JLabel labelCadastrar = new JLabel("1 - Cadastrar correntista");
		panelTelaSecundaria.add(labelCadastrar);
		panelTelaSecundaria.setLayout(grid);
		
		JLabel labelListar = new JLabel("2 - Listar correntista");
		panelTelaSecundaria.add(labelListar);
		
		JLabel labelEditar = new JLabel("3 - Editar correntista");
		panelTelaSecundaria.add(labelEditar);
		
		JLabel labelDeletar = new JLabel("4 - Deletar correntista");
		panelTelaSecundaria.add(labelDeletar);
		
		JLabel labelEncerrar = new JLabel("5 - Encerrar");
		panelTelaSecundaria.add(labelEncerrar);
		
		JTextField opcaoTexto = new JTextField(10);
		panelTelaSecundaria.add(opcaoTexto);
		
		JButton botaoEnviar = new JButton("Enviar");
		panelTelaSecundaria.add(botaoEnviar);
		
		
		frameTelaSecundaria.add(panelTelaSecundaria);
		frameTelaSecundaria.setVisible(true);
		
		ControllerTelaSecundaria controllerTelaSecundaria = new ControllerTelaSecundaria(frameTelaSecundaria, opcaoTexto, botaoEnviar);
		botaoEnviar.addActionListener(controllerTelaSecundaria);
		
	}

}