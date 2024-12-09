package com.myservlet1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("")
public class LoginServlet implements Servlet{
	ServletConfig sc;
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		this.sc=config;
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return sc;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String s="<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>My login page</title>\r\n"
				+ " <link rel=\"stylesheet\" href=\"./style.css\">\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "<div class=\"login\">\r\n"
				+ "\r\n"
				+ "<h1>\r\n"
				+ " Enter your id and password for login\r\n"
				+ " \r\n"
				+ "</h1>\r\n"
				+ "\r\n"
				+ "<label for=\"input-1\">Enter your name or Email</label>\r\n"
				+ "<input id=\"input-1\" placeholder=\"Name or Email\" type=\"text\"/>\r\n"
				+ "\r\n"
				+ "<label for=\"input-2\">Enter your password</label>\r\n"
				+ "<input id=\"input-2\" placeholder=\"Password\" type=\"text\"/>\r\n"
				+ "     \r\n"
				+ "</div>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		res.getWriter().println(s);
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
