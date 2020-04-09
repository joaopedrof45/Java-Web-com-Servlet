package servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "teste",
        urlPatterns = {"/aovivo"}
)
public class Teste extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
//        out.write("Hello World!".getBytes());
//        out.flush();
//        out.close();
        out.println(String.format("<html>"));
        out.println(String.format("<form action='http://localhost:8080/hello' method='POST'>"));
        out.println(String.format("<h1>Nome</h1>"));
        out.println(String.format("<input type='text' name='nome'></input>"));
        out.println(String.format("<h1>Email</h1>"));
        out.println(String.format("<input type='text' name='email'></input>"));
        out.println(String.format("<input type='submit' value='Enviar'></input>"));
        out.println(String.format("</form>"));
        out.println(String.format("</html>"));

    }

}
