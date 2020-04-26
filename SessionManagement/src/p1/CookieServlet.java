package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cs")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//creating cookie
		//cookie class has two constructors
		//public Cookie()--zero parameterized constructor
		//public Cookie(String name_of_cookie,value of the cookie)
		Cookie cookie=new Cookie("mycookie","Created_by_WebServer");
		cookie.setMaxAge(60*60*24);
		response.addCookie(cookie);
		
		Cookie cookie1=new Cookie("mycookie1","Created_by_WebServer");
		cookie1.setMaxAge(60*60*24*3);
		response.addCookie(cookie1);
		
		out.println("<h1>Cookie created and sent back to client<br></h1>");
		
		//reading of cookies
		//request.getCookies()--return type is Cookie[]
		Cookie[] c1=request.getCookies();
		for(Cookie c:c1)
		{
			out.println("Cookie Name = "+c.getName()+"<br>");
			out.println("Cookie Value = "+c.getValue()+"<br>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
