import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends javax.servlet.http.HttpServlet 
{
	// Do not declare these variables on the
	// class level – the same instance of
	// LoginServlet is shared by all users

	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException 
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String id = req.getParameter("id");
		String password = req.getParameter("pwd");
		out.println("<HTML><BODY>");

		if("jsmith".equalsIgnoreCase(id) && "spring12".equalsIgnoreCase(password))
		{
			out.println("Hello "+ id + ". Welcome to our magazines! ");
		} 
		else 
		{
			out.println("Id/Password combination is not valid");
		}
		out.println("</BODY></HTML>");
	}
}