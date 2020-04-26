package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(servletNames = { "Servlet3" },urlPatterns={ "/Servlet3" })
//@WebFilter("/*")
//@WebFilter(servletNames = { "Servlet3" })
public class PerformanceFilter implements Filter {

    
    public PerformanceFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		long start=System.currentTimeMillis();
		System.out.println("start ="+start);
		out.println("Going to servlet<br>");
		chain.doFilter(request, response);
		long end=System.currentTimeMillis();
		System.out.println("end ="+end);
		System.out.println("time taken to process "+(end-start)+" ms");
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
