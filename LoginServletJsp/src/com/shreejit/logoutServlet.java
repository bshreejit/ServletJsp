package com.shreejit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logoutServlet")
public class logoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public logoutServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		//Removes the username attribute hence welcome.jsp and video.jsp wont be accessed
		session.removeAttribute("username");
		
		session.invalidate();//It removes all the data after logout
		response.sendRedirect("login.jsp");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}
