package com.shreejit;

//Alternate of login check in the loginServlet


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/*@WebFilter("/loginServlet")*/
public class loginFilter implements Filter {

	public loginFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		PrintWriter out = response.getWriter();
		HttpServletRequest req = (HttpServletRequest) request;

		String uname = request.getParameter("username");
		String passw = request.getParameter("password");
		String veri="bshreejit";
		String pass="admin";
		if (uname.equals(veri) && passw.equals(pass)){
			// pass the request along the filter chain
			chain.doFilter(request, response);
		} else {
			out.println("Login Failed!!!");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
