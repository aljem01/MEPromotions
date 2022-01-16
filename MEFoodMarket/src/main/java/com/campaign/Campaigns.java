package com.campaign;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.campaign.DatabaseConnect;
/**
 * Servlet implementation class Campaigns
 */
public class Campaigns extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Campaigns() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("GetMethod: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("DoPost Method: ").append(request.getContextPath());
		doGet(request, response);
		String campaign = request.getParameter("campaign");
		try { 

			// Initialize the database 
			//DatabaseConnect connectdb = new DatabaseConnect();
			Connection con = DatabaseConnect.initializeDatabase(); 

			
			PreparedStatement st = con.prepareStatement("insert into campaigns (Campaign) values('"+campaign+"')"); 

			// For the first parameter, 
			st.setString(1, campaign); 

			
			// Executing the insert command using executeUpdate() 
			
			st.executeUpdate(); 

			// Close all the connections 
			st.close(); 
			con.close(); 

			 
			PrintWriter out = response.getWriter(); 
			out.println("<html><body><b>Campaign Successfully Inserted"
						+ "</b></body></html>"); 
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
			PrintWriter out = response.getWriter(); 
			out.println("<html><body><b>Campaign UnSuccessfully Inserted"
					+ "</b></body></html>"); 
		}
	}

}
