package p3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Third")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=request.getParameter("txtName");
		out.println("Welcome "+user+"<br>");
		out.println("<form action='Forth'>");
		out.println("<input type='hidden' name='uname' value='"+user+"'>");
		out.println("<input type='submit' value='Forth'>");
		out.println("</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
