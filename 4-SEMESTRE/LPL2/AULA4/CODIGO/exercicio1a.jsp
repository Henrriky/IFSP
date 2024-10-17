<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercicio 1 - A</title>
</head>
<body>
	<%
	 	String[][] fornecedores = {
	 			{ "Fornecedor 1", "8.00", "1" },
	 			{ "Fornecedor 2", "3.00", "0" },
	 			{ "Fornecedor 3", "6.00", "1" },
	 			{ "Fornecedor 4", "12.00", "0" },
	 			{ "Fornecedor 5", "19.00", "1" } 
	 	};
		
		for (int i = 0; i < fornecedores.length; i++) {
			String nome = fornecedores[i][0];
			String preco = fornecedores[i][1];
			String temFrete = fornecedores[i][2];
			
			if (Double.parseDouble(preco) < 8.0 && !Boolean.parseBoolean(temFrete)) {
				out.println("<h1>O fornecedor " + nome + " é vantajoso</h1>");
			}
		}
	%>
</body>
</html>