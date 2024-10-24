package servlets.EXERCICIO1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/EXERCICIO1/Exercicio4PagamentoPedido")
public class Exercicio4PagamentoPedido extends HttpServlet {
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
            out.println("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"UTF-8\">\n" +
                    "<title>Exercicio 4 - Pedido</title>\n" +
                    "</head>\n" +
                    "<style type=\"text/css\">\n" +
                    "    body {\n" +
                    "        display: flex;\n" +
                    "        justify-content: center;\n" +
                    "        align-items: center;\n" +
                    "        font-size: 18px;\n" +
                    "    }\n" +
                    "    .btnFinishOrder {\n" +
                    "        cursor: pointer;\n" +
                    "        padding: 6px;\n" +
                    "        color: white;\n" +
                    "        background-color: black;\n" +
                    "        border-radius: 4px;\n" +
                    "        border: none;\n" +
                    "        font-size: 16px;\n" +
                    "        width: 100%;\n" +
                    "    }\n" +
                    "</style>\n" +
                    "<body>\n" +
                    "    <form method=\"POST\" action=\"Exercicio4InformacoesPedido\">\n" +
                    "        <h2>Cadastro de Pedido - Informações de Pagamento</h2>\n" +
                    "        <fieldset>\n" +
                    "            <legend>Formulário de Pagamento</legend>\n" +
                    "            <input type=\"hidden\" value=\"" + livroNome + "\" name=\"inputLivroNome\">\n" +
                    "            <input type=\"hidden\" value=\"" + livroImagem + "\" name=\"inputLivroImagem\">\n" +
                    "            <input type=\"hidden\" value=\"" + livroValor + "\" name=\"inputLivroValor\">\n" +
                    "            <input type=\"hidden\" value=\"" + nome + "\" name=\"inputNome\">\n" +
                    "            <input type=\"hidden\" value=\"" + cpf + "\" name=\"inputCPF\">\n" +
                    "            <input type=\"hidden\" value=\"" + sexo + "\" name=\"inputSexo\">\n" +
                    "            <input type=\"hidden\" value=\"" + endereco + "\" name=\"inputEndereco\">\n" +
                    "            <input type=\"hidden\" value=\"" + cidade + "\" name=\"inputCidade\">\n" +
                    "            <input type=\"hidden\" value=\"" + estado + "\" name=\"inputEstado\">\n" +
                    "            <label for=\"inputFormaPagamento\">Forma de pagamento:</label>\n" +
                    "            <br>\n" +
                    "            <input type=\"radio\" id=\"inputFormaPagamentoCredito\" value=\"credito\" name=\"inputFormaPagamento\" required>\n" +
                    "            <label for=\"inputFormaPagamentoCredito\">Crédito</label><br>\n" +
                    "            <input type=\"radio\" id=\"inputFormaPagamentoPIX\" value=\"pix\" name=\"inputFormaPagamento\" required>\n" +
                    "            <label for=\"inputFormaPagamentoPIX\">PIX</label><br>\n" +
                    "            <input type=\"radio\" id=\"inputFormaPagamentoBoleto\" value=\"boleto\" name=\"inputFormaPagamento\" required>\n" +
                    "            <label for=\"inputFormaPagamentoBoleto\">Boleto Bancário</label>\n" +
                    "            <br><br>\n" +
                    "            <label for=\"inputFormaParcelamento\">Forma de parcelamento:</label>\n" +
                    "            <br>\n" +
                    "            <select name=\"inputFormaParcelamento\" id=\"inputFormaParcelamento\" required>\n" +
                    "                <option value=\"1X" + valor + "\">1 X " + String.format("%.2f", valor) + "</option>\n" +
                    "                <option value=\"2X" + valor / 2.0 + "\">2 X " + String.format("%.2f", valor / 2.0) + "</option>\n" +
                    "                <option value=\"3X" + valor / 3.0 + "\">3 X " + String.format("%.2f", valor / 3.0) + "</option>\n" +
                    "            </select>\n" +
                    "            <br><br>\n" +
                    "            <input type=\"submit\" value=\"Finalizar pedido\" name=\"btnFinalizarPedido\" class=\"btnFinishOrder\">\n" +
                    "        </fieldset>\n" +
                    "    </form>\n" +
                    "</body>\n" +
                    "</html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
