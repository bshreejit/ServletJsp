package com.shreejit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/addFilter")
public class IdFilter implements Filter {

	public IdFilter() {
	}

	public void destroy() {

	}

	// doFilter is same as the get and post method in servlet that accepts and
	// process values

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		PrintWriter out=response.getWriter();
		
		/*
		 * When we have to work with Request object object we need HttpRequest object.
		 * But,here we have a ServletRequeset Object, so we can now,
		 */
		HttpServletRequest req = (HttpServletRequest) request;
		// So in above case, basically we are type casting the ServletRequeset into
		// HttpRequest object

		// So now once we have this object we can actually fetch the value
		int id = Integer.parseInt(request.getParameter("id"));

		if (id > 1) {
			chain.doFilter(request, response);
		}else {
			out.println("Invalid Id!!!");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
