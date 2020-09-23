package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/add")
public class AddServlet  extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		PrintWriter out=res.getWriter();
		
		out.print(k);
		
		Runtime.getRuntime().exec("cmd /c start C:\\Users\\ULTIMATE\\Desktop\\my_first.bat");
		
		//req.setAttribute("k", k);
		
		/*
		 * HttpSession sess= req.getSession();
		 * 
		 * sess.setAttribute("k", k);
		 */
		
		/*
		 * Cookie cookie= new Cookie("k", k+""); res.addCookie(cookie);
		 * 
		 * res.sendRedirect("sq");
		 */
		
		/*
		 * RequestDispatcher rd= req.getRequestDispatcher("sq"); rd.forward(req, res);
		 */
		
		
		
	}
	
	
}
