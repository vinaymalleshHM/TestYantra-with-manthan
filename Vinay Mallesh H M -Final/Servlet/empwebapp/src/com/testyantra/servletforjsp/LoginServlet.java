package com.testyantra.servletforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.testyantra.empwebapp.beans.EmployeeInfoBean;
import com.testyantra.empwebapp.dao.EmployeeDAO;
import com.testyantra.empwebapp.dao.EmployeeDAOImpl;
@WebServlet("/Loginn2")
public class LoginServlet extends HttpServlet{
	
	EmployeeDAO dao = new EmployeeDAOImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int empId= Integer.parseInt(req.getParameter("empId"));
		String password = req.getParameter("password");
		
		EmployeeInfoBean EmployeeInfoBean = dao.authenticate(empId, password);
		
		if (EmployeeInfoBean != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("EmployeeInfoBean", EmployeeInfoBean);
			req.getRequestDispatcher("./home").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "Invalid Crendential!!!");
			req.getRequestDispatcher("./login").forward(req, resp);
		}
	
	}

	
	
	
}