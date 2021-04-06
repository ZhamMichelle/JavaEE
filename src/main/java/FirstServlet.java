import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException, ServletException {
        HttpSession session=request.getSession();

        Integer count = (Integer) session.getAttribute("count");

            if(count==null){
                session.setAttribute("count", 1);
                count=1;
            }
            else
                session.setAttribute("count",count++);
        //String name = request.getParameter("name");

        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<h1> count is: "+count+" </h1>");
       //pw.println("<h1> fucking perfect," + name + "</h1>");
        pw.println("</html>");

//        response.sendRedirect("testJSP.jsp");
//        RequestDispatcher dispatcher=request.getRequestDispatcher("testJSP.jsp");
//        dispatcher.forward(request,response);
    }

}