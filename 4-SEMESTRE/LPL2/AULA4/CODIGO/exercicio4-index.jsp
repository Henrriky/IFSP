<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercicio 4 - Livros</title>


<style type="text/css">
	
	.bookContainer {
		max-width: 350px;
		border: 1px solid black;
		margin: 20px;
		padding: 6px;
		border-radius: 4px;
	}
	.bookImage {
		max-width: 100px;
        max-height: 150px;
	}
	.bookPrice {
		font-size: 18px;
	}
	.btnBuyBook {
		padding: 6px;
	    color: white;
	    background-color: black;
	    border-radius: 4px;
	    border: none;
	    font-size: 16px;
	    width: 100%;
	    cursor: pointer;
	}

</style>
</head>
<body>
	<h1>Bem vindo ao nosso catálogo de livros</h1>
	<%
	 	String[][] livros = {
	 			{ "Código Limpo", "https://m.media-amazon.com/images/I/51E2055ZGUL._AC_UF1000,1000_QL80_.jpg", "150.00" },
	 			{ "O Programador Pragmático", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRzn5JZad-Dyq-m5s_dKnciBS2a_W_9wJLP5Q&s", "180.00" },
	 			{ "Algoritmos: Teoria e Prática", "https://m.media-amazon.com/images/I/71QtOUBMtNL._AC_UF1000,1000_QL80_.jpg", "320.00" } 
	 	};
	%>
	<%
		for (String[] informacoesLivro : livros) {
	%>
		<div class="bookContainer">
			<h2><%= informacoesLivro[0] %></h2>
			<img alt="Livro <%= informacoesLivro[0] %>" src="<%= informacoesLivro[1] %>" class="bookImage">
			<p class="bookPrice">Preço: R$ <%= informacoesLivro[2] %></p>
			<form action="exercicio4-cadastro-pedido.jsp" method="POST">
				<input type="hidden" value="<%= informacoesLivro[0] %>" name="inputLivroNome">
				<input type="hidden" value="<%= informacoesLivro[1] %>" name="inputLivroImagem">
				<input type="hidden" value="<%= informacoesLivro[2] %>" name="inputLivroValor">
				<input type="submit" value="Comprar Livro" name="btnComprar" class="btnBuyBook">
			</form>
		</div>
	<%
		}
	%>
</body>
</html>