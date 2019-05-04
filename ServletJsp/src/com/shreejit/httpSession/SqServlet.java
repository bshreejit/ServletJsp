package com.shreejit.httpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq2")
public class SqServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		// Session object is retrieved by another servlet
		HttpSession session = req.getSession();
		int k = (int) session.getAttribute("k");
		//Attribute will return a object so we have to type cast it into int
		
		k = k * k;
		PrintWriter out = res.getWriter();
		out.println("Square is : " + k);

	}

}
