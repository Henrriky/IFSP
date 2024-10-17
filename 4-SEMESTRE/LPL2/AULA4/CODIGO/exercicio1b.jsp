<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercicio 1 - B</title>
</head>
<body>
	<%
	 	String[][] clientes = {
	 			{ "Cliente 1", "30", "500" },
	 			{ "Cliente 2", "40", "400" },
	 			{ "Cliente 3", "3", "100" },
	 			{ "Cliente 4", "4", "120" },
	 			{ "Cliente 5", "9", "300" },
	 			{ "Cliente 6", "30", "500" },
	 			{ "Cliente 7", "60", "600" },
	 			{ "Cliente 8", "35", "350" },
	 			{ "Cliente 9", "40", "400" },
	 			{ "Cliente 10", "80", "1200" },
	 	};
		
		for (int i = 0; i < clientes.length; i++) {
			String nome = clientes[i][0];
			String pizzasCompradas = clientes[i][1];
			String valorGastoEmPizzas = clientes[i][2];
			
			if (Double.parseDouble(pizzasCompradas) >= 10.0 || Double.parseDouble(valorGastoEmPizzas) > 500.0) {
				out.println("<h1>O cliente " + nome + " tem direito a uma pizza de promoção</h1>");
			}
		}
	%>
</body>
</html>