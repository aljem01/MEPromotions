package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Adminlogin
 */
public class Adminlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		
		if ((name.equals("admin")) && (pass.equals("admin1234"))) {
			response.sendRedirect("AdminPanel.jsp");
		} else {
			response.sendRedirect("index.jsp");
		}
	}

	

}
