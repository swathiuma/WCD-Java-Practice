package p2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter(filterName="Filter1",urlPatterns="Filter3")
@WebFilter(servletNames = { "Servlet0"},urlPatterns={"/servlet0","/servlet2"})
//@WebFilter( "/servlet0" )
//@WebFilter(urlPatterns="Filter3")
public class Filter1 implements Filter {

    public Filter1() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		System.out.println("Request came to Filter 1");
		chain.doFilter(request, response);
		System.out.println("Response from Filter 1");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
