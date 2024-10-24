package servlets.EXERCICIO1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EXERCICIO1/Exercicio3AulaAnterior")
public class Exercicio3 extends HttpServlet {
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
