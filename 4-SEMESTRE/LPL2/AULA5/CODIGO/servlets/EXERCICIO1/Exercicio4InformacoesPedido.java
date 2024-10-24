package servlets.EXERCICIO1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EXERCICIO1/Exercicio4InformacoesPedido")
public class Exercicio4InformacoesPedido extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        String livroNome = request.getParameter("inputLivroNome");
        String livroImagem = request.getParameter("inputLivroImagem");
        String livroValor = request.getParameter("inputLivroValor");
        String nome = request.getParameter("inputNome");
        String cpf = request.getParameter("inputCPF");
        String sexo = request.getParameter("inputSexo");
        String endereco = request.getParameter("inputEndereco");
        String cidade = request.getParameter("inputCidade");
        String estado = request.getParameter("inputEstado");
        
        double valor = Double.parseDouble(livroValor);

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Exercicio 4 - Pedido</title>");
            out.println("<style type=\"text/css\">");
            out.println("body {");
            out.println("    display: flex;");
            out.println("    justify-content: center;");
            out.println("    align-items: center;");
            out.println("    font-size: 18px;");
            out.println("}");
            out.println(".orderContainer {");
            out.println("    border: 1px solid black;");
            out.println("    padding: 10px 60px;");
            out.println("    width: 600px;");
            out.println("}");
            out.println(".orderBookPurchased {");
            out.println("    display: flex;");
            out.println("    justify-content: space-between;");
            out.println("    gap: 40px;");
            out.println("    border: 1px solid black;");
            out.println("    margin-bottom: 20px;");
            out.println("    padding-right: 10px;");
            out.println("    font-weight: bold;");
            out.println("}");
            out.println(".orderBookPurchasedDetails {");
            out.println("    display: flex;");
            out.println("    gap: 10px;");
            out.println("}");
            out.println(".orderBookPurchasedDetails img {");
            out.println("    max-width: 100px;");
            out.println("    max-height: 150px;");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"orderContainer\">");
            out.println("<h2 style=\"text-align: center\">Informações do Pedido</h2>");
            out.println("<h3>Informações do Livro:</h3>");
            out.println("<div class=\"orderBookPurchased\">");
            out.println("<div class=\"orderBookPurchasedDetails\">");
            out.println("<img alt=\"Imagem do livro " + livroNome + "\" src=\"" + livroImagem + "\">");
            out.println("<p>" + livroNome + "</p>");
            out.println("</div>");
            out.println("<p>R$ " + String.format("%.2f", valor) + "</p>");
            out.println("</div>");
            out.println("<h3>Informações Pessoais:</h3>");
            out.println("<p><b>Nome:</b> " + nome + "</p>");
            out.println("<p><b>CPF:</b> " + cpf + "</p>");
            out.println("<p><b>Sexo:</b> " + ("M".equals(sexo) ? "Masculino" : "Feminino") + "</p>");
            out.println("<p><b>Endereço:</b> " + endereco + "</p>");
            out.println("<p><b>Cidade:</b> " + cidade + "</p>");
            out.println("<p><b>Estado:</b> " + estado + "</p>");
            out.println("<h3>Informações de Pagamento:</h3>");
            out.println("<p><b>Forma de pagamento:</b> " + request.getParameter("inputFormaPagamento") + "</p>");
            out.println("<p><b>Forma de parcelamento:</b> " + request.getParameter("inputFormaParcelamento") + "</p>");
            out.println("</div>");
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
