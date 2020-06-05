package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import domino.Magia;

public class DaoMagia {
	String url = "jdbc:postgresql://localhost/DAW2AV";
	String usuario = "postgres";
	String senha = "postgres";
	
	public void cadastrar(Magia cont) {
		String operacao = "INSERT INTO magia (nomemagia, descricao, potencia) VALUES ('" + cont.getNomemagia() + "', '" + cont.getDescricao() + "', '" + cont.getPotencia() + "')";

		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement comando = conexao.prepareStatement(operacao);
			comando.execute();
		} catch(SQLException e) {
			System.out.println("Erro de conexão com o Banco de Dados (Magia)!!!");
		}
	}
}
