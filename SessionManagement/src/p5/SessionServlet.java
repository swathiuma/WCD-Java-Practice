package p5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/session1")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession ses=request.getSession();
		//HttpSession ses=request.getSession(false);
		//Cookie ck=new Cookie("sesid",ses.getId());
		//response.addCookie(ck);
		out.println("Session ID : "+ses.getId()+"<br>");
		out.println("Creation time :"+ses.getCreationTime()+"<br>");
		out.println("last acces time :"+ses.getLastAccessedTime());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
