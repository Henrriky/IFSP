<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercicio 3</title>
</head>
<body>
	<h1>Calculadora de temperatura</h1>
	<form action="" method="POST" >
		<p>Temperatura: <input type="text" name="inputTemp"></p>
		<p>Operação:
			<br>
			<input type="radio" id="CEtoFA" name="inputOpcaoConversao" value="CEtoFA">
			<label for="CEtoFA">Celsius para Fahrenheit</label><br>
			<input type="radio" id="CEtoKE" name="inputOpcaoConversao" value="CEtoKE">
			<label for="CEtoKE">Celsius para Kelvin</label><br>
			<input type="radio" id="FAtoCE" name="inputOpcaoConversao" value="FAtoCE">
			<label for="FAtoCE">Fahrenheit para Celcius</label><br>
			<input type="radio" id="FAtoKE" name="inputOpcaoConversao" value="FAtoKE">
			<label for="FAtoKE">Fahrenheit para Kelvin</label><br>
			<input type="radio" id="KEtoCE" name="inputOpcaoConversao" value="KEtoCE">		
			<label for="KEtoCE">Kelvin para Celsius</label><br>	
			<input type="radio" id="KEtoFA" name="inputOpcaoConversao" value="KEtoFA">		
			<label for="KEtoCE">Kelvin para Celsius</label><br>	
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