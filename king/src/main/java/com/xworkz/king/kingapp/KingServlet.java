package com.xworkz.king.kingapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/king")
public class KingServlet extends HttpServlet {
	
	public KingServlet() {
		System.out.println("KingServlet object is created");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Running doGet in KingServlet");
String kingName = req.getParameter("kingName");
String region = req.getParameter("region");
String noOfQueens = req.getParameter("noOfQueens");
String	dob = req.getParameter("dob");
String	dod = req.getParameter("dod");

System.out.println("The king name : "+kingName);
System.out.println("region of king : "+region);
System.out.println("noOfQueens: " +noOfQueens);
System.out.println(" DOB: " +dob);
System.out.println("DOD: " +dob);

PrintWriter writer =  resp.getWriter();
writer.print("<html>");
writer.print("<body>");
writer.print("<h1 style = 'color:red ;'>");
resp.setContentType("text/html");
writer.print("Sending the king name to server succesfully " +kingName);
writer.print("<html/>");
writer.print("<body/>");
writer.print("<h1/>");

	}

}
