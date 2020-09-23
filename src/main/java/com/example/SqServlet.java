package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		/*
		 * HttpSession sess= req.getSession(); int i= (int)sess.getAttribute("k");
		 */
		int i=0;
		Cookie cookies[]=req.getCookies();
		
		for(Cookie cook: cookies) {
			if(cook.getName().equals("k"))
				i=Integer.parseInt(cook.getValue());
		}
		
		PrintWriter out= res.getWriter();
		
		out.print(i*i);
		
		
	}
	

}
