package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter("/Login")
public class LoginFilter implements Filter {

    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=request.getParameter("userid");
		String pass=request.getParameter("pass");
		System.out.println(user+" herre "+pass);
		if(pass.equals("ADMIN")&& user.equals("admin"))
		{
			chain.doFilter(request, response);
			//RequestDispatcher rd=request.getRequestDispatcher("Login");
			//rd.forward(request, response);
		}
		else if(pass.equals("USER")&& user.equals("user")){
			RequestDispatcher rd=request.getRequestDispatcher("User");
			rd.forward(request, response);
			//chain.doFilter(request, response);
		}
		else{
			out.println("Check your data");
			RequestDispatcher rd=request.getRequestDispatcher("loginPage.html");
			rd.include(request, response);
			//chain.doFilter(request, response);
		}
		//chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
