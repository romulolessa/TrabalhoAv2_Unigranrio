<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="utf-8">
		<title>Personagem Cadastrado</title>
	</head>
	<body>
	<%
		String nome = request.getParameter("nome");
		String pais = request.getParameter("pais");
		String nomemagia = request.getParameter("nomemagia");
		String descricao = request.getParameter("descricao");
		String sexo = request.getParameter("sexo");
		
		int chuteFraco = Integer.parseInt(request.getParameter("chuteFraco"));
		int chuteForte = Integer.parseInt(request.getParameter("chuteForte"));
		int socoFraco = Integer.parseInt(request.getParameter("socoFraco"));
		int socoForte = Integer.parseInt(request.getParameter("socoForte"));
		int potencia = Integer.parseInt(request.getParameter("potencia"));	
	%>
	<h1>Cadastro de Personagem</h1>
	<fieldset>
		<legend>Personagem cadastrado</legend>
		<p> Personagem foi cadastrado com sucesso</p>
		<fieldset>
			<legend>Personagem</legend>
			<p>
				Nome do personagem:  <%=nome%><br>
				Sexo:  <%=sexo %><br>
				Pais: <%=pais %><br>
			</p>
			
		</fieldset>
		<fieldset>
			<legend>Golpes</legend>
			<p>
				Chute Fraco: <%=chuteFraco %><br>
				Chute Forte: <%=chuteForte %><br>
				Soco Fraco: <%=socoFraco %><br>
				Soco Forte: <%=socoForte %><br>
			</p>
		</fieldset>
		<fieldset>
			<legend>Magia</legend>
			<p>
			Nome da Magia: <%=nomemagia %><br>
			Descrição: <%=descricao %><br>
			Potencia: <%=potencia %>
			</p>
		</fieldset>
	</fieldset>
	</body>
</html>