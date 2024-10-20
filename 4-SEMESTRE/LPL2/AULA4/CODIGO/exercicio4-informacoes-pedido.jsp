<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercicio 4 - Pedido</title>
</head>
<style type="text/css">
	
	body {
		display: flex;
		justify-content: center;
		align-items: center;
		font-size: 18px;
	}
	.orderContainer {
		border: 1px solid black;
		padding: 10px 60px;
		width: 600px;
	}
	.orderBookPurchased {
		display: flex;
		justify-content: space-between;
		gap: 40px;
		border: 1px solid black;
		margin-bottom: 20px;
		padding-right: 10px;
		font-weight: bold;
	}
	.orderBookPurchasedDetails {
		display: flex;
		gap: 10px;
	}	
	.orderBookPurchasedDetails img {
		max-width: 100px;
		max-height: 150px;
	}
</style>
<body>
	<div class="orderContainer">
		<h2 style="text-align: center">Informações do Pedido</h2>
		
		<h3>Informações do Livro: </h3>
		<div class="orderBookPurchased">
			<div class="orderBookPurchasedDetails">
				<img 
					alt="Imagem do livro <%= request.getParameter("inputLivroNome") %>" 
					src="<%= request.getParameter("inputLivroImagem") %>"
				>
				<p><%= request.getParameter("inputLivroNome") %></p>
			</div>
			<p>R$ <%= request.getParameter("inputLivroValor") %></p>
		</div>
		
		<h3>Informações pessoais: </h3>
		<p><b>Nome:</b> <%= request.getParameter("inputNome") %></p>
		<p><b>CPF:</b> <%= request.getParameter("inputCPF") %></p>
		<p><b>Sexo:</b> <%= (request.getParameter("inputSexo") != null && request.getParameter("inputSexo").equals("M") ? "Masculino" : "Feminino") %></p>
		<p><b>Endereço:</b> <%= request.getParameter("inputEndereco") %></p>
		<p><b>Cidade:</b> <%= request.getParameter("inputCidade") %></p>
		<p><b>Estado:</b> <%= request.getParameter("inputEstado") %></p>
		
		<h3>Informações de pagamento: </h3>
		<p><b>Forma de pagamento:</b> <%= request.getParameter("inputFormaPagamento") %></p>
		<p><b>Forma de parcelamento:</b> <%= request.getParameter("inputFormaParcelamento") %></p>
	</div>
</body>
</html>