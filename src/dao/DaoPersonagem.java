package dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;


import domino.Personagem;

public class DaoPersonagem {
		String url = "jdbc:postgresql://localhost/DAW2AV";
		String usuario = "postgres";
		String senha = "postgres";
		
		public void cadastrar(Personagem cont) {
			String operacao = "INSERT INTO personagem (nome, sexo, pais) VALUES ('" + cont.getNome() + "', '" + cont.getSexo() + "', '" + cont.getPais() + "')";

			try {
				Connection conexao = DriverManager.getConnection(url, usuario, senha);
				PreparedStatement comando = conexao.prepareStatement(operacao);
				comando.execute();
			} catch(SQLException e) {
				System.out.println("Erro de conexão com o Banco de Dados (Personagem)!!!");
			}
		}
}
