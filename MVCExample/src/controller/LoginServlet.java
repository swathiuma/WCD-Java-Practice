package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LoginCls;

@WebServlet("/loginS")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String email=request.getParameter("mailid");
		String pass=request.getParameter("pass");
		//communicating with model class
		LoginCls login=new LoginCls();
		login.setEmailid(email);
		login.setPassword(pass);
		boolean res=login.validate();
		if(res==true)
			{
			out.println("<font color='green'>Successfully logged in</font>");
			request.setAttribute("login", login);
			RequestDispatcher rd=request.getRequestDispatcher("success");
			rd.forward(request, response);
			}
		else
			{
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.forward(request, response);
			}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
