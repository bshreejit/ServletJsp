package com.shreejit.httpSession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//Session is generally used for login purpose 

@WebServlet("/add2")
public class AddServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		
		//Session value is strored
		HttpSession session=req.getSession();
		session.setAttribute("k", k);
		
		res.sendRedirect("sq2");
		
		System.out.println("Result pf addition is: " + k);

	
		
		
	}
} 
