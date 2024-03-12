package com.codechobo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginAction")
public class LoginAction extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		if(id.equals("asdf") && pwd.equals("1234")) {
			// id와 pwd가 일치하는 경우
			response.sendRedirect("/");
		} else {
			// id와 pwd가 일치하지 않는 경우
			request.setAttribute("msg", "id 또는 비밀번호가 틀립니다.");
			
			RequestDispatcher reqDis = request.getRequestDispatcher("/loginForm.jsp");
			reqDis.forward(request, response);
		}
	}
}
