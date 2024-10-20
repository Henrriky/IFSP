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
		<p>Temperatura: <input type="text" name="inputTemp" required value="<%= request.getParameter("inputTemp") != null ? request.getParameter("inputTemp") : "" %>"></p>
		<p>Operação:
			<br>
			<input type="radio" id="CEtoFA" name="inputOpcaoConversao" value="CEtoFA" required>
			<label for="CEtoFA">Celsius para Fahrenheit</label><br>
			<input type="radio" id="CEtoKE" name="inputOpcaoConversao" value="CEtoKE" required>
			<label for="CEtoKE">Celsius para Kelvin</label><br>
			<input type="radio" id="FAtoCE" name="inputOpcaoConversao" value="FAtoCE" required>
			<label for="FAtoCE">Fahrenheit para Celcius</label><br>
			<input type="radio" id="FAtoKE" name="inputOpcaoConversao" value="FAtoKE" required>
			<label for="FAtoKE">Fahrenheit para Kelvin</label><br>
			<input type="radio" id="KEtoCE" name="inputOpcaoConversao" value="KEtoCE" required>		
			<label for="KEtoCE">Kelvin para Celsius</label><br>	
			<input type="radio" id="KEtoFA" name="inputOpcaoConversao" value="KEtoFA" required>		
			<label for="KEtoFA">Kelvin para Fahrenheit</label><br>	
		</p>
		<%
			if (
					request.getParameter("inputTemp") != null && !request.getParameter("inputTemp").equals("") && 
					request.getParameter("inputOpcaoConversao") != null  && !request.getParameter("inputOpcaoConversao").equals("")
			   ) {
				Double inputTemp = Double.parseDouble(request.getParameter("inputTemp"));
				String inputOpcaoConversao = request.getParameter("inputOpcaoConversao");
				Double resultado = null;
				String escala = "";
				switch (inputOpcaoConversao) {
					case "CEtoFA":
						resultado = inputTemp * 1.8 + 32;
						escala = "°F";
						break;
					case "CEtoKE":
						resultado = inputTemp + 273.15;
						escala = "°K";
						break;
					case "FAtoCE":
						resultado = (inputTemp - 32) / 1.8;
						escala = "°C";
						break;
					case "FAtoKE":
						resultado = (inputTemp + 459.67) / 1.8;
						escala = "°K";
						break;
					case "KEtoCE":
						resultado = inputTemp - 273.15;
						escala = "°C";
						break;
					case "KEtoFA":
						resultado = inputTemp * 1.8 - 459.67;
						escala = "°F";
						break;
				}
				if (resultado != null) {
					out.println("<h4> O resultado da conversão é " + resultado + escala + " </h4>");
				}
			}
		%>
		<input type="submit" name="btnCalcular" value="Calcular"></input>
	</form>

</body>
</html>