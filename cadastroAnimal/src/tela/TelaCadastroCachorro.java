package tela;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.TelaCadastroCachorroControlador;

public class TelaCadastroCachorro {
	
	public void chamarTelaCadastroCachorro() {
		
		GridLayout grid = new GridLayout(0,1);
		
		String primeiroCampo = "Digite o nome do cachorro";
		String segundoCampo = "Digite o CAF do cachorro";
		String terceiroCampo = "Digite a raça do cachorro"; 
		
		JFrame frameTelaCadastroCachorro = new JFrame();
		
		frameTelaCadastroCachorro.setSize (300, 300);
		JPanel panelTelaCadastroCachorro = new JPanel();
		
		JLabel labelPrimeiroCampo = new JLabel(primeiroCampo);
		panelTelaCadastroCachorro.add(labelPrimeiroCampo);
		panelTelaCadastroCachorro.setLayout(grid);
		
		JTextField caixaTextoPrimeiroCampo = new JTextField(10);
		panelTelaCadastroCachorro.add(caixaTextoPrimeiroCampo);
		
		
		JLabel labelSegundoCampo = new JLabel(segundoCampo);
		panelTelaCadastroCachorro.add(labelSegundoCampo);
		
		JTextField caixaTextoSegundoCampo = new JTextField(10);
		panelTelaCadastroCachorro.add(caixaTextoSegundoCampo);
		
		
		JLabel labelTerceiroCampo = new JLabel(terceiroCampo);
		panelTelaCadastroCachorro.add(labelTerceiroCampo);
		
		JTextField caixaTextoTerceiroCampo = new JTextField(10);
		panelTelaCadastroCachorro.add(caixaTextoTerceiroCampo);
		
		JButton botaoCadastrar = new JButton("Cadastrar");
		panelTelaCadastroCachorro.add(botaoCadastrar);
		
		
		frameTelaCadastroCachorro.add(panelTelaCadastroCachorro);
		frameTelaCadastroCachorro.setVisible(true);
		
		TelaCadastroCachorroControlador cadastroCachorroControlador = new TelaCadastroCachorroControlador(caixaTextoPrimeiroCampo,caixaTextoSegundoCampo,
				caixaTextoTerceiroCampo, frameTelaCadastroCachorro);
		
		botaoCadastrar.addActionListener(cadastroCachorroControlador);
		
		
	}

}