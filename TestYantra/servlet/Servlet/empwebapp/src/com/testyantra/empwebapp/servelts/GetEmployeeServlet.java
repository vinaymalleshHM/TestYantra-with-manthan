package com.testyantra.empwebapp.servelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends  HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Employee Details</h1><br>");
		out.print("Employee id=101<br> employee name=venki test yantra");
		out.print("</body>");
		out.print("</html>");
		
	}
	
	

}