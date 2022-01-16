package com.login;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AgentLogin
 */
public class AgentLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name = request.getParameter("agent_username");
		String pass = request.getParameter("agent_password");

		if ((name.equals("agent1")) && (pass.equals("agent1234"))) {
			response.sendRedirect("agentPanel.jsp");
		} else {
			response.sendRedirect("agentLogin.jsp");
		}
	}

}
