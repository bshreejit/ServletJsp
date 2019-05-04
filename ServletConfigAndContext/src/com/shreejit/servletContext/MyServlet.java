package com.shreejit.servletContext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//Servlet Context
@WebServlet("/abc")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.print("Hi!! ");
		
		
		// Now fetching the initial value that is mentioned in the web.xml
		ServletContext con = getServletContext();
		// Or can use; request.getServletContext();

		String nam = con.getInitParameter("name");
		String num = con.getInitParameter("number");
		
		out.println(nam);
		out.println(num);
	}

}
