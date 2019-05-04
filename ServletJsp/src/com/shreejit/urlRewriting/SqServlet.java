package com.shreejit.urlRewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		// For request dispatcher
		int k = (int) req.getAttribute("k");

		/*
		 * //For Sent Redirect 
		 * int k=Integer.parseInt(req.getParameter("k"));
		 */

		k = k * k;
		PrintWriter out = res.getWriter();
		out.println("Square is : " + k);

	}

}
