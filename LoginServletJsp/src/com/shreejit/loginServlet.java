package com.shreejit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shreejit.dao.LoginDao;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public loginServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		// Getting data from the form
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");

		LoginDao dao = new LoginDao();

		/*
		 * Static value which is not so practical; its is not the right way of
		 * verifying. Instead we use database
		 */
		// if (uname.equals("bshreejit") && pass.equals("admin")) {
		
		if (dao.check(uname, pass)) {
			// Creating a session so that the welcome.jsp page is secured and can be
			// accessed only when logged in
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);

			response.sendRedirect("welcome.jsp");
		} else {
			// out.println("Login Failed!!!");
			response.sendRedirect("login.jsp");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

}
