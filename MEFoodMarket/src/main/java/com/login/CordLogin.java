package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CordLogin
 */
public class CordLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("cord_username");
		String pass = request.getParameter("cord_password");

		if ((name.equals("cord1")) && (pass.equals("cord1234"))) {
			response.sendRedirect("cordPanel.jsp");
		} else {
			response.sendRedirect("cordagentLogin.jsp");
		}
	}

}
