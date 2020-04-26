package p2;

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

//@WebFilter(filterName="Filter2",urlPatterns="servlet0")
//@WebFilter("/Filter2")
@WebFilter(servletNames = { "Servlet1" },urlPatterns="/servlet1")
//@WebFilter("/servlet1")
public class Filter2 implements Filter {

   
    public Filter2() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out=response.getWriter();
		System.out.println("Request came to Filter 2");
		chain.doFilter(request, response);
		System.out.println("Response from Filter 2");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
