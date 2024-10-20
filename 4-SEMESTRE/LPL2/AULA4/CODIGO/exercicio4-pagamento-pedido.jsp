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
	.btnFinishOrder {
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
	<form method="POST" action="exercicio4-informacoes-pedido.jsp">
		<h2>Cadastro de Pedido - Informações de Pagamento</h2>
		<fieldset>
			<legend>Formulário de Pagamento</legend>
			<input type="hidden" value="<%= request.getParameter("inputLivroNome") %>" name="inputLivroNome">
			<input type="hidden" value="<%= request.getParameter("inputLivroImagem") %>" name="inputLivroImagem">
			<input type="hidden" value="<%= request.getParameter("inputLivroValor") %>" name="inputLivroValor">
			<input type="hidden" value="<%= request.getParameter("inputNome") %>" name="inputNome">
			<input type="hidden" value="<%= request.getParameter("inputCPF") %>" name="inputCPF">
			<input type="hidden" value="<%= request.getParameter("inputSexo") %>" name="inputSexo">
			<input type="hidden" value="<%= request.getParameter("inputEndereco") %>" name="inputEndereco">
			<input type="hidden" value="<%= request.getParameter("inputCidade") %>" name="inputCidade">
			<input type="hidden" value="<%= request.getParameter("inputEstado") %>" name="inputEstado">
			
			<label for="inputFormaPagamento">Forma de pagamento:</label>
			<br>
			<input type="radio" id="inputFormaPagamentoCredito" value="credito" name="inputFormaPagamento" required>
			<label for="inputFormaPagamentoCredito">Crédito</label><br>
			<input type="radio" id="inputFormaPagamentoPIX" value="pix" name="inputFormaPagamento" required>
			<label for="inputFormaPagamentoPIX">PIX</label><br>
			<input type="radio" id="inputFormaPagamentoBoleto" value="boleto" name="inputFormaPagamento" required>
			<label for="inputFormaPagamentoBoleto">Boleto Bancário</label>
			<br>
			<br>
			<label for="inputFormaParcelamento">Forma de parcelamento:</label>
			<br>
			<select name="inputFormaParcelamento" id="inputFormaParcelamento" required>
				<option value="1X<%= Double.parseDouble(request.getParameter("inputLivroValor"))/1.0 %>">
					1 X <%= Double.parseDouble(request.getParameter("inputLivroValor"))/1.0 %>
				</option>
				<option value="2X<%= Double.parseDouble(request.getParameter("inputLivroValor"))/2.0 %>">
					2 X <%= Double.parseDouble(request.getParameter("inputLivroValor"))/2.0 %>
				</option>
				<option value="3X<%= Double.parseDouble(request.getParameter("inputLivroValor"))/2.0 %>">
					3 X <%= Double.parseDouble(request.getParameter("inputLivroValor"))/3.0 %>
				</option>
			</select>
			<br>
			<br>
			<input type="submit" value="Finalizar pedido" name="btnFinalizarPedido" class="btnFinishOrder">
		</fieldset>
	</form>
</body>
</html>