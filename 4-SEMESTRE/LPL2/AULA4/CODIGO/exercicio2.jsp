<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercicio 2</title>
</head>
<body>
	<h1>Calculadora simples</h1>
	<form action="" method="POST" >
		<p>Valor 1 <input type="text" name="inputValor1"></p>
		<p>Valor 2 <input type="text" name="inputValor2"></p>
		<p>Operação:
			<select name="inputOperacao">
				<option value="+">+</option>
				<option value="-">-</option>
				<option value="*">*</option>
				<option value="/">/</option>
			</select>
		</p>
		<%
			if (
					request.getParameter("inputValor1") != null && !request.getParameter("inputValor1").equals("") && 
					request.getParameter("inputValor2") != null  && !request.getParameter("inputValor2").equals("") && 
					request.getParameter("inputOperacao") != null && !request.getParameter("inputOperacao").equals("")
			   ) {
				Double valor1 = Double.parseDouble(request.getParameter("inputValor1"));
				Double valor2 = Double.parseDouble(request.getParameter("inputValor2"));
				String operacao = request.getParameter("inputOperacao");
				Double resultado = null;
				if (operacao.equals("+")) {
					resultado = valor1 + valor2;
				} else if (operacao.equals("-")) {
					resultado = valor1 - valor2;
				} else if (operacao.equals("*")) {
					resultado = valor1 * valor2;
				} else if (operacao.equals("/")) {
					resultado = valor1 / valor2;
				}
				
				if (resultado != null) {
					out.println("<h4> O resultado da operação é " + resultado + "</h4>");
				}
				
				
			}
		%>
		<input type="submit" name="btnCalcular" value="Calcular"></input>
	</form>

</body>
</html>