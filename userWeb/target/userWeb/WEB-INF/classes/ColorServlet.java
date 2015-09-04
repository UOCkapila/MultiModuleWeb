import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Created by kapila on 9/4/15.
 */
public class ColorServlet extends HttpServlet {
    PrintWriter writer = resp.getWriter();
    writer.println("<h1>Hello, World!</h1>");
    /* protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String color= request.getParameter("color");
       PrintWriter out = response.getWriter();
        out.println ( "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n" +
                "<html> \n" + "<head> \n" + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"> \n" +
                "<title> My first jsp </title> \n" + "</head> \n" + "<body> \n" + "<font size=\"12px\" color=\"" + color +
                "\">" + "Hello World" + "</font> \n" + "</body> \n" + "</html>" ); }
  */  }
}
