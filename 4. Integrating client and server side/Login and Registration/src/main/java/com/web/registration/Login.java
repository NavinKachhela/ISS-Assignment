package com.web.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userEmail = request.getParameter("username");
		String userPassword = request.getParameter("password");
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher = null;
		Connection connectionObj = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connectionObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationdb", "root", "abc123");
			PreparedStatement prepStatementObject = connectionObj.prepareStatement("select * from users where userEmail = ? and userPassword = ?");
			prepStatementObject.setString(1, userEmail);
			prepStatementObject.setString(2, userPassword);
			
			ResultSet rs = prepStatementObject.executeQuery();
			if(rs.next()) {
				session.setAttribute("name", rs.getString("userName"));
				dispatcher = request.getRequestDispatcher("index.jsp");
			}else {
				request.setAttribute("status", "failed");
				dispatcher = request.getRequestDispatcher("login.jsp");
			}
			dispatcher.forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
