package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entidade.Cachorro;

//Dao = Data Access Object -> Essa classe é especialista em transações de banco de dados do objeto GERENTE
public class DaoCachorro {
	
	public boolean salvarCachorroNoBanco(Cachorro cachorro) {
		boolean salvamento = false;
		
		FabricaConexao conexaoFabricaConexao = new FabricaConexao(); //Instancia a classe Fabrica de Conexão
		Connection connectionCachorro = null; //Cria o objeto conexão como null
		PreparedStatement preparaOComandoSQL = null; // Cria o objeto que prepara o comando SQL
		
		String comandoSqlInsert = "insert into table_cachorro (nome, caf, raca) values (?, ?, ?);";//Base do comando SQL
		
		try {
			connectionCachorro = conexaoFabricaConexao.criarConexao(); // Recebe o objeto de conexão da classe Fabrica de Conexão
			
			preparaOComandoSQL = connectionCachorro.prepareStatement(comandoSqlInsert); // Armazena a conexão e o comando SQL que vai ser preparado
			
			preparaOComandoSQL.setString(1, cachorro.getNome()); // Coloca o valor no campo nome
			preparaOComandoSQL.setString(2, cachorro.getCaf()); // Coloca o valor no campo caf
			preparaOComandoSQL.setString(3, cachorro.getRaca()); // Coloca o valor no campo raça
			
			preparaOComandoSQL.execute(); // Executa o comando no banco de dados

			
			System.out.println("Cachorro registrado com sucesso!"); // Log
			
			salvamento = true; // Se tudo funcionar certo
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Erro ao registrar cachorro!");
			
		}finally { // É obrigatório para fechar as conexões, vai cair aqui se der certo ou errado
			
			try {
				if (connectionCachorro != null) {
					connectionCachorro.close(); // Se o objeto connectionTeste estiver aberto essa linha vai encerrar
			
				}
				if (preparaOComandoSQL != null) {
					preparaOComandoSQL.close(); // Se o objeto preparaOComandoSQL estiver aberto essa linha vai encerrar
			
				}
				
				
				
			} catch (Exception e2) {
				System.out.println("Não foi possível encerrar a conexão!");
				
			}
			
		}
		
		
		return salvamento;
		
	}

	
	
}
