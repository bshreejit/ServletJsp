 package com.shreejit.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//Annotation configuration method; alternate of xml config file and easy to use
@WebServlet("/add3")
public class AddServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;

		/*
		 * We can't simply send int value in cookie 
		 * It accepts string value. SO we have to convert it into string.
		 *  k + " "  ----->   k int value is changed to string by appending "" 
		 */
		Cookie cookie = new Cookie("k", k + " ");
		res.addCookie(cookie);
	
		res.sendRedirect("sq3");
		

	}
}
