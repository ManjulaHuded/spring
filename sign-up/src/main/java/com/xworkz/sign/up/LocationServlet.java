package com.xworkz.sign.up;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/sign")
public class LocationServlet extends HttpServlet {

	public LocationServlet() {
		System.out.println("LocationServlet object is created");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Runing doPost in LocationServlet");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String startPoint = req.getParameter("startPoint");
		String destination = req.getParameter("destination");
		String gender = req.getParameter("gender");

		System.out.println(name);
		System.out.println(email);
		System.out.println(startPoint);
		System.out.println(destination);
		System.out.println(gender);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.append("<body>");
		writer.print("<h1 style='color:green;'>");
		if (name.length() > 3) {
			writer.print("Sending name sucessfully.." + name);
			writer.print("<h1 style='color:green;'>");
		} else {
			writer.print("Invalid name failed to sign up..");
			writer.print("<h1 style='color:red;'>");
		}
		writer.print("<h1/>");
		writer.print("<body/>");
		writer.print("<html/>");

	}
}
