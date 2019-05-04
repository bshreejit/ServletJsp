package com.shreejit.urlRewriting;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		res.getWriter().println("Result of addition is: " + k);

		// Dispatching to another servlet
		
		req.setAttribute("k", k); 
		RequestDispatcher rd=req.getRequestDispatcher("/sq");
		rd.forward(req, res);
		 

		/*
		 * // Using Send Re-direct 
		 * res.sendRedirect("sq?k"+k);
		 */
		
		//Send ReDirect Comes under the concept called session management
	}
} 
