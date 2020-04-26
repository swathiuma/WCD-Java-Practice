package p5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sfirst")
public class SessionServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SessionServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=request.getParameter("txtName");
		String pass=request.getParameter("txtPass");
		
		HttpSession ses=request.getSession();
		ses.setAttribute("User", user);
		ses.setAttribute("Password", pass);
		out.println("Welcome <b>"+user +"</b> to Session servlet1");
		//RequestDispatcher rd=request.getRequestDispatcher("ssecond");
		//rd.forward(request, response);
		out.println("<br><a href='ssecond'>Second</a>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
