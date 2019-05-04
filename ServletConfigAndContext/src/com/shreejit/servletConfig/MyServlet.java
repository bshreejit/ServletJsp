package com.shreejit.servletConfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//Servlet Config
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
		
		ServletConfig cg= getServletConfig();
		String nam = cg.getInitParameter("name");
		String num = cg.getInitParameter("number");
		
		out.println(nam);
		out.println(num);
	}

}
