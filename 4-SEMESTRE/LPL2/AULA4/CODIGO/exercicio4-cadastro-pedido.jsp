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
	.orderInputText {
		width: 100%;
		font-size: 18px;
	}
	.btnNextStep {
		cursor: pointer;
		padding: 6px;
	    color: white;
	    background-color: black;
	    border-radius: 4px;
	    border: none;
	    font-size: 16px;
	    width: 100%;
	}
</style>
<body>
	<form method="POST" action="exercicio4-pagamento-pedido.jsp">
		<h2>Cadastro de Pedido - Informações pessoais</h2>
		<fieldset>
			<legend>Formulário Pessoal</legend>
			<input type="hidden" value="<%= request.getParameter("inputLivroNome") %>" name="inputLivroNome">
			<input type="hidden" value="<%= request.getParameter("inputLivroImagem") %>" name="inputLivroImagem">
			<input type="hidden" value="<%= request.getParameter("inputLivroValor") %>" name="inputLivroValor">
			<label for="inputName">Nome completo</label><br>
			<input type="text" id="inputName" name="inputNome" class="orderInputText" required><br><br>
			<label for="inputCPF">CPF</label><br>
			<input type="text" id="inputCPF" name="inputCPF" class="orderInputText" required><br><br>
			<label for="inputName">Sexo</label><br>
			<input type="radio" id="inputSexoM" value="M" name="inputSexo" required>
			<label for="inputSexoM">Masculino</label><br>
			<input type="radio" id="inputSexoF" value="F" name="inputSexo" required>
			<label for="inputSexoF">Feminino</label><br><br>
			
			<label for="inputEndereco">Endereço</label><br>
			<input type="text" id="inputEndereco" name="inputEndereco" class="orderInputText" required><br><br>
			<label for="inputCidade">Cidade</label><br>
			<input type="text" id="inputCidade" name="inputCidade" class="orderInputText" required><br><br>
			<label for="inputEstado">Estado</label><br>
			<select name="inputEstado" id="inputEstado" required>
				<option value="SP" selected>SP</option>
				<option value="RJ">RJ</option>
				<option value="MG">MG</option>
				<option value="ES">ES</option>
			</select>
			<br>
			<br>
			<input type="submit" value="Próxima etapa" name="btnProximo" class="btnNextStep">
		</fieldset>
	</form>
</body>
</html>