package controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoGolpe;
import dao.DaoMagia;
import dao.DaoPersonagem;
import domino.Golpe;
import domino.Magia;
import domino.Personagem;

@WebServlet("/SalvarPersonagem")
public class SalvarPersonagem extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.print("Funcionou !!! <br>");

		} catch (ClassNotFoundException e) {
			System.out.print("Não Funcionou !!!<br>");
		}
		String nome = request.getParameter("nome");
		String pais = request.getParameter("pais");
		String nomemagia = request.getParameter("nomemagias");
		String descricao = request.getParameter("nome");
		String sexo = request.getParameter("sexo");
		int chuteFraco = Integer.parseInt(request.getParameter("chuteFraco"));
		int chuteForte = Integer.parseInt(request.getParameter("chuteForte"));
		int socoFraco = Integer.parseInt(request.getParameter("socoFraco"));
		int socoForte = Integer.parseInt(request.getParameter("socoForte"));
		int potencia = Integer.parseInt(request.getParameter("potencia"));
		
		Golpe golpe = new Golpe();
		Magia magia = new Magia();
		Personagem personagem = new Personagem();
		
		DaoPersonagem daoPersonagem = new DaoPersonagem();
		daoPersonagem.cadastrar(personagem);
		DaoGolpe daoGolpe = new DaoGolpe();
		daoGolpe.cadastrar(golpe);
		DaoMagia daoMagia = new DaoMagia();
		daoMagia.cadastrar(magia);
		
		  
		personagem.setNome(nome);
		personagem.setSexo(sexo);
		personagem.setPais(pais);
		golpe.setChuteFraco(chuteFraco);
		golpe.setChuteForte(chuteForte);
		golpe.setSocoFraco(socoFraco);
		golpe.setSocoForte(socoForte);
		magia.setNomemagia(nomemagia);
		magia.setDescricao(descricao);
		magia.setPotencia(potencia);
		
		
		
		response.sendRedirect("Sucesso.jsp?nome="+nome+"&sexo="+sexo+"&pais="+pais+"&chuteFraco="+chuteFraco+"&chuteForte="+chuteForte+"&socoFraco="+socoFraco+"&socoForte="+socoForte+"&nomemagia="+nomemagia+"&descricao="+descricao+"&potencia="+potencia);
	}

}
