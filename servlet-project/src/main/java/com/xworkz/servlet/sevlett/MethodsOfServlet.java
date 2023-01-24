package com.xworkz.servlet.sevlett;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/do")
public class MethodsOfServlet extends HttpServlet {
	
	public MethodsOfServlet() {
		System.out.println("MethodsOfServlet object is created...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method in MethodsOfServlet");
		String data = "Displaying doGet method in web server...";
	PrintWriter refOfDoGet = resp.getWriter();
	refOfDoGet.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost method in MethodsOfServlet");
		String data1 ="Displaying doPost method in web server...";
	PrintWriter refOfDoPost = resp.getWriter();
	refOfDoPost.print(data1);
	resp.setContentType("text/plain");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPut method in MethodsOfServlet");
		String data2 = "Displaying doPut method in web server...";
	PrintWriter refOfDoPut = resp.getWriter();
	refOfDoPut.print(data2);
	resp.setContentType("text/plain");
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doDelete method in MethodsOfServlet");
	String data3 = "Displaying doDelete method in web server...";
PrintWriter refOfDelete = resp.getWriter();
refOfDelete.print(data3);
resp.setContentType("text/plain");
	}
	
	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doHead method in MethodsOfServlet");
		String data3 = "Displaying doHead method in web server...";
	PrintWriter refOfHead = resp.getWriter();
	refOfHead.print(data3);
	resp.setContentType("text/plain");	
	}
	
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doOptions method in MethodsOfServlet");
		String data3 = "Displaying doOptions method in web server...";
	PrintWriter refOfOptions = resp.getWriter();
	refOfOptions.print(data3);
	resp.setContentType("text/plain");
	}
	
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doTrace method in MethodsOfServlet");
		String data3 = "Displaying doTrace method in web server...";
	PrintWriter refOfTrace = resp.getWriter();
	refOfTrace.print(data3);
	resp.setContentType("text/plain");
	}

}
