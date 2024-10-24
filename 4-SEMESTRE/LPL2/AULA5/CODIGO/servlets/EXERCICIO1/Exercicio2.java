package servlets.EXERCICIO1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EXERCICIO1/Exercicio2AulaAnterior")
public class Exercicio2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void processRequest (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Cálculo</title>");
			out.println("</head>");
			out.println("<body>");
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
			out.println("</body>");
			out.println("</html>");			
		}
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
}
