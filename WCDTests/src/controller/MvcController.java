package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modal.MvcModal;


@WebServlet("/MvcController")
public class MvcController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public MvcController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		MvcModal mm=new MvcModal();
		String color=mm.getColor();
		String fab=mm.getFabric();
		String style=mm.getStyle();
		out.println("Traditional material associated with Wedding Anniversary is : "+color+" color "+fab+style);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
