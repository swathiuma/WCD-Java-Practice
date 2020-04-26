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
//@WebFilter(filterName="Filter3",urlPatterns="servlet0")
@WebFilter(servletNames = { "Servlet0"},urlPatterns={"/servlet0","/servlet2"})
//@WebFilter( "/servlet0" )
//@WebFilter(urlPatterns="servlet0")
public class Filter3 implements Filter {

    public Filter3() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out=response.getWriter();
		System.out.println("Request came to Filter 3");
		chain.doFilter(request, response);
		System.out.println("Response from Filter 3");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
