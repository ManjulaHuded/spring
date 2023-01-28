package com.xworkz.sign.up;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/contact")
public class ContactServlet extends HttpServlet {

	public ContactServlet() {
		System.out.println("ContactServlet object is created..");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in ContactServlet");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		Long converting = Long.parseLong(mobile);
		String comments = req.getParameter("comments");

		System.out.println(name);
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(comments);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		if (name.length() > 3 && converting > 0) {
			writer.print("<h1 style='color=green;'>");
			writer.print("Sending name sucessfully.. " + name);
	
			writer.print("</h1>");
			System.out.println("data is valid");
		} else {
			writer.print("<h1 style='color=red;'>");
			writer.print("Sending name failed name length should be 3.. " + name);
			writer.print("Invalid moblie number");
			writer.print("</h1>");
			System.out.println("data is invalid");
		}
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");

	}
}
