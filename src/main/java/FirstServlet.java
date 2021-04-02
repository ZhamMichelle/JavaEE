import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet{

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException{

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException{
        PrintWriter pw=response.getWriter();

        pw.println("<html>");
        pw.println("<h1> fucking perfect </h1>");
        pw.println("</html>");
    }

}