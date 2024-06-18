package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {
	
	private static String USUARIO = "root";
	private static String SENHA = "root";
	private static String BANCO_URL = "jdbc:mysql://localhost:3306/cadastro_cachorro?useTimezone=true&serverTimezone=UTC";
	
	public Connection criarConexao() {
		
		Connection conexaoBancoDados = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			conexaoBancoDados = DriverManager.getConnection(BANCO_URL,USUARIO,SENHA);
			
			System.out.println("Deu certo!");
			
			
		} catch (Exception e) {
			
			System.out.println("Deu errado!");
			
		}
		
		
		return conexaoBancoDados;
		
	}
	
	

}
