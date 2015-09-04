import java.io.IOException;

/**
 * Created by kapila on 9/4/15.
 */
public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
// reading the user input
    String color= request.getParameter("color");
    PrintWriter out = response.getWriter();
    out.println (String.format("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN" +
            "\" \"http://www.w3.org/TR/html4/loose.dtd\">\n<html> " +
            "\n<head> \n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"> " +
            "\n<title> My first jsp </title> \n</head> \n<body> \n<font size=\"12px\" color=\"%s\">Hello " +
            "World</font> \n</body> \n</html>", color));
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String color= request.getParameter("color");
        PrintWriter out = response.getWriter();
        out.println (String.format("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN" +
                "\" \"http://www.w3.org/TR/html4/loose.dtd\">\n<html> " +
                "\n<head> \n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"> " +
                "\n<title> My first jsp </title> \n</head> \n<body> \n<font size=\"12px\" color=\"%s\">Hello " +
                "World</font> \n</body> \n</html>", color));
    }
}
