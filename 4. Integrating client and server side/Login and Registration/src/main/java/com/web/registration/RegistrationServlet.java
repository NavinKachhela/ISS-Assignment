package com.web.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("name");
		String userEmail = request.getParameter("email");
		String userPassword = request.getParameter("pass");
		String userMobileNumber = request.getParameter("contact");
		RequestDispatcher dispatcher = null;
		Connection connectionObj = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connectionObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationdb", "root", "abc123");
			PreparedStatement prepStatementObject = connectionObj.prepareStatement("insert into users(userName, userPassword, userEmail, userMobileNumber) values(?,?,?,?) ");
			prepStatementObject.setString(1, userName);
			prepStatementObject.setString(2, userPassword);
			prepStatementObject.setString(3, userEmail);
			prepStatementObject.setString(4, userMobileNumber);
			
			int rowCount = prepStatementObject.executeUpdate();
			dispatcher = request.getRequestDispatcher("registration.jsp");
			if(rowCount > 0) {
				request.setAttribute("status", "success");
				
			}else {
				request.setAttribute("status", "failed");
			}
			dispatcher.forward(request, response);
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connectionObj.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
