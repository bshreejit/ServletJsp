package com.shreejit.jstlCore;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DemoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// String name="Shreejit";
		// When sending we have to make sure the value is being added somewhere
		// request.setAttribute("label", name);

		// FOr passing a single object
		/*
		 * Student s = new Student(1, "Shreejit"); request.setAttribute("student", s);
		 */

		// For passing a list of or multiple objects
		List<Student> studs=Arrays.asList(new Student(1,"Shreejit"), new Student(2,"Sujan"));

		request.setAttribute("student", studs);
		// Sending the name to the jsp file
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		// passing the two objects
		rd.forward(request, response);

	}

}
