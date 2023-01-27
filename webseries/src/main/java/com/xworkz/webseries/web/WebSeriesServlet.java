package com.xworkz.webseries.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/web")
public class WebSeriesServlet extends HttpServlet {
	
	public WebSeriesServlet() {
		System.out.println("WebSeriesServlet object is created");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet in WebSeriesServlet");
	String name = req.getParameter("WebseriesName");
String language = req.getParameter("language");
String episodes = req.getParameter("episodes");
String ott = req.getParameter("ott");
String budget = req.getParameter("budget");

System.out.println(name);
System.out.println(language);
System.out.println(episodes);
System.out.println(ott);
System.out.println(budget);

PrintWriter writer = resp.getWriter();
writer.print("<html>");
writer.print("<body>");
writer.print("<h1 style = 'color:pink;'>");
writer.print("The webseries name " + name + " pased succesfully... ");
writer.print("<html/>");
writer.print("<body/>");
writer.print("<h1/>");
resp.setContentType("text/html");



		
	}
	@Override
	public void destroy() {
		System.out.println("destroy method is runing in WebSeriesServlet");
	}

}
