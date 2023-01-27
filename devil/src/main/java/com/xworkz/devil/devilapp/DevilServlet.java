package com.xworkz.devil.devilapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/devil")
public class DevilServlet extends HttpServlet {

	public DevilServlet() {
		System.out.println("DevilServlet object is created...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method in DevilServlet..");
		String nameOfDevil = req.getParameter("nameOfDevil");
		String ageOfDevil = req.getParameter("ageOfDevil");
		String color = req.getParameter("color");
		String education = req.getParameter("education");
		String hieght = req.getParameter("hieght");
		String wieght = req.getParameter("wieght");
		String dob = req.getParameter("dob");
		String dod = req.getParameter("dod");
		String reson = req.getParameter("reson");
		String wife = req.getParameter("wife");
		String father = req.getParameter("father");
		String mother = req.getParameter("mother");
		String daughter = req.getParameter("daughter");
		String son = req.getParameter("son");
		String pregnant = req.getParameter("pregnant");
		String occupation = req.getParameter("occupation");
		String salary = req.getParameter("salary");
		String company = req.getParameter("company");
		String property = req.getParameter("property");
		String khabarstan = req.getParameter("khabarstan");

		System.out.println(nameOfDevil);
		System.out.println(ageOfDevil);
		System.out.println(color);
		System.out.println(education);
		System.out.println(hieght);
		System.out.println(wieght);
		System.out.println(dob);
		System.out.println(dod);
		System.out.println(reson);
		System.out.println(wife);
		System.out.println(father);
		System.out.println(mother);
		System.out.println(daughter);
		System.out.println(son);
		System.out.println(pregnant);
		System.out.println(occupation);
		System.out.println(salary);
		System.out.println(company);
		System.out.println(khabarstan);

		PrintWriter writer = resp.getWriter();

		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1 style = 'color:blue ;'>");
		writer.print("Sending the devil name to server succesfully " + nameOfDevil);
		writer.print("</h1>");
		writer.print("<html/>");
		writer.print("<body/>");
		writer.print("<h1/>");

		resp.setContentType("text/html");
	}

}
