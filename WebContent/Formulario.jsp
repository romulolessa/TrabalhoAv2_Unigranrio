<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Insert title here</title>
		<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;400&display=swap" rel="stylesheet">
		<style type="text/css">
			.container{
			max-width: 500px;
			max-height 200px;
			margin: 0 auto 0 auto;
			text-align: justify;
			 font-family: 'Roboto', sans-serif;
			}
		</style>
	</head>
	<body>
		<div class="container">
			<h1>Cadastro de Personagem</h1>
			<form action="SalvarPersonagem" method="post">
				<fieldset>
					<legend>Personagem</legend>
					<p>
						<label>Nome: </label>
						<input type="text" name="nome" placeholder="Nome do Personagem">
					</p>
					<p>
						<label>Sexo: </label>
						<input type="radio" name="sexo" id="sexo" value="Masculino">Masculino
						<input type="radio" name="sexo" id="sexo" value="Feminino">Feminino
					</p>
					<p><label for="pais">Pais: </label>
			      	<select name="pais" id="pais">
						<option selected="pais" value="Pais">Selecione o Pais</option>
						<option value="Brasil">Brasil</option>
						<option value="Argentina">Argentina</option>
						<option value="Colombia">Colombia</option>
						<option value="Chile">Chile</option>
						<option value="Bolivia">Bolivia</option>
					</select>
					</p>
				</fieldset>
				<fieldset>
					<legend>Golpes</legend>
					<p>
					<label for="chuteFraco">Chute Fraco: 1</label>
					<input type="range" name="chuteFraco" id="chuteFraco" min="1" max="5"> 5
					</p>
					<p>
					<label for="chuteForte">Chute Forte: 1</label>
					<input type="range" name="chuteForte" id="chuteForte" min="1" max="10"> 10
					</p>
					<p>
					<label for="socoFraco">Soco Fraco: 1</label>
					<input type="range" name="socoFraco" id="socoFraco" min="1" max="5"> 5
					</p>
					<p>
					<label for="socoForte">Soco Forte: 1</label>
					<input type="range" name="socoForte" id="socoForte" min="1" max="10"> 10
					</p>
				</fieldset>
				<fieldset>
					<legend>Magia</legend>
					<p>
						<label for="nomeMagia">Nome da Magia:</label>
						<input type="text" name="nomemagia" id="nomemagia">
					</p>
					<p>
						<label for="descricaoMagia">Descrição da Magia:</label>
					</p>
					<input type="text" name="descricao" id="descricao">
					<p>
						<label for="potencia">Potencia: </label>
		                <select id="pontencia" name="potencia">
		                	<option value="1">1</option>
		                	<option value="2">2</option>
		                	<option value="3">3</option>
		                	<option value="4">4</option>
		                	<option value="5">5</option>
						</select>
					</p>
				</fieldset>
				<button type="submit">Cadastrar Personagem</button>
			</form>
		</div>
	</body>
</html>