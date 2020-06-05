package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import domino.Golpe;

public class DaoGolpe {
	String url = "jdbc:postgresql://localhost/DAW2AV";
	String usuario = "postgres";
	String senha = "postgres";
	
	public void cadastrar(Golpe cont) {
		String operacao = "INSERT INTO golpe (chuteForte, chuteFraco, socoForte, socoFraco) VALUES ('" + cont.getChuteForte() + "', '" + cont.getChuteFraco() + "', '" + cont.getSocoForte() +"', '" + cont.getSocoFraco() + "')";

		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement comando = conexao.prepareStatement(operacao);
			comando.execute();
		} catch(SQLException e) {
			System.out.println("Erro de conexão com o Banco de Dados (Golpe)!!!");
		}
	}
}
