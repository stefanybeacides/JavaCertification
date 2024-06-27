package tela;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ControllerTelaCadastroCorrentista;
import entidade.Cep;
import service.BuscarCep;

public class TelaCadastroCorrentista {
	
public static void chamarTelaCadastroCorrentista() {
		
		String campoNome = "Digite o nome do correntista";
		String campoCpf = "Digite o CPF do correntista";
		String campoCep = "Digite o CEP do correntista"; 
		String campoLogradouro = "Logradouro";
		String campoBairro = "Bairro";
		String campoCidade = "Cidade";
		String campoUf = "UF";
		String campoEmail = "Digite o email do correntista";
		String campoQtdTransacao = "Digite a quantidade de transações";
		String campoAnuidade = "Digite o valor da anuidade";
		BuscarCep buscarCep = new BuscarCep();
		
		JFrame frameTelaCadastroCorrentista = new JFrame();
		
		GridLayout grid = new GridLayout(0, 1);
		
		frameTelaCadastroCorrentista.setSize (350, 600);
		JPanel panelTelaCadastroCorrentista = new JPanel();
		
		JLabel labelCampoNome = new JLabel(campoNome);
		panelTelaCadastroCorrentista.add(labelCampoNome);
		panelTelaCadastroCorrentista.setLayout(grid);
		
		JTextField caixaTextoNome = new JTextField(10);
		panelTelaCadastroCorrentista.add(caixaTextoNome);
		
		
		JLabel labelCampoCpf = new JLabel(campoCpf);
		panelTelaCadastroCorrentista.add(labelCampoCpf);
		
		JTextField caixaTextoCpf = new JTextField(10);
		panelTelaCadastroCorrentista.add(caixaTextoCpf);
		
		JLabel labelCampoCep = new JLabel(campoCep);
		panelTelaCadastroCorrentista.add(labelCampoCep);
		
		JTextField caixaTextoCep = new JTextField(10);
		panelTelaCadastroCorrentista.add(caixaTextoCep);
		
		JLabel labelCampoLogradouro = new JLabel(campoLogradouro);
		panelTelaCadastroCorrentista.add(labelCampoLogradouro);
		
		JTextField caixaTextoLogradouro = new JTextField(10);
		panelTelaCadastroCorrentista.add(caixaTextoLogradouro);
		
		JLabel labelCampoBairro = new JLabel(campoBairro);
		panelTelaCadastroCorrentista.add(labelCampoBairro);
		
		JTextField caixaTextoBairro = new JTextField(10);
		panelTelaCadastroCorrentista.add(caixaTextoBairro);
		
		JLabel labelCampoCidade = new JLabel(campoCidade);
		panelTelaCadastroCorrentista.add(labelCampoCidade);
		
		JTextField caixaTextoCidade = new JTextField(10);
		panelTelaCadastroCorrentista.add(caixaTextoCidade);
		
		JLabel labelCampoUf = new JLabel(campoUf);
		panelTelaCadastroCorrentista.add(labelCampoUf);
		
		JTextField caixaTextoUf = new JTextField(10);
		panelTelaCadastroCorrentista.add(caixaTextoUf);
		
		JLabel labelCampoEmail = new JLabel(campoEmail);
		panelTelaCadastroCorrentista.add(labelCampoEmail);
		
		JTextField caixaTextoEmail = new JTextField(10);
		panelTelaCadastroCorrentista.add(caixaTextoEmail);
		
		JLabel labelCampoQtdTransacao = new JLabel(campoQtdTransacao);
		panelTelaCadastroCorrentista.add(labelCampoQtdTransacao);
		
		JTextField caixaTextoQtdTransacao = new JTextField(10);
		panelTelaCadastroCorrentista.add(caixaTextoQtdTransacao);
		
		JLabel labelCampoAnuidade = new JLabel(campoAnuidade);
		panelTelaCadastroCorrentista.add(labelCampoAnuidade);
		
		JTextField caixaTextoAnuidade = new JTextField(10);
		panelTelaCadastroCorrentista.add(caixaTextoAnuidade);
		
		JButton botaoCadastrar = new JButton("Cadastrar");
		panelTelaCadastroCorrentista.add(botaoCadastrar);
		
		
	       // Adiciona um ActionListener ao JTextField
			caixaTextoCep.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
	                String valorCep = caixaTextoCep.getText();
	                try {
						Cep cep = buscarCep.ConsultaCep(valorCep);
						caixaTextoLogradouro.setText(cep.getLogradouro());
						caixaTextoBairro.setText(cep.getBairro());
						caixaTextoCidade.setText(cep.getLocalidade());
						caixaTextoUf.setText(cep.getUf());
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					
				}
	        });
			
		
		frameTelaCadastroCorrentista.add(panelTelaCadastroCorrentista);
		frameTelaCadastroCorrentista.setVisible(true);
		
		ControllerTelaCadastroCorrentista controllerCadastroCorrentista = new ControllerTelaCadastroCorrentista(caixaTextoNome,caixaTextoCpf,
				caixaTextoCep, caixaTextoLogradouro, caixaTextoBairro, caixaTextoCidade, caixaTextoUf, caixaTextoEmail, caixaTextoQtdTransacao, caixaTextoAnuidade, frameTelaCadastroCorrentista);
		
		botaoCadastrar.addActionListener(controllerCadastroCorrentista); 
		
		
	}

}