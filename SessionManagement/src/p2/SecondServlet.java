package p2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Cookie[] carray=request.getCookies();
		out.println("No.of Cookies :"+carray.length+"<br>");
		for(int i=0;i<carray.length;i++)
		{
			/*if(carray[i].getName().equals("user"))
			{
			out.println("Name : "+carray[i].getName()+" Value : "+carray[i].getValue()+"<br/>");
			}*/
			out.println("Name : "+carray[i].getName()+" Value : "+carray[i].getValue()+"<br/>");
		}
		System.out.println("cookie value=");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
