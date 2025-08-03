import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String studentName = request.getParameter("name");
        PrintWriter out = response.getWriter();
        out.println("Student record received: " + studentName);
    }
}
