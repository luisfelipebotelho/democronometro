package br.com.senai.cronometro;

import javax.swing.SwingUtilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws SQLException {
		
		new MenuSistema();

		/*SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Cronometro();
			}

		}
		);

		*/
			
		/*
		 * Passa a passo de uma conexão
		 * 
		 */
		
		//Conexão
		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.recuperarConexao();	
		
		
		//Fim da Conexão
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a atividade");
		String descricao  = leia.nextLine();
		
		//Inserindo no banco
		
		PreparedStatement stm = con.prepareStatement("INSERT INTO atividade(descricao) VALUES(?)", Statement.NO_GENERATED_KEYS);		
		stm.setString(1, descricao);
		stm.execute();
		leia.close();
		
		
		//Deletar da tabela
		/*
		String sqlDeletar = "DELETE FROM atividade WHERE id=6";
		stm.execute(sqlDeletar);
		Interger linhasModificadas=stm.getUpdateCount();
		System.out.println("Você deletou: "+linhasModificadas);
		*/
		
		
		//Inicio da pesquisa
		/*
				boolean resultado = stm.execute("SELECT * FROM atividade");
		System.out.println("Status da Conexão: " + resultado);

		ResultSet rs = stm.getResultSet();

		while (rs.next()) {
			Integer id = rs.getInt("id");
			System.out.println(id);
			String descricao = rs.getString("descricao");
			System.out.println(descricao);
			
		}
		
		*/
		//Fim da pesquisa		
		System.out.println("Fechando a conexão...");
		//rs.close();
		stm.close();
		con.close();
	}

}
