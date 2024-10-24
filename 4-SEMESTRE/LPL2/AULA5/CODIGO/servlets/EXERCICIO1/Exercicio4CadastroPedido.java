package servlets.EXERCICIO1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EXERCICIO1/Exercicio4CadastroPedido")
public class Exercicio4CadastroPedido extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void processRequest (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		try (PrintWriter out = response.getWriter()) {
			out.println(""
					+ "<!DOCTYPE html>\n"
					+ "<html>\n"
					+ "<head>\n"
					+ "<meta charset=\"UTF-8\">\n"
					+ "<title>Exercicio 4 - Pedido</title>\n"
					+ "</head>\n"
					+ "<style type=\"text/css\">\n"
					+ "	\n"
					+ "	body {\n"
					+ "		display: flex;\n"
					+ "		justify-content: center;\n"
					+ "		align-items: center;\n"
					+ "		font-size: 18px;\n"
					+ "	}\n"
					+ "	.orderInputText {\n"
					+ "		width: 100%;\n"
					+ "		font-size: 18px;\n"
					+ "	}\n"
					+ "	.btnNextStep {\n"
					+ "		cursor: pointer;\n"
					+ "		padding: 6px;\n"
					+ "	    color: white;\n"
					+ "	    background-color: black;\n"
					+ "	    border-radius: 4px;\n"
					+ "	    border: none;\n"
					+ "	    font-size: 16px;\n"
					+ "	    width: 100%;\n"
					+ "	}\n"
					+ "</style>");
			out.println(""
					+ "<body>\n"
					+ "	<form method=\"POST\" action=\"Exercicio4PagamentoPedido\">\n"
					+ "		<h2>Cadastro de Pedido - Informações pessoais</h2>\n"
					+ "		<fieldset>\n"
					+ "			<legend>Formulário Pessoal</legend>\n"
					+ "			<input type=\"hidden\" value=\'" + request.getParameter("inputLivroNome") + "' name=\"inputLivroNome\">\n"
					+ "			<input type=\"hidden\" value=\'" + request.getParameter("inputLivroImagem") + "' name=\"inputLivroImagem\">\n"
					+ "			<input type=\"hidden\" value=\'" + request.getParameter("inputLivroValor") + "' name=\"inputLivroValor\">\n"
					+ "			<label for=\"inputName\">Nome completo</label><br>\n"
					+ "			<input type=\"text\" id=\"inputName\" name=\"inputNome\" class=\"orderInputText\" required><br><br>\n"
					+ "			<label for=\"inputCPF\">CPF</label><br>\n"
					+ "			<input type=\"text\" id=\"inputCPF\" name=\"inputCPF\" class=\"orderInputText\" required><br><br>\n"
					+ "			<label for=\"inputName\">Sexo</label><br>\n"
					+ "			<input type=\"radio\" id=\"inputSexoM\" value=\"M\" name=\"inputSexo\" required>\n"
					+ "			<label for=\"inputSexoM\">Masculino</label><br>\n"
					+ "			<input type=\"radio\" id=\"inputSexoF\" value=\"F\" name=\"inputSexo\" required>\n"
					+ "			<label for=\"inputSexoF\">Feminino</label><br><br>\n"
					+ "			\n"
					+ "			<label for=\"inputEndereco\">Endereço</label><br>\n"
					+ "			<input type=\"text\" id=\"inputEndereco\" name=\"inputEndereco\" class=\"orderInputText\" required><br><br>\n"
					+ "			<label for=\"inputCidade\">Cidade</label><br>\n"
					+ "			<input type=\"text\" id=\"inputCidade\" name=\"inputCidade\" class=\"orderInputText\" required><br><br>\n"
					+ "			<label for=\"inputEstado\">Estado</label><br>\n"
					+ "			<select name=\"inputEstado\" id=\"inputEstado\" required>\n"
					+ "				<option value=\"SP\" selected>SP</option>\n"
					+ "				<option value=\"RJ\">RJ</option>\n"
					+ "				<option value=\"MG\">MG</option>\n"
					+ "				<option value=\"ES\">ES</option>\n"
					+ "			</select>\n"
					+ "			<br>\n"
					+ "			<br>\n"
					+ "			<input type=\"submit\" value=\"Próxima etapa\" name=\"btnProximo\" class=\"btnNextStep\">\n"
					+ "		</fieldset>\n"
					+ "	</form>\n"
					+ "</body>");
		}
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
}
